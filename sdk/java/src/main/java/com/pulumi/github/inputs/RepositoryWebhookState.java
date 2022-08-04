// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.github.inputs.RepositoryWebhookConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryWebhookState extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryWebhookState Empty = new RepositoryWebhookState();

    /**
     * Indicate if the webhook should receive events. Defaults to `true`.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Indicate if the webhook should receive events. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Configuration block for the webhook. Detailed below.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<RepositoryWebhookConfigurationArgs> configuration;

    /**
     * @return Configuration block for the webhook. Detailed below.
     * 
     */
    public Optional<Output<RepositoryWebhookConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
     * 
     */
    @Import(name="events")
    private @Nullable Output<List<String>> events;

    /**
     * @return A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
     * 
     */
    public Optional<Output<List<String>>> events() {
        return Optional.ofNullable(this.events);
    }

    /**
     * The repository of the webhook.
     * 
     */
    @Import(name="repository")
    private @Nullable Output<String> repository;

    /**
     * @return The repository of the webhook.
     * 
     */
    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    /**
     * The URL of the webhook.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the webhook.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private RepositoryWebhookState() {}

    private RepositoryWebhookState(RepositoryWebhookState $) {
        this.active = $.active;
        this.configuration = $.configuration;
        this.etag = $.etag;
        this.events = $.events;
        this.repository = $.repository;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryWebhookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryWebhookState $;

        public Builder() {
            $ = new RepositoryWebhookState();
        }

        public Builder(RepositoryWebhookState defaults) {
            $ = new RepositoryWebhookState(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Indicate if the webhook should receive events. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Indicate if the webhook should receive events. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param configuration Configuration block for the webhook. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<RepositoryWebhookConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Configuration block for the webhook. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(RepositoryWebhookConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param events A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
         * 
         * @return builder
         * 
         */
        public Builder events(@Nullable Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param repository The repository of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The repository of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param url The URL of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public RepositoryWebhookState build() {
            return $;
        }
    }

}
