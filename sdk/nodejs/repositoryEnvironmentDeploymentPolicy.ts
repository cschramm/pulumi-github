// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to create and manage environment deployment branch policies for a GitHub repository.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as github from "@pulumi/github";
 *
 * const current = github.getUser({
 *     username: "",
 * });
 * const test = new github.Repository("test", {name: "tf-acc-test-%s"});
 * const testRepositoryEnvironment = new github.RepositoryEnvironment("test", {
 *     repository: test.name,
 *     environment: "environment/test",
 *     waitTimer: 10000,
 *     reviewers: [{
 *         users: [current.then(current => current.id)],
 *     }],
 *     deploymentBranchPolicy: {
 *         protectedBranches: false,
 *         customBranchPolicies: true,
 *     },
 * });
 * const testRepositoryEnvironmentDeploymentPolicy = new github.RepositoryEnvironmentDeploymentPolicy("test", {
 *     repository: test.name,
 *     environment: testRepositoryEnvironment.environment,
 *     branchPattern: "releases/*",
 * });
 * ```
 *
 * ## Import
 *
 * GitHub Repository Environment Deployment Policy can be imported using an ID made up of `name` of the repository combined with the `environment` name of the environment with the `Id` of the deployment policy, separated by a `:` character, e.g.
 *
 * ```sh
 * $ pulumi import github:index/repositoryEnvironmentDeploymentPolicy:RepositoryEnvironmentDeploymentPolicy daily terraform:daily:123456
 * ```
 */
export class RepositoryEnvironmentDeploymentPolicy extends pulumi.CustomResource {
    /**
     * Get an existing RepositoryEnvironmentDeploymentPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RepositoryEnvironmentDeploymentPolicyState, opts?: pulumi.CustomResourceOptions): RepositoryEnvironmentDeploymentPolicy {
        return new RepositoryEnvironmentDeploymentPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'github:index/repositoryEnvironmentDeploymentPolicy:RepositoryEnvironmentDeploymentPolicy';

    /**
     * Returns true if the given object is an instance of RepositoryEnvironmentDeploymentPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RepositoryEnvironmentDeploymentPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RepositoryEnvironmentDeploymentPolicy.__pulumiType;
    }

    /**
     * The name pattern that branches must match in order to deploy to the environment.
     */
    public readonly branchPattern!: pulumi.Output<string>;
    /**
     * The name of the environment.
     */
    public readonly environment!: pulumi.Output<string>;
    /**
     * The repository of the environment.
     */
    public readonly repository!: pulumi.Output<string>;

    /**
     * Create a RepositoryEnvironmentDeploymentPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RepositoryEnvironmentDeploymentPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RepositoryEnvironmentDeploymentPolicyArgs | RepositoryEnvironmentDeploymentPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RepositoryEnvironmentDeploymentPolicyState | undefined;
            resourceInputs["branchPattern"] = state ? state.branchPattern : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["repository"] = state ? state.repository : undefined;
        } else {
            const args = argsOrState as RepositoryEnvironmentDeploymentPolicyArgs | undefined;
            if ((!args || args.branchPattern === undefined) && !opts.urn) {
                throw new Error("Missing required property 'branchPattern'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.repository === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repository'");
            }
            resourceInputs["branchPattern"] = args ? args.branchPattern : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["repository"] = args ? args.repository : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RepositoryEnvironmentDeploymentPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RepositoryEnvironmentDeploymentPolicy resources.
 */
export interface RepositoryEnvironmentDeploymentPolicyState {
    /**
     * The name pattern that branches must match in order to deploy to the environment.
     */
    branchPattern?: pulumi.Input<string>;
    /**
     * The name of the environment.
     */
    environment?: pulumi.Input<string>;
    /**
     * The repository of the environment.
     */
    repository?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RepositoryEnvironmentDeploymentPolicy resource.
 */
export interface RepositoryEnvironmentDeploymentPolicyArgs {
    /**
     * The name pattern that branches must match in order to deploy to the environment.
     */
    branchPattern: pulumi.Input<string>;
    /**
     * The name of the environment.
     */
    environment: pulumi.Input<string>;
    /**
     * The repository of the environment.
     */
    repository: pulumi.Input<string>;
}
