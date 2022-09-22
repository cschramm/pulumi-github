// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BranchProtectionV3Restrictions {
    private @Nullable List<String> apps;
    private @Nullable List<String> teams;
    private @Nullable List<String> users;

    private BranchProtectionV3Restrictions() {}
    public List<String> apps() {
        return this.apps == null ? List.of() : this.apps;
    }
    public List<String> teams() {
        return this.teams == null ? List.of() : this.teams;
    }
    public List<String> users() {
        return this.users == null ? List.of() : this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchProtectionV3Restrictions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> apps;
        private @Nullable List<String> teams;
        private @Nullable List<String> users;
        public Builder() {}
        public Builder(BranchProtectionV3Restrictions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apps = defaults.apps;
    	      this.teams = defaults.teams;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder apps(@Nullable List<String> apps) {
            this.apps = apps;
            return this;
        }
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }
        @CustomType.Setter
        public Builder teams(@Nullable List<String> teams) {
            this.teams = teams;
            return this;
        }
        public Builder teams(String... teams) {
            return teams(List.of(teams));
        }
        @CustomType.Setter
        public Builder users(@Nullable List<String> users) {
            this.users = users;
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        public BranchProtectionV3Restrictions build() {
            final var o = new BranchProtectionV3Restrictions();
            o.apps = apps;
            o.teams = teams;
            o.users = users;
            return o;
        }
    }
}