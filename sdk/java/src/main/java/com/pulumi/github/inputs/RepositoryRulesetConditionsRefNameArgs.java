// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RepositoryRulesetConditionsRefNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryRulesetConditionsRefNameArgs Empty = new RepositoryRulesetConditionsRefNameArgs();

    /**
     * (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    @Import(name="excludes", required=true)
    private Output<List<String>> excludes;

    /**
     * @return (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    public Output<List<String>> excludes() {
        return this.excludes;
    }

    /**
     * (List of String) Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
     * 
     */
    @Import(name="includes", required=true)
    private Output<List<String>> includes;

    /**
     * @return (List of String) Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
     * 
     */
    public Output<List<String>> includes() {
        return this.includes;
    }

    private RepositoryRulesetConditionsRefNameArgs() {}

    private RepositoryRulesetConditionsRefNameArgs(RepositoryRulesetConditionsRefNameArgs $) {
        this.excludes = $.excludes;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryRulesetConditionsRefNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryRulesetConditionsRefNameArgs $;

        public Builder() {
            $ = new RepositoryRulesetConditionsRefNameArgs();
        }

        public Builder(RepositoryRulesetConditionsRefNameArgs defaults) {
            $ = new RepositoryRulesetConditionsRefNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludes (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
         * 
         * @return builder
         * 
         */
        public Builder excludes(Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        /**
         * @param excludes (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
         * 
         * @return builder
         * 
         */
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param includes (List of String) Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
         * 
         * @return builder
         * 
         */
        public Builder includes(Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes (List of String) Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
         * 
         * @return builder
         * 
         */
        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        /**
         * @param includes (List of String) Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
         * 
         * @return builder
         * 
         */
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public RepositoryRulesetConditionsRefNameArgs build() {
            if ($.excludes == null) {
                throw new MissingRequiredPropertyException("RepositoryRulesetConditionsRefNameArgs", "excludes");
            }
            if ($.includes == null) {
                throw new MissingRequiredPropertyException("RepositoryRulesetConditionsRefNameArgs", "includes");
            }
            return $;
        }
    }

}
