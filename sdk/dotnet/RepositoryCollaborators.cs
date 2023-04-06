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
    /// Provides a GitHub repository collaborators resource.
    /// 
    /// &gt; Note: github.RepositoryCollaborators cannot be used in conjunction with github.RepositoryCollaborator and
    /// github.TeamRepository or they will fight over what your policy should be.
    /// 
    /// This resource allows you to manage all collaborators for repositories in your
    /// organization or personal account. For organization repositories, collaborators can
    /// have explicit (and differing levels of) read, write, or administrator access to
    /// specific repositories, without giving the user full organization membership.
    /// For personal repositories, collaborators can only be granted write
    /// (implicitly includes read) permission.
    /// 
    /// When applied, an invitation will be sent to the user to become a collaborators
    /// on a repository. When destroyed, either the invitation will be cancelled or the
    /// collaborators will be removed from the repository.
    /// 
    /// This resource is authoritative. For adding a collaborator to a repo in a non-authoritative manner, use
    /// github.RepositoryCollaborator instead.
    /// 
    /// Further documentation on GitHub collaborators:
    /// 
    /// - [Adding outside collaborators to your personal repositories](https://help.github.com/en/github/setting-up-and-managing-your-github-user-account/managing-access-to-your-personal-repositories)
    /// - [Adding outside collaborators to repositories in your organization](https://help.github.com/articles/adding-outside-collaborators-to-repositories-in-your-organization/)
    /// - [Converting an organization member to an outside collaborators](https://help.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)
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
    ///     // Add collaborators to a repository
    ///     var someTeam = new Github.Team("someTeam", new()
    ///     {
    ///         Description = "Some cool team",
    ///     });
    /// 
    ///     var someRepo = new Github.Repository("someRepo");
    /// 
    ///     var aRepoCollaborators = new Github.RepositoryCollaborators("aRepoCollaborators", new()
    ///     {
    ///         Repository = someRepo.Name,
    ///         Users = new[]
    ///         {
    ///             new Github.Inputs.RepositoryCollaboratorsUserArgs
    ///             {
    ///                 Permission = "admin",
    ///                 Username = "SomeUser",
    ///             },
    ///         },
    ///         Teams = new[]
    ///         {
    ///             new Github.Inputs.RepositoryCollaboratorsTeamArgs
    ///             {
    ///                 Permission = "pull",
    ///                 TeamId = someTeam.Slug,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// GitHub Repository Collaborators can be imported using the name `name`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import github:index/repositoryCollaborators:RepositoryCollaborators collaborators terraform
    /// ```
    /// </summary>
    [GithubResourceType("github:index/repositoryCollaborators:RepositoryCollaborators")]
    public partial class RepositoryCollaborators : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Map of usernames to invitation ID for any users added as part of creation of this resource to 
        /// be used in `github.UserInvitationAccepter`.
        /// </summary>
        [Output("invitationIds")]
        public Output<ImmutableDictionary<string, string>> InvitationIds { get; private set; } = null!;

        /// <summary>
        /// The GitHub repository
        /// </summary>
        [Output("repository")]
        public Output<string> Repository { get; private set; } = null!;

        /// <summary>
        /// List of teams
        /// </summary>
        [Output("teams")]
        public Output<ImmutableArray<Outputs.RepositoryCollaboratorsTeam>> Teams { get; private set; } = null!;

        /// <summary>
        /// List of uses
        /// </summary>
        [Output("users")]
        public Output<ImmutableArray<Outputs.RepositoryCollaboratorsUser>> Users { get; private set; } = null!;


        /// <summary>
        /// Create a RepositoryCollaborators resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RepositoryCollaborators(string name, RepositoryCollaboratorsArgs args, CustomResourceOptions? options = null)
            : base("github:index/repositoryCollaborators:RepositoryCollaborators", name, args ?? new RepositoryCollaboratorsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RepositoryCollaborators(string name, Input<string> id, RepositoryCollaboratorsState? state = null, CustomResourceOptions? options = null)
            : base("github:index/repositoryCollaborators:RepositoryCollaborators", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RepositoryCollaborators resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RepositoryCollaborators Get(string name, Input<string> id, RepositoryCollaboratorsState? state = null, CustomResourceOptions? options = null)
        {
            return new RepositoryCollaborators(name, id, state, options);
        }
    }

    public sealed class RepositoryCollaboratorsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GitHub repository
        /// </summary>
        [Input("repository", required: true)]
        public Input<string> Repository { get; set; } = null!;

        [Input("teams")]
        private InputList<Inputs.RepositoryCollaboratorsTeamArgs>? _teams;

        /// <summary>
        /// List of teams
        /// </summary>
        public InputList<Inputs.RepositoryCollaboratorsTeamArgs> Teams
        {
            get => _teams ?? (_teams = new InputList<Inputs.RepositoryCollaboratorsTeamArgs>());
            set => _teams = value;
        }

        [Input("users")]
        private InputList<Inputs.RepositoryCollaboratorsUserArgs>? _users;

        /// <summary>
        /// List of uses
        /// </summary>
        public InputList<Inputs.RepositoryCollaboratorsUserArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.RepositoryCollaboratorsUserArgs>());
            set => _users = value;
        }

        public RepositoryCollaboratorsArgs()
        {
        }
        public static new RepositoryCollaboratorsArgs Empty => new RepositoryCollaboratorsArgs();
    }

    public sealed class RepositoryCollaboratorsState : global::Pulumi.ResourceArgs
    {
        [Input("invitationIds")]
        private InputMap<string>? _invitationIds;

        /// <summary>
        /// Map of usernames to invitation ID for any users added as part of creation of this resource to 
        /// be used in `github.UserInvitationAccepter`.
        /// </summary>
        public InputMap<string> InvitationIds
        {
            get => _invitationIds ?? (_invitationIds = new InputMap<string>());
            set => _invitationIds = value;
        }

        /// <summary>
        /// The GitHub repository
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        [Input("teams")]
        private InputList<Inputs.RepositoryCollaboratorsTeamGetArgs>? _teams;

        /// <summary>
        /// List of teams
        /// </summary>
        public InputList<Inputs.RepositoryCollaboratorsTeamGetArgs> Teams
        {
            get => _teams ?? (_teams = new InputList<Inputs.RepositoryCollaboratorsTeamGetArgs>());
            set => _teams = value;
        }

        [Input("users")]
        private InputList<Inputs.RepositoryCollaboratorsUserGetArgs>? _users;

        /// <summary>
        /// List of uses
        /// </summary>
        public InputList<Inputs.RepositoryCollaboratorsUserGetArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.RepositoryCollaboratorsUserGetArgs>());
            set => _users = value;
        }

        public RepositoryCollaboratorsState()
        {
        }
        public static new RepositoryCollaboratorsState Empty => new RepositoryCollaboratorsState();
    }
}
