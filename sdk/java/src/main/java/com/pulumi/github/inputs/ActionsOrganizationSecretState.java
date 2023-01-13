// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionsOrganizationSecretState extends com.pulumi.resources.ResourceArgs {

    public static final ActionsOrganizationSecretState Empty = new ActionsOrganizationSecretState();

    /**
     * Date of actions_secret creation.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Date of actions_secret creation.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Encrypted value of the secret using the Github public key in Base64 format.
     * 
     */
    @Import(name="encryptedValue")
    private @Nullable Output<String> encryptedValue;

    /**
     * @return Encrypted value of the secret using the Github public key in Base64 format.
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
    @Import(name="secretName")
    private @Nullable Output<String> secretName;

    /**
     * @return Name of the secret
     * 
     */
    public Optional<Output<String>> secretName() {
        return Optional.ofNullable(this.secretName);
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
     * Date of actions_secret update.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return Date of actions_secret update.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * Configures the access that repositories have to the organization secret.
     * Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<String> visibility;

    /**
     * @return Configures the access that repositories have to the organization secret.
     * Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
     * 
     */
    public Optional<Output<String>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private ActionsOrganizationSecretState() {}

    private ActionsOrganizationSecretState(ActionsOrganizationSecretState $) {
        this.createdAt = $.createdAt;
        this.encryptedValue = $.encryptedValue;
        this.plaintextValue = $.plaintextValue;
        this.secretName = $.secretName;
        this.selectedRepositoryIds = $.selectedRepositoryIds;
        this.updatedAt = $.updatedAt;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionsOrganizationSecretState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionsOrganizationSecretState $;

        public Builder() {
            $ = new ActionsOrganizationSecretState();
        }

        public Builder(ActionsOrganizationSecretState defaults) {
            $ = new ActionsOrganizationSecretState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt Date of actions_secret creation.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Date of actions_secret creation.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param encryptedValue Encrypted value of the secret using the Github public key in Base64 format.
         * 
         * @return builder
         * 
         */
        public Builder encryptedValue(@Nullable Output<String> encryptedValue) {
            $.encryptedValue = encryptedValue;
            return this;
        }

        /**
         * @param encryptedValue Encrypted value of the secret using the Github public key in Base64 format.
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
        public Builder secretName(@Nullable Output<String> secretName) {
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
         * @param updatedAt Date of actions_secret update.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt Date of actions_secret update.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param visibility Configures the access that repositories have to the organization secret.
         * Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<String> visibility) {
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

        public ActionsOrganizationSecretState build() {
            return $;
        }
    }

}
