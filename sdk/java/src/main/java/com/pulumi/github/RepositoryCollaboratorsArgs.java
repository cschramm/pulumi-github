// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.github.inputs.RepositoryCollaboratorsTeamArgs;
import com.pulumi.github.inputs.RepositoryCollaboratorsUserArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryCollaboratorsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryCollaboratorsArgs Empty = new RepositoryCollaboratorsArgs();

    /**
     * The GitHub repository
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The GitHub repository
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    /**
     * List of teams
     * 
     */
    @Import(name="teams")
    private @Nullable Output<List<RepositoryCollaboratorsTeamArgs>> teams;

    /**
     * @return List of teams
     * 
     */
    public Optional<Output<List<RepositoryCollaboratorsTeamArgs>>> teams() {
        return Optional.ofNullable(this.teams);
    }

    /**
     * List of users
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<RepositoryCollaboratorsUserArgs>> users;

    /**
     * @return List of users
     * 
     */
    public Optional<Output<List<RepositoryCollaboratorsUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private RepositoryCollaboratorsArgs() {}

    private RepositoryCollaboratorsArgs(RepositoryCollaboratorsArgs $) {
        this.repository = $.repository;
        this.teams = $.teams;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryCollaboratorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryCollaboratorsArgs $;

        public Builder() {
            $ = new RepositoryCollaboratorsArgs();
        }

        public Builder(RepositoryCollaboratorsArgs defaults) {
            $ = new RepositoryCollaboratorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repository The GitHub repository
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The GitHub repository
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param teams List of teams
         * 
         * @return builder
         * 
         */
        public Builder teams(@Nullable Output<List<RepositoryCollaboratorsTeamArgs>> teams) {
            $.teams = teams;
            return this;
        }

        /**
         * @param teams List of teams
         * 
         * @return builder
         * 
         */
        public Builder teams(List<RepositoryCollaboratorsTeamArgs> teams) {
            return teams(Output.of(teams));
        }

        /**
         * @param teams List of teams
         * 
         * @return builder
         * 
         */
        public Builder teams(RepositoryCollaboratorsTeamArgs... teams) {
            return teams(List.of(teams));
        }

        /**
         * @param users List of users
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<RepositoryCollaboratorsUserArgs>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users List of users
         * 
         * @return builder
         * 
         */
        public Builder users(List<RepositoryCollaboratorsUserArgs> users) {
            return users(Output.of(users));
        }

        /**
         * @param users List of users
         * 
         * @return builder
         * 
         */
        public Builder users(RepositoryCollaboratorsUserArgs... users) {
            return users(List.of(users));
        }

        public RepositoryCollaboratorsArgs build() {
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
