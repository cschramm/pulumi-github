// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to enable and manage GitHub Actions permissions for a given repository.
 * You must have admin access to an repository to use this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as github from "@pulumi/github";
 *
 * const example = new github.Repository("example", {});
 * const test = new github.ActionsRepositoryPermissions("test", {
 *     allowedActions: "selected",
 *     allowedActionsConfig: {
 *         githubOwnedAllowed: true,
 *         patternsAlloweds: [
 *             "actions/cache@*",
 *             "actions/checkout@*",
 *         ],
 *         verifiedAllowed: true,
 *     },
 *     repository: example.name,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the name of the GitHub repository
 *
 * ```sh
 *  $ pulumi import github:index/actionsRepositoryPermissions:ActionsRepositoryPermissions test <github_repository_name>
 * ```
 */
export class ActionsRepositoryPermissions extends pulumi.CustomResource {
    /**
     * Get an existing ActionsRepositoryPermissions resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ActionsRepositoryPermissionsState, opts?: pulumi.CustomResourceOptions): ActionsRepositoryPermissions {
        return new ActionsRepositoryPermissions(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'github:index/actionsRepositoryPermissions:ActionsRepositoryPermissions';

    /**
     * Returns true if the given object is an instance of ActionsRepositoryPermissions.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ActionsRepositoryPermissions {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ActionsRepositoryPermissions.__pulumiType;
    }

    /**
     * The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
     */
    public readonly allowedActions!: pulumi.Output<string | undefined>;
    /**
     * Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
     */
    public readonly allowedActionsConfig!: pulumi.Output<outputs.ActionsRepositoryPermissionsAllowedActionsConfig | undefined>;
    /**
     * Should GitHub actions be enabled on this repository?
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The GitHub repository
     */
    public readonly repository!: pulumi.Output<string>;

    /**
     * Create a ActionsRepositoryPermissions resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ActionsRepositoryPermissionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ActionsRepositoryPermissionsArgs | ActionsRepositoryPermissionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ActionsRepositoryPermissionsState | undefined;
            resourceInputs["allowedActions"] = state ? state.allowedActions : undefined;
            resourceInputs["allowedActionsConfig"] = state ? state.allowedActionsConfig : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["repository"] = state ? state.repository : undefined;
        } else {
            const args = argsOrState as ActionsRepositoryPermissionsArgs | undefined;
            if ((!args || args.repository === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repository'");
            }
            resourceInputs["allowedActions"] = args ? args.allowedActions : undefined;
            resourceInputs["allowedActionsConfig"] = args ? args.allowedActionsConfig : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["repository"] = args ? args.repository : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ActionsRepositoryPermissions.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ActionsRepositoryPermissions resources.
 */
export interface ActionsRepositoryPermissionsState {
    /**
     * The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
     */
    allowedActions?: pulumi.Input<string>;
    /**
     * Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
     */
    allowedActionsConfig?: pulumi.Input<inputs.ActionsRepositoryPermissionsAllowedActionsConfig>;
    /**
     * Should GitHub actions be enabled on this repository?
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The GitHub repository
     */
    repository?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ActionsRepositoryPermissions resource.
 */
export interface ActionsRepositoryPermissionsArgs {
    /**
     * The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
     */
    allowedActions?: pulumi.Input<string>;
    /**
     * Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
     */
    allowedActionsConfig?: pulumi.Input<inputs.ActionsRepositoryPermissionsAllowedActionsConfig>;
    /**
     * Should GitHub actions be enabled on this repository?
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The GitHub repository
     */
    repository: pulumi.Input<string>;
}