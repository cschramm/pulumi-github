// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    public static class GetOrganizationWebhooks
    {
        /// <summary>
        /// Use this data source to retrieve all webhooks of the organization.
        /// 
        /// ## Example Usage
        /// 
        /// To retrieve *all* webhooks of the organization:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Github = Pulumi.Github;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Github.GetOrganizationWebhooks.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetOrganizationWebhooksResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationWebhooksResult>("github:index/getOrganizationWebhooks:getOrganizationWebhooks", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve all webhooks of the organization.
        /// 
        /// ## Example Usage
        /// 
        /// To retrieve *all* webhooks of the organization:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Github = Pulumi.Github;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Github.GetOrganizationWebhooks.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetOrganizationWebhooksResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationWebhooksResult>("github:index/getOrganizationWebhooks:getOrganizationWebhooks", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetOrganizationWebhooksResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// An Array of GitHub Webhooks.  Each `webhook` block consists of the fields documented below.
        /// ___
        /// </summary>
        public readonly ImmutableArray<Outputs.GetOrganizationWebhooksWebhookResult> Webhooks;

        [OutputConstructor]
        private GetOrganizationWebhooksResult(
            string id,

            ImmutableArray<Outputs.GetOrganizationWebhooksWebhookResult> webhooks)
        {
            Id = id;
            Webhooks = webhooks;
        }
    }
}
