// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs Empty = new ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs();

    /**
     * A list of OpenID Connect claims.
     * 
     */
    @Import(name="includeClaimKeys")
    private @Nullable Output<List<String>> includeClaimKeys;

    /**
     * @return A list of OpenID Connect claims.
     * 
     */
    public Optional<Output<List<String>>> includeClaimKeys() {
        return Optional.ofNullable(this.includeClaimKeys);
    }

    /**
     * The name of the repository.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The name of the repository.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    /**
     * Whether to use the default template or not. If `true`, `include_claim_keys` must not
     * be set.
     * 
     */
    @Import(name="useDefault", required=true)
    private Output<Boolean> useDefault;

    /**
     * @return Whether to use the default template or not. If `true`, `include_claim_keys` must not
     * be set.
     * 
     */
    public Output<Boolean> useDefault() {
        return this.useDefault;
    }

    private ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs() {}

    private ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs(ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs $) {
        this.includeClaimKeys = $.includeClaimKeys;
        this.repository = $.repository;
        this.useDefault = $.useDefault;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs $;

        public Builder() {
            $ = new ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs();
        }

        public Builder(ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs defaults) {
            $ = new ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeClaimKeys A list of OpenID Connect claims.
         * 
         * @return builder
         * 
         */
        public Builder includeClaimKeys(@Nullable Output<List<String>> includeClaimKeys) {
            $.includeClaimKeys = includeClaimKeys;
            return this;
        }

        /**
         * @param includeClaimKeys A list of OpenID Connect claims.
         * 
         * @return builder
         * 
         */
        public Builder includeClaimKeys(List<String> includeClaimKeys) {
            return includeClaimKeys(Output.of(includeClaimKeys));
        }

        /**
         * @param includeClaimKeys A list of OpenID Connect claims.
         * 
         * @return builder
         * 
         */
        public Builder includeClaimKeys(String... includeClaimKeys) {
            return includeClaimKeys(List.of(includeClaimKeys));
        }

        /**
         * @param repository The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param useDefault Whether to use the default template or not. If `true`, `include_claim_keys` must not
         * be set.
         * 
         * @return builder
         * 
         */
        public Builder useDefault(Output<Boolean> useDefault) {
            $.useDefault = useDefault;
            return this;
        }

        /**
         * @param useDefault Whether to use the default template or not. If `true`, `include_claim_keys` must not
         * be set.
         * 
         * @return builder
         * 
         */
        public Builder useDefault(Boolean useDefault) {
            return useDefault(Output.of(useDefault));
        }

        public ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs build() {
            $.repository = Objects.requireNonNull($.repository, "expected parameter 'repository' to be non-null");
            $.useDefault = Objects.requireNonNull($.useDefault, "expected parameter 'useDefault' to be non-null");
            return $;
        }
    }

}