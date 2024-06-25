// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EnterpriseActionsPermissionsEnabledOrganizationsConfig {
    /**
     * @return List of organization IDs to enable for GitHub Actions.
     * 
     */
    private List<Integer> organizationIds;

    private EnterpriseActionsPermissionsEnabledOrganizationsConfig() {}
    /**
     * @return List of organization IDs to enable for GitHub Actions.
     * 
     */
    public List<Integer> organizationIds() {
        return this.organizationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseActionsPermissionsEnabledOrganizationsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> organizationIds;
        public Builder() {}
        public Builder(EnterpriseActionsPermissionsEnabledOrganizationsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationIds = defaults.organizationIds;
        }

        @CustomType.Setter
        public Builder organizationIds(List<Integer> organizationIds) {
            if (organizationIds == null) {
              throw new MissingRequiredPropertyException("EnterpriseActionsPermissionsEnabledOrganizationsConfig", "organizationIds");
            }
            this.organizationIds = organizationIds;
            return this;
        }
        public Builder organizationIds(Integer... organizationIds) {
            return organizationIds(List.of(organizationIds));
        }
        public EnterpriseActionsPermissionsEnabledOrganizationsConfig build() {
            final var _resultValue = new EnterpriseActionsPermissionsEnabledOrganizationsConfig();
            _resultValue.organizationIds = organizationIds;
            return _resultValue;
        }
    }
}