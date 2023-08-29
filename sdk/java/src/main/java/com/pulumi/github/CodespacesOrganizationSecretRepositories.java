// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.CodespacesOrganizationSecretRepositoriesArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.CodespacesOrganizationSecretRepositoriesState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage repository allow list for existing GitHub Codespaces secrets within your GitHub organization.
 * 
 * You must have write access to an organization secret to use this resource.
 * 
 * This resource is only applicable when `visibility` of the existing organization secret has been set to `selected`.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.GithubFunctions;
 * import com.pulumi.github.inputs.GetRepositoryArgs;
 * import com.pulumi.github.CodespacesOrganizationSecretRepositories;
 * import com.pulumi.github.CodespacesOrganizationSecretRepositoriesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var repo = GithubFunctions.getRepository(GetRepositoryArgs.builder()
 *             .fullName(&#34;my-org/repo&#34;)
 *             .build());
 * 
 *         var orgSecretRepos = new CodespacesOrganizationSecretRepositories(&#34;orgSecretRepos&#34;, CodespacesOrganizationSecretRepositoriesArgs.builder()        
 *             .secretName(&#34;existing_secret_name&#34;)
 *             .selectedRepositoryIds(repo.applyValue(getRepositoryResult -&gt; getRepositoryResult.repoId()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an ID made up of the secret name
 * 
 * ```sh
 *  $ pulumi import github:index/codespacesOrganizationSecretRepositories:CodespacesOrganizationSecretRepositories org_secret_repos existing_secret_name
 * ```
 * 
 */
@ResourceType(type="github:index/codespacesOrganizationSecretRepositories:CodespacesOrganizationSecretRepositories")
public class CodespacesOrganizationSecretRepositories extends com.pulumi.resources.CustomResource {
    /**
     * Name of the existing secret
     * 
     */
    @Export(name="secretName", refs={String.class}, tree="[0]")
    private Output<String> secretName;

    /**
     * @return Name of the existing secret
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }
    /**
     * An array of repository ids that can access the organization secret.
     * 
     */
    @Export(name="selectedRepositoryIds", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> selectedRepositoryIds;

    /**
     * @return An array of repository ids that can access the organization secret.
     * 
     */
    public Output<List<Integer>> selectedRepositoryIds() {
        return this.selectedRepositoryIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CodespacesOrganizationSecretRepositories(String name) {
        this(name, CodespacesOrganizationSecretRepositoriesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CodespacesOrganizationSecretRepositories(String name, CodespacesOrganizationSecretRepositoriesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CodespacesOrganizationSecretRepositories(String name, CodespacesOrganizationSecretRepositoriesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/codespacesOrganizationSecretRepositories:CodespacesOrganizationSecretRepositories", name, args == null ? CodespacesOrganizationSecretRepositoriesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CodespacesOrganizationSecretRepositories(String name, Output<String> id, @Nullable CodespacesOrganizationSecretRepositoriesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/codespacesOrganizationSecretRepositories:CodespacesOrganizationSecretRepositories", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CodespacesOrganizationSecretRepositories get(String name, Output<String> id, @Nullable CodespacesOrganizationSecretRepositoriesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CodespacesOrganizationSecretRepositories(name, id, state, options);
    }
}
