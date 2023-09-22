// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RepositoryRulesetBypassActorArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryRulesetBypassActorArgs Empty = new RepositoryRulesetBypassActorArgs();

    /**
     * (Number) The ID of the actor that can bypass a ruleset.
     * 
     */
    @Import(name="actorId", required=true)
    private Output<Integer> actorId;

    /**
     * @return (Number) The ID of the actor that can bypass a ruleset.
     * 
     */
    public Output<Integer> actorId() {
        return this.actorId;
    }

    /**
     * The type of actor that can bypass a ruleset. Can be one of: `RepositoryRole`, `Team`, `Integration`, `OrganizationAdmin`.
     * 
     */
    @Import(name="actorType", required=true)
    private Output<String> actorType;

    /**
     * @return The type of actor that can bypass a ruleset. Can be one of: `RepositoryRole`, `Team`, `Integration`, `OrganizationAdmin`.
     * 
     */
    public Output<String> actorType() {
        return this.actorType;
    }

    /**
     * (String) When the specified actor can bypass the ruleset. pull_request means that an actor can only bypass rules on pull requests. Can be one of: `always`, `pull_request`.
     * 
     * &gt; Note: at the time of writing this, the following actor types correspond to the following actor IDs:
     * 
     */
    @Import(name="bypassMode", required=true)
    private Output<String> bypassMode;

    /**
     * @return (String) When the specified actor can bypass the ruleset. pull_request means that an actor can only bypass rules on pull requests. Can be one of: `always`, `pull_request`.
     * 
     * &gt; Note: at the time of writing this, the following actor types correspond to the following actor IDs:
     * 
     */
    public Output<String> bypassMode() {
        return this.bypassMode;
    }

    private RepositoryRulesetBypassActorArgs() {}

    private RepositoryRulesetBypassActorArgs(RepositoryRulesetBypassActorArgs $) {
        this.actorId = $.actorId;
        this.actorType = $.actorType;
        this.bypassMode = $.bypassMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryRulesetBypassActorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryRulesetBypassActorArgs $;

        public Builder() {
            $ = new RepositoryRulesetBypassActorArgs();
        }

        public Builder(RepositoryRulesetBypassActorArgs defaults) {
            $ = new RepositoryRulesetBypassActorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actorId (Number) The ID of the actor that can bypass a ruleset.
         * 
         * @return builder
         * 
         */
        public Builder actorId(Output<Integer> actorId) {
            $.actorId = actorId;
            return this;
        }

        /**
         * @param actorId (Number) The ID of the actor that can bypass a ruleset.
         * 
         * @return builder
         * 
         */
        public Builder actorId(Integer actorId) {
            return actorId(Output.of(actorId));
        }

        /**
         * @param actorType The type of actor that can bypass a ruleset. Can be one of: `RepositoryRole`, `Team`, `Integration`, `OrganizationAdmin`.
         * 
         * @return builder
         * 
         */
        public Builder actorType(Output<String> actorType) {
            $.actorType = actorType;
            return this;
        }

        /**
         * @param actorType The type of actor that can bypass a ruleset. Can be one of: `RepositoryRole`, `Team`, `Integration`, `OrganizationAdmin`.
         * 
         * @return builder
         * 
         */
        public Builder actorType(String actorType) {
            return actorType(Output.of(actorType));
        }

        /**
         * @param bypassMode (String) When the specified actor can bypass the ruleset. pull_request means that an actor can only bypass rules on pull requests. Can be one of: `always`, `pull_request`.
         * 
         * &gt; Note: at the time of writing this, the following actor types correspond to the following actor IDs:
         * 
         * @return builder
         * 
         */
        public Builder bypassMode(Output<String> bypassMode) {
            $.bypassMode = bypassMode;
            return this;
        }

        /**
         * @param bypassMode (String) When the specified actor can bypass the ruleset. pull_request means that an actor can only bypass rules on pull requests. Can be one of: `always`, `pull_request`.
         * 
         * &gt; Note: at the time of writing this, the following actor types correspond to the following actor IDs:
         * 
         * @return builder
         * 
         */
        public Builder bypassMode(String bypassMode) {
            return bypassMode(Output.of(bypassMode));
        }

        public RepositoryRulesetBypassActorArgs build() {
            $.actorId = Objects.requireNonNull($.actorId, "expected parameter 'actorId' to be non-null");
            $.actorType = Objects.requireNonNull($.actorType, "expected parameter 'actorType' to be non-null");
            $.bypassMode = Objects.requireNonNull($.bypassMode, "expected parameter 'bypassMode' to be non-null");
            return $;
        }
    }

}
