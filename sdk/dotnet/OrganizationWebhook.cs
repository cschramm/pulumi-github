// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    /// <summary>
    /// This resource allows you to create and manage webhooks for GitHub organization.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Github = Pulumi.Github;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new Github.OrganizationWebhook("foo", new()
    ///     {
    ///         Active = false,
    ///         Configuration = new Github.Inputs.OrganizationWebhookConfigurationArgs
    ///         {
    ///             ContentType = "form",
    ///             InsecureSsl = false,
    ///             Url = "https://google.de/",
    ///         },
    ///         Events = new[]
    ///         {
    ///             "issues",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Organization webhooks can be imported using the `id` of the webhook. The `id` of the webhook can be found in the URL of the webhook. For example, `"https://github.com/organizations/foo-org/settings/hooks/123456789"`.
    /// 
    /// ```sh
    ///  $ pulumi import github:index/organizationWebhook:OrganizationWebhook terraform 123456789
    /// ```
    /// 
    ///  If secret is populated in the webhook's configuration, the value will be imported as "********".
    /// </summary>
    [GithubResourceType("github:index/organizationWebhook:OrganizationWebhook")]
    public partial class OrganizationWebhook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicate of the webhook should receive events. Defaults to `true`.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.OrganizationWebhookConfiguration?> Configuration { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/)
        /// </summary>
        [Output("events")]
        public Output<ImmutableArray<string>> Events { get; private set; } = null!;

        /// <summary>
        /// URL of the webhook
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a OrganizationWebhook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrganizationWebhook(string name, OrganizationWebhookArgs args, CustomResourceOptions? options = null)
            : base("github:index/organizationWebhook:OrganizationWebhook", name, args ?? new OrganizationWebhookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrganizationWebhook(string name, Input<string> id, OrganizationWebhookState? state = null, CustomResourceOptions? options = null)
            : base("github:index/organizationWebhook:OrganizationWebhook", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing OrganizationWebhook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrganizationWebhook Get(string name, Input<string> id, OrganizationWebhookState? state = null, CustomResourceOptions? options = null)
        {
            return new OrganizationWebhook(name, id, state, options);
        }
    }

    public sealed class OrganizationWebhookArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicate of the webhook should receive events. Defaults to `true`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.OrganizationWebhookConfigurationArgs>? Configuration { get; set; }

        [Input("events", required: true)]
        private InputList<string>? _events;

        /// <summary>
        /// A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/)
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        public OrganizationWebhookArgs()
        {
        }
        public static new OrganizationWebhookArgs Empty => new OrganizationWebhookArgs();
    }

    public sealed class OrganizationWebhookState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicate of the webhook should receive events. Defaults to `true`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.OrganizationWebhookConfigurationGetArgs>? Configuration { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("events")]
        private InputList<string>? _events;

        /// <summary>
        /// A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/)
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        /// <summary>
        /// URL of the webhook
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public OrganizationWebhookState()
        {
        }
        public static new OrganizationWebhookState Empty => new OrganizationWebhookState();
    }
}
