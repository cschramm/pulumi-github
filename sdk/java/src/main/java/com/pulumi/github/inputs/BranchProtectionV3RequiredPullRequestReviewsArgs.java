// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.github.inputs.BranchProtectionV3RequiredPullRequestReviewsBypassPullRequestAllowancesArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BranchProtectionV3RequiredPullRequestReviewsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BranchProtectionV3RequiredPullRequestReviewsArgs Empty = new BranchProtectionV3RequiredPullRequestReviewsArgs();

    /**
     * Allow specific users, teams, or apps to bypass pull request requirements. See Bypass Pull Request Allowances below for details.
     * 
     */
    @Import(name="bypassPullRequestAllowances")
    private @Nullable Output<BranchProtectionV3RequiredPullRequestReviewsBypassPullRequestAllowancesArgs> bypassPullRequestAllowances;

    /**
     * @return Allow specific users, teams, or apps to bypass pull request requirements. See Bypass Pull Request Allowances below for details.
     * 
     */
    public Optional<Output<BranchProtectionV3RequiredPullRequestReviewsBypassPullRequestAllowancesArgs>> bypassPullRequestAllowances() {
        return Optional.ofNullable(this.bypassPullRequestAllowances);
    }

    /**
     * Dismiss approved reviews automatically when a new commit is pushed. Defaults to `false`.
     * 
     */
    @Import(name="dismissStaleReviews")
    private @Nullable Output<Boolean> dismissStaleReviews;

    /**
     * @return Dismiss approved reviews automatically when a new commit is pushed. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> dismissStaleReviews() {
        return Optional.ofNullable(this.dismissStaleReviews);
    }

    /**
     * The list of app slugs with dismissal access.
     * 
     */
    @Import(name="dismissalApps")
    private @Nullable Output<List<String>> dismissalApps;

    /**
     * @return The list of app slugs with dismissal access.
     * 
     */
    public Optional<Output<List<String>>> dismissalApps() {
        return Optional.ofNullable(this.dismissalApps);
    }

    /**
     * The list of team slugs with dismissal access.
     * Always use `slug` of the team, **not** its name. Each team already **has** to have access to the repository.
     * 
     */
    @Import(name="dismissalTeams")
    private @Nullable Output<List<String>> dismissalTeams;

    /**
     * @return The list of team slugs with dismissal access.
     * Always use `slug` of the team, **not** its name. Each team already **has** to have access to the repository.
     * 
     */
    public Optional<Output<List<String>>> dismissalTeams() {
        return Optional.ofNullable(this.dismissalTeams);
    }

    /**
     * The list of user logins with dismissal access
     * 
     */
    @Import(name="dismissalUsers")
    private @Nullable Output<List<String>> dismissalUsers;

    /**
     * @return The list of user logins with dismissal access
     * 
     */
    public Optional<Output<List<String>>> dismissalUsers() {
        return Optional.ofNullable(this.dismissalUsers);
    }

    /**
     * @deprecated
     * Use enforce_admins instead
     * 
     */
    @Deprecated /* Use enforce_admins instead */
    @Import(name="includeAdmins")
    private @Nullable Output<Boolean> includeAdmins;

    /**
     * @deprecated
     * Use enforce_admins instead
     * 
     */
    @Deprecated /* Use enforce_admins instead */
    public Optional<Output<Boolean>> includeAdmins() {
        return Optional.ofNullable(this.includeAdmins);
    }

    /**
     * Require an approved review in pull requests including files with a designated code owner. Defaults to `false`.
     * 
     */
    @Import(name="requireCodeOwnerReviews")
    private @Nullable Output<Boolean> requireCodeOwnerReviews;

    /**
     * @return Require an approved review in pull requests including files with a designated code owner. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> requireCodeOwnerReviews() {
        return Optional.ofNullable(this.requireCodeOwnerReviews);
    }

    /**
     * Require x number of approvals to satisfy branch protection requirements. If this is specified it must be a number between 0-6. This requirement matches GitHub&#39;s API, see the upstream [documentation](https://developer.github.com/v3/repos/branches/#parameters-1) for more information.
     * 
     */
    @Import(name="requiredApprovingReviewCount")
    private @Nullable Output<Integer> requiredApprovingReviewCount;

    /**
     * @return Require x number of approvals to satisfy branch protection requirements. If this is specified it must be a number between 0-6. This requirement matches GitHub&#39;s API, see the upstream [documentation](https://developer.github.com/v3/repos/branches/#parameters-1) for more information.
     * 
     */
    public Optional<Output<Integer>> requiredApprovingReviewCount() {
        return Optional.ofNullable(this.requiredApprovingReviewCount);
    }

    private BranchProtectionV3RequiredPullRequestReviewsArgs() {}

    private BranchProtectionV3RequiredPullRequestReviewsArgs(BranchProtectionV3RequiredPullRequestReviewsArgs $) {
        this.bypassPullRequestAllowances = $.bypassPullRequestAllowances;
        this.dismissStaleReviews = $.dismissStaleReviews;
        this.dismissalApps = $.dismissalApps;
        this.dismissalTeams = $.dismissalTeams;
        this.dismissalUsers = $.dismissalUsers;
        this.includeAdmins = $.includeAdmins;
        this.requireCodeOwnerReviews = $.requireCodeOwnerReviews;
        this.requiredApprovingReviewCount = $.requiredApprovingReviewCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BranchProtectionV3RequiredPullRequestReviewsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BranchProtectionV3RequiredPullRequestReviewsArgs $;

        public Builder() {
            $ = new BranchProtectionV3RequiredPullRequestReviewsArgs();
        }

        public Builder(BranchProtectionV3RequiredPullRequestReviewsArgs defaults) {
            $ = new BranchProtectionV3RequiredPullRequestReviewsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypassPullRequestAllowances Allow specific users, teams, or apps to bypass pull request requirements. See Bypass Pull Request Allowances below for details.
         * 
         * @return builder
         * 
         */
        public Builder bypassPullRequestAllowances(@Nullable Output<BranchProtectionV3RequiredPullRequestReviewsBypassPullRequestAllowancesArgs> bypassPullRequestAllowances) {
            $.bypassPullRequestAllowances = bypassPullRequestAllowances;
            return this;
        }

        /**
         * @param bypassPullRequestAllowances Allow specific users, teams, or apps to bypass pull request requirements. See Bypass Pull Request Allowances below for details.
         * 
         * @return builder
         * 
         */
        public Builder bypassPullRequestAllowances(BranchProtectionV3RequiredPullRequestReviewsBypassPullRequestAllowancesArgs bypassPullRequestAllowances) {
            return bypassPullRequestAllowances(Output.of(bypassPullRequestAllowances));
        }

        /**
         * @param dismissStaleReviews Dismiss approved reviews automatically when a new commit is pushed. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder dismissStaleReviews(@Nullable Output<Boolean> dismissStaleReviews) {
            $.dismissStaleReviews = dismissStaleReviews;
            return this;
        }

        /**
         * @param dismissStaleReviews Dismiss approved reviews automatically when a new commit is pushed. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder dismissStaleReviews(Boolean dismissStaleReviews) {
            return dismissStaleReviews(Output.of(dismissStaleReviews));
        }

        /**
         * @param dismissalApps The list of app slugs with dismissal access.
         * 
         * @return builder
         * 
         */
        public Builder dismissalApps(@Nullable Output<List<String>> dismissalApps) {
            $.dismissalApps = dismissalApps;
            return this;
        }

        /**
         * @param dismissalApps The list of app slugs with dismissal access.
         * 
         * @return builder
         * 
         */
        public Builder dismissalApps(List<String> dismissalApps) {
            return dismissalApps(Output.of(dismissalApps));
        }

        /**
         * @param dismissalApps The list of app slugs with dismissal access.
         * 
         * @return builder
         * 
         */
        public Builder dismissalApps(String... dismissalApps) {
            return dismissalApps(List.of(dismissalApps));
        }

        /**
         * @param dismissalTeams The list of team slugs with dismissal access.
         * Always use `slug` of the team, **not** its name. Each team already **has** to have access to the repository.
         * 
         * @return builder
         * 
         */
        public Builder dismissalTeams(@Nullable Output<List<String>> dismissalTeams) {
            $.dismissalTeams = dismissalTeams;
            return this;
        }

        /**
         * @param dismissalTeams The list of team slugs with dismissal access.
         * Always use `slug` of the team, **not** its name. Each team already **has** to have access to the repository.
         * 
         * @return builder
         * 
         */
        public Builder dismissalTeams(List<String> dismissalTeams) {
            return dismissalTeams(Output.of(dismissalTeams));
        }

        /**
         * @param dismissalTeams The list of team slugs with dismissal access.
         * Always use `slug` of the team, **not** its name. Each team already **has** to have access to the repository.
         * 
         * @return builder
         * 
         */
        public Builder dismissalTeams(String... dismissalTeams) {
            return dismissalTeams(List.of(dismissalTeams));
        }

        /**
         * @param dismissalUsers The list of user logins with dismissal access
         * 
         * @return builder
         * 
         */
        public Builder dismissalUsers(@Nullable Output<List<String>> dismissalUsers) {
            $.dismissalUsers = dismissalUsers;
            return this;
        }

        /**
         * @param dismissalUsers The list of user logins with dismissal access
         * 
         * @return builder
         * 
         */
        public Builder dismissalUsers(List<String> dismissalUsers) {
            return dismissalUsers(Output.of(dismissalUsers));
        }

        /**
         * @param dismissalUsers The list of user logins with dismissal access
         * 
         * @return builder
         * 
         */
        public Builder dismissalUsers(String... dismissalUsers) {
            return dismissalUsers(List.of(dismissalUsers));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use enforce_admins instead
         * 
         */
        @Deprecated /* Use enforce_admins instead */
        public Builder includeAdmins(@Nullable Output<Boolean> includeAdmins) {
            $.includeAdmins = includeAdmins;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use enforce_admins instead
         * 
         */
        @Deprecated /* Use enforce_admins instead */
        public Builder includeAdmins(Boolean includeAdmins) {
            return includeAdmins(Output.of(includeAdmins));
        }

        /**
         * @param requireCodeOwnerReviews Require an approved review in pull requests including files with a designated code owner. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireCodeOwnerReviews(@Nullable Output<Boolean> requireCodeOwnerReviews) {
            $.requireCodeOwnerReviews = requireCodeOwnerReviews;
            return this;
        }

        /**
         * @param requireCodeOwnerReviews Require an approved review in pull requests including files with a designated code owner. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
            return requireCodeOwnerReviews(Output.of(requireCodeOwnerReviews));
        }

        /**
         * @param requiredApprovingReviewCount Require x number of approvals to satisfy branch protection requirements. If this is specified it must be a number between 0-6. This requirement matches GitHub&#39;s API, see the upstream [documentation](https://developer.github.com/v3/repos/branches/#parameters-1) for more information.
         * 
         * @return builder
         * 
         */
        public Builder requiredApprovingReviewCount(@Nullable Output<Integer> requiredApprovingReviewCount) {
            $.requiredApprovingReviewCount = requiredApprovingReviewCount;
            return this;
        }

        /**
         * @param requiredApprovingReviewCount Require x number of approvals to satisfy branch protection requirements. If this is specified it must be a number between 0-6. This requirement matches GitHub&#39;s API, see the upstream [documentation](https://developer.github.com/v3/repos/branches/#parameters-1) for more information.
         * 
         * @return builder
         * 
         */
        public Builder requiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
            return requiredApprovingReviewCount(Output.of(requiredApprovingReviewCount));
        }

        public BranchProtectionV3RequiredPullRequestReviewsArgs build() {
            return $;
        }
    }

}
