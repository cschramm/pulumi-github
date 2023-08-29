// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.ActionsEnvironmentSecretArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.ActionsEnvironmentSecretState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.ActionsEnvironmentSecret;
 * import com.pulumi.github.ActionsEnvironmentSecretArgs;
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
 *         var exampleSecretActionsEnvironmentSecret = new ActionsEnvironmentSecret(&#34;exampleSecretActionsEnvironmentSecret&#34;, ActionsEnvironmentSecretArgs.builder()        
 *             .environment(&#34;example_environment&#34;)
 *             .secretName(&#34;example_secret_name&#34;)
 *             .plaintextValue(var_.some_secret_string())
 *             .build());
 * 
 *         var exampleSecretIndex_actionsEnvironmentSecretActionsEnvironmentSecret = new ActionsEnvironmentSecret(&#34;exampleSecretIndex/actionsEnvironmentSecretActionsEnvironmentSecret&#34;, ActionsEnvironmentSecretArgs.builder()        
 *             .environment(&#34;example_environment&#34;)
 *             .secretName(&#34;example_secret_name&#34;)
 *             .encryptedValue(var_.some_encrypted_secret_string())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.GithubFunctions;
 * import com.pulumi.github.inputs.GetRepositoryArgs;
 * import com.pulumi.github.RepositoryEnvironment;
 * import com.pulumi.github.RepositoryEnvironmentArgs;
 * import com.pulumi.github.ActionsEnvironmentSecret;
 * import com.pulumi.github.ActionsEnvironmentSecretArgs;
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
 *         var repoEnvironment = new RepositoryEnvironment(&#34;repoEnvironment&#34;, RepositoryEnvironmentArgs.builder()        
 *             .repository(repo.applyValue(getRepositoryResult -&gt; getRepositoryResult.name()))
 *             .environment(&#34;example_environment&#34;)
 *             .build());
 * 
 *         var testSecret = new ActionsEnvironmentSecret(&#34;testSecret&#34;, ActionsEnvironmentSecretArgs.builder()        
 *             .repository(repo.applyValue(getRepositoryResult -&gt; getRepositoryResult.name()))
 *             .environment(repoEnvironment.environment())
 *             .secretName(&#34;test_secret_name&#34;)
 *             .plaintextValue(&#34;%s&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource does not support importing. If you&#39;d like to help contribute it, please visit our [GitHub page](https://github.com/integrations/terraform-provider-github)!
 * 
 */
@ResourceType(type="github:index/actionsEnvironmentSecret:ActionsEnvironmentSecret")
public class ActionsEnvironmentSecret extends com.pulumi.resources.CustomResource {
    /**
     * Date of actions_environment_secret creation.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Date of actions_environment_secret creation.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Encrypted value of the secret using the GitHub public key in Base64 format.
     * 
     */
    @Export(name="encryptedValue", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> encryptedValue;

    /**
     * @return Encrypted value of the secret using the GitHub public key in Base64 format.
     * 
     */
    public Output<Optional<String>> encryptedValue() {
        return Codegen.optional(this.encryptedValue);
    }
    /**
     * Name of the environment.
     * 
     */
    @Export(name="environment", refs={String.class}, tree="[0]")
    private Output<String> environment;

    /**
     * @return Name of the environment.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }
    /**
     * Plaintext value of the secret to be encrypted.
     * 
     */
    @Export(name="plaintextValue", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> plaintextValue;

    /**
     * @return Plaintext value of the secret to be encrypted.
     * 
     */
    public Output<Optional<String>> plaintextValue() {
        return Codegen.optional(this.plaintextValue);
    }
    /**
     * Name of the repository.
     * 
     */
    @Export(name="repository", refs={String.class}, tree="[0]")
    private Output<String> repository;

    /**
     * @return Name of the repository.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }
    /**
     * Name of the secret.
     * 
     */
    @Export(name="secretName", refs={String.class}, tree="[0]")
    private Output<String> secretName;

    /**
     * @return Name of the secret.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }
    /**
     * Date of actions_environment_secret update.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Date of actions_environment_secret update.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActionsEnvironmentSecret(String name) {
        this(name, ActionsEnvironmentSecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionsEnvironmentSecret(String name, ActionsEnvironmentSecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionsEnvironmentSecret(String name, ActionsEnvironmentSecretArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/actionsEnvironmentSecret:ActionsEnvironmentSecret", name, args == null ? ActionsEnvironmentSecretArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionsEnvironmentSecret(String name, Output<String> id, @Nullable ActionsEnvironmentSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/actionsEnvironmentSecret:ActionsEnvironmentSecret", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "encryptedValue",
                "plaintextValue"
            ))
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
    public static ActionsEnvironmentSecret get(String name, Output<String> id, @Nullable ActionsEnvironmentSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActionsEnvironmentSecret(name, id, state, options);
    }
}
