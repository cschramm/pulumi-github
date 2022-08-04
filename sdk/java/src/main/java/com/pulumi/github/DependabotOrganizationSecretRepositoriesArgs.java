// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DependabotOrganizationSecretRepositoriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DependabotOrganizationSecretRepositoriesArgs Empty = new DependabotOrganizationSecretRepositoriesArgs();

    @Import(name="secretName", required=true)
    private Output<String> secretName;

    public Output<String> secretName() {
        return this.secretName;
    }

    @Import(name="selectedRepositoryIds", required=true)
    private Output<List<Integer>> selectedRepositoryIds;

    public Output<List<Integer>> selectedRepositoryIds() {
        return this.selectedRepositoryIds;
    }

    private DependabotOrganizationSecretRepositoriesArgs() {}

    private DependabotOrganizationSecretRepositoriesArgs(DependabotOrganizationSecretRepositoriesArgs $) {
        this.secretName = $.secretName;
        this.selectedRepositoryIds = $.selectedRepositoryIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DependabotOrganizationSecretRepositoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DependabotOrganizationSecretRepositoriesArgs $;

        public Builder() {
            $ = new DependabotOrganizationSecretRepositoriesArgs();
        }

        public Builder(DependabotOrganizationSecretRepositoriesArgs defaults) {
            $ = new DependabotOrganizationSecretRepositoriesArgs(Objects.requireNonNull(defaults));
        }

        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        public Builder selectedRepositoryIds(Output<List<Integer>> selectedRepositoryIds) {
            $.selectedRepositoryIds = selectedRepositoryIds;
            return this;
        }

        public Builder selectedRepositoryIds(List<Integer> selectedRepositoryIds) {
            return selectedRepositoryIds(Output.of(selectedRepositoryIds));
        }

        public Builder selectedRepositoryIds(Integer... selectedRepositoryIds) {
            return selectedRepositoryIds(List.of(selectedRepositoryIds));
        }

        public DependabotOrganizationSecretRepositoriesArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            $.selectedRepositoryIds = Objects.requireNonNull($.selectedRepositoryIds, "expected parameter 'selectedRepositoryIds' to be non-null");
            return $;
        }
    }

}
