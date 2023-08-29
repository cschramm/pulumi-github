// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.EnterpriseOrganizationArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.EnterpriseOrganizationState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to create and manage a GitHub enterprise organization.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.EnterpriseOrganization;
 * import com.pulumi.github.EnterpriseOrganizationArgs;
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
 *         var org = new EnterpriseOrganization(&#34;org&#34;, EnterpriseOrganizationArgs.builder()        
 *             .enterpriseId(data.github_enterprise().enterprise().id())
 *             .description(&#34;Organization created with terraform&#34;)
 *             .billingEmail(&#34;jon@winteriscoming.com&#34;)
 *             .adminLogins(&#34;jon-snow&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Support for importing organizations is not currently supported.
 * 
 */
@ResourceType(type="github:index/enterpriseOrganization:EnterpriseOrganization")
public class EnterpriseOrganization extends com.pulumi.resources.CustomResource {
    /**
     * List of organization owner usernames.
     * 
     */
    @Export(name="adminLogins", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> adminLogins;

    /**
     * @return List of organization owner usernames.
     * 
     */
    public Output<List<String>> adminLogins() {
        return this.adminLogins;
    }
    /**
     * The billing email address.
     * 
     */
    @Export(name="billingEmail", refs={String.class}, tree="[0]")
    private Output<String> billingEmail;

    /**
     * @return The billing email address.
     * 
     */
    public Output<String> billingEmail() {
        return this.billingEmail;
    }
    /**
     * The description of the organization.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the organization.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the enterprise.
     * 
     */
    @Export(name="enterpriseId", refs={String.class}, tree="[0]")
    private Output<String> enterpriseId;

    /**
     * @return The ID of the enterprise.
     * 
     */
    public Output<String> enterpriseId() {
        return this.enterpriseId;
    }
    /**
     * The name of the organization.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseOrganization(String name) {
        this(name, EnterpriseOrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseOrganization(String name, EnterpriseOrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseOrganization(String name, EnterpriseOrganizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/enterpriseOrganization:EnterpriseOrganization", name, args == null ? EnterpriseOrganizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnterpriseOrganization(String name, Output<String> id, @Nullable EnterpriseOrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/enterpriseOrganization:EnterpriseOrganization", name, state, makeResourceOptions(options, id));
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
    public static EnterpriseOrganization get(String name, Output<String> id, @Nullable EnterpriseOrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseOrganization(name, id, state, options);
    }
}
