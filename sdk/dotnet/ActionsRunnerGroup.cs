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
    /// This resource allows you to create and manage GitHub Actions runner groups within your GitHub enterprise organizations.
    /// You must have admin access to an organization to use this resource.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the ID of the runner group:
    /// 
    /// ```sh
    ///  $ pulumi import github:index/actionsRunnerGroup:ActionsRunnerGroup test 7
    /// ```
    /// </summary>
    [GithubResourceType("github:index/actionsRunnerGroup:ActionsRunnerGroup")]
    public partial class ActionsRunnerGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether public repositories can be added to the runner group. Defaults to false.
        /// </summary>
        [Output("allowsPublicRepositories")]
        public Output<bool?> AllowsPublicRepositories { get; private set; } = null!;

        /// <summary>
        /// Whether this is the default runner group
        /// </summary>
        [Output("default")]
        public Output<bool> Default { get; private set; } = null!;

        /// <summary>
        /// An etag representing the runner group object
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Whether the runner group is inherited from the enterprise level
        /// </summary>
        [Output("inherited")]
        public Output<bool> Inherited { get; private set; } = null!;

        /// <summary>
        /// Name of the runner group
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        /// </summary>
        [Output("restrictedToWorkflows")]
        public Output<bool?> RestrictedToWorkflows { get; private set; } = null!;

        /// <summary>
        /// The GitHub API URL for the runner group's runners
        /// </summary>
        [Output("runnersUrl")]
        public Output<string> RunnersUrl { get; private set; } = null!;

        /// <summary>
        /// GitHub API URL for the runner group's repositories
        /// </summary>
        [Output("selectedRepositoriesUrl")]
        public Output<string> SelectedRepositoriesUrl { get; private set; } = null!;

        /// <summary>
        /// IDs of the repositories which should be added to the runner group
        /// </summary>
        [Output("selectedRepositoryIds")]
        public Output<ImmutableArray<int>> SelectedRepositoryIds { get; private set; } = null!;

        /// <summary>
        /// List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        /// </summary>
        [Output("selectedWorkflows")]
        public Output<ImmutableArray<string>> SelectedWorkflows { get; private set; } = null!;

        /// <summary>
        /// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        /// </summary>
        [Output("visibility")]
        public Output<string> Visibility { get; private set; } = null!;


        /// <summary>
        /// Create a ActionsRunnerGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ActionsRunnerGroup(string name, ActionsRunnerGroupArgs args, CustomResourceOptions? options = null)
            : base("github:index/actionsRunnerGroup:ActionsRunnerGroup", name, args ?? new ActionsRunnerGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ActionsRunnerGroup(string name, Input<string> id, ActionsRunnerGroupState? state = null, CustomResourceOptions? options = null)
            : base("github:index/actionsRunnerGroup:ActionsRunnerGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ActionsRunnerGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ActionsRunnerGroup Get(string name, Input<string> id, ActionsRunnerGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ActionsRunnerGroup(name, id, state, options);
        }
    }

    public sealed class ActionsRunnerGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether public repositories can be added to the runner group. Defaults to false.
        /// </summary>
        [Input("allowsPublicRepositories")]
        public Input<bool>? AllowsPublicRepositories { get; set; }

        /// <summary>
        /// Name of the runner group
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        /// </summary>
        [Input("restrictedToWorkflows")]
        public Input<bool>? RestrictedToWorkflows { get; set; }

        [Input("selectedRepositoryIds")]
        private InputList<int>? _selectedRepositoryIds;

        /// <summary>
        /// IDs of the repositories which should be added to the runner group
        /// </summary>
        public InputList<int> SelectedRepositoryIds
        {
            get => _selectedRepositoryIds ?? (_selectedRepositoryIds = new InputList<int>());
            set => _selectedRepositoryIds = value;
        }

        [Input("selectedWorkflows")]
        private InputList<string>? _selectedWorkflows;

        /// <summary>
        /// List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        /// </summary>
        public InputList<string> SelectedWorkflows
        {
            get => _selectedWorkflows ?? (_selectedWorkflows = new InputList<string>());
            set => _selectedWorkflows = value;
        }

        /// <summary>
        /// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        /// </summary>
        [Input("visibility", required: true)]
        public Input<string> Visibility { get; set; } = null!;

        public ActionsRunnerGroupArgs()
        {
        }
        public static new ActionsRunnerGroupArgs Empty => new ActionsRunnerGroupArgs();
    }

    public sealed class ActionsRunnerGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether public repositories can be added to the runner group. Defaults to false.
        /// </summary>
        [Input("allowsPublicRepositories")]
        public Input<bool>? AllowsPublicRepositories { get; set; }

        /// <summary>
        /// Whether this is the default runner group
        /// </summary>
        [Input("default")]
        public Input<bool>? Default { get; set; }

        /// <summary>
        /// An etag representing the runner group object
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Whether the runner group is inherited from the enterprise level
        /// </summary>
        [Input("inherited")]
        public Input<bool>? Inherited { get; set; }

        /// <summary>
        /// Name of the runner group
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        /// </summary>
        [Input("restrictedToWorkflows")]
        public Input<bool>? RestrictedToWorkflows { get; set; }

        /// <summary>
        /// The GitHub API URL for the runner group's runners
        /// </summary>
        [Input("runnersUrl")]
        public Input<string>? RunnersUrl { get; set; }

        /// <summary>
        /// GitHub API URL for the runner group's repositories
        /// </summary>
        [Input("selectedRepositoriesUrl")]
        public Input<string>? SelectedRepositoriesUrl { get; set; }

        [Input("selectedRepositoryIds")]
        private InputList<int>? _selectedRepositoryIds;

        /// <summary>
        /// IDs of the repositories which should be added to the runner group
        /// </summary>
        public InputList<int> SelectedRepositoryIds
        {
            get => _selectedRepositoryIds ?? (_selectedRepositoryIds = new InputList<int>());
            set => _selectedRepositoryIds = value;
        }

        [Input("selectedWorkflows")]
        private InputList<string>? _selectedWorkflows;

        /// <summary>
        /// List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        /// </summary>
        public InputList<string> SelectedWorkflows
        {
            get => _selectedWorkflows ?? (_selectedWorkflows = new InputList<string>());
            set => _selectedWorkflows = value;
        }

        /// <summary>
        /// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        /// </summary>
        [Input("visibility")]
        public Input<string>? Visibility { get; set; }

        public ActionsRunnerGroupState()
        {
        }
        public static new ActionsRunnerGroupState Empty => new ActionsRunnerGroupState();
    }
}
