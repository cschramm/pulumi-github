// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationWebhooksWebhook {
    /**
     * @return `true` if the webhook is active.
     * 
     */
    private Boolean active;
    /**
     * @return the ID of the webhook.
     * 
     */
    private Integer id;
    /**
     * @return the name of the webhook.
     * 
     */
    private String name;
    /**
     * @return the type of the webhook.
     * 
     */
    private String type;
    /**
     * @return the url of the webhook.
     * 
     */
    private String url;

    private GetOrganizationWebhooksWebhook() {}
    /**
     * @return `true` if the webhook is active.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return the ID of the webhook.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return the name of the webhook.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return the type of the webhook.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return the url of the webhook.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationWebhooksWebhook defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private Integer id;
        private String name;
        private String type;
        private String url;
        public Builder() {}
        public Builder(GetOrganizationWebhooksWebhook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetOrganizationWebhooksWebhook build() {
            final var o = new GetOrganizationWebhooksWebhook();
            o.active = active;
            o.id = id;
            o.name = name;
            o.type = type;
            o.url = url;
            return o;
        }
    }
}
