// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve deployment branch policies for a repository / environment.
 */
export function getRepositoryDeploymentBranchPolicies(args: GetRepositoryDeploymentBranchPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetRepositoryDeploymentBranchPoliciesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("github:index/getRepositoryDeploymentBranchPolicies:getRepositoryDeploymentBranchPolicies", {
        "environmentName": args.environmentName,
        "repository": args.repository,
    }, opts);
}

/**
 * A collection of arguments for invoking getRepositoryDeploymentBranchPolicies.
 */
export interface GetRepositoryDeploymentBranchPoliciesArgs {
    /**
     * Name of the environment to retrieve the deployment branch policies  from.
     */
    environmentName: string;
    /**
     * Name of the repository to retrieve the deployment branch policies from.
     */
    repository: string;
}

/**
 * A collection of values returned by getRepositoryDeploymentBranchPolicies.
 */
export interface GetRepositoryDeploymentBranchPoliciesResult {
    /**
     * The list of this repository / environment deployment policies. Each element of `deploymentBranchPolicies` has the following attributes:
     */
    readonly deploymentBranchPolicies: outputs.GetRepositoryDeploymentBranchPoliciesDeploymentBranchPolicy[];
    readonly environmentName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly repository: string;
}
/**
 * Use this data source to retrieve deployment branch policies for a repository / environment.
 */
export function getRepositoryDeploymentBranchPoliciesOutput(args: GetRepositoryDeploymentBranchPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRepositoryDeploymentBranchPoliciesResult> {
    return pulumi.output(args).apply((a: any) => getRepositoryDeploymentBranchPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getRepositoryDeploymentBranchPolicies.
 */
export interface GetRepositoryDeploymentBranchPoliciesOutputArgs {
    /**
     * Name of the environment to retrieve the deployment branch policies  from.
     */
    environmentName: pulumi.Input<string>;
    /**
     * Name of the repository to retrieve the deployment branch policies from.
     */
    repository: pulumi.Input<string>;
}
