// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.DependabotSecretArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.DependabotSecretState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="github:index/dependabotSecret:DependabotSecret")
public class DependabotSecret extends com.pulumi.resources.CustomResource {
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="encryptedValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptedValue;

    public Output<Optional<String>> encryptedValue() {
        return Codegen.optional(this.encryptedValue);
    }
    @Export(name="plaintextValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> plaintextValue;

    public Output<Optional<String>> plaintextValue() {
        return Codegen.optional(this.plaintextValue);
    }
    @Export(name="repository", type=String.class, parameters={})
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }
    @Export(name="secretName", type=String.class, parameters={})
    private Output<String> secretName;

    public Output<String> secretName() {
        return this.secretName;
    }
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DependabotSecret(String name) {
        this(name, DependabotSecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DependabotSecret(String name, DependabotSecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DependabotSecret(String name, DependabotSecretArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/dependabotSecret:DependabotSecret", name, args == null ? DependabotSecretArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DependabotSecret(String name, Output<String> id, @Nullable DependabotSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/dependabotSecret:DependabotSecret", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DependabotSecret get(String name, Output<String> id, @Nullable DependabotSecretState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DependabotSecret(name, id, state, options);
    }
}