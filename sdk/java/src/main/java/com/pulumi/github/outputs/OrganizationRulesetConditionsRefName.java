// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OrganizationRulesetConditionsRefName {
    /**
     * @return (List of String) Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    private List<String> excludes;
    /**
     * @return (List of String) Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
     * 
     */
    private List<String> includes;

    private OrganizationRulesetConditionsRefName() {}
    /**
     * @return (List of String) Array of repository names or patterns to exclude. The condition will not pass if any of these patterns match.
     * 
     */
    public List<String> excludes() {
        return this.excludes;
    }
    /**
     * @return (List of String) Array of repository names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~ALL` to include all repositories.
     * 
     */
    public List<String> includes() {
        return this.includes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationRulesetConditionsRefName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> excludes;
        private List<String> includes;
        public Builder() {}
        public Builder(OrganizationRulesetConditionsRefName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.includes = defaults.includes;
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
        public Builder includes(List<String> includes) {
            this.includes = Objects.requireNonNull(includes);
            return this;
        }
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }
        public OrganizationRulesetConditionsRefName build() {
            final var o = new OrganizationRulesetConditionsRefName();
            o.excludes = excludes;
            o.includes = includes;
            return o;
        }
    }
}
