// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    public static class GetBranchProtectionRules
    {
        /// <summary>
        /// Use this data source to retrieve a list of repository branch protection rules.
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
        ///     var example = Github.GetBranchProtectionRules.Invoke(new()
        ///     {
        ///         Repository = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBranchProtectionRulesResult> InvokeAsync(GetBranchProtectionRulesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBranchProtectionRulesResult>("github:index/getBranchProtectionRules:getBranchProtectionRules", args ?? new GetBranchProtectionRulesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve a list of repository branch protection rules.
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
        ///     var example = Github.GetBranchProtectionRules.Invoke(new()
        ///     {
        ///         Repository = "example",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetBranchProtectionRulesResult> Invoke(GetBranchProtectionRulesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBranchProtectionRulesResult>("github:index/getBranchProtectionRules:getBranchProtectionRules", args ?? new GetBranchProtectionRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBranchProtectionRulesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The GitHub repository name.
        /// </summary>
        [Input("repository", required: true)]
        public string Repository { get; set; } = null!;

        public GetBranchProtectionRulesArgs()
        {
        }
        public static new GetBranchProtectionRulesArgs Empty => new GetBranchProtectionRulesArgs();
    }

    public sealed class GetBranchProtectionRulesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The GitHub repository name.
        /// </summary>
        [Input("repository", required: true)]
        public Input<string> Repository { get; set; } = null!;

        public GetBranchProtectionRulesInvokeArgs()
        {
        }
        public static new GetBranchProtectionRulesInvokeArgs Empty => new GetBranchProtectionRulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetBranchProtectionRulesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Repository;
        /// <summary>
        /// Collection of Branch Protection Rules. Each of the results conforms to the following scheme:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBranchProtectionRulesRuleResult> Rules;

        [OutputConstructor]
        private GetBranchProtectionRulesResult(
            string id,

            string repository,

            ImmutableArray<Outputs.GetBranchProtectionRulesRuleResult> rules)
        {
            Id = id;
            Repository = repository;
            Rules = rules;
        }
    }
}