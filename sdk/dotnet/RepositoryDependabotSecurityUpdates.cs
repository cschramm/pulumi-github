// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    [GithubResourceType("github:index/repositoryDependabotSecurityUpdates:RepositoryDependabotSecurityUpdates")]
    public partial class RepositoryDependabotSecurityUpdates : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The state of the automated security fixes.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The GitHub repository.
        /// </summary>
        [Output("repository")]
        public Output<string> Repository { get; private set; } = null!;


        /// <summary>
        /// Create a RepositoryDependabotSecurityUpdates resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RepositoryDependabotSecurityUpdates(string name, RepositoryDependabotSecurityUpdatesArgs args, CustomResourceOptions? options = null)
            : base("github:index/repositoryDependabotSecurityUpdates:RepositoryDependabotSecurityUpdates", name, args ?? new RepositoryDependabotSecurityUpdatesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RepositoryDependabotSecurityUpdates(string name, Input<string> id, RepositoryDependabotSecurityUpdatesState? state = null, CustomResourceOptions? options = null)
            : base("github:index/repositoryDependabotSecurityUpdates:RepositoryDependabotSecurityUpdates", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RepositoryDependabotSecurityUpdates resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RepositoryDependabotSecurityUpdates Get(string name, Input<string> id, RepositoryDependabotSecurityUpdatesState? state = null, CustomResourceOptions? options = null)
        {
            return new RepositoryDependabotSecurityUpdates(name, id, state, options);
        }
    }

    public sealed class RepositoryDependabotSecurityUpdatesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The state of the automated security fixes.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The GitHub repository.
        /// </summary>
        [Input("repository", required: true)]
        public Input<string> Repository { get; set; } = null!;

        public RepositoryDependabotSecurityUpdatesArgs()
        {
        }
        public static new RepositoryDependabotSecurityUpdatesArgs Empty => new RepositoryDependabotSecurityUpdatesArgs();
    }

    public sealed class RepositoryDependabotSecurityUpdatesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The state of the automated security fixes.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The GitHub repository.
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        public RepositoryDependabotSecurityUpdatesState()
        {
        }
        public static new RepositoryDependabotSecurityUpdatesState Empty => new RepositoryDependabotSecurityUpdatesState();
    }
}
