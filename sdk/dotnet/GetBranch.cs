// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    public static class GetBranch
    {
        /// <summary>
        /// Use this data source to retrieve information about a repository branch.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Github = Pulumi.Github;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var development = Output.Create(Github.GetBranch.InvokeAsync(new Github.GetBranchArgs
        ///         {
        ///             Branch = "development",
        ///             Repository = "example",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBranchResult> InvokeAsync(GetBranchArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetBranchResult>("github:index/getBranch:getBranch", args ?? new GetBranchArgs(), options.WithVersion());
    }


    public sealed class GetBranchArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The repository branch to create.
        /// </summary>
        [Input("branch", required: true)]
        public string Branch { get; set; } = null!;

        /// <summary>
        /// The GitHub repository name.
        /// </summary>
        [Input("repository", required: true)]
        public string Repository { get; set; } = null!;

        public GetBranchArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetBranchResult
    {
        public readonly string Branch;
        /// <summary>
        /// An etag representing the Branch object.
        /// </summary>
        public readonly string Etag;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A string representing a branch reference, in the form of `refs/heads/&lt;branch&gt;`.
        /// </summary>
        public readonly string Ref;
        public readonly string Repository;
        /// <summary>
        /// A string storing the reference's `HEAD` commit's SHA1.
        /// </summary>
        public readonly string Sha;

        [OutputConstructor]
        private GetBranchResult(
            string branch,

            string etag,

            string id,

            string @ref,

            string repository,

            string sha)
        {
            Branch = branch;
            Etag = etag;
            Id = id;
            Ref = @ref;
            Repository = repository;
            Sha = sha;
        }
    }
}
