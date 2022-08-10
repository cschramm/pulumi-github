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
    /// This resource allows you to create and manage PullRequests for repositories within your GitHub organization or personal account.
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
    ///     var example = new Github.RepositoryPullRequest("example", new()
    ///     {
    ///         BaseRef = "main",
    ///         BaseRepository = "example-repository",
    ///         Body = "This will change everything",
    ///         HeadRef = "feature-branch",
    ///         Title = "My newest feature",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [GithubResourceType("github:index/repositoryPullRequest:RepositoryPullRequest")]
    public partial class RepositoryPullRequest : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the branch serving as the base of the Pull Request.
        /// </summary>
        [Output("baseRef")]
        public Output<string> BaseRef { get; private set; } = null!;

        /// <summary>
        /// Name of the base repository to retrieve the Pull Requests from.
        /// </summary>
        [Output("baseRepository")]
        public Output<string> BaseRepository { get; private set; } = null!;

        /// <summary>
        /// Head commit SHA of the Pull Request base.
        /// </summary>
        [Output("baseSha")]
        public Output<string> BaseSha { get; private set; } = null!;

        /// <summary>
        /// Body of the Pull Request.
        /// </summary>
        [Output("body")]
        public Output<string?> Body { get; private set; } = null!;

        /// <summary>
        /// Indicates Whether this Pull Request is a draft.
        /// </summary>
        [Output("draft")]
        public Output<bool> Draft { get; private set; } = null!;

        /// <summary>
        /// Name of the branch serving as the head of the Pull Request.
        /// </summary>
        [Output("headRef")]
        public Output<string> HeadRef { get; private set; } = null!;

        /// <summary>
        /// Head commit SHA of the Pull Request head.
        /// </summary>
        [Output("headSha")]
        public Output<string> HeadSha { get; private set; } = null!;

        /// <summary>
        /// List of label names set on the Pull Request.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableArray<string>> Labels { get; private set; } = null!;

        /// <summary>
        /// Controls whether the base repository maintainers can modify the Pull Request. Default: false.
        /// </summary>
        [Output("maintainerCanModify")]
        public Output<bool?> MaintainerCanModify { get; private set; } = null!;

        /// <summary>
        /// The number of the Pull Request within the repository.
        /// </summary>
        [Output("number")]
        public Output<int> Number { get; private set; } = null!;

        /// <summary>
        /// Unix timestamp indicating the Pull Request creation time.
        /// </summary>
        [Output("openedAt")]
        public Output<int> OpenedAt { get; private set; } = null!;

        /// <summary>
        /// GitHub login of the user who opened the Pull Request.
        /// </summary>
        [Output("openedBy")]
        public Output<string> OpenedBy { get; private set; } = null!;

        /// <summary>
        /// Owner of the repository. If not provided, the provider's default owner is used.
        /// </summary>
        [Output("owner")]
        public Output<string?> Owner { get; private set; } = null!;

        /// <summary>
        /// the current Pull Request state - can be "open", "closed" or "merged".
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The title of the Pull Request.
        /// </summary>
        [Output("title")]
        public Output<string> Title { get; private set; } = null!;

        /// <summary>
        /// The timestamp of the last Pull Request update.
        /// </summary>
        [Output("updatedAt")]
        public Output<int> UpdatedAt { get; private set; } = null!;


        /// <summary>
        /// Create a RepositoryPullRequest resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RepositoryPullRequest(string name, RepositoryPullRequestArgs args, CustomResourceOptions? options = null)
            : base("github:index/repositoryPullRequest:RepositoryPullRequest", name, args ?? new RepositoryPullRequestArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RepositoryPullRequest(string name, Input<string> id, RepositoryPullRequestState? state = null, CustomResourceOptions? options = null)
            : base("github:index/repositoryPullRequest:RepositoryPullRequest", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RepositoryPullRequest resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RepositoryPullRequest Get(string name, Input<string> id, RepositoryPullRequestState? state = null, CustomResourceOptions? options = null)
        {
            return new RepositoryPullRequest(name, id, state, options);
        }
    }

    public sealed class RepositoryPullRequestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the branch serving as the base of the Pull Request.
        /// </summary>
        [Input("baseRef", required: true)]
        public Input<string> BaseRef { get; set; } = null!;

        /// <summary>
        /// Name of the base repository to retrieve the Pull Requests from.
        /// </summary>
        [Input("baseRepository", required: true)]
        public Input<string> BaseRepository { get; set; } = null!;

        /// <summary>
        /// Body of the Pull Request.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// Name of the branch serving as the head of the Pull Request.
        /// </summary>
        [Input("headRef", required: true)]
        public Input<string> HeadRef { get; set; } = null!;

        /// <summary>
        /// Controls whether the base repository maintainers can modify the Pull Request. Default: false.
        /// </summary>
        [Input("maintainerCanModify")]
        public Input<bool>? MaintainerCanModify { get; set; }

        /// <summary>
        /// Owner of the repository. If not provided, the provider's default owner is used.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// The title of the Pull Request.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        public RepositoryPullRequestArgs()
        {
        }
        public static new RepositoryPullRequestArgs Empty => new RepositoryPullRequestArgs();
    }

    public sealed class RepositoryPullRequestState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the branch serving as the base of the Pull Request.
        /// </summary>
        [Input("baseRef")]
        public Input<string>? BaseRef { get; set; }

        /// <summary>
        /// Name of the base repository to retrieve the Pull Requests from.
        /// </summary>
        [Input("baseRepository")]
        public Input<string>? BaseRepository { get; set; }

        /// <summary>
        /// Head commit SHA of the Pull Request base.
        /// </summary>
        [Input("baseSha")]
        public Input<string>? BaseSha { get; set; }

        /// <summary>
        /// Body of the Pull Request.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// Indicates Whether this Pull Request is a draft.
        /// </summary>
        [Input("draft")]
        public Input<bool>? Draft { get; set; }

        /// <summary>
        /// Name of the branch serving as the head of the Pull Request.
        /// </summary>
        [Input("headRef")]
        public Input<string>? HeadRef { get; set; }

        /// <summary>
        /// Head commit SHA of the Pull Request head.
        /// </summary>
        [Input("headSha")]
        public Input<string>? HeadSha { get; set; }

        [Input("labels")]
        private InputList<string>? _labels;

        /// <summary>
        /// List of label names set on the Pull Request.
        /// </summary>
        public InputList<string> Labels
        {
            get => _labels ?? (_labels = new InputList<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Controls whether the base repository maintainers can modify the Pull Request. Default: false.
        /// </summary>
        [Input("maintainerCanModify")]
        public Input<bool>? MaintainerCanModify { get; set; }

        /// <summary>
        /// The number of the Pull Request within the repository.
        /// </summary>
        [Input("number")]
        public Input<int>? Number { get; set; }

        /// <summary>
        /// Unix timestamp indicating the Pull Request creation time.
        /// </summary>
        [Input("openedAt")]
        public Input<int>? OpenedAt { get; set; }

        /// <summary>
        /// GitHub login of the user who opened the Pull Request.
        /// </summary>
        [Input("openedBy")]
        public Input<string>? OpenedBy { get; set; }

        /// <summary>
        /// Owner of the repository. If not provided, the provider's default owner is used.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// the current Pull Request state - can be "open", "closed" or "merged".
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The title of the Pull Request.
        /// </summary>
        [Input("title")]
        public Input<string>? Title { get; set; }

        /// <summary>
        /// The timestamp of the last Pull Request update.
        /// </summary>
        [Input("updatedAt")]
        public Input<int>? UpdatedAt { get; set; }

        public RepositoryPullRequestState()
        {
        }
        public static new RepositoryPullRequestState Empty => new RepositoryPullRequestState();
    }
}
