// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OrganizationBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationBlockArgs Empty = new OrganizationBlockArgs();

    /**
     * The name of the user to block.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The name of the user to block.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private OrganizationBlockArgs() {}

    private OrganizationBlockArgs(OrganizationBlockArgs $) {
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationBlockArgs $;

        public Builder() {
            $ = new OrganizationBlockArgs();
        }

        public Builder(OrganizationBlockArgs defaults) {
            $ = new OrganizationBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param username The name of the user to block.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
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

        public OrganizationBlockArgs build() {
            if ($.username == null) {
                throw new MissingRequiredPropertyException("OrganizationBlockArgs", "username");
            }
            return $;
        }
    }

}
