// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationBlockState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationBlockState Empty = new OrganizationBlockState();

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The name of the user to block.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The name of the user to block.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private OrganizationBlockState() {}

    private OrganizationBlockState(OrganizationBlockState $) {
        this.etag = $.etag;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationBlockState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationBlockState $;

        public Builder() {
            $ = new OrganizationBlockState();
        }

        public Builder(OrganizationBlockState defaults) {
            $ = new OrganizationBlockState(Objects.requireNonNull(defaults));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param username The name of the user to block.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The name of the user to block.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public OrganizationBlockState build() {
            return $;
        }
    }

}
