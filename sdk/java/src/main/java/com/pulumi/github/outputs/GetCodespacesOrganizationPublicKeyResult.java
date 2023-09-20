// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCodespacesOrganizationPublicKeyResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Actual key retrieved.
     * 
     */
    private String key;
    /**
     * @return ID of the key that has been retrieved.
     * 
     */
    private String keyId;

    private GetCodespacesOrganizationPublicKeyResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Actual key retrieved.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return ID of the key that has been retrieved.
     * 
     */
    public String keyId() {
        return this.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCodespacesOrganizationPublicKeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String key;
        private String keyId;
        public Builder() {}
        public Builder(GetCodespacesOrganizationPublicKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.keyId = defaults.keyId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public GetCodespacesOrganizationPublicKeyResult build() {
            final var o = new GetCodespacesOrganizationPublicKeyResult();
            o.id = id;
            o.key = key;
            o.keyId = keyId;
            return o;
        }
    }
}