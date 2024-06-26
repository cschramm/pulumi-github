// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationRulesetRulesPullRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationRulesetRulesPullRequestArgs Empty = new OrganizationRulesetRulesPullRequestArgs();

    /**
     * New, reviewable commits pushed will dismiss previous pull request review approvals. Defaults to `false`.
     * 
     */
    @Import(name="dismissStaleReviewsOnPush")
    private @Nullable Output<Boolean> dismissStaleReviewsOnPush;

    /**
     * @return New, reviewable commits pushed will dismiss previous pull request review approvals. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> dismissStaleReviewsOnPush() {
        return Optional.ofNullable(this.dismissStaleReviewsOnPush);
    }

    /**
     * Require an approving review in pull requests that modify files that have a designated code owner. Defaults to `false`.
     * 
     */
    @Import(name="requireCodeOwnerReview")
    private @Nullable Output<Boolean> requireCodeOwnerReview;

    /**
     * @return Require an approving review in pull requests that modify files that have a designated code owner. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requireCodeOwnerReview() {
        return Optional.ofNullable(this.requireCodeOwnerReview);
    }

    /**
     * Whether the most recent reviewable push must be approved by someone other than the person who pushed it. Defaults to `false`.
     * 
     */
    @Import(name="requireLastPushApproval")
    private @Nullable Output<Boolean> requireLastPushApproval;

    /**
     * @return Whether the most recent reviewable push must be approved by someone other than the person who pushed it. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requireLastPushApproval() {
        return Optional.ofNullable(this.requireLastPushApproval);
    }

    /**
     * The number of approving reviews that are required before a pull request can be merged. Defaults to `0`.
     * 
     */
    @Import(name="requiredApprovingReviewCount")
    private @Nullable Output<Integer> requiredApprovingReviewCount;

    /**
     * @return The number of approving reviews that are required before a pull request can be merged. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> requiredApprovingReviewCount() {
        return Optional.ofNullable(this.requiredApprovingReviewCount);
    }

    /**
     * All conversations on code must be resolved before a pull request can be merged. Defaults to `false`.
     * 
     */
    @Import(name="requiredReviewThreadResolution")
    private @Nullable Output<Boolean> requiredReviewThreadResolution;

    /**
     * @return All conversations on code must be resolved before a pull request can be merged. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requiredReviewThreadResolution() {
        return Optional.ofNullable(this.requiredReviewThreadResolution);
    }

    private OrganizationRulesetRulesPullRequestArgs() {}

    private OrganizationRulesetRulesPullRequestArgs(OrganizationRulesetRulesPullRequestArgs $) {
        this.dismissStaleReviewsOnPush = $.dismissStaleReviewsOnPush;
        this.requireCodeOwnerReview = $.requireCodeOwnerReview;
        this.requireLastPushApproval = $.requireLastPushApproval;
        this.requiredApprovingReviewCount = $.requiredApprovingReviewCount;
        this.requiredReviewThreadResolution = $.requiredReviewThreadResolution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationRulesetRulesPullRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationRulesetRulesPullRequestArgs $;

        public Builder() {
            $ = new OrganizationRulesetRulesPullRequestArgs();
        }

        public Builder(OrganizationRulesetRulesPullRequestArgs defaults) {
            $ = new OrganizationRulesetRulesPullRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dismissStaleReviewsOnPush New, reviewable commits pushed will dismiss previous pull request review approvals. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder dismissStaleReviewsOnPush(@Nullable Output<Boolean> dismissStaleReviewsOnPush) {
            $.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
            return this;
        }

        /**
         * @param dismissStaleReviewsOnPush New, reviewable commits pushed will dismiss previous pull request review approvals. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder dismissStaleReviewsOnPush(Boolean dismissStaleReviewsOnPush) {
            return dismissStaleReviewsOnPush(Output.of(dismissStaleReviewsOnPush));
        }

        /**
         * @param requireCodeOwnerReview Require an approving review in pull requests that modify files that have a designated code owner. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireCodeOwnerReview(@Nullable Output<Boolean> requireCodeOwnerReview) {
            $.requireCodeOwnerReview = requireCodeOwnerReview;
            return this;
        }

        /**
         * @param requireCodeOwnerReview Require an approving review in pull requests that modify files that have a designated code owner. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireCodeOwnerReview(Boolean requireCodeOwnerReview) {
            return requireCodeOwnerReview(Output.of(requireCodeOwnerReview));
        }

        /**
         * @param requireLastPushApproval Whether the most recent reviewable push must be approved by someone other than the person who pushed it. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireLastPushApproval(@Nullable Output<Boolean> requireLastPushApproval) {
            $.requireLastPushApproval = requireLastPushApproval;
            return this;
        }

        /**
         * @param requireLastPushApproval Whether the most recent reviewable push must be approved by someone other than the person who pushed it. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireLastPushApproval(Boolean requireLastPushApproval) {
            return requireLastPushApproval(Output.of(requireLastPushApproval));
        }

        /**
         * @param requiredApprovingReviewCount The number of approving reviews that are required before a pull request can be merged. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder requiredApprovingReviewCount(@Nullable Output<Integer> requiredApprovingReviewCount) {
            $.requiredApprovingReviewCount = requiredApprovingReviewCount;
            return this;
        }

        /**
         * @param requiredApprovingReviewCount The number of approving reviews that are required before a pull request can be merged. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder requiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
            return requiredApprovingReviewCount(Output.of(requiredApprovingReviewCount));
        }

        /**
         * @param requiredReviewThreadResolution All conversations on code must be resolved before a pull request can be merged. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requiredReviewThreadResolution(@Nullable Output<Boolean> requiredReviewThreadResolution) {
            $.requiredReviewThreadResolution = requiredReviewThreadResolution;
            return this;
        }

        /**
         * @param requiredReviewThreadResolution All conversations on code must be resolved before a pull request can be merged. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requiredReviewThreadResolution(Boolean requiredReviewThreadResolution) {
            return requiredReviewThreadResolution(Output.of(requiredReviewThreadResolution));
        }

        public OrganizationRulesetRulesPullRequestArgs build() {
            return $;
        }
    }

}
