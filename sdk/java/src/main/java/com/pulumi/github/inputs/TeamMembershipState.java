// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamMembershipState extends com.pulumi.resources.ResourceArgs {

    public static final TeamMembershipState Empty = new TeamMembershipState();

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The role of the user within the team.
     * Must be one of `member` or `maintainer`. Defaults to `member`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role of the user within the team.
     * Must be one of `member` or `maintainer`. Defaults to `member`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The GitHub team id or the GitHub team slug
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return The GitHub team id or the GitHub team slug
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    /**
     * The user to add to the team.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The user to add to the team.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private TeamMembershipState() {}

    private TeamMembershipState(TeamMembershipState $) {
        this.etag = $.etag;
        this.role = $.role;
        this.teamId = $.teamId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamMembershipState $;

        public Builder() {
            $ = new TeamMembershipState();
        }

        public Builder(TeamMembershipState defaults) {
            $ = new TeamMembershipState(Objects.requireNonNull(defaults));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param role The role of the user within the team.
         * Must be one of `member` or `maintainer`. Defaults to `member`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of the user within the team.
         * Must be one of `member` or `maintainer`. Defaults to `member`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param teamId The GitHub team id or the GitHub team slug
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId The GitHub team id or the GitHub team slug
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        /**
         * @param username The user to add to the team.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user to add to the team.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public TeamMembershipState build() {
            return $;
        }
    }

}
