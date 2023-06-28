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
    /// This resource allows you to create and manage custom roles in a GitHub Organization for use in repositories.
    /// 
    /// &gt; Note: Custom roles are currently only available in GitHub Enterprise Cloud.
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
    ///     var example = new Github.OrganizationCustomRole("example", new()
    ///     {
    ///         BaseRole = "read",
    ///         Description = "Example custom role that uses the read role as its base",
    ///         Permissions = new[]
    ///         {
    ///             "add_assignee",
    ///             "add_label",
    ///             "bypass_branch_protection",
    ///             "close_issue",
    ///             "close_pull_request",
    ///             "mark_as_duplicate",
    ///             "create_tag",
    ///             "delete_issue",
    ///             "delete_tag",
    ///             "manage_deploy_keys",
    ///             "push_protected_branch",
    ///             "read_code_scanning",
    ///             "reopen_issue",
    ///             "reopen_pull_request",
    ///             "request_pr_review",
    ///             "resolve_dependabot_alerts",
    ///             "resolve_secret_scanning_alerts",
    ///             "view_secret_scanning_alerts",
    ///             "write_code_scanning",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Custom roles can be imported using the `id` of the role. The `id` of the custom role can be found using the [list custom roles in an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles#list-custom-repository-roles-in-an-organization) API.
    /// 
    /// ```sh
    ///  $ pulumi import github:index/organizationCustomRole:OrganizationCustomRole example 1234
    /// ```
    /// </summary>
    [GithubResourceType("github:index/organizationCustomRole:OrganizationCustomRole")]
    public partial class OrganizationCustomRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The system role from which the role inherits permissions. Can be one of: `read`, `triage`, `write`, or `maintain`.
        /// </summary>
        [Output("baseRole")]
        public Output<string> BaseRole { get; private set; } = null!;

        /// <summary>
        /// The description for the custom role.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the custom role.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
        /// </summary>
        [Output("permissions")]
        public Output<ImmutableArray<string>> Permissions { get; private set; } = null!;


        /// <summary>
        /// Create a OrganizationCustomRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrganizationCustomRole(string name, OrganizationCustomRoleArgs args, CustomResourceOptions? options = null)
            : base("github:index/organizationCustomRole:OrganizationCustomRole", name, args ?? new OrganizationCustomRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrganizationCustomRole(string name, Input<string> id, OrganizationCustomRoleState? state = null, CustomResourceOptions? options = null)
            : base("github:index/organizationCustomRole:OrganizationCustomRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrganizationCustomRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrganizationCustomRole Get(string name, Input<string> id, OrganizationCustomRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new OrganizationCustomRole(name, id, state, options);
        }
    }

    public sealed class OrganizationCustomRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The system role from which the role inherits permissions. Can be one of: `read`, `triage`, `write`, or `maintain`.
        /// </summary>
        [Input("baseRole", required: true)]
        public Input<string> BaseRole { get; set; } = null!;

        /// <summary>
        /// The description for the custom role.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the custom role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("permissions", required: true)]
        private InputList<string>? _permissions;

        /// <summary>
        /// A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
        /// </summary>
        public InputList<string> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<string>());
            set => _permissions = value;
        }

        public OrganizationCustomRoleArgs()
        {
        }
        public static new OrganizationCustomRoleArgs Empty => new OrganizationCustomRoleArgs();
    }

    public sealed class OrganizationCustomRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The system role from which the role inherits permissions. Can be one of: `read`, `triage`, `write`, or `maintain`.
        /// </summary>
        [Input("baseRole")]
        public Input<string>? BaseRole { get; set; }

        /// <summary>
        /// The description for the custom role.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the custom role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("permissions")]
        private InputList<string>? _permissions;

        /// <summary>
        /// A list of additional permissions included in this role. Must have a minimum of 1 additional permission. The list of available permissions can be found using the [list repository fine-grained permissions for an organization](https://docs.github.com/en/enterprise-cloud@latest/rest/orgs/custom-roles?apiVersion=2022-11-28#list-repository-fine-grained-permissions-for-an-organization) API.
        /// </summary>
        public InputList<string> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<string>());
            set => _permissions = value;
        }

        public OrganizationCustomRoleState()
        {
        }
        public static new OrganizationCustomRoleState Empty => new OrganizationCustomRoleState();
    }
}
