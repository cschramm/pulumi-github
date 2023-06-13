// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryCollaboratorsTeamArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryCollaboratorsTeamArgs Empty = new RepositoryCollaboratorsTeamArgs();

    /**
     * The permission of the outside collaborators for the repository.
     * Must be one of `pull`, `triage`, `push`, `maintain`, `admin` or the name of an existing [custom repository role](https://docs.github.com/en/enterprise-cloud@latest/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization) within the organisation. Defaults to `pull`.
     * Must be `push` for personal repositories. Defaults to `push`.
     * 
     */
    @Import(name="permission")
    private @Nullable Output<String> permission;

    /**
     * @return The permission of the outside collaborators for the repository.
     * Must be one of `pull`, `triage`, `push`, `maintain`, `admin` or the name of an existing [custom repository role](https://docs.github.com/en/enterprise-cloud@latest/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization) within the organisation. Defaults to `pull`.
     * Must be `push` for personal repositories. Defaults to `push`.
     * 
     */
    public Optional<Output<String>> permission() {
        return Optional.ofNullable(this.permission);
    }

    @Import(name="teamId", required=true)
    private Output<String> teamId;

    public Output<String> teamId() {
        return this.teamId;
    }

    private RepositoryCollaboratorsTeamArgs() {}

    private RepositoryCollaboratorsTeamArgs(RepositoryCollaboratorsTeamArgs $) {
        this.permission = $.permission;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryCollaboratorsTeamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryCollaboratorsTeamArgs $;

        public Builder() {
            $ = new RepositoryCollaboratorsTeamArgs();
        }

        public Builder(RepositoryCollaboratorsTeamArgs defaults) {
            $ = new RepositoryCollaboratorsTeamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permission The permission of the outside collaborators for the repository.
         * Must be one of `pull`, `triage`, `push`, `maintain`, `admin` or the name of an existing [custom repository role](https://docs.github.com/en/enterprise-cloud@latest/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization) within the organisation. Defaults to `pull`.
         * Must be `push` for personal repositories. Defaults to `push`.
         * 
         * @return builder
         * 
         */
        public Builder permission(@Nullable Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission The permission of the outside collaborators for the repository.
         * Must be one of `pull`, `triage`, `push`, `maintain`, `admin` or the name of an existing [custom repository role](https://docs.github.com/en/enterprise-cloud@latest/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization) within the organisation. Defaults to `pull`.
         * Must be `push` for personal repositories. Defaults to `push`.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        public Builder teamId(Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public RepositoryCollaboratorsTeamArgs build() {
            $.teamId = Objects.requireNonNull($.teamId, "expected parameter 'teamId' to be non-null");
            return $;
        }
    }

}