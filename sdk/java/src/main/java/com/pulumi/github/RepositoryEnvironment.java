// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.RepositoryEnvironmentArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.RepositoryEnvironmentState;
import com.pulumi.github.outputs.RepositoryEnvironmentDeploymentBranchPolicy;
import com.pulumi.github.outputs.RepositoryEnvironmentReviewer;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to create and manage environments for a GitHub repository.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.GithubFunctions;
 * import com.pulumi.github.inputs.GetUserArgs;
 * import com.pulumi.github.Repository;
 * import com.pulumi.github.RepositoryArgs;
 * import com.pulumi.github.RepositoryEnvironment;
 * import com.pulumi.github.RepositoryEnvironmentArgs;
 * import com.pulumi.github.inputs.RepositoryEnvironmentReviewerArgs;
 * import com.pulumi.github.inputs.RepositoryEnvironmentDeploymentBranchPolicyArgs;
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
 *         final var current = GithubFunctions.getUser(GetUserArgs.builder()
 *             .username(&#34;&#34;)
 *             .build());
 * 
 *         var exampleRepository = new Repository(&#34;exampleRepository&#34;, RepositoryArgs.builder()        
 *             .description(&#34;My awesome codebase&#34;)
 *             .build());
 * 
 *         var exampleRepositoryEnvironment = new RepositoryEnvironment(&#34;exampleRepositoryEnvironment&#34;, RepositoryEnvironmentArgs.builder()        
 *             .environment(&#34;example&#34;)
 *             .repository(exampleRepository.name())
 *             .reviewers(RepositoryEnvironmentReviewerArgs.builder()
 *                 .users(current.applyValue(getUserResult -&gt; getUserResult.id()))
 *                 .build())
 *             .deploymentBranchPolicy(RepositoryEnvironmentDeploymentBranchPolicyArgs.builder()
 *                 .protectedBranches(true)
 *                 .customBranchPolicies(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * GitHub Repository Environment can be imported using an ID made up of `name` of the repository combined with the `environment` name of the environment, separated by a `:` character, e.g.
 * 
 * ```sh
 *  $ pulumi import github:index/repositoryEnvironment:RepositoryEnvironment daily terraform:daily
 * ```
 * 
 */
@ResourceType(type="github:index/repositoryEnvironment:RepositoryEnvironment")
public class RepositoryEnvironment extends com.pulumi.resources.CustomResource {
    /**
     * The deployment branch policy configuration
     * 
     */
    @Export(name="deploymentBranchPolicy", type=RepositoryEnvironmentDeploymentBranchPolicy.class, parameters={})
    private Output</* @Nullable */ RepositoryEnvironmentDeploymentBranchPolicy> deploymentBranchPolicy;

    /**
     * @return The deployment branch policy configuration
     * 
     */
    public Output<Optional<RepositoryEnvironmentDeploymentBranchPolicy>> deploymentBranchPolicy() {
        return Codegen.optional(this.deploymentBranchPolicy);
    }
    /**
     * The name of the environment.
     * 
     */
    @Export(name="environment", type=String.class, parameters={})
    private Output<String> environment;

    /**
     * @return The name of the environment.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }
    /**
     * The repository of the environment.
     * 
     */
    @Export(name="repository", type=String.class, parameters={})
    private Output<String> repository;

    /**
     * @return The repository of the environment.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }
    /**
     * The environment reviewers configuration.
     * 
     */
    @Export(name="reviewers", type=List.class, parameters={RepositoryEnvironmentReviewer.class})
    private Output</* @Nullable */ List<RepositoryEnvironmentReviewer>> reviewers;

    /**
     * @return The environment reviewers configuration.
     * 
     */
    public Output<Optional<List<RepositoryEnvironmentReviewer>>> reviewers() {
        return Codegen.optional(this.reviewers);
    }
    /**
     * Amount of time to delay a job after the job is initially triggered.
     * 
     */
    @Export(name="waitTimer", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> waitTimer;

    /**
     * @return Amount of time to delay a job after the job is initially triggered.
     * 
     */
    public Output<Optional<Integer>> waitTimer() {
        return Codegen.optional(this.waitTimer);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepositoryEnvironment(String name) {
        this(name, RepositoryEnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepositoryEnvironment(String name, RepositoryEnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryEnvironment(String name, RepositoryEnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/repositoryEnvironment:RepositoryEnvironment", name, args == null ? RepositoryEnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RepositoryEnvironment(String name, Output<String> id, @Nullable RepositoryEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/repositoryEnvironment:RepositoryEnvironment", name, state, makeResourceOptions(options, id));
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
    public static RepositoryEnvironment get(String name, Output<String> id, @Nullable RepositoryEnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryEnvironment(name, id, state, options);
    }
}
