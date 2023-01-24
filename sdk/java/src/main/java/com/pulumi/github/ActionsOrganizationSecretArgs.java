// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionsOrganizationSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionsOrganizationSecretArgs Empty = new ActionsOrganizationSecretArgs();

    /**
     * Encrypted value of the secret using the GitHub public key in Base64 format.
     * 
     */
    @Import(name="encryptedValue")
    private @Nullable Output<String> encryptedValue;

    /**
     * @return Encrypted value of the secret using the GitHub public key in Base64 format.
     * 
     */
    public Optional<Output<String>> encryptedValue() {
        return Optional.ofNullable(this.encryptedValue);
    }

    /**
     * Plaintext value of the secret to be encrypted
     * 
     */
    @Import(name="plaintextValue")
    private @Nullable Output<String> plaintextValue;

    /**
     * @return Plaintext value of the secret to be encrypted
     * 
     */
    public Optional<Output<String>> plaintextValue() {
        return Optional.ofNullable(this.plaintextValue);
    }

    /**
     * Name of the secret
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return Name of the secret
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    /**
     * An array of repository ids that can access the organization secret.
     * 
     */
    @Import(name="selectedRepositoryIds")
    private @Nullable Output<List<Integer>> selectedRepositoryIds;

    /**
     * @return An array of repository ids that can access the organization secret.
     * 
     */
    public Optional<Output<List<Integer>>> selectedRepositoryIds() {
        return Optional.ofNullable(this.selectedRepositoryIds);
    }

    /**
     * Configures the access that repositories have to the organization secret.
     * Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
     * 
     */
    @Import(name="visibility", required=true)
    private Output<String> visibility;

    /**
     * @return Configures the access that repositories have to the organization secret.
     * Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
     * 
     */
    public Output<String> visibility() {
        return this.visibility;
    }

    private ActionsOrganizationSecretArgs() {}

    private ActionsOrganizationSecretArgs(ActionsOrganizationSecretArgs $) {
        this.encryptedValue = $.encryptedValue;
        this.plaintextValue = $.plaintextValue;
        this.secretName = $.secretName;
        this.selectedRepositoryIds = $.selectedRepositoryIds;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionsOrganizationSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionsOrganizationSecretArgs $;

        public Builder() {
            $ = new ActionsOrganizationSecretArgs();
        }

        public Builder(ActionsOrganizationSecretArgs defaults) {
            $ = new ActionsOrganizationSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptedValue Encrypted value of the secret using the GitHub public key in Base64 format.
         * 
         * @return builder
         * 
         */
        public Builder encryptedValue(@Nullable Output<String> encryptedValue) {
            $.encryptedValue = encryptedValue;
            return this;
        }

        /**
         * @param encryptedValue Encrypted value of the secret using the GitHub public key in Base64 format.
         * 
         * @return builder
         * 
         */
        public Builder encryptedValue(String encryptedValue) {
            return encryptedValue(Output.of(encryptedValue));
        }

        /**
         * @param plaintextValue Plaintext value of the secret to be encrypted
         * 
         * @return builder
         * 
         */
        public Builder plaintextValue(@Nullable Output<String> plaintextValue) {
            $.plaintextValue = plaintextValue;
            return this;
        }

        /**
         * @param plaintextValue Plaintext value of the secret to be encrypted
         * 
         * @return builder
         * 
         */
        public Builder plaintextValue(String plaintextValue) {
            return plaintextValue(Output.of(plaintextValue));
        }

        /**
         * @param secretName Name of the secret
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName Name of the secret
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param selectedRepositoryIds An array of repository ids that can access the organization secret.
         * 
         * @return builder
         * 
         */
        public Builder selectedRepositoryIds(@Nullable Output<List<Integer>> selectedRepositoryIds) {
            $.selectedRepositoryIds = selectedRepositoryIds;
            return this;
        }

        /**
         * @param selectedRepositoryIds An array of repository ids that can access the organization secret.
         * 
         * @return builder
         * 
         */
        public Builder selectedRepositoryIds(List<Integer> selectedRepositoryIds) {
            return selectedRepositoryIds(Output.of(selectedRepositoryIds));
        }

        /**
         * @param selectedRepositoryIds An array of repository ids that can access the organization secret.
         * 
         * @return builder
         * 
         */
        public Builder selectedRepositoryIds(Integer... selectedRepositoryIds) {
            return selectedRepositoryIds(List.of(selectedRepositoryIds));
        }

        /**
         * @param visibility Configures the access that repositories have to the organization secret.
         * Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(Output<String> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility Configures the access that repositories have to the organization secret.
         * Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(String visibility) {
            return visibility(Output.of(visibility));
        }

        public ActionsOrganizationSecretArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            $.visibility = Objects.requireNonNull($.visibility, "expected parameter 'visibility' to be non-null");
            return $;
        }
    }

}
