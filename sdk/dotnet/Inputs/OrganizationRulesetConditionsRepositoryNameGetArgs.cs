// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github.Inputs
{

    public sealed class OrganizationRulesetConditionsRepositoryNameGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("excludes", required: true)]
        private InputList<string>? _excludes;

        /// <summary>
        /// (List of String) Array of ref names or patterns to exclude. The condition will not pass if any of these patterns match.
        /// </summary>
        public InputList<string> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<string>());
            set => _excludes = value;
        }

        [Input("includes", required: true)]
        private InputList<string>? _includes;

        /// <summary>
        /// (List of String) Array of ref names or patterns to include. One of these patterns must match for the condition to pass. Also accepts `~DEFAULT_BRANCH` to include the default branch or `~ALL` to include all branches.
        /// </summary>
        public InputList<string> Includes
        {
            get => _includes ?? (_includes = new InputList<string>());
            set => _includes = value;
        }

        [Input("protected")]
        public Input<bool>? Protected { get; set; }

        public OrganizationRulesetConditionsRepositoryNameGetArgs()
        {
        }
        public static new OrganizationRulesetConditionsRepositoryNameGetArgs Empty => new OrganizationRulesetConditionsRepositoryNameGetArgs();
    }
}
