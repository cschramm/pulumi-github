// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryPullRequestsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryPullRequestsPlainArgs Empty = new GetRepositoryPullRequestsPlainArgs();

    @Import(name="baseRef")
    private @Nullable String baseRef;

    public Optional<String> baseRef() {
        return Optional.ofNullable(this.baseRef);
    }

    @Import(name="baseRepository", required=true)
    private String baseRepository;

    public String baseRepository() {
        return this.baseRepository;
    }

    @Import(name="headRef")
    private @Nullable String headRef;

    public Optional<String> headRef() {
        return Optional.ofNullable(this.headRef);
    }

    @Import(name="owner")
    private @Nullable String owner;

    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    @Import(name="sortBy")
    private @Nullable String sortBy;

    public Optional<String> sortBy() {
        return Optional.ofNullable(this.sortBy);
    }

    @Import(name="sortDirection")
    private @Nullable String sortDirection;

    public Optional<String> sortDirection() {
        return Optional.ofNullable(this.sortDirection);
    }

    @Import(name="state")
    private @Nullable String state;

    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetRepositoryPullRequestsPlainArgs() {}

    private GetRepositoryPullRequestsPlainArgs(GetRepositoryPullRequestsPlainArgs $) {
        this.baseRef = $.baseRef;
        this.baseRepository = $.baseRepository;
        this.headRef = $.headRef;
        this.owner = $.owner;
        this.sortBy = $.sortBy;
        this.sortDirection = $.sortDirection;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryPullRequestsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryPullRequestsPlainArgs $;

        public Builder() {
            $ = new GetRepositoryPullRequestsPlainArgs();
        }

        public Builder(GetRepositoryPullRequestsPlainArgs defaults) {
            $ = new GetRepositoryPullRequestsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseRef(@Nullable String baseRef) {
            $.baseRef = baseRef;
            return this;
        }

        public Builder baseRepository(String baseRepository) {
            $.baseRepository = baseRepository;
            return this;
        }

        public Builder headRef(@Nullable String headRef) {
            $.headRef = headRef;
            return this;
        }

        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        public Builder sortBy(@Nullable String sortBy) {
            $.sortBy = sortBy;
            return this;
        }

        public Builder sortDirection(@Nullable String sortDirection) {
            $.sortDirection = sortDirection;
            return this;
        }

        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetRepositoryPullRequestsPlainArgs build() {
            $.baseRepository = Objects.requireNonNull($.baseRepository, "expected parameter 'baseRepository' to be non-null");
            return $;
        }
    }

}