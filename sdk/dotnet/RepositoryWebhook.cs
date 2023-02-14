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
    /// This resource allows you to create and manage webhooks for repositories within your
    /// GitHub organization or personal account.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Github = Pulumi.Github;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var repo = new Github.Repository("repo", new()
    ///     {
    ///         Description = "Terraform acceptance tests",
    ///         HomepageUrl = "http://example.com/",
    ///         Visibility = "public",
    ///     });
    /// 
    ///     var foo = new Github.RepositoryWebhook("foo", new()
    ///     {
    ///         Repository = repo.Name,
    ///         Configuration = new Github.Inputs.RepositoryWebhookConfigurationArgs
    ///         {
    ///             Url = "https://google.de/",
    ///             ContentType = "form",
    ///             InsecureSsl = false,
    ///         },
    ///         Active = false,
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
    /// Repository webhooks can be imported using the `name` of the repository, combined with the `id` of the webhook, separated by a `/` character. The `id` of the webhook can be found in the URL of the webhook. For example`"https://github.com/foo-org/foo-repo/settings/hooks/14711452"`. Importing uses the name of the repository, as well as the ID of the webhook, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import github:index/repositoryWebhook:RepositoryWebhook terraform terraform/11235813
    /// ```
    /// 
    ///  If secret is populated in the webhook's configuration, the value will be imported as "********".
    /// </summary>
    [GithubResourceType("github:index/repositoryWebhook:RepositoryWebhook")]
    public partial class RepositoryWebhook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicate if the webhook should receive events. Defaults to `true`.
        /// </summary>
        [Output("active")]
        public Output<bool?> Active { get; private set; } = null!;

        /// <summary>
        /// Configuration block for the webhook. Detailed below.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.RepositoryWebhookConfiguration?> Configuration { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        /// </summary>
        [Output("events")]
        public Output<ImmutableArray<string>> Events { get; private set; } = null!;

        /// <summary>
        /// The repository of the webhook.
        /// </summary>
        [Output("repository")]
        public Output<string> Repository { get; private set; } = null!;

        /// <summary>
        /// The URL of the webhook.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a RepositoryWebhook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RepositoryWebhook(string name, RepositoryWebhookArgs args, CustomResourceOptions? options = null)
            : base("github:index/repositoryWebhook:RepositoryWebhook", name, args ?? new RepositoryWebhookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RepositoryWebhook(string name, Input<string> id, RepositoryWebhookState? state = null, CustomResourceOptions? options = null)
            : base("github:index/repositoryWebhook:RepositoryWebhook", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RepositoryWebhook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RepositoryWebhook Get(string name, Input<string> id, RepositoryWebhookState? state = null, CustomResourceOptions? options = null)
        {
            return new RepositoryWebhook(name, id, state, options);
        }
    }

    public sealed class RepositoryWebhookArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicate if the webhook should receive events. Defaults to `true`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Configuration block for the webhook. Detailed below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.RepositoryWebhookConfigurationArgs>? Configuration { get; set; }

        [Input("events", required: true)]
        private InputList<string>? _events;

        /// <summary>
        /// A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        /// <summary>
        /// The repository of the webhook.
        /// </summary>
        [Input("repository", required: true)]
        public Input<string> Repository { get; set; } = null!;

        public RepositoryWebhookArgs()
        {
        }
        public static new RepositoryWebhookArgs Empty => new RepositoryWebhookArgs();
    }

    public sealed class RepositoryWebhookState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicate if the webhook should receive events. Defaults to `true`.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Configuration block for the webhook. Detailed below.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.RepositoryWebhookConfigurationGetArgs>? Configuration { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("events")]
        private InputList<string>? _events;

        /// <summary>
        /// A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        /// </summary>
        public InputList<string> Events
        {
            get => _events ?? (_events = new InputList<string>());
            set => _events = value;
        }

        /// <summary>
        /// The repository of the webhook.
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        /// <summary>
        /// The URL of the webhook.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public RepositoryWebhookState()
        {
        }
        public static new RepositoryWebhookState Empty => new RepositoryWebhookState();
    }
}
