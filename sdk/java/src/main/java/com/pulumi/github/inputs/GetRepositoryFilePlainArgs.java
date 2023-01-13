// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryFilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryFilePlainArgs Empty = new GetRepositoryFilePlainArgs();

    /**
     * Git branch (defaults to `main`).
     * The branch must already exist, it will not be created if it does not already exist.
     * 
     */
    @Import(name="branch")
    private @Nullable String branch;

    /**
     * @return Git branch (defaults to `main`).
     * The branch must already exist, it will not be created if it does not already exist.
     * 
     */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * The path of the file to manage.
     * 
     */
    @Import(name="file", required=true)
    private String file;

    /**
     * @return The path of the file to manage.
     * 
     */
    public String file() {
        return this.file;
    }

    /**
     * The repository to create the file in.
     * 
     */
    @Import(name="repository", required=true)
    private String repository;

    /**
     * @return The repository to create the file in.
     * 
     */
    public String repository() {
        return this.repository;
    }

    private GetRepositoryFilePlainArgs() {}

    private GetRepositoryFilePlainArgs(GetRepositoryFilePlainArgs $) {
        this.branch = $.branch;
        this.file = $.file;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryFilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryFilePlainArgs $;

        public Builder() {
            $ = new GetRepositoryFilePlainArgs();
        }

        public Builder(GetRepositoryFilePlainArgs defaults) {
            $ = new GetRepositoryFilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch Git branch (defaults to `main`).
         * The branch must already exist, it will not be created if it does not already exist.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable String branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param file The path of the file to manage.
         * 
         * @return builder
         * 
         */
        public Builder file(String file) {
            $.file = file;
            return this;
        }

        /**
         * @param repository The repository to create the file in.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            $.repository = repository;
            return this;
        }

        public GetRepositoryFilePlainArgs build() {
            $.file = Objects.requireNonNull($.file, "expected parameter 'file' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
