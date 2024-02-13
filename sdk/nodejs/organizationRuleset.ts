// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Creates a GitHub organization ruleset.
 *
 * This resource allows you to create and manage rulesets on the organization level. When applied, a new ruleset will be created. When destroyed, that ruleset will be removed.
 *
 * ## Import
 *
 * GitHub Organization Rulesets can be imported using the GitHub ruleset ID e.g.
 *
 * ```sh
 * $ pulumi import github:index/organizationRuleset:OrganizationRuleset example 12345`
 * ```
 */
export class OrganizationRuleset extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationRuleset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationRulesetState, opts?: pulumi.CustomResourceOptions): OrganizationRuleset {
        return new OrganizationRuleset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'github:index/organizationRuleset:OrganizationRuleset';

    /**
     * Returns true if the given object is an instance of OrganizationRuleset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationRuleset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationRuleset.__pulumiType;
    }

    /**
     * (Block List) The actors that can bypass the rules in this ruleset. (see below for nested schema)
     */
    public readonly bypassActors!: pulumi.Output<outputs.OrganizationRulesetBypassActor[] | undefined>;
    /**
     * (Block List, Max: 1) Parameters for an organization ruleset condition. `refName` is required alongside one of `repositoryName` or `repositoryId`. (see below for nested schema)
     */
    public readonly conditions!: pulumi.Output<outputs.OrganizationRulesetConditions | undefined>;
    /**
     * (String) Possible values for Enforcement are `disabled`, `active`, `evaluate`. Note: `evaluate` is currently only supported for owners of type `organization`.
     */
    public readonly enforcement!: pulumi.Output<string>;
    /**
     * (String)
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * (String) The name of the ruleset.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (String) GraphQL global node id for use with v4 API.
     */
    public /*out*/ readonly nodeId!: pulumi.Output<string>;
    /**
     * (Block List, Min: 1, Max: 1) Rules within the ruleset. (see below for nested schema)
     */
    public readonly rules!: pulumi.Output<outputs.OrganizationRulesetRules>;
    /**
     * (Number) GitHub ID for the ruleset.
     */
    public /*out*/ readonly rulesetId!: pulumi.Output<number>;
    /**
     * (String) Possible values are `branch` and `tag`.
     */
    public readonly target!: pulumi.Output<string>;

    /**
     * Create a OrganizationRuleset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationRulesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationRulesetArgs | OrganizationRulesetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationRulesetState | undefined;
            resourceInputs["bypassActors"] = state ? state.bypassActors : undefined;
            resourceInputs["conditions"] = state ? state.conditions : undefined;
            resourceInputs["enforcement"] = state ? state.enforcement : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeId"] = state ? state.nodeId : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["rulesetId"] = state ? state.rulesetId : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
        } else {
            const args = argsOrState as OrganizationRulesetArgs | undefined;
            if ((!args || args.enforcement === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enforcement'");
            }
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            if ((!args || args.target === undefined) && !opts.urn) {
                throw new Error("Missing required property 'target'");
            }
            resourceInputs["bypassActors"] = args ? args.bypassActors : undefined;
            resourceInputs["conditions"] = args ? args.conditions : undefined;
            resourceInputs["enforcement"] = args ? args.enforcement : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["nodeId"] = undefined /*out*/;
            resourceInputs["rulesetId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationRuleset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationRuleset resources.
 */
export interface OrganizationRulesetState {
    /**
     * (Block List) The actors that can bypass the rules in this ruleset. (see below for nested schema)
     */
    bypassActors?: pulumi.Input<pulumi.Input<inputs.OrganizationRulesetBypassActor>[]>;
    /**
     * (Block List, Max: 1) Parameters for an organization ruleset condition. `refName` is required alongside one of `repositoryName` or `repositoryId`. (see below for nested schema)
     */
    conditions?: pulumi.Input<inputs.OrganizationRulesetConditions>;
    /**
     * (String) Possible values for Enforcement are `disabled`, `active`, `evaluate`. Note: `evaluate` is currently only supported for owners of type `organization`.
     */
    enforcement?: pulumi.Input<string>;
    /**
     * (String)
     */
    etag?: pulumi.Input<string>;
    /**
     * (String) The name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * (String) GraphQL global node id for use with v4 API.
     */
    nodeId?: pulumi.Input<string>;
    /**
     * (Block List, Min: 1, Max: 1) Rules within the ruleset. (see below for nested schema)
     */
    rules?: pulumi.Input<inputs.OrganizationRulesetRules>;
    /**
     * (Number) GitHub ID for the ruleset.
     */
    rulesetId?: pulumi.Input<number>;
    /**
     * (String) Possible values are `branch` and `tag`.
     */
    target?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationRuleset resource.
 */
export interface OrganizationRulesetArgs {
    /**
     * (Block List) The actors that can bypass the rules in this ruleset. (see below for nested schema)
     */
    bypassActors?: pulumi.Input<pulumi.Input<inputs.OrganizationRulesetBypassActor>[]>;
    /**
     * (Block List, Max: 1) Parameters for an organization ruleset condition. `refName` is required alongside one of `repositoryName` or `repositoryId`. (see below for nested schema)
     */
    conditions?: pulumi.Input<inputs.OrganizationRulesetConditions>;
    /**
     * (String) Possible values for Enforcement are `disabled`, `active`, `evaluate`. Note: `evaluate` is currently only supported for owners of type `organization`.
     */
    enforcement: pulumi.Input<string>;
    /**
     * (String) The name of the ruleset.
     */
    name?: pulumi.Input<string>;
    /**
     * (Block List, Min: 1, Max: 1) Rules within the ruleset. (see below for nested schema)
     */
    rules: pulumi.Input<inputs.OrganizationRulesetRules>;
    /**
     * (String) Possible values are `branch` and `tag`.
     */
    target: pulumi.Input<string>;
}
