// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    public static class GetCodespacesSecrets
    {
        /// <summary>
        /// Use this data source to retrieve the list of codespaces secrets for a GitHub repository.
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
        ///     var example = Github.GetCodespacesSecrets.Invoke(new()
        ///     {
        ///         Name = "example_repository",
        ///     });
        /// 
        ///     var example2 = Github.GetCodespacesSecrets.Invoke(new()
        ///     {
        ///         FullName = "org/example_repository",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCodespacesSecretsResult> InvokeAsync(GetCodespacesSecretsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCodespacesSecretsResult>("github:index/getCodespacesSecrets:getCodespacesSecrets", args ?? new GetCodespacesSecretsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve the list of codespaces secrets for a GitHub repository.
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
        ///     var example = Github.GetCodespacesSecrets.Invoke(new()
        ///     {
        ///         Name = "example_repository",
        ///     });
        /// 
        ///     var example2 = Github.GetCodespacesSecrets.Invoke(new()
        ///     {
        ///         FullName = "org/example_repository",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCodespacesSecretsResult> Invoke(GetCodespacesSecretsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCodespacesSecretsResult>("github:index/getCodespacesSecrets:getCodespacesSecrets", args ?? new GetCodespacesSecretsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCodespacesSecretsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Full name of the repository (in `org/name` format).
        /// </summary>
        [Input("fullName")]
        public string? FullName { get; set; }

        /// <summary>
        /// The name of the repository.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetCodespacesSecretsArgs()
        {
        }
        public static new GetCodespacesSecretsArgs Empty => new GetCodespacesSecretsArgs();
    }

    public sealed class GetCodespacesSecretsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Full name of the repository (in `org/name` format).
        /// </summary>
        [Input("fullName")]
        public Input<string>? FullName { get; set; }

        /// <summary>
        /// The name of the repository.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetCodespacesSecretsInvokeArgs()
        {
        }
        public static new GetCodespacesSecretsInvokeArgs Empty => new GetCodespacesSecretsInvokeArgs();
    }


    [OutputType]
    public sealed class GetCodespacesSecretsResult
    {
        public readonly string FullName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Secret name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// list of codespaces secrets for the repository
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCodespacesSecretsSecretResult> Secrets;

        [OutputConstructor]
        private GetCodespacesSecretsResult(
            string fullName,

            string id,

            string name,

            ImmutableArray<Outputs.GetCodespacesSecretsSecretResult> secrets)
        {
            FullName = fullName;
            Id = id;
            Name = name;
            Secrets = secrets;
        }
    }
}
