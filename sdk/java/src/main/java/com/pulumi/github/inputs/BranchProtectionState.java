// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.github.inputs.BranchProtectionRequiredPullRequestReviewArgs;
import com.pulumi.github.inputs.BranchProtectionRequiredStatusCheckArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BranchProtectionState extends com.pulumi.resources.ResourceArgs {

    public static final BranchProtectionState Empty = new BranchProtectionState();

    /**
     * Boolean, setting this to `true` to allow the branch to be deleted.
     * 
     */
    @Import(name="allowsDeletions")
    private @Nullable Output<Boolean> allowsDeletions;

    /**
     * @return Boolean, setting this to `true` to allow the branch to be deleted.
     * 
     */
    public Optional<Output<Boolean>> allowsDeletions() {
        return Optional.ofNullable(this.allowsDeletions);
    }

    /**
     * Boolean, setting this to `true` to allow force pushes on the branch.
     * 
     */
    @Import(name="allowsForcePushes")
    private @Nullable Output<Boolean> allowsForcePushes;

    /**
     * @return Boolean, setting this to `true` to allow force pushes on the branch.
     * 
     */
    public Optional<Output<Boolean>> allowsForcePushes() {
        return Optional.ofNullable(this.allowsForcePushes);
    }

    /**
     * Boolean, setting this to `true` to block creating the branch.
     * 
     */
    @Import(name="blocksCreations")
    private @Nullable Output<Boolean> blocksCreations;

    /**
     * @return Boolean, setting this to `true` to block creating the branch.
     * 
     */
    public Optional<Output<Boolean>> blocksCreations() {
        return Optional.ofNullable(this.blocksCreations);
    }

    /**
     * Boolean, setting this to `true` enforces status checks for repository administrators.
     * 
     */
    @Import(name="enforceAdmins")
    private @Nullable Output<Boolean> enforceAdmins;

    /**
     * @return Boolean, setting this to `true` enforces status checks for repository administrators.
     * 
     */
    public Optional<Output<Boolean>> enforceAdmins() {
        return Optional.ofNullable(this.enforceAdmins);
    }

    /**
     * Identifies the protection rule pattern.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return Identifies the protection rule pattern.
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * The list of actor IDs that may push to the branch.
     * 
     */
    @Import(name="pushRestrictions")
    private @Nullable Output<List<String>> pushRestrictions;

    /**
     * @return The list of actor IDs that may push to the branch.
     * 
     */
    public Optional<Output<List<String>>> pushRestrictions() {
        return Optional.ofNullable(this.pushRestrictions);
    }

    /**
     * The name or node ID of the repository associated with this branch protection rule.
     * 
     */
    @Import(name="repositoryId")
    private @Nullable Output<String> repositoryId;

    /**
     * @return The name or node ID of the repository associated with this branch protection rule.
     * 
     */
    public Optional<Output<String>> repositoryId() {
        return Optional.ofNullable(this.repositoryId);
    }

    /**
     * Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
     * 
     */
    @Import(name="requireConversationResolution")
    private @Nullable Output<Boolean> requireConversationResolution;

    /**
     * @return Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
     * 
     */
    public Optional<Output<Boolean>> requireConversationResolution() {
        return Optional.ofNullable(this.requireConversationResolution);
    }

    /**
     * Boolean, setting this to `true` requires all commits to be signed with GPG.
     * 
     */
    @Import(name="requireSignedCommits")
    private @Nullable Output<Boolean> requireSignedCommits;

    /**
     * @return Boolean, setting this to `true` requires all commits to be signed with GPG.
     * 
     */
    public Optional<Output<Boolean>> requireSignedCommits() {
        return Optional.ofNullable(this.requireSignedCommits);
    }

    /**
     * Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
     * 
     */
    @Import(name="requiredLinearHistory")
    private @Nullable Output<Boolean> requiredLinearHistory;

    /**
     * @return Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
     * 
     */
    public Optional<Output<Boolean>> requiredLinearHistory() {
        return Optional.ofNullable(this.requiredLinearHistory);
    }

    /**
     * Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
     * 
     */
    @Import(name="requiredPullRequestReviews")
    private @Nullable Output<List<BranchProtectionRequiredPullRequestReviewArgs>> requiredPullRequestReviews;

    /**
     * @return Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
     * 
     */
    public Optional<Output<List<BranchProtectionRequiredPullRequestReviewArgs>>> requiredPullRequestReviews() {
        return Optional.ofNullable(this.requiredPullRequestReviews);
    }

    /**
     * Enforce restrictions for required status checks. See Required Status Checks below for details.
     * 
     */
    @Import(name="requiredStatusChecks")
    private @Nullable Output<List<BranchProtectionRequiredStatusCheckArgs>> requiredStatusChecks;

    /**
     * @return Enforce restrictions for required status checks. See Required Status Checks below for details.
     * 
     */
    public Optional<Output<List<BranchProtectionRequiredStatusCheckArgs>>> requiredStatusChecks() {
        return Optional.ofNullable(this.requiredStatusChecks);
    }

    private BranchProtectionState() {}

    private BranchProtectionState(BranchProtectionState $) {
        this.allowsDeletions = $.allowsDeletions;
        this.allowsForcePushes = $.allowsForcePushes;
        this.blocksCreations = $.blocksCreations;
        this.enforceAdmins = $.enforceAdmins;
        this.pattern = $.pattern;
        this.pushRestrictions = $.pushRestrictions;
        this.repositoryId = $.repositoryId;
        this.requireConversationResolution = $.requireConversationResolution;
        this.requireSignedCommits = $.requireSignedCommits;
        this.requiredLinearHistory = $.requiredLinearHistory;
        this.requiredPullRequestReviews = $.requiredPullRequestReviews;
        this.requiredStatusChecks = $.requiredStatusChecks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BranchProtectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BranchProtectionState $;

        public Builder() {
            $ = new BranchProtectionState();
        }

        public Builder(BranchProtectionState defaults) {
            $ = new BranchProtectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowsDeletions Boolean, setting this to `true` to allow the branch to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder allowsDeletions(@Nullable Output<Boolean> allowsDeletions) {
            $.allowsDeletions = allowsDeletions;
            return this;
        }

        /**
         * @param allowsDeletions Boolean, setting this to `true` to allow the branch to be deleted.
         * 
         * @return builder
         * 
         */
        public Builder allowsDeletions(Boolean allowsDeletions) {
            return allowsDeletions(Output.of(allowsDeletions));
        }

        /**
         * @param allowsForcePushes Boolean, setting this to `true` to allow force pushes on the branch.
         * 
         * @return builder
         * 
         */
        public Builder allowsForcePushes(@Nullable Output<Boolean> allowsForcePushes) {
            $.allowsForcePushes = allowsForcePushes;
            return this;
        }

        /**
         * @param allowsForcePushes Boolean, setting this to `true` to allow force pushes on the branch.
         * 
         * @return builder
         * 
         */
        public Builder allowsForcePushes(Boolean allowsForcePushes) {
            return allowsForcePushes(Output.of(allowsForcePushes));
        }

        /**
         * @param blocksCreations Boolean, setting this to `true` to block creating the branch.
         * 
         * @return builder
         * 
         */
        public Builder blocksCreations(@Nullable Output<Boolean> blocksCreations) {
            $.blocksCreations = blocksCreations;
            return this;
        }

        /**
         * @param blocksCreations Boolean, setting this to `true` to block creating the branch.
         * 
         * @return builder
         * 
         */
        public Builder blocksCreations(Boolean blocksCreations) {
            return blocksCreations(Output.of(blocksCreations));
        }

        /**
         * @param enforceAdmins Boolean, setting this to `true` enforces status checks for repository administrators.
         * 
         * @return builder
         * 
         */
        public Builder enforceAdmins(@Nullable Output<Boolean> enforceAdmins) {
            $.enforceAdmins = enforceAdmins;
            return this;
        }

        /**
         * @param enforceAdmins Boolean, setting this to `true` enforces status checks for repository administrators.
         * 
         * @return builder
         * 
         */
        public Builder enforceAdmins(Boolean enforceAdmins) {
            return enforceAdmins(Output.of(enforceAdmins));
        }

        /**
         * @param pattern Identifies the protection rule pattern.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern Identifies the protection rule pattern.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param pushRestrictions The list of actor IDs that may push to the branch.
         * 
         * @return builder
         * 
         */
        public Builder pushRestrictions(@Nullable Output<List<String>> pushRestrictions) {
            $.pushRestrictions = pushRestrictions;
            return this;
        }

        /**
         * @param pushRestrictions The list of actor IDs that may push to the branch.
         * 
         * @return builder
         * 
         */
        public Builder pushRestrictions(List<String> pushRestrictions) {
            return pushRestrictions(Output.of(pushRestrictions));
        }

        /**
         * @param pushRestrictions The list of actor IDs that may push to the branch.
         * 
         * @return builder
         * 
         */
        public Builder pushRestrictions(String... pushRestrictions) {
            return pushRestrictions(List.of(pushRestrictions));
        }

        /**
         * @param repositoryId The name or node ID of the repository associated with this branch protection rule.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(@Nullable Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        /**
         * @param repositoryId The name or node ID of the repository associated with this branch protection rule.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        /**
         * @param requireConversationResolution Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
         * 
         * @return builder
         * 
         */
        public Builder requireConversationResolution(@Nullable Output<Boolean> requireConversationResolution) {
            $.requireConversationResolution = requireConversationResolution;
            return this;
        }

        /**
         * @param requireConversationResolution Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
         * 
         * @return builder
         * 
         */
        public Builder requireConversationResolution(Boolean requireConversationResolution) {
            return requireConversationResolution(Output.of(requireConversationResolution));
        }

        /**
         * @param requireSignedCommits Boolean, setting this to `true` requires all commits to be signed with GPG.
         * 
         * @return builder
         * 
         */
        public Builder requireSignedCommits(@Nullable Output<Boolean> requireSignedCommits) {
            $.requireSignedCommits = requireSignedCommits;
            return this;
        }

        /**
         * @param requireSignedCommits Boolean, setting this to `true` requires all commits to be signed with GPG.
         * 
         * @return builder
         * 
         */
        public Builder requireSignedCommits(Boolean requireSignedCommits) {
            return requireSignedCommits(Output.of(requireSignedCommits));
        }

        /**
         * @param requiredLinearHistory Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
         * 
         * @return builder
         * 
         */
        public Builder requiredLinearHistory(@Nullable Output<Boolean> requiredLinearHistory) {
            $.requiredLinearHistory = requiredLinearHistory;
            return this;
        }

        /**
         * @param requiredLinearHistory Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
         * 
         * @return builder
         * 
         */
        public Builder requiredLinearHistory(Boolean requiredLinearHistory) {
            return requiredLinearHistory(Output.of(requiredLinearHistory));
        }

        /**
         * @param requiredPullRequestReviews Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
         * 
         * @return builder
         * 
         */
        public Builder requiredPullRequestReviews(@Nullable Output<List<BranchProtectionRequiredPullRequestReviewArgs>> requiredPullRequestReviews) {
            $.requiredPullRequestReviews = requiredPullRequestReviews;
            return this;
        }

        /**
         * @param requiredPullRequestReviews Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
         * 
         * @return builder
         * 
         */
        public Builder requiredPullRequestReviews(List<BranchProtectionRequiredPullRequestReviewArgs> requiredPullRequestReviews) {
            return requiredPullRequestReviews(Output.of(requiredPullRequestReviews));
        }

        /**
         * @param requiredPullRequestReviews Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
         * 
         * @return builder
         * 
         */
        public Builder requiredPullRequestReviews(BranchProtectionRequiredPullRequestReviewArgs... requiredPullRequestReviews) {
            return requiredPullRequestReviews(List.of(requiredPullRequestReviews));
        }

        /**
         * @param requiredStatusChecks Enforce restrictions for required status checks. See Required Status Checks below for details.
         * 
         * @return builder
         * 
         */
        public Builder requiredStatusChecks(@Nullable Output<List<BranchProtectionRequiredStatusCheckArgs>> requiredStatusChecks) {
            $.requiredStatusChecks = requiredStatusChecks;
            return this;
        }

        /**
         * @param requiredStatusChecks Enforce restrictions for required status checks. See Required Status Checks below for details.
         * 
         * @return builder
         * 
         */
        public Builder requiredStatusChecks(List<BranchProtectionRequiredStatusCheckArgs> requiredStatusChecks) {
            return requiredStatusChecks(Output.of(requiredStatusChecks));
        }

        /**
         * @param requiredStatusChecks Enforce restrictions for required status checks. See Required Status Checks below for details.
         * 
         * @return builder
         * 
         */
        public Builder requiredStatusChecks(BranchProtectionRequiredStatusCheckArgs... requiredStatusChecks) {
            return requiredStatusChecks(List.of(requiredStatusChecks));
        }

        public BranchProtectionState build() {
            return $;
        }
    }

}
