// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.github.inputs.RepositoryEnvironmentDeploymentBranchPolicyArgs;
import com.pulumi.github.inputs.RepositoryEnvironmentReviewerArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryEnvironmentArgs Empty = new RepositoryEnvironmentArgs();

    @Import(name="deploymentBranchPolicy")
    private @Nullable Output<RepositoryEnvironmentDeploymentBranchPolicyArgs> deploymentBranchPolicy;

    public Optional<Output<RepositoryEnvironmentDeploymentBranchPolicyArgs>> deploymentBranchPolicy() {
        return Optional.ofNullable(this.deploymentBranchPolicy);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="environment", required=true)
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
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The repository of the environment.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    @Import(name="reviewers")
    private @Nullable Output<List<RepositoryEnvironmentReviewerArgs>> reviewers;

    public Optional<Output<List<RepositoryEnvironmentReviewerArgs>>> reviewers() {
        return Optional.ofNullable(this.reviewers);
    }

    /**
     * Amount of time to delay a job after the job is initially triggered.
     * 
     */
    @Import(name="waitTimer")
    private @Nullable Output<Integer> waitTimer;

    /**
     * @return Amount of time to delay a job after the job is initially triggered.
     * 
     */
    public Optional<Output<Integer>> waitTimer() {
        return Optional.ofNullable(this.waitTimer);
    }

    private RepositoryEnvironmentArgs() {}

    private RepositoryEnvironmentArgs(RepositoryEnvironmentArgs $) {
        this.deploymentBranchPolicy = $.deploymentBranchPolicy;
        this.environment = $.environment;
        this.repository = $.repository;
        this.reviewers = $.reviewers;
        this.waitTimer = $.waitTimer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryEnvironmentArgs $;

        public Builder() {
            $ = new RepositoryEnvironmentArgs();
        }

        public Builder(RepositoryEnvironmentArgs defaults) {
            $ = new RepositoryEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder deploymentBranchPolicy(@Nullable Output<RepositoryEnvironmentDeploymentBranchPolicyArgs> deploymentBranchPolicy) {
            $.deploymentBranchPolicy = deploymentBranchPolicy;
            return this;
        }

        public Builder deploymentBranchPolicy(RepositoryEnvironmentDeploymentBranchPolicyArgs deploymentBranchPolicy) {
            return deploymentBranchPolicy(Output.of(deploymentBranchPolicy));
        }

        /**
         * @param environment The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param repository The repository of the environment.
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The repository of the environment.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder reviewers(@Nullable Output<List<RepositoryEnvironmentReviewerArgs>> reviewers) {
            $.reviewers = reviewers;
            return this;
        }

        public Builder reviewers(List<RepositoryEnvironmentReviewerArgs> reviewers) {
            return reviewers(Output.of(reviewers));
        }

        public Builder reviewers(RepositoryEnvironmentReviewerArgs... reviewers) {
            return reviewers(List.of(reviewers));
        }

        /**
         * @param waitTimer Amount of time to delay a job after the job is initially triggered.
         * 
         * @return builder
         * 
         */
        public Builder waitTimer(@Nullable Output<Integer> waitTimer) {
            $.waitTimer = waitTimer;
            return this;
        }

        /**
         * @param waitTimer Amount of time to delay a job after the job is initially triggered.
         * 
         * @return builder
         * 
         */
        public Builder waitTimer(Integer waitTimer) {
            return waitTimer(Output.of(waitTimer));
        }

        public RepositoryEnvironmentArgs build() {
            $.environment = Objects.requireNonNull($.environment, "expected parameter 'environment' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
