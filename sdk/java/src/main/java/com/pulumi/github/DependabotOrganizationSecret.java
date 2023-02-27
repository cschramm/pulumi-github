// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.DependabotOrganizationSecretArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.DependabotOrganizationSecretState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="github:index/dependabotOrganizationSecret:DependabotOrganizationSecret")
public class DependabotOrganizationSecret extends com.pulumi.resources.CustomResource {
    /**
     * Date of &#39;dependabot_secret&#39; creation.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Date of &#39;dependabot_secret&#39; creation.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Encrypted value of the secret using the GitHub public key in Base64 format.
     * 
     */
    @Export(name="encryptedValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptedValue;

    /**
     * @return Encrypted value of the secret using the GitHub public key in Base64 format.
     * 
     */
    public Output<Optional<String>> encryptedValue() {
        return Codegen.optional(this.encryptedValue);
    }
    /**
     * Plaintext value of the secret to be encrypted.
     * 
     */
    @Export(name="plaintextValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> plaintextValue;

    /**
     * @return Plaintext value of the secret to be encrypted.
     * 
     */
    public Output<Optional<String>> plaintextValue() {
        return Codegen.optional(this.plaintextValue);
    }
    /**
     * Name of the secret.
     * 
     */
    @Export(name="secretName", type=String.class, parameters={})
    private Output<String> secretName;

    /**
     * @return Name of the secret.
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }
    /**
     * An array of repository ids that can access the organization secret.
     * 
     */
    @Export(name="selectedRepositoryIds", type=List.class, parameters={Integer.class})
    private Output</* @Nullable */ List<Integer>> selectedRepositoryIds;

    /**
     * @return An array of repository ids that can access the organization secret.
     * 
     */
    public Output<Optional<List<Integer>>> selectedRepositoryIds() {
        return Codegen.optional(this.selectedRepositoryIds);
    }
    /**
     * Date of &#39;dependabot_secret&#39; update.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return Date of &#39;dependabot_secret&#39; update.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * Configures the access that repositories have to the organization secret. Must be one of &#39;all&#39;, &#39;private&#39; or &#39;selected&#39;.
     * &#39;selected_repository_ids&#39; is required if set to &#39;selected&#39;.
     * 
     */
    @Export(name="visibility", type=String.class, parameters={})
    private Output<String> visibility;

    /**
     * @return Configures the access that repositories have to the organization secret. Must be one of &#39;all&#39;, &#39;private&#39; or &#39;selected&#39;.
     * &#39;selected_repository_ids&#39; is required if set to &#39;selected&#39;.
     * 
     */
    public Output<String> visibility() {
        return this.visibility;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DependabotOrganizationSecret(String name) {
        this(name, DependabotOrganizationSecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DependabotOrganizationSecret(String name, DependabotOrganizationSecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DependabotOrganizationSecret(String name, DependabotOrganizationSecretArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/dependabotOrganizationSecret:DependabotOrganizationSecret", name, args == null ? DependabotOrganizationSecretArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DependabotOrganizationSecret(String name, Output<String> id, @Nullable DependabotOrganizationSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/dependabotOrganizationSecret:DependabotOrganizationSecret", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "encryptedValue",
                "plaintextValue"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DependabotOrganizationSecret get(String name, Output<String> id, @Nullable DependabotOrganizationSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DependabotOrganizationSecret(name, id, state, options);
    }
}
