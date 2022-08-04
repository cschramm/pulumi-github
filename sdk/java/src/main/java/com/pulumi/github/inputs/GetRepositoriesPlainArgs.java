// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoriesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoriesPlainArgs Empty = new GetRepositoriesPlainArgs();

    /**
     * Search query. See [documentation for the search syntax](https://help.github.com/articles/understanding-the-search-syntax/).
     * 
     */
    @Import(name="query", required=true)
    private String query;

    /**
     * @return Search query. See [documentation for the search syntax](https://help.github.com/articles/understanding-the-search-syntax/).
     * 
     */
    public String query() {
        return this.query;
    }

    /**
     * Sorts the repositories returned by the specified attribute. Valid values include `stars`, `fork`, and `updated`. Defaults to `updated`.
     * 
     */
    @Import(name="sort")
    private @Nullable String sort;

    /**
     * @return Sorts the repositories returned by the specified attribute. Valid values include `stars`, `fork`, and `updated`. Defaults to `updated`.
     * 
     */
    public Optional<String> sort() {
        return Optional.ofNullable(this.sort);
    }

    private GetRepositoriesPlainArgs() {}

    private GetRepositoriesPlainArgs(GetRepositoriesPlainArgs $) {
        this.query = $.query;
        this.sort = $.sort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoriesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoriesPlainArgs $;

        public Builder() {
            $ = new GetRepositoriesPlainArgs();
        }

        public Builder(GetRepositoriesPlainArgs defaults) {
            $ = new GetRepositoriesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Search query. See [documentation for the search syntax](https://help.github.com/articles/understanding-the-search-syntax/).
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            $.query = query;
            return this;
        }

        /**
         * @param sort Sorts the repositories returned by the specified attribute. Valid values include `stars`, `fork`, and `updated`. Defaults to `updated`.
         * 
         * @return builder
         * 
         */
        public Builder sort(@Nullable String sort) {
            $.sort = sort;
            return this;
        }

        public GetRepositoriesPlainArgs build() {
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            return $;
        }
    }

}
