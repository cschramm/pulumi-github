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
    public sealed class RepositorySecurityAndAnalysisSecretScanning
    {
        /// <summary>
        /// Set to `enabled` to enable advanced security features on the repository. Can be `enabled` or `disabled`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private RepositorySecurityAndAnalysisSecretScanning(string status)
        {
            Status = status;
        }
    }
}
