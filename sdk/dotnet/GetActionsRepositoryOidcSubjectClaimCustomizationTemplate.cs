// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    public static class GetActionsRepositoryOidcSubjectClaimCustomizationTemplate
    {
        /// <summary>
        /// Use this data source to retrieve the OpenID Connect subject claim customization template for a repository
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
        ///     var example = Github.GetActionsRepositoryOidcSubjectClaimCustomizationTemplate.Invoke(new()
        ///     {
        ///         Name = "example_repository",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetActionsRepositoryOidcSubjectClaimCustomizationTemplateResult> InvokeAsync(GetActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetActionsRepositoryOidcSubjectClaimCustomizationTemplateResult>("github:index/getActionsRepositoryOidcSubjectClaimCustomizationTemplate:getActionsRepositoryOidcSubjectClaimCustomizationTemplate", args ?? new GetActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve the OpenID Connect subject claim customization template for a repository
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
        ///     var example = Github.GetActionsRepositoryOidcSubjectClaimCustomizationTemplate.Invoke(new()
        ///     {
        ///         Name = "example_repository",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetActionsRepositoryOidcSubjectClaimCustomizationTemplateResult> Invoke(GetActionsRepositoryOidcSubjectClaimCustomizationTemplateInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetActionsRepositoryOidcSubjectClaimCustomizationTemplateResult>("github:index/getActionsRepositoryOidcSubjectClaimCustomizationTemplate:getActionsRepositoryOidcSubjectClaimCustomizationTemplate", args ?? new GetActionsRepositoryOidcSubjectClaimCustomizationTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the repository to get the OpenID Connect subject claim customization template for.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs()
        {
        }
        public static new GetActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs Empty => new GetActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs();
    }

    public sealed class GetActionsRepositoryOidcSubjectClaimCustomizationTemplateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the repository to get the OpenID Connect subject claim customization template for.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetActionsRepositoryOidcSubjectClaimCustomizationTemplateInvokeArgs()
        {
        }
        public static new GetActionsRepositoryOidcSubjectClaimCustomizationTemplateInvokeArgs Empty => new GetActionsRepositoryOidcSubjectClaimCustomizationTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetActionsRepositoryOidcSubjectClaimCustomizationTemplateResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The list of OpenID Connect claim keys.
        /// </summary>
        public readonly ImmutableArray<string> IncludeClaimKeys;
        public readonly string Name;
        /// <summary>
        /// Whether the repository uses the default template.
        /// </summary>
        public readonly bool UseDefault;

        [OutputConstructor]
        private GetActionsRepositoryOidcSubjectClaimCustomizationTemplateResult(
            string id,

            ImmutableArray<string> includeClaimKeys,

            string name,

            bool useDefault)
        {
            Id = id;
            IncludeClaimKeys = includeClaimKeys;
            Name = name;
            UseDefault = useDefault;
        }
    }
}
