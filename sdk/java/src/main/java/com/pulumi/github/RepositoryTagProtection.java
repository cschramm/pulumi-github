// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.RepositoryTagProtectionArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.RepositoryTagProtectionState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource allows you to create and manage a repository tag protection for repositories within your GitHub organization or personal account.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.RepositoryTagProtection;
 * import com.pulumi.github.RepositoryTagProtectionArgs;
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
 *         var example = new RepositoryTagProtection("example", RepositoryTagProtectionArgs.builder()        
 *             .repository("example-repository")
 *             .pattern("v*")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Repository tag protections can be imported using the `name` of the repository, combined with the `id` of the tag protection, separated by a `/` character.
 * The `id` of the tag protection can be found using the [GitHub API](https://docs.github.com/en/rest/repos/tags#list-tag-protection-states-for-a-repository).
 * 
 * Importing uses the name of the repository, as well as the ID of the tag protection, e.g.
 * 
 * ```sh
 * $ pulumi import github:index/repositoryTagProtection:RepositoryTagProtection terraform my-repo/31077
 * ```
 * 
 */
@ResourceType(type="github:index/repositoryTagProtection:RepositoryTagProtection")
public class RepositoryTagProtection extends com.pulumi.resources.CustomResource {
    /**
     * The pattern of the tag to protect.
     * 
     */
    @Export(name="pattern", refs={String.class}, tree="[0]")
    private Output<String> pattern;

    /**
     * @return The pattern of the tag to protect.
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }
    /**
     * Name of the repository to add the tag protection to.
     * 
     */
    @Export(name="repository", refs={String.class}, tree="[0]")
    private Output<String> repository;

    /**
     * @return Name of the repository to add the tag protection to.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }
    /**
     * The ID of the tag protection.
     * 
     */
    @Export(name="tagProtectionId", refs={Integer.class}, tree="[0]")
    private Output<Integer> tagProtectionId;

    /**
     * @return The ID of the tag protection.
     * 
     */
    public Output<Integer> tagProtectionId() {
        return this.tagProtectionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepositoryTagProtection(String name) {
        this(name, RepositoryTagProtectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepositoryTagProtection(String name, RepositoryTagProtectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryTagProtection(String name, RepositoryTagProtectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/repositoryTagProtection:RepositoryTagProtection", name, args == null ? RepositoryTagProtectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RepositoryTagProtection(String name, Output<String> id, @Nullable RepositoryTagProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/repositoryTagProtection:RepositoryTagProtection", name, state, makeResourceOptions(options, id));
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
    public static RepositoryTagProtection get(String name, Output<String> id, @Nullable RepositoryTagProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryTagProtection(name, id, state, options);
    }
}
