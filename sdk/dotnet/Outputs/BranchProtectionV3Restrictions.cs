// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github.Outputs
{

    [OutputType]
    public sealed class BranchProtectionV3Restrictions
    {
        /// <summary>
        /// The list of app slugs with push access.
        /// 
        /// `restrictions` is only available for organization-owned repositories.
        /// </summary>
        public readonly ImmutableArray<string> Apps;
        /// <summary>
        /// The list of team slugs with push access.
        /// Always use `slug` of the team, **not** its name. Each team already **has** to have access to the repository.
        /// </summary>
        public readonly ImmutableArray<string> Teams;
        /// <summary>
        /// The list of user logins with push access.
        /// </summary>
        public readonly ImmutableArray<string> Users;

        [OutputConstructor]
        private BranchProtectionV3Restrictions(
            ImmutableArray<string> apps,

            ImmutableArray<string> teams,

            ImmutableArray<string> users)
        {
            Apps = apps;
            Teams = teams;
            Users = users;
        }
    }
}
