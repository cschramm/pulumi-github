// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.github.inputs.RepositoryWebhookConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryWebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryWebhookArgs Empty = new RepositoryWebhookArgs();

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

    /**
     * A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * The repository of the webhook.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The repository of the webhook.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    private RepositoryWebhookArgs() {}

    private RepositoryWebhookArgs(RepositoryWebhookArgs $) {
        this.active = $.active;
        this.configuration = $.configuration;
        this.events = $.events;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryWebhookArgs $;

        public Builder() {
            $ = new RepositoryWebhookArgs();
        }

        public Builder(RepositoryWebhookArgs defaults) {
            $ = new RepositoryWebhookArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param events A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
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
        public Builder repository(Output<String> repository) {
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

        public RepositoryWebhookArgs build() {
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
