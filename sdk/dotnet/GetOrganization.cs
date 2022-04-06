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
        /// using Pulumi;
        /// using Github = Pulumi.Github;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Github.GetOrganization.InvokeAsync(new Github.GetOrganizationArgs
        ///         {
        ///             Name = "github",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOrganizationResult> InvokeAsync(GetOrganizationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationResult>("github:index/getOrganization:getOrganization", args ?? new GetOrganizationArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve basic information about a GitHub Organization.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Github = Pulumi.Github;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Github.GetOrganization.InvokeAsync(new Github.GetOrganizationArgs
        ///         {
        ///             Name = "github",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOrganizationResult> Invoke(GetOrganizationInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetOrganizationResult>("github:index/getOrganization:getOrganization", args ?? new GetOrganizationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the organization account
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetOrganizationArgs()
        {
        }
    }

    public sealed class GetOrganizationInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the organization account
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetOrganizationInvokeArgs()
        {
        }
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
        /// The login of the organization account
        /// </summary>
        public readonly string Login;
        /// <summary>
        /// (`list`) A list with the members of the organization
        /// </summary>
        public readonly ImmutableArray<string> Members;
        /// <summary>
        /// The name of the organization account
        /// </summary>
        public readonly string Name;
        public readonly string NodeId;
        public readonly string Orgname;
        /// <summary>
        /// The plan name for the organization account
        /// </summary>
        public readonly string Plan;
        /// <summary>
        /// (`list`) A list with the repositories on the organization
        /// </summary>
        public readonly ImmutableArray<string> Repositories;

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

            ImmutableArray<string> repositories)
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
        }
    }
}
