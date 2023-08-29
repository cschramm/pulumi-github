// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class RepositoryDependabotSecurityUpdates extends pulumi.CustomResource {
    /**
     * Get an existing RepositoryDependabotSecurityUpdates resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RepositoryDependabotSecurityUpdatesState, opts?: pulumi.CustomResourceOptions): RepositoryDependabotSecurityUpdates {
        return new RepositoryDependabotSecurityUpdates(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'github:index/repositoryDependabotSecurityUpdates:RepositoryDependabotSecurityUpdates';

    /**
     * Returns true if the given object is an instance of RepositoryDependabotSecurityUpdates.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RepositoryDependabotSecurityUpdates {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RepositoryDependabotSecurityUpdates.__pulumiType;
    }

    /**
     * The state of the automated security fixes.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The GitHub repository.
     */
    public readonly repository!: pulumi.Output<string>;

    /**
     * Create a RepositoryDependabotSecurityUpdates resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RepositoryDependabotSecurityUpdatesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RepositoryDependabotSecurityUpdatesArgs | RepositoryDependabotSecurityUpdatesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RepositoryDependabotSecurityUpdatesState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["repository"] = state ? state.repository : undefined;
        } else {
            const args = argsOrState as RepositoryDependabotSecurityUpdatesArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.repository === undefined) && !opts.urn) {
                throw new Error("Missing required property 'repository'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["repository"] = args ? args.repository : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RepositoryDependabotSecurityUpdates.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RepositoryDependabotSecurityUpdates resources.
 */
export interface RepositoryDependabotSecurityUpdatesState {
    /**
     * The state of the automated security fixes.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The GitHub repository.
     */
    repository?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RepositoryDependabotSecurityUpdates resource.
 */
export interface RepositoryDependabotSecurityUpdatesArgs {
    /**
     * The state of the automated security fixes.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The GitHub repository.
     */
    repository: pulumi.Input<string>;
}
