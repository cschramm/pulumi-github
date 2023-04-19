// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRefPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRefPlainArgs Empty = new GetRefPlainArgs();

    /**
     * Owner of the repository.
     * 
     */
    @Import(name="owner")
    private @Nullable String owner;

    /**
     * @return Owner of the repository.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * The repository ref to look up. Must be formatted `heads/&lt;ref&gt;` for branches, and `tags/&lt;ref&gt;` for tags.
     * 
     */
    @Import(name="ref", required=true)
    private String ref;

    /**
     * @return The repository ref to look up. Must be formatted `heads/&lt;ref&gt;` for branches, and `tags/&lt;ref&gt;` for tags.
     * 
     */
    public String ref() {
        return this.ref;
    }

    /**
     * The GitHub repository name.
     * 
     */
    @Import(name="repository", required=true)
    private String repository;

    /**
     * @return The GitHub repository name.
     * 
     */
    public String repository() {
        return this.repository;
    }

    private GetRefPlainArgs() {}

    private GetRefPlainArgs(GetRefPlainArgs $) {
        this.owner = $.owner;
        this.ref = $.ref;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRefPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRefPlainArgs $;

        public Builder() {
            $ = new GetRefPlainArgs();
        }

        public Builder(GetRefPlainArgs defaults) {
            $ = new GetRefPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param owner Owner of the repository.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable String owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param ref The repository ref to look up. Must be formatted `heads/&lt;ref&gt;` for branches, and `tags/&lt;ref&gt;` for tags.
         * 
         * @return builder
         * 
         */
        public Builder ref(String ref) {
            $.ref = ref;
            return this;
        }

        /**
         * @param repository The GitHub repository name.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            $.repository = repository;
            return this;
        }

        public GetRefPlainArgs build() {
            $.ref = Objects.requireNonNull($.ref, "expected parameter 'ref' to be non-null");
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            return $;
        }
    }

}
