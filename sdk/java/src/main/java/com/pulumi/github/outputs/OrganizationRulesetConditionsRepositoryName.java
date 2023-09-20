// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationRulesetConditionsRepositoryName {
    /**
     * @return (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    private List<String> excludes;
    /**
     * @return (List of String) Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
     * 
     */
    private List<String> inlcudes;
    private @Nullable Boolean protected_;

    private OrganizationRulesetConditionsRepositoryName() {}
    /**
     * @return (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    public List<String> excludes() {
        return this.excludes;
    }
    /**
     * @return (List of String) Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
     * 
     */
    public List<String> inlcudes() {
        return this.inlcudes;
    }
    public Optional<Boolean> protected_() {
        return Optional.ofNullable(this.protected_);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationRulesetConditionsRepositoryName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> excludes;
        private List<String> inlcudes;
        private @Nullable Boolean protected_;
        public Builder() {}
        public Builder(OrganizationRulesetConditionsRepositoryName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.inlcudes = defaults.inlcudes;
    	      this.protected_ = defaults.protected_;
        }

        @CustomType.Setter
        public Builder excludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }
        @CustomType.Setter
        public Builder inlcudes(List<String> inlcudes) {
            this.inlcudes = Objects.requireNonNull(inlcudes);
            return this;
        }
        public Builder inlcudes(String... inlcudes) {
            return inlcudes(List.of(inlcudes));
        }
        @CustomType.Setter("protected")
        public Builder protected_(@Nullable Boolean protected_) {
            this.protected_ = protected_;
            return this;
        }
        public OrganizationRulesetConditionsRepositoryName build() {
            final var o = new OrganizationRulesetConditionsRepositoryName();
            o.excludes = excludes;
            o.inlcudes = inlcudes;
            o.protected_ = protected_;
            return o;
        }
    }
}