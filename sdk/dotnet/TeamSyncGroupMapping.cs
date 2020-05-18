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
    /// This resource allows you to create and manage Identity Provider (IdP) group connections within your GitHub teams.
    /// You must have team synchronization enabled for organizations owned by enterprise accounts.
    /// 
    /// To learn more about team synchronization between IdPs and Github, please refer to:
    /// https://help.github.com/en/github/setting-up-and-managing-organizations-and-teams/synchronizing-teams-between-your-identity-provider-and-github
    /// </summary>
    public partial class TeamSyncGroupMapping : Pulumi.CustomResource
    {
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// An Array of GitHub Identity Provider Groups (or empty []).  Each `group` block consists of the fields documented below.
        /// ___
        /// </summary>
        [Output("groups")]
        public Output<ImmutableArray<Outputs.TeamSyncGroupMappingGroup>> Groups { get; private set; } = null!;

        /// <summary>
        /// Slug of the team
        /// </summary>
        [Output("teamSlug")]
        public Output<string> TeamSlug { get; private set; } = null!;


        /// <summary>
        /// Create a TeamSyncGroupMapping resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamSyncGroupMapping(string name, TeamSyncGroupMappingArgs args, CustomResourceOptions? options = null)
            : base("github:index/teamSyncGroupMapping:TeamSyncGroupMapping", name, args ?? new TeamSyncGroupMappingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamSyncGroupMapping(string name, Input<string> id, TeamSyncGroupMappingState? state = null, CustomResourceOptions? options = null)
            : base("github:index/teamSyncGroupMapping:TeamSyncGroupMapping", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TeamSyncGroupMapping resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamSyncGroupMapping Get(string name, Input<string> id, TeamSyncGroupMappingState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamSyncGroupMapping(name, id, state, options);
        }
    }

    public sealed class TeamSyncGroupMappingArgs : Pulumi.ResourceArgs
    {
        [Input("groups")]
        private InputList<Inputs.TeamSyncGroupMappingGroupArgs>? _groups;

        /// <summary>
        /// An Array of GitHub Identity Provider Groups (or empty []).  Each `group` block consists of the fields documented below.
        /// ___
        /// </summary>
        public InputList<Inputs.TeamSyncGroupMappingGroupArgs> Groups
        {
            get => _groups ?? (_groups = new InputList<Inputs.TeamSyncGroupMappingGroupArgs>());
            set => _groups = value;
        }

        /// <summary>
        /// Slug of the team
        /// </summary>
        [Input("teamSlug", required: true)]
        public Input<string> TeamSlug { get; set; } = null!;

        public TeamSyncGroupMappingArgs()
        {
        }
    }

    public sealed class TeamSyncGroupMappingState : Pulumi.ResourceArgs
    {
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("groups")]
        private InputList<Inputs.TeamSyncGroupMappingGroupGetArgs>? _groups;

        /// <summary>
        /// An Array of GitHub Identity Provider Groups (or empty []).  Each `group` block consists of the fields documented below.
        /// ___
        /// </summary>
        public InputList<Inputs.TeamSyncGroupMappingGroupGetArgs> Groups
        {
            get => _groups ?? (_groups = new InputList<Inputs.TeamSyncGroupMappingGroupGetArgs>());
            set => _groups = value;
        }

        /// <summary>
        /// Slug of the team
        /// </summary>
        [Input("teamSlug")]
        public Input<string>? TeamSlug { get; set; }

        public TeamSyncGroupMappingState()
        {
        }
    }
}
