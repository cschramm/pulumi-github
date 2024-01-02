// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryEnvironmentReviewer {
    /**
     * @return Up to 6 IDs for teams who may review jobs that reference the environment. Reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
     * 
     */
    private @Nullable List<Integer> teams;
    /**
     * @return Up to 6 IDs for users who may review jobs that reference the environment. Reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
     * 
     */
    private @Nullable List<Integer> users;

    private RepositoryEnvironmentReviewer() {}
    /**
     * @return Up to 6 IDs for teams who may review jobs that reference the environment. Reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
     * 
     */
    public List<Integer> teams() {
        return this.teams == null ? List.of() : this.teams;
    }
    /**
     * @return Up to 6 IDs for users who may review jobs that reference the environment. Reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
     * 
     */
    public List<Integer> users() {
        return this.users == null ? List.of() : this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryEnvironmentReviewer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Integer> teams;
        private @Nullable List<Integer> users;
        public Builder() {}
        public Builder(RepositoryEnvironmentReviewer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.teams = defaults.teams;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder teams(@Nullable List<Integer> teams) {

            this.teams = teams;
            return this;
        }
        public Builder teams(Integer... teams) {
            return teams(List.of(teams));
        }
        @CustomType.Setter
        public Builder users(@Nullable List<Integer> users) {

            this.users = users;
            return this;
        }
        public Builder users(Integer... users) {
            return users(List.of(users));
        }
        public RepositoryEnvironmentReviewer build() {
            final var _resultValue = new RepositoryEnvironmentReviewer();
            _resultValue.teams = teams;
            _resultValue.users = users;
            return _resultValue;
        }
    }
}
