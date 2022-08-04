// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamMembersMember {
    /**
     * @return The role of the user within the team.
     * Must be one of `member` or `maintainer`. Defaults to `member`.
     * 
     */
    private final @Nullable String role;
    /**
     * @return The user to add to the team.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private TeamMembersMember(
        @CustomType.Parameter("role") @Nullable String role,
        @CustomType.Parameter("username") String username) {
        this.role = role;
        this.username = username;
    }

    /**
     * @return The role of the user within the team.
     * Must be one of `member` or `maintainer`. Defaults to `member`.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return The user to add to the team.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamMembersMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String role;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(TeamMembersMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.username = defaults.username;
        }

        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public TeamMembersMember build() {
            return new TeamMembersMember(role, username);
        }
    }
}
