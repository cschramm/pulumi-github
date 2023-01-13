// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve all webhooks of the organization.
 *
 * ## Example Usage
 *
 * To retrieve *all* webhooks of the organization:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as github from "@pulumi/github";
 *
 * const all = github.getOrganizationWebhooks({});
 * ```
 */
export function getOrganizationWebhooks(opts?: pulumi.InvokeOptions): Promise<GetOrganizationWebhooksResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("github:index/getOrganizationWebhooks:getOrganizationWebhooks", {
    }, opts);
}

/**
 * A collection of values returned by getOrganizationWebhooks.
 */
export interface GetOrganizationWebhooksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * An Array of GitHub Webhooks.  Each `webhook` block consists of the fields documented below.
     * ___
     */
    readonly webhooks: outputs.GetOrganizationWebhooksWebhook[];
}
