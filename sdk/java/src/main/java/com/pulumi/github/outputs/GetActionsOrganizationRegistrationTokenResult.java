// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActionsOrganizationRegistrationTokenResult {
    /**
     * @return The token expiration date.
     * 
     */
    private Integer expiresAt;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The token that has been retrieved.
     * 
     */
    private String token;

    private GetActionsOrganizationRegistrationTokenResult() {}
    /**
     * @return The token expiration date.
     * 
     */
    public Integer expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The token that has been retrieved.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionsOrganizationRegistrationTokenResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer expiresAt;
        private String id;
        private String token;
        public Builder() {}
        public Builder(GetActionsOrganizationRegistrationTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder expiresAt(Integer expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public GetActionsOrganizationRegistrationTokenResult build() {
            final var o = new GetActionsOrganizationRegistrationTokenResult();
            o.expiresAt = expiresAt;
            o.id = id;
            o.token = token;
            return o;
        }
    }
}