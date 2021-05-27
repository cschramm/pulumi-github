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
    /// The provider type for the github package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [GithubResourceType("pulumi:providers:github")]
    public partial class Provider : Pulumi.ProviderResource
    {
        /// <summary>
        /// The GitHub Base API URL
        /// </summary>
        [Output("baseUrl")]
        public Output<string?> BaseUrl { get; private set; } = null!;

        /// <summary>
        /// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
        /// </summary>
        [Output("organization")]
        public Output<string?> Organization { get; private set; } = null!;

        /// <summary>
        /// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
        /// </summary>
        [Output("owner")]
        public Output<string?> Owner { get; private set; } = null!;

        /// <summary>
        /// The OAuth token used to connect to GitHub. Anonymous mode is enabled if both `token` and `app_auth` are not set.
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("github", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
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
    }

    public sealed class ProviderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The GitHub App credentials used to connect to GitHub. Conflicts with `token`. Anonymous mode is enabled if both `token`
        /// and `app_auth` are not set.
        /// </summary>
        [Input("appAuth", json: true)]
        public Input<Inputs.ProviderAppAuthArgs>? AppAuth { get; set; }

        /// <summary>
        /// The GitHub Base API URL
        /// </summary>
        [Input("baseUrl")]
        public Input<string>? BaseUrl { get; set; }

        /// <summary>
        /// Enable `insecure` mode for testing purposes
        /// </summary>
        [Input("insecure", json: true)]
        public Input<bool>? Insecure { get; set; }

        /// <summary>
        /// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
        /// </summary>
        [Input("organization")]
        public Input<string>? Organization { get; set; }

        /// <summary>
        /// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// The OAuth token used to connect to GitHub. Anonymous mode is enabled if both `token` and `app_auth` are not set.
        /// </summary>
        [Input("token")]
        public Input<string>? Token { get; set; }

        public ProviderArgs()
        {
            BaseUrl = Utilities.GetEnv("GITHUB_BASE_URL") ?? "https://api.github.com/";
        }
    }
}
