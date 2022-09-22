// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export function getTree(args: GetTreeArgs, opts?: pulumi.InvokeOptions): Promise<GetTreeResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("github:index/getTree:getTree", {
        "recursive": args.recursive,
        "repository": args.repository,
        "treeSha": args.treeSha,
    }, opts);
}

/**
 * A collection of arguments for invoking getTree.
 */
export interface GetTreeArgs {
    recursive?: boolean;
    repository: string;
    treeSha: string;
}

/**
 * A collection of values returned by getTree.
 */
export interface GetTreeResult {
    readonly entries: outputs.GetTreeEntry[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly recursive?: boolean;
    readonly repository: string;
    readonly treeSha: string;
}

export function getTreeOutput(args: GetTreeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTreeResult> {
    return pulumi.output(args).apply(a => getTree(a, opts))
}

/**
 * A collection of arguments for invoking getTree.
 */
export interface GetTreeOutputArgs {
    recursive?: pulumi.Input<boolean>;
    repository: pulumi.Input<string>;
    treeSha: pulumi.Input<string>;
}