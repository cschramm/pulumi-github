// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.OrganizationBlockArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.OrganizationBlockState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource allows you to create and manage blocks for GitHub organizations.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.OrganizationBlock;
 * import com.pulumi.github.OrganizationBlockArgs;
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
 *         var example = new OrganizationBlock("example", OrganizationBlockArgs.builder()        
 *             .username("paultyng")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * GitHub organization block can be imported using a username, e.g.
 * 
 * ```sh
 * $ pulumi import github:index/organizationBlock:OrganizationBlock example someuser
 * ```
 * 
 */
@ResourceType(type="github:index/organizationBlock:OrganizationBlock")
public class OrganizationBlock extends com.pulumi.resources.CustomResource {
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The name of the user to block.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The name of the user to block.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationBlock(String name) {
        this(name, OrganizationBlockArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationBlock(String name, OrganizationBlockArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationBlock(String name, OrganizationBlockArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/organizationBlock:OrganizationBlock", name, args == null ? OrganizationBlockArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationBlock(String name, Output<String> id, @Nullable OrganizationBlockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/organizationBlock:OrganizationBlock", name, state, makeResourceOptions(options, id));
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
    public static OrganizationBlock get(String name, Output<String> id, @Nullable OrganizationBlockState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationBlock(name, id, state, options);
    }
}
