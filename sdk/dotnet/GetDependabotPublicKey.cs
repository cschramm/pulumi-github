// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    public static class GetDependabotPublicKey
    {
        public static Task<GetDependabotPublicKeyResult> InvokeAsync(GetDependabotPublicKeyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDependabotPublicKeyResult>("github:index/getDependabotPublicKey:getDependabotPublicKey", args ?? new GetDependabotPublicKeyArgs(), options.WithDefaults());

        public static Output<GetDependabotPublicKeyResult> Invoke(GetDependabotPublicKeyInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDependabotPublicKeyResult>("github:index/getDependabotPublicKey:getDependabotPublicKey", args ?? new GetDependabotPublicKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDependabotPublicKeyArgs : global::Pulumi.InvokeArgs
    {
        [Input("repository", required: true)]
        public string Repository { get; set; } = null!;

        public GetDependabotPublicKeyArgs()
        {
        }
        public static new GetDependabotPublicKeyArgs Empty => new GetDependabotPublicKeyArgs();
    }

    public sealed class GetDependabotPublicKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("repository", required: true)]
        public Input<string> Repository { get; set; } = null!;

        public GetDependabotPublicKeyInvokeArgs()
        {
        }
        public static new GetDependabotPublicKeyInvokeArgs Empty => new GetDependabotPublicKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetDependabotPublicKeyResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Key;
        public readonly string KeyId;
        public readonly string Repository;

        [OutputConstructor]
        private GetDependabotPublicKeyResult(
            string id,

            string key,

            string keyId,

            string repository)
        {
            Id = id;
            Key = key;
            KeyId = keyId;
            Repository = repository;
        }
    }
}
