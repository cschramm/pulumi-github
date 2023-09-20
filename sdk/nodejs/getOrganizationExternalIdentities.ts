// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve each organization member's SAML or SCIM user
 * attributes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as github from "@pulumi/github";
 *
 * const all = github.getOrganizationExternalIdentities({});
 * ```
 */
export function getOrganizationExternalIdentities(opts?: pulumi.InvokeOptions): Promise<GetOrganizationExternalIdentitiesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("github:index/getOrganizationExternalIdentities:getOrganizationExternalIdentities", {
    }, opts);
}

/**
 * A collection of values returned by getOrganizationExternalIdentities.
 */
export interface GetOrganizationExternalIdentitiesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * An Array of identities returned from GitHub
     */
    readonly identities: outputs.GetOrganizationExternalIdentitiesIdentity[];
}
/**
 * Use this data source to retrieve each organization member's SAML or SCIM user
 * attributes.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as github from "@pulumi/github";
 *
 * const all = github.getOrganizationExternalIdentities({});
 * ```
 */
export function getOrganizationExternalIdentitiesOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetOrganizationExternalIdentitiesResult> {
    return pulumi.output(getOrganizationExternalIdentities(opts))
}