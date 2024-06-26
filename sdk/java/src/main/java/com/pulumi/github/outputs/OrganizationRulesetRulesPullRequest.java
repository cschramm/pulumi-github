// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationRulesetRulesPullRequest {
    /**
     * @return New, reviewable commits pushed will dismiss previous pull request review approvals. Defaults to `false`.
     * 
     */
    private @Nullable Boolean dismissStaleReviewsOnPush;
    /**
     * @return Require an approving review in pull requests that modify files that have a designated code owner. Defaults to `false`.
     * 
     */
    private @Nullable Boolean requireCodeOwnerReview;
    /**
     * @return Whether the most recent reviewable push must be approved by someone other than the person who pushed it. Defaults to `false`.
     * 
     */
    private @Nullable Boolean requireLastPushApproval;
    /**
     * @return The number of approving reviews that are required before a pull request can be merged. Defaults to `0`.
     * 
     */
    private @Nullable Integer requiredApprovingReviewCount;
    /**
     * @return All conversations on code must be resolved before a pull request can be merged. Defaults to `false`.
     * 
     */
    private @Nullable Boolean requiredReviewThreadResolution;

    private OrganizationRulesetRulesPullRequest() {}
    /**
     * @return New, reviewable commits pushed will dismiss previous pull request review approvals. Defaults to `false`.
     * 
     */
    public Optional<Boolean> dismissStaleReviewsOnPush() {
        return Optional.ofNullable(this.dismissStaleReviewsOnPush);
    }
    /**
     * @return Require an approving review in pull requests that modify files that have a designated code owner. Defaults to `false`.
     * 
     */
    public Optional<Boolean> requireCodeOwnerReview() {
        return Optional.ofNullable(this.requireCodeOwnerReview);
    }
    /**
     * @return Whether the most recent reviewable push must be approved by someone other than the person who pushed it. Defaults to `false`.
     * 
     */
    public Optional<Boolean> requireLastPushApproval() {
        return Optional.ofNullable(this.requireLastPushApproval);
    }
    /**
     * @return The number of approving reviews that are required before a pull request can be merged. Defaults to `0`.
     * 
     */
    public Optional<Integer> requiredApprovingReviewCount() {
        return Optional.ofNullable(this.requiredApprovingReviewCount);
    }
    /**
     * @return All conversations on code must be resolved before a pull request can be merged. Defaults to `false`.
     * 
     */
    public Optional<Boolean> requiredReviewThreadResolution() {
        return Optional.ofNullable(this.requiredReviewThreadResolution);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationRulesetRulesPullRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean dismissStaleReviewsOnPush;
        private @Nullable Boolean requireCodeOwnerReview;
        private @Nullable Boolean requireLastPushApproval;
        private @Nullable Integer requiredApprovingReviewCount;
        private @Nullable Boolean requiredReviewThreadResolution;
        public Builder() {}
        public Builder(OrganizationRulesetRulesPullRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dismissStaleReviewsOnPush = defaults.dismissStaleReviewsOnPush;
    	      this.requireCodeOwnerReview = defaults.requireCodeOwnerReview;
    	      this.requireLastPushApproval = defaults.requireLastPushApproval;
    	      this.requiredApprovingReviewCount = defaults.requiredApprovingReviewCount;
    	      this.requiredReviewThreadResolution = defaults.requiredReviewThreadResolution;
        }

        @CustomType.Setter
        public Builder dismissStaleReviewsOnPush(@Nullable Boolean dismissStaleReviewsOnPush) {

            this.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
            return this;
        }
        @CustomType.Setter
        public Builder requireCodeOwnerReview(@Nullable Boolean requireCodeOwnerReview) {

            this.requireCodeOwnerReview = requireCodeOwnerReview;
            return this;
        }
        @CustomType.Setter
        public Builder requireLastPushApproval(@Nullable Boolean requireLastPushApproval) {

            this.requireLastPushApproval = requireLastPushApproval;
            return this;
        }
        @CustomType.Setter
        public Builder requiredApprovingReviewCount(@Nullable Integer requiredApprovingReviewCount) {

            this.requiredApprovingReviewCount = requiredApprovingReviewCount;
            return this;
        }
        @CustomType.Setter
        public Builder requiredReviewThreadResolution(@Nullable Boolean requiredReviewThreadResolution) {

            this.requiredReviewThreadResolution = requiredReviewThreadResolution;
            return this;
        }
        public OrganizationRulesetRulesPullRequest build() {
            final var _resultValue = new OrganizationRulesetRulesPullRequest();
            _resultValue.dismissStaleReviewsOnPush = dismissStaleReviewsOnPush;
            _resultValue.requireCodeOwnerReview = requireCodeOwnerReview;
            _resultValue.requireLastPushApproval = requireLastPushApproval;
            _resultValue.requiredApprovingReviewCount = requiredApprovingReviewCount;
            _resultValue.requiredReviewThreadResolution = requiredReviewThreadResolution;
            return _resultValue;
        }
    }
}
