// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    [GithubResourceType("github:index/dependabotOrganizationSecretRepositories:DependabotOrganizationSecretRepositories")]
    public partial class DependabotOrganizationSecretRepositories : global::Pulumi.CustomResource
    {
        [Output("secretName")]
        public Output<string> SecretName { get; private set; } = null!;

        [Output("selectedRepositoryIds")]
        public Output<ImmutableArray<int>> SelectedRepositoryIds { get; private set; } = null!;


        /// <summary>
        /// Create a DependabotOrganizationSecretRepositories resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DependabotOrganizationSecretRepositories(string name, DependabotOrganizationSecretRepositoriesArgs args, CustomResourceOptions? options = null)
            : base("github:index/dependabotOrganizationSecretRepositories:DependabotOrganizationSecretRepositories", name, args ?? new DependabotOrganizationSecretRepositoriesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DependabotOrganizationSecretRepositories(string name, Input<string> id, DependabotOrganizationSecretRepositoriesState? state = null, CustomResourceOptions? options = null)
            : base("github:index/dependabotOrganizationSecretRepositories:DependabotOrganizationSecretRepositories", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DependabotOrganizationSecretRepositories resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DependabotOrganizationSecretRepositories Get(string name, Input<string> id, DependabotOrganizationSecretRepositoriesState? state = null, CustomResourceOptions? options = null)
        {
            return new DependabotOrganizationSecretRepositories(name, id, state, options);
        }
    }

    public sealed class DependabotOrganizationSecretRepositoriesArgs : global::Pulumi.ResourceArgs
    {
        [Input("secretName", required: true)]
        public Input<string> SecretName { get; set; } = null!;

        [Input("selectedRepositoryIds", required: true)]
        private InputList<int>? _selectedRepositoryIds;
        public InputList<int> SelectedRepositoryIds
        {
            get => _selectedRepositoryIds ?? (_selectedRepositoryIds = new InputList<int>());
            set => _selectedRepositoryIds = value;
        }

        public DependabotOrganizationSecretRepositoriesArgs()
        {
        }
        public static new DependabotOrganizationSecretRepositoriesArgs Empty => new DependabotOrganizationSecretRepositoriesArgs();
    }

    public sealed class DependabotOrganizationSecretRepositoriesState : global::Pulumi.ResourceArgs
    {
        [Input("secretName")]
        public Input<string>? SecretName { get; set; }

        [Input("selectedRepositoryIds")]
        private InputList<int>? _selectedRepositoryIds;
        public InputList<int> SelectedRepositoryIds
        {
            get => _selectedRepositoryIds ?? (_selectedRepositoryIds = new InputList<int>());
            set => _selectedRepositoryIds = value;
        }

        public DependabotOrganizationSecretRepositoriesState()
        {
        }
        public static new DependabotOrganizationSecretRepositoriesState Empty => new DependabotOrganizationSecretRepositoriesState();
    }
}