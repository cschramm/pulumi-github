// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationCustomRoleState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationCustomRoleState Empty = new OrganizationCustomRoleState();

    /**
     * The system role from which the role inherits permissions. Can be one of: `read`, `triage`, `write`, or `maintain`.
     * 
     */
    @Import(name="baseRole")
    private @Nullable Output<String> baseRole;

    /**
     * @return The system role from which the role inherits permissions. Can be one of: `read`, `triage`, `write`, or `maintain`.
     * 
     */
    public Optional<Output<String>> baseRole() {
        return Optional.ofNullable(this.baseRole);
    }

    /**
     * The description for the custom role.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the custom role.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the custom role.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the custom role.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    /**
     * @return A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
     * 
     */
    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private OrganizationCustomRoleState() {}

    private OrganizationCustomRoleState(OrganizationCustomRoleState $) {
        this.baseRole = $.baseRole;
        this.description = $.description;
        this.name = $.name;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationCustomRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationCustomRoleState $;

        public Builder() {
            $ = new OrganizationCustomRoleState();
        }

        public Builder(OrganizationCustomRoleState defaults) {
            $ = new OrganizationCustomRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseRole The system role from which the role inherits permissions. Can be one of: `read`, `triage`, `write`, or `maintain`.
         * 
         * @return builder
         * 
         */
        public Builder baseRole(@Nullable Output<String> baseRole) {
            $.baseRole = baseRole;
            return this;
        }

        /**
         * @param baseRole The system role from which the role inherits permissions. Can be one of: `read`, `triage`, `write`, or `maintain`.
         * 
         * @return builder
         * 
         */
        public Builder baseRole(String baseRole) {
            return baseRole(Output.of(baseRole));
        }

        /**
         * @param description The description for the custom role.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the custom role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param permissions A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public OrganizationCustomRoleState build() {
            return $;
        }
    }

}
