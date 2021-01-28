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
    /// This resource allows you to create and manage columns for GitHub projects.
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
    ///         var project = new Github.OrganizationProject("project", new Github.OrganizationProjectArgs
    ///         {
    ///             Body = "This is an organization project.",
    ///         });
    ///         var column = new Github.ProjectColumn("column", new Github.ProjectColumnArgs
    ///         {
    ///             ProjectId = project.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [GithubResourceType("github:index/projectColumn:ProjectColumn")]
    public partial class ProjectColumn : Pulumi.CustomResource
    {
        [Output("columnId")]
        public Output<int> ColumnId { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The name of the column.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of an existing project that the column will be created in.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectColumn resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectColumn(string name, ProjectColumnArgs args, CustomResourceOptions? options = null)
            : base("github:index/projectColumn:ProjectColumn", name, args ?? new ProjectColumnArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectColumn(string name, Input<string> id, ProjectColumnState? state = null, CustomResourceOptions? options = null)
            : base("github:index/projectColumn:ProjectColumn", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectColumn resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectColumn Get(string name, Input<string> id, ProjectColumnState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectColumn(name, id, state, options);
        }
    }

    public sealed class ProjectColumnArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the column.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of an existing project that the column will be created in.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public ProjectColumnArgs()
        {
        }
    }

    public sealed class ProjectColumnState : Pulumi.ResourceArgs
    {
        [Input("columnId")]
        public Input<int>? ColumnId { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The name of the column.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of an existing project that the column will be created in.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public ProjectColumnState()
        {
        }
    }
}
