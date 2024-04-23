// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github.Inputs
{

    public sealed class RepositoryRulesetRulesRequiredStatusChecksGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("requiredChecks", required: true)]
        private InputList<Inputs.RepositoryRulesetRulesRequiredStatusChecksRequiredCheckGetArgs>? _requiredChecks;

        /// <summary>
        /// Status checks that are required. Several can be defined.
        /// </summary>
        public InputList<Inputs.RepositoryRulesetRulesRequiredStatusChecksRequiredCheckGetArgs> RequiredChecks
        {
            get => _requiredChecks ?? (_requiredChecks = new InputList<Inputs.RepositoryRulesetRulesRequiredStatusChecksRequiredCheckGetArgs>());
            set => _requiredChecks = value;
        }

        /// <summary>
        /// Whether pull requests targeting a matching branch must be tested with the latest code. This setting will not take effect unless at least one status check is enabled. Defaults to `false`.
        /// </summary>
        [Input("strictRequiredStatusChecksPolicy")]
        public Input<bool>? StrictRequiredStatusChecksPolicy { get; set; }

        public RepositoryRulesetRulesRequiredStatusChecksGetArgs()
        {
        }
        public static new RepositoryRulesetRulesRequiredStatusChecksGetArgs Empty => new RepositoryRulesetRulesRequiredStatusChecksGetArgs();
    }
}
