// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve the list of variables of the repository environment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as github from "@pulumi/github";
 *
 * const example = github.getActionsEnvironmentVariables({
 *     environment: "exampleEnvironment",
 *     name: "exampleRepo",
 * });
 * ```
 */
export function getActionsEnvironmentVariables(args: GetActionsEnvironmentVariablesArgs, opts?: pulumi.InvokeOptions): Promise<GetActionsEnvironmentVariablesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("github:index/getActionsEnvironmentVariables:getActionsEnvironmentVariables", {
        "environment": args.environment,
        "fullName": args.fullName,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getActionsEnvironmentVariables.
 */
export interface GetActionsEnvironmentVariablesArgs {
    environment: string;
    fullName?: string;
    /**
     * Name of the variable
     */
    name?: string;
}

/**
 * A collection of values returned by getActionsEnvironmentVariables.
 */
export interface GetActionsEnvironmentVariablesResult {
    readonly environment: string;
    readonly fullName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the variable
     */
    readonly name: string;
    /**
     * list of variables for the environment
     */
    readonly variables: outputs.GetActionsEnvironmentVariablesVariable[];
}
/**
 * Use this data source to retrieve the list of variables of the repository environment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as github from "@pulumi/github";
 *
 * const example = github.getActionsEnvironmentVariables({
 *     environment: "exampleEnvironment",
 *     name: "exampleRepo",
 * });
 * ```
 */
export function getActionsEnvironmentVariablesOutput(args: GetActionsEnvironmentVariablesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetActionsEnvironmentVariablesResult> {
    return pulumi.output(args).apply((a: any) => getActionsEnvironmentVariables(a, opts))
}

/**
 * A collection of arguments for invoking getActionsEnvironmentVariables.
 */
export interface GetActionsEnvironmentVariablesOutputArgs {
    environment: pulumi.Input<string>;
    fullName?: pulumi.Input<string>;
    /**
     * Name of the variable
     */
    name?: pulumi.Input<string>;
}