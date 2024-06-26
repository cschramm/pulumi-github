// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationRulesetConditionsRepositoryNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationRulesetConditionsRepositoryNameArgs Empty = new OrganizationRulesetConditionsRepositoryNameArgs();

    /**
     * Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    @Import(name="excludes", required=true)
    private Output<List<String>> excludes;

    /**
     * @return Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    public Output<List<String>> excludes() {
        return this.excludes;
    }

    /**
     * Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
     * 
     */
    @Import(name="includes", required=true)
    private Output<List<String>> includes;

    /**
     * @return Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
     * 
     */
    public Output<List<String>> includes() {
        return this.includes;
    }

    /**
     * Whether renaming of target repositories is prevented.
     * 
     */
    @Import(name="protected")
    private @Nullable Output<Boolean> protected_;

    /**
     * @return Whether renaming of target repositories is prevented.
     * 
     */
    public Optional<Output<Boolean>> protected_() {
        return Optional.ofNullable(this.protected_);
    }

    private OrganizationRulesetConditionsRepositoryNameArgs() {}

    private OrganizationRulesetConditionsRepositoryNameArgs(OrganizationRulesetConditionsRepositoryNameArgs $) {
        this.excludes = $.excludes;
        this.includes = $.includes;
        this.protected_ = $.protected_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationRulesetConditionsRepositoryNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationRulesetConditionsRepositoryNameArgs $;

        public Builder() {
            $ = new OrganizationRulesetConditionsRepositoryNameArgs();
        }

        public Builder(OrganizationRulesetConditionsRepositoryNameArgs defaults) {
            $ = new OrganizationRulesetConditionsRepositoryNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludes Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
         * 
         * @return builder
         * 
         */
        public Builder excludes(Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        /**
         * @param excludes Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
         * 
         * @return builder
         * 
         */
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param includes Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
         * 
         * @return builder
         * 
         */
        public Builder includes(Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
         * 
         * @return builder
         * 
         */
        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        /**
         * @param includes Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
         * 
         * @return builder
         * 
         */
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        /**
         * @param protected_ Whether renaming of target repositories is prevented.
         * 
         * @return builder
         * 
         */
        public Builder protected_(@Nullable Output<Boolean> protected_) {
            $.protected_ = protected_;
            return this;
        }

        /**
         * @param protected_ Whether renaming of target repositories is prevented.
         * 
         * @return builder
         * 
         */
        public Builder protected_(Boolean protected_) {
            return protected_(Output.of(protected_));
        }

        public OrganizationRulesetConditionsRepositoryNameArgs build() {
            if ($.excludes == null) {
                throw new MissingRequiredPropertyException("OrganizationRulesetConditionsRepositoryNameArgs", "excludes");
            }
            if ($.includes == null) {
                throw new MissingRequiredPropertyException("OrganizationRulesetConditionsRepositoryNameArgs", "includes");
            }
            return $;
        }
    }

}
