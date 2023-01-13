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
    public sealed class RepositoryTemplate
    {
        /// <summary>
        /// Whether the new repository should include all the branches from the template repository (defaults to false, which includes only the default branch from the template).
        /// </summary>
        public readonly bool? IncludeAllBranches;
        /// <summary>
        /// The GitHub organization or user the template repository is owned by.
        /// </summary>
        public readonly string Owner;
        /// <summary>
        /// The name of the template repository.
        /// </summary>
        public readonly string Repository;

        [OutputConstructor]
        private RepositoryTemplate(
            bool? includeAllBranches,

            string owner,

            string repository)
        {
            IncludeAllBranches = includeAllBranches;
            Owner = owner;
            Repository = repository;
        }
    }
}
