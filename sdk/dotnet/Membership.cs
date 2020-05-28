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
    /// Provides a GitHub membership resource.
    /// 
    /// This resource allows you to add/remove users from your organization. When applied,
    /// an invitation will be sent to the user to become part of the organization. When
    /// destroyed, either the invitation will be cancelled or the user will be removed.
    /// 
    /// ## Example Usage
    /// 
    /// 
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Github = Pulumi.Github;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Add a user to the organization
    ///         var membershipForSomeUser = new Github.Membership("membershipForSomeUser", new Github.MembershipArgs
    ///         {
    ///             Role = "member",
    ///             Username = "SomeUser",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class Membership : Pulumi.CustomResource
    {
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The role of the user within the organization.
        /// Must be one of `member` or `admin`. Defaults to `member`.
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// The user to add to the organization.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a Membership resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Membership(string name, MembershipArgs args, CustomResourceOptions? options = null)
            : base("github:index/membership:Membership", name, args ?? new MembershipArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Membership(string name, Input<string> id, MembershipState? state = null, CustomResourceOptions? options = null)
            : base("github:index/membership:Membership", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Membership resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Membership Get(string name, Input<string> id, MembershipState? state = null, CustomResourceOptions? options = null)
        {
            return new Membership(name, id, state, options);
        }
    }

    public sealed class MembershipArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The role of the user within the organization.
        /// Must be one of `member` or `admin`. Defaults to `member`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The user to add to the organization.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public MembershipArgs()
        {
        }
    }

    public sealed class MembershipState : Pulumi.ResourceArgs
    {
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The role of the user within the organization.
        /// Must be one of `member` or `admin`. Defaults to `member`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The user to add to the organization.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public MembershipState()
        {
        }
    }
}
