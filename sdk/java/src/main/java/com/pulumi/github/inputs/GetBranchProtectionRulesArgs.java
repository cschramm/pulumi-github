// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetBranchProtectionRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBranchProtectionRulesArgs Empty = new GetBranchProtectionRulesArgs();

    /**
     * The GitHub repository name.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The GitHub repository name.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    private GetBranchProtectionRulesArgs() {}

    private GetBranchProtectionRulesArgs(GetBranchProtectionRulesArgs $) {
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBranchProtectionRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBranchProtectionRulesArgs $;

        public Builder() {
            $ = new GetBranchProtectionRulesArgs();
        }

        public Builder(GetBranchProtectionRulesArgs defaults) {
            $ = new GetBranchProtectionRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repository The GitHub repository name.
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The GitHub repository name.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public GetBranchProtectionRulesArgs build() {
            if ($.repository == null) {
                throw new MissingRequiredPropertyException("GetBranchProtectionRulesArgs", "repository");
            }
            return $;
        }
    }

}
