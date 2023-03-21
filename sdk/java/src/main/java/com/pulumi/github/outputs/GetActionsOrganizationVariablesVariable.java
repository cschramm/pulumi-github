// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActionsOrganizationVariablesVariable {
    /**
     * @return Timestamp of the variable creation
     * 
     */
    private String createdAt;
    /**
     * @return Name of the variable
     * 
     */
    private String name;
    /**
     * @return Timestamp of the variable last update
     * 
     */
    private String updatedAt;
    /**
     * @return Value of the variable
     * 
     */
    private String value;
    /**
     * @return Visibility of the variable
     * 
     */
    private String visibility;

    private GetActionsOrganizationVariablesVariable() {}
    /**
     * @return Timestamp of the variable creation
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Name of the variable
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Timestamp of the variable last update
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }
    /**
     * @return Value of the variable
     * 
     */
    public String value() {
        return this.value;
    }
    /**
     * @return Visibility of the variable
     * 
     */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionsOrganizationVariablesVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdAt;
        private String name;
        private String updatedAt;
        private String value;
        private String visibility;
        public Builder() {}
        public Builder(GetActionsOrganizationVariablesVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.name = defaults.name;
    	      this.updatedAt = defaults.updatedAt;
    	      this.value = defaults.value;
    	      this.visibility = defaults.visibility;
        }

        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        @CustomType.Setter
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }
        public GetActionsOrganizationVariablesVariable build() {
            final var o = new GetActionsOrganizationVariablesVariable();
            o.createdAt = createdAt;
            o.name = name;
            o.updatedAt = updatedAt;
            o.value = value;
            o.visibility = visibility;
            return o;
        }
    }
}