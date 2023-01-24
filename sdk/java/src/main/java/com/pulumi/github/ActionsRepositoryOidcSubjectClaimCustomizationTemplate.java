// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.ActionsRepositoryOidcSubjectClaimCustomizationTemplateState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to create and manage an OpenID Connect subject claim customization template for a GitHub
 * repository.
 * 
 * More information on integrating GitHub with cloud providers using OpenID Connect and a list of available claims is
 * available in the [Actions documentation](https://docs.github.com/en/actions/deployment/security-hardening-your-deployments/about-security-hardening-with-openid-connect).
 * 
 * The following table lists the behaviour of `use_default`:
 * 
 * | `use_default` | `include_claim_keys` | Template used                                             |
 * |---------------|----------------------|-----------------------------------------------------------|
 * | `true`        | Unset                | GitHub&#39;s default                                          |
 * | `false`       | Set                  | `include_claim_keys`                                      |
 * | `false`       | Unset                | Organization&#39;s default if set, otherwise GitHub&#39;s default |
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.Repository;
 * import com.pulumi.github.ActionsRepositoryOidcSubjectClaimCustomizationTemplate;
 * import com.pulumi.github.ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Repository(&#34;example&#34;);
 * 
 *         var exampleTemplate = new ActionsRepositoryOidcSubjectClaimCustomizationTemplate(&#34;exampleTemplate&#34;, ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs.builder()        
 *             .repository(example.name())
 *             .useDefault(false)
 *             .includeClaimKeys(            
 *                 &#34;actor&#34;,
 *                 &#34;context&#34;,
 *                 &#34;repository_owner&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using the repository&#39;s name.
 * 
 * ```sh
 *  $ pulumi import github:index/actionsRepositoryOidcSubjectClaimCustomizationTemplate:ActionsRepositoryOidcSubjectClaimCustomizationTemplate test example_repository
 * ```
 * 
 */
@ResourceType(type="github:index/actionsRepositoryOidcSubjectClaimCustomizationTemplate:ActionsRepositoryOidcSubjectClaimCustomizationTemplate")
public class ActionsRepositoryOidcSubjectClaimCustomizationTemplate extends com.pulumi.resources.CustomResource {
    /**
     * A list of OpenID Connect claims.
     * 
     */
    @Export(name="includeClaimKeys", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> includeClaimKeys;

    /**
     * @return A list of OpenID Connect claims.
     * 
     */
    public Output<Optional<List<String>>> includeClaimKeys() {
        return Codegen.optional(this.includeClaimKeys);
    }
    @Export(name="repository", type=String.class, parameters={})
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }
    /**
     * Whether to use the default template or not. If `true`, `include_claim_keys` must not
     * be set.
     * 
     */
    @Export(name="useDefault", type=Boolean.class, parameters={})
    private Output<Boolean> useDefault;

    /**
     * @return Whether to use the default template or not. If `true`, `include_claim_keys` must not
     * be set.
     * 
     */
    public Output<Boolean> useDefault() {
        return this.useDefault;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActionsRepositoryOidcSubjectClaimCustomizationTemplate(String name) {
        this(name, ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionsRepositoryOidcSubjectClaimCustomizationTemplate(String name, ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionsRepositoryOidcSubjectClaimCustomizationTemplate(String name, ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/actionsRepositoryOidcSubjectClaimCustomizationTemplate:ActionsRepositoryOidcSubjectClaimCustomizationTemplate", name, args == null ? ActionsRepositoryOidcSubjectClaimCustomizationTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionsRepositoryOidcSubjectClaimCustomizationTemplate(String name, Output<String> id, @Nullable ActionsRepositoryOidcSubjectClaimCustomizationTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/actionsRepositoryOidcSubjectClaimCustomizationTemplate:ActionsRepositoryOidcSubjectClaimCustomizationTemplate", name, state, makeResourceOptions(options, id));
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
    public static ActionsRepositoryOidcSubjectClaimCustomizationTemplate get(String name, Output<String> id, @Nullable ActionsRepositoryOidcSubjectClaimCustomizationTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActionsRepositoryOidcSubjectClaimCustomizationTemplate(name, id, state, options);
    }
}
