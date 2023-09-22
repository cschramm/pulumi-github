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
    public sealed class OrganizationRulesetBypassActor
    {
        /// <summary>
        /// (Number) The ID of the actor that can bypass a ruleset.
        /// </summary>
        public readonly int ActorId;
        /// <summary>
        /// The type of actor that can bypass a ruleset. Can be one of: `RepositoryRole`, `Team`, `Integration`, `OrganizationAdmin`.
        /// </summary>
        public readonly string ActorType;
        /// <summary>
        /// (String) When the specified actor can bypass the ruleset. pull_request means that an actor can only bypass rules on pull requests. Can be one of: `always`, `pull_request`.
        /// 
        /// ~&gt;Note: at the time of writing this, the following actor types correspond to the following actor IDs:
        /// </summary>
        public readonly string BypassMode;

        [OutputConstructor]
        private OrganizationRulesetBypassActor(
            int actorId,

            string actorType,

            string bypassMode)
        {
            ActorId = actorId;
            ActorType = actorType;
            BypassMode = bypassMode;
        }
    }
}
