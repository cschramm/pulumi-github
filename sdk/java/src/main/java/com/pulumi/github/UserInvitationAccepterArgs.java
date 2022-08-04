// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class UserInvitationAccepterArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserInvitationAccepterArgs Empty = new UserInvitationAccepterArgs();

    /**
     * ID of the invitation to accept
     * 
     */
    @Import(name="invitationId", required=true)
    private Output<String> invitationId;

    /**
     * @return ID of the invitation to accept
     * 
     */
    public Output<String> invitationId() {
        return this.invitationId;
    }

    private UserInvitationAccepterArgs() {}

    private UserInvitationAccepterArgs(UserInvitationAccepterArgs $) {
        this.invitationId = $.invitationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserInvitationAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserInvitationAccepterArgs $;

        public Builder() {
            $ = new UserInvitationAccepterArgs();
        }

        public Builder(UserInvitationAccepterArgs defaults) {
            $ = new UserInvitationAccepterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param invitationId ID of the invitation to accept
         * 
         * @return builder
         * 
         */
        public Builder invitationId(Output<String> invitationId) {
            $.invitationId = invitationId;
            return this;
        }

        /**
         * @param invitationId ID of the invitation to accept
         * 
         * @return builder
         * 
         */
        public Builder invitationId(String invitationId) {
            return invitationId(Output.of(invitationId));
        }

        public UserInvitationAccepterArgs build() {
            $.invitationId = Objects.requireNonNull($.invitationId, "expected parameter 'invitationId' to be non-null");
            return $;
        }
    }

}
