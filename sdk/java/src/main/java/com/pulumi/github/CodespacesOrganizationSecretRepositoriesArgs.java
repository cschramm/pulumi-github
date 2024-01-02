// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CodespacesOrganizationSecretRepositoriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CodespacesOrganizationSecretRepositoriesArgs Empty = new CodespacesOrganizationSecretRepositoriesArgs();

    /**
     * Name of the existing secret
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return Name of the existing secret
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    /**
     * An array of repository ids that can access the organization secret.
     * 
     */
    @Import(name="selectedRepositoryIds", required=true)
    private Output<List<Integer>> selectedRepositoryIds;

    /**
     * @return An array of repository ids that can access the organization secret.
     * 
     */
    public Output<List<Integer>> selectedRepositoryIds() {
        return this.selectedRepositoryIds;
    }

    private CodespacesOrganizationSecretRepositoriesArgs() {}

    private CodespacesOrganizationSecretRepositoriesArgs(CodespacesOrganizationSecretRepositoriesArgs $) {
        this.secretName = $.secretName;
        this.selectedRepositoryIds = $.selectedRepositoryIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CodespacesOrganizationSecretRepositoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodespacesOrganizationSecretRepositoriesArgs $;

        public Builder() {
            $ = new CodespacesOrganizationSecretRepositoriesArgs();
        }

        public Builder(CodespacesOrganizationSecretRepositoriesArgs defaults) {
            $ = new CodespacesOrganizationSecretRepositoriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretName Name of the existing secret
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName Name of the existing secret
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param selectedRepositoryIds An array of repository ids that can access the organization secret.
         * 
         * @return builder
         * 
         */
        public Builder selectedRepositoryIds(Output<List<Integer>> selectedRepositoryIds) {
            $.selectedRepositoryIds = selectedRepositoryIds;
            return this;
        }

        /**
         * @param selectedRepositoryIds An array of repository ids that can access the organization secret.
         * 
         * @return builder
         * 
         */
        public Builder selectedRepositoryIds(List<Integer> selectedRepositoryIds) {
            return selectedRepositoryIds(Output.of(selectedRepositoryIds));
        }

        /**
         * @param selectedRepositoryIds An array of repository ids that can access the organization secret.
         * 
         * @return builder
         * 
         */
        public Builder selectedRepositoryIds(Integer... selectedRepositoryIds) {
            return selectedRepositoryIds(List.of(selectedRepositoryIds));
        }

        public CodespacesOrganizationSecretRepositoriesArgs build() {
            if ($.secretName == null) {
                throw new MissingRequiredPropertyException("CodespacesOrganizationSecretRepositoriesArgs", "secretName");
            }
            if ($.selectedRepositoryIds == null) {
                throw new MissingRequiredPropertyException("CodespacesOrganizationSecretRepositoriesArgs", "selectedRepositoryIds");
            }
            return $;
        }
    }

}
