// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryCollaboratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryCollaboratorArgs Empty = new RepositoryCollaboratorArgs();

    @Import(name="permission")
    private @Nullable Output<String> permission;

    public Optional<Output<String>> permission() {
        return Optional.ofNullable(this.permission);
    }

    @Import(name="permissionDiffSuppression")
    private @Nullable Output<Boolean> permissionDiffSuppression;

    public Optional<Output<Boolean>> permissionDiffSuppression() {
        return Optional.ofNullable(this.permissionDiffSuppression);
    }

    @Import(name="repository", required=true)
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }

    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private RepositoryCollaboratorArgs() {}

    private RepositoryCollaboratorArgs(RepositoryCollaboratorArgs $) {
        this.permission = $.permission;
        this.permissionDiffSuppression = $.permissionDiffSuppression;
        this.repository = $.repository;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryCollaboratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryCollaboratorArgs $;

        public Builder() {
            $ = new RepositoryCollaboratorArgs();
        }

        public Builder(RepositoryCollaboratorArgs defaults) {
            $ = new RepositoryCollaboratorArgs(Objects.requireNonNull(defaults));
        }

        public Builder permission(@Nullable Output<String> permission) {
            $.permission = permission;
            return this;
        }

        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        public Builder permissionDiffSuppression(@Nullable Output<Boolean> permissionDiffSuppression) {
            $.permissionDiffSuppression = permissionDiffSuppression;
            return this;
        }

        public Builder permissionDiffSuppression(Boolean permissionDiffSuppression) {
            return permissionDiffSuppression(Output.of(permissionDiffSuppression));
        }

        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public RepositoryCollaboratorArgs build() {
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}