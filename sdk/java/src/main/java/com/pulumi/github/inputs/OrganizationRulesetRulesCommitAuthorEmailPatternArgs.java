// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationRulesetRulesCommitAuthorEmailPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationRulesetRulesCommitAuthorEmailPatternArgs Empty = new OrganizationRulesetRulesCommitAuthorEmailPatternArgs();

    /**
     * (String) The name of the ruleset.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (String) The name of the ruleset.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If true, the rule will fail if the pattern matches.
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    /**
     * @return If true, the rule will fail if the pattern matches.
     * 
     */
    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    /**
     * The operator to use for matching. Can be one of: `starts_with`, `ends_with`, `contains`, `regex`.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator to use for matching. Can be one of: `starts_with`, `ends_with`, `contains`, `regex`.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The pattern to match with.
     * 
     */
    @Import(name="pattern", required=true)
    private Output<String> pattern;

    /**
     * @return The pattern to match with.
     * 
     */
    public Output<String> pattern() {
        return this.pattern;
    }

    private OrganizationRulesetRulesCommitAuthorEmailPatternArgs() {}

    private OrganizationRulesetRulesCommitAuthorEmailPatternArgs(OrganizationRulesetRulesCommitAuthorEmailPatternArgs $) {
        this.name = $.name;
        this.negate = $.negate;
        this.operator = $.operator;
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationRulesetRulesCommitAuthorEmailPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationRulesetRulesCommitAuthorEmailPatternArgs $;

        public Builder() {
            $ = new OrganizationRulesetRulesCommitAuthorEmailPatternArgs();
        }

        public Builder(OrganizationRulesetRulesCommitAuthorEmailPatternArgs defaults) {
            $ = new OrganizationRulesetRulesCommitAuthorEmailPatternArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name (String) The name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (String) The name of the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param negate If true, the rule will fail if the pattern matches.
         * 
         * @return builder
         * 
         */
        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        /**
         * @param negate If true, the rule will fail if the pattern matches.
         * 
         * @return builder
         * 
         */
        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        /**
         * @param operator The operator to use for matching. Can be one of: `starts_with`, `ends_with`, `contains`, `regex`.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use for matching. Can be one of: `starts_with`, `ends_with`, `contains`, `regex`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param pattern The pattern to match with.
         * 
         * @return builder
         * 
         */
        public Builder pattern(Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern The pattern to match with.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public OrganizationRulesetRulesCommitAuthorEmailPatternArgs build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("OrganizationRulesetRulesCommitAuthorEmailPatternArgs", "operator");
            }
            if ($.pattern == null) {
                throw new MissingRequiredPropertyException("OrganizationRulesetRulesCommitAuthorEmailPatternArgs", "pattern");
            }
            return $;
        }
    }

}
