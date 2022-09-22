// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ActionsOrganizationPermissionsEnabledRepositoriesConfig {
    private List<Integer> repositoryIds;

    private ActionsOrganizationPermissionsEnabledRepositoriesConfig() {}
    public List<Integer> repositoryIds() {
        return this.repositoryIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionsOrganizationPermissionsEnabledRepositoriesConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> repositoryIds;
        public Builder() {}
        public Builder(ActionsOrganizationPermissionsEnabledRepositoriesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryIds = defaults.repositoryIds;
        }

        @CustomType.Setter
        public Builder repositoryIds(List<Integer> repositoryIds) {
            this.repositoryIds = Objects.requireNonNull(repositoryIds);
            return this;
        }
        public Builder repositoryIds(Integer... repositoryIds) {
            return repositoryIds(List.of(repositoryIds));
        }
        public ActionsOrganizationPermissionsEnabledRepositoriesConfig build() {
            final var o = new ActionsOrganizationPermissionsEnabledRepositoriesConfig();
            o.repositoryIds = repositoryIds;
            return o;
        }
    }
}