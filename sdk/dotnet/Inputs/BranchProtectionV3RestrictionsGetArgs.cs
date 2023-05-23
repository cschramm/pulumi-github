// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github.Inputs
{

    public sealed class BranchProtectionV3RestrictionsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("apps")]
        private InputList<string>? _apps;

        /// <summary>
        /// The list of app slugs with push access.
        /// 
        /// `restrictions` is only available for organization-owned repositories.
        /// </summary>
        public InputList<string> Apps
        {
            get => _apps ?? (_apps = new InputList<string>());
            set => _apps = value;
        }

        [Input("teams")]
        private InputList<string>? _teams;

        /// <summary>
        /// The list of team slugs with push access.
        /// Always use `slug` of the team, **not** its name. Each team already **has** to have access to the repository.
        /// </summary>
        public InputList<string> Teams
        {
            get => _teams ?? (_teams = new InputList<string>());
            set => _teams = value;
        }

        [Input("users")]
        private InputList<string>? _users;

        /// <summary>
        /// The list of user logins with push access.
        /// </summary>
        public InputList<string> Users
        {
            get => _users ?? (_users = new InputList<string>());
            set => _users = value;
        }

        public BranchProtectionV3RestrictionsGetArgs()
        {
        }
        public static new BranchProtectionV3RestrictionsGetArgs Empty => new BranchProtectionV3RestrictionsGetArgs();
    }
}
