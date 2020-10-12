// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Github
{
    /// <summary>
    /// This resource allows you to create and manage files within a
    /// GitHub repository.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Github = Pulumi.Github;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var fooRepository = new Github.Repository("fooRepository", new Github.RepositoryArgs
    ///         {
    ///             AutoInit = true,
    ///         });
    ///         var fooRepositoryFile = new Github.RepositoryFile("fooRepositoryFile", new Github.RepositoryFileArgs
    ///         {
    ///             Repository = fooRepository.Name,
    ///             Branch = "main",
    ///             File = ".gitignore",
    ///             Content = "**/*.tfstate",
    ///             CommitMessage = "Managed by Terraform",
    ///             CommitAuthor = "Terraform User",
    ///             CommitEmail = "terraform@example.com",
    ///             OverwriteOnCreate = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class RepositoryFile : Pulumi.CustomResource
    {
        /// <summary>
        /// Git branch (defaults to `master`).
        /// The branch must already exist, it will not be created if it does not already exist.
        /// </summary>
        [Output("branch")]
        public Output<string?> Branch { get; private set; } = null!;

        /// <summary>
        /// Committer author name to use.
        /// </summary>
        [Output("commitAuthor")]
        public Output<string> CommitAuthor { get; private set; } = null!;

        /// <summary>
        /// Committer email address to use.
        /// </summary>
        [Output("commitEmail")]
        public Output<string> CommitEmail { get; private set; } = null!;

        /// <summary>
        /// Commit message when adding or updating the managed file.
        /// </summary>
        [Output("commitMessage")]
        public Output<string> CommitMessage { get; private set; } = null!;

        /// <summary>
        /// The file content.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        /// <summary>
        /// The path of the file to manage.
        /// </summary>
        [Output("file")]
        public Output<string> File { get; private set; } = null!;

        /// <summary>
        /// Enable overwriting existing files
        /// </summary>
        [Output("overwriteOnCreate")]
        public Output<bool?> OverwriteOnCreate { get; private set; } = null!;

        /// <summary>
        /// The repository name
        /// </summary>
        [Output("repository")]
        public Output<string> Repository { get; private set; } = null!;

        /// <summary>
        /// The SHA blob of the file.
        /// </summary>
        [Output("sha")]
        public Output<string> Sha { get; private set; } = null!;


        /// <summary>
        /// Create a RepositoryFile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RepositoryFile(string name, RepositoryFileArgs args, CustomResourceOptions? options = null)
            : base("github:index/repositoryFile:RepositoryFile", name, args ?? new RepositoryFileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RepositoryFile(string name, Input<string> id, RepositoryFileState? state = null, CustomResourceOptions? options = null)
            : base("github:index/repositoryFile:RepositoryFile", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RepositoryFile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RepositoryFile Get(string name, Input<string> id, RepositoryFileState? state = null, CustomResourceOptions? options = null)
        {
            return new RepositoryFile(name, id, state, options);
        }
    }

    public sealed class RepositoryFileArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Git branch (defaults to `master`).
        /// The branch must already exist, it will not be created if it does not already exist.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Committer author name to use.
        /// </summary>
        [Input("commitAuthor")]
        public Input<string>? CommitAuthor { get; set; }

        /// <summary>
        /// Committer email address to use.
        /// </summary>
        [Input("commitEmail")]
        public Input<string>? CommitEmail { get; set; }

        /// <summary>
        /// Commit message when adding or updating the managed file.
        /// </summary>
        [Input("commitMessage")]
        public Input<string>? CommitMessage { get; set; }

        /// <summary>
        /// The file content.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        /// <summary>
        /// The path of the file to manage.
        /// </summary>
        [Input("file", required: true)]
        public Input<string> File { get; set; } = null!;

        /// <summary>
        /// Enable overwriting existing files
        /// </summary>
        [Input("overwriteOnCreate")]
        public Input<bool>? OverwriteOnCreate { get; set; }

        /// <summary>
        /// The repository name
        /// </summary>
        [Input("repository", required: true)]
        public Input<string> Repository { get; set; } = null!;

        public RepositoryFileArgs()
        {
        }
    }

    public sealed class RepositoryFileState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Git branch (defaults to `master`).
        /// The branch must already exist, it will not be created if it does not already exist.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// Committer author name to use.
        /// </summary>
        [Input("commitAuthor")]
        public Input<string>? CommitAuthor { get; set; }

        /// <summary>
        /// Committer email address to use.
        /// </summary>
        [Input("commitEmail")]
        public Input<string>? CommitEmail { get; set; }

        /// <summary>
        /// Commit message when adding or updating the managed file.
        /// </summary>
        [Input("commitMessage")]
        public Input<string>? CommitMessage { get; set; }

        /// <summary>
        /// The file content.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// The path of the file to manage.
        /// </summary>
        [Input("file")]
        public Input<string>? File { get; set; }

        /// <summary>
        /// Enable overwriting existing files
        /// </summary>
        [Input("overwriteOnCreate")]
        public Input<bool>? OverwriteOnCreate { get; set; }

        /// <summary>
        /// The repository name
        /// </summary>
        [Input("repository")]
        public Input<string>? Repository { get; set; }

        /// <summary>
        /// The SHA blob of the file.
        /// </summary>
        [Input("sha")]
        public Input<string>? Sha { get; set; }

        public RepositoryFileState()
        {
        }
    }
}
