// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    public static class GetOrganization
    {
        /// <summary>
        /// Use this data source to retrieve basic information about a GitHub Organization.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Github = Pulumi.Github;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Github.GetOrganization.Invoke(new()
        ///     {
        ///         Name = "github",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOrganizationResult> InvokeAsync(GetOrganizationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationResult>("github:index/getOrganization:getOrganization", args ?? new GetOrganizationArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve basic information about a GitHub Organization.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Github = Pulumi.Github;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Github.GetOrganization.Invoke(new()
        ///     {
        ///         Name = "github",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOrganizationResult> Invoke(GetOrganizationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationResult>("github:index/getOrganization:getOrganization", args ?? new GetOrganizationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The organization's public profile name
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetOrganizationArgs()
        {
        }
        public static new GetOrganizationArgs Empty => new GetOrganizationArgs();
    }

    public sealed class GetOrganizationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The organization's public profile name
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetOrganizationInvokeArgs()
        {
        }
        public static new GetOrganizationInvokeArgs Empty => new GetOrganizationInvokeArgs();
    }


    [OutputType]
    public sealed class GetOrganizationResult
    {
        /// <summary>
        /// The description the organization account
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The members login
        /// </summary>
        public readonly string Login;
        /// <summary>
        /// **Deprecated**: use `users` instead by replacing `github_organization.example.members` to `github_organization.example.users[*].login` which will give you the same value, expect this field to be removed in next major version
        /// </summary>
        public readonly ImmutableArray<string> Members;
        /// <summary>
        /// The organization's public profile name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// GraphQL global node id for use with v4 API
        /// </summary>
        public readonly string NodeId;
        /// <summary>
        /// The organization's name as used in URLs and the API
        /// </summary>
        public readonly string Orgname;
        /// <summary>
        /// The plan name for the organization account
        /// </summary>
        public readonly string Plan;
        /// <summary>
        /// (`list`) A list with the repositories on the organization
        /// </summary>
        public readonly ImmutableArray<string> Repositories;
        /// <summary>
        /// (`list`) A list with the members of the organization with following fields:
        /// </summary>
        public readonly ImmutableArray<ImmutableDictionary<string, string>> Users;

        [OutputConstructor]
        private GetOrganizationResult(
            string description,

            string id,

            string login,

            ImmutableArray<string> members,

            string name,

            string nodeId,

            string orgname,

            string plan,

            ImmutableArray<string> repositories,

            ImmutableArray<ImmutableDictionary<string, string>> users)
        {
            Description = description;
            Id = id;
            Login = login;
            Members = members;
            Name = name;
            NodeId = nodeId;
            Orgname = orgname;
            Plan = plan;
            Repositories = repositories;
            Users = users;
        }
    }
}
