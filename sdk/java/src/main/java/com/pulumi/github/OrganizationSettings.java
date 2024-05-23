// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.OrganizationSettingsArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.OrganizationSettingsState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to create and manage settings for a GitHub Organization.
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
 * import com.pulumi.github.OrganizationSettings;
 * import com.pulumi.github.OrganizationSettingsArgs;
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
 *         var test = new OrganizationSettings("test", OrganizationSettingsArgs.builder()
 *             .billingEmail("test{@literal @}example.com")
 *             .company("Test Company")
 *             .blog("https://example.com")
 *             .email("test{@literal @}example.com")
 *             .twitterUsername("Test")
 *             .location("Test Location")
 *             .name("Test Name")
 *             .description("Test Description")
 *             .hasOrganizationProjects(true)
 *             .hasRepositoryProjects(true)
 *             .defaultRepositoryPermission("read")
 *             .membersCanCreateRepositories(true)
 *             .membersCanCreatePublicRepositories(true)
 *             .membersCanCreatePrivateRepositories(true)
 *             .membersCanCreateInternalRepositories(true)
 *             .membersCanCreatePages(true)
 *             .membersCanCreatePublicPages(true)
 *             .membersCanCreatePrivatePages(true)
 *             .membersCanForkPrivateRepositories(true)
 *             .webCommitSignoffRequired(true)
 *             .advancedSecurityEnabledForNewRepositories(false)
 *             .dependabotAlertsEnabledForNewRepositories(false)
 *             .dependabotSecurityUpdatesEnabledForNewRepositories(false)
 *             .dependencyGraphEnabledForNewRepositories(false)
 *             .secretScanningEnabledForNewRepositories(false)
 *             .secretScanningPushProtectionEnabledForNewRepositories(false)
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
 * Organization settings can be imported using the `id` of the organization.
 * The `id` of the organization can be found using the [get an organization](https://docs.github.com/en/rest/orgs/orgs#get-an-organization) API.
 * 
 * ```sh
 * $ pulumi import github:index/organizationSettings:OrganizationSettings test 123456789
 * ```
 * 
 */
@ResourceType(type="github:index/organizationSettings:OrganizationSettings")
public class OrganizationSettings extends com.pulumi.resources.CustomResource {
    /**
     * Whether or not advanced security is enabled for new repositories. Defaults to `false`.
     * 
     */
    @Export(name="advancedSecurityEnabledForNewRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> advancedSecurityEnabledForNewRepositories;

    /**
     * @return Whether or not advanced security is enabled for new repositories. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> advancedSecurityEnabledForNewRepositories() {
        return Codegen.optional(this.advancedSecurityEnabledForNewRepositories);
    }
    /**
     * The billing email address for the organization.
     * 
     */
    @Export(name="billingEmail", refs={String.class}, tree="[0]")
    private Output<String> billingEmail;

    /**
     * @return The billing email address for the organization.
     * 
     */
    public Output<String> billingEmail() {
        return this.billingEmail;
    }
    /**
     * The blog URL for the organization.
     * 
     */
    @Export(name="blog", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> blog;

    /**
     * @return The blog URL for the organization.
     * 
     */
    public Output<Optional<String>> blog() {
        return Codegen.optional(this.blog);
    }
    /**
     * The company name for the organization.
     * 
     */
    @Export(name="company", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> company;

    /**
     * @return The company name for the organization.
     * 
     */
    public Output<Optional<String>> company() {
        return Codegen.optional(this.company);
    }
    /**
     * The default permission for organization members to create new repositories. Can be one of `read`, `write`, `admin`, or `none`. Defaults to `read`.
     * 
     */
    @Export(name="defaultRepositoryPermission", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultRepositoryPermission;

    /**
     * @return The default permission for organization members to create new repositories. Can be one of `read`, `write`, `admin`, or `none`. Defaults to `read`.
     * 
     */
    public Output<Optional<String>> defaultRepositoryPermission() {
        return Codegen.optional(this.defaultRepositoryPermission);
    }
    /**
     * Whether or not dependabot alerts are enabled for new repositories. Defaults to `false`.
     * 
     */
    @Export(name="dependabotAlertsEnabledForNewRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dependabotAlertsEnabledForNewRepositories;

    /**
     * @return Whether or not dependabot alerts are enabled for new repositories. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> dependabotAlertsEnabledForNewRepositories() {
        return Codegen.optional(this.dependabotAlertsEnabledForNewRepositories);
    }
    /**
     * Whether or not dependabot security updates are enabled for new repositories. Defaults to `false`.
     * 
     */
    @Export(name="dependabotSecurityUpdatesEnabledForNewRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dependabotSecurityUpdatesEnabledForNewRepositories;

    /**
     * @return Whether or not dependabot security updates are enabled for new repositories. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> dependabotSecurityUpdatesEnabledForNewRepositories() {
        return Codegen.optional(this.dependabotSecurityUpdatesEnabledForNewRepositories);
    }
    /**
     * Whether or not dependency graph is enabled for new repositories. Defaults to `false`.
     * 
     */
    @Export(name="dependencyGraphEnabledForNewRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dependencyGraphEnabledForNewRepositories;

    /**
     * @return Whether or not dependency graph is enabled for new repositories. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> dependencyGraphEnabledForNewRepositories() {
        return Codegen.optional(this.dependencyGraphEnabledForNewRepositories);
    }
    /**
     * The description for the organization.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the organization.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The email address for the organization.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return The email address for the organization.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * Whether or not organization projects are enabled for the organization.
     * 
     */
    @Export(name="hasOrganizationProjects", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> hasOrganizationProjects;

    /**
     * @return Whether or not organization projects are enabled for the organization.
     * 
     */
    public Output<Optional<Boolean>> hasOrganizationProjects() {
        return Codegen.optional(this.hasOrganizationProjects);
    }
    /**
     * Whether or not repository projects are enabled for the organization.
     * 
     */
    @Export(name="hasRepositoryProjects", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> hasRepositoryProjects;

    /**
     * @return Whether or not repository projects are enabled for the organization.
     * 
     */
    public Output<Optional<Boolean>> hasRepositoryProjects() {
        return Codegen.optional(this.hasRepositoryProjects);
    }
    /**
     * The location for the organization.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> location;

    /**
     * @return The location for the organization.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Whether or not organization members can create new internal repositories. For Enterprise Organizations only.
     * 
     */
    @Export(name="membersCanCreateInternalRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanCreateInternalRepositories;

    /**
     * @return Whether or not organization members can create new internal repositories. For Enterprise Organizations only.
     * 
     */
    public Output<Optional<Boolean>> membersCanCreateInternalRepositories() {
        return Codegen.optional(this.membersCanCreateInternalRepositories);
    }
    /**
     * Whether or not organization members can create new pages. Defaults to `true`.
     * 
     */
    @Export(name="membersCanCreatePages", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanCreatePages;

    /**
     * @return Whether or not organization members can create new pages. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> membersCanCreatePages() {
        return Codegen.optional(this.membersCanCreatePages);
    }
    /**
     * Whether or not organization members can create new private pages. Defaults to `true`.
     * 
     */
    @Export(name="membersCanCreatePrivatePages", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanCreatePrivatePages;

    /**
     * @return Whether or not organization members can create new private pages. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> membersCanCreatePrivatePages() {
        return Codegen.optional(this.membersCanCreatePrivatePages);
    }
    /**
     * Whether or not organization members can create new private repositories. Defaults to `true`.
     * 
     */
    @Export(name="membersCanCreatePrivateRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanCreatePrivateRepositories;

    /**
     * @return Whether or not organization members can create new private repositories. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> membersCanCreatePrivateRepositories() {
        return Codegen.optional(this.membersCanCreatePrivateRepositories);
    }
    /**
     * Whether or not organization members can create new public pages. Defaults to `true`.
     * 
     */
    @Export(name="membersCanCreatePublicPages", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanCreatePublicPages;

    /**
     * @return Whether or not organization members can create new public pages. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> membersCanCreatePublicPages() {
        return Codegen.optional(this.membersCanCreatePublicPages);
    }
    /**
     * Whether or not organization members can create new public repositories. Defaults to `true`.
     * 
     */
    @Export(name="membersCanCreatePublicRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanCreatePublicRepositories;

    /**
     * @return Whether or not organization members can create new public repositories. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> membersCanCreatePublicRepositories() {
        return Codegen.optional(this.membersCanCreatePublicRepositories);
    }
    /**
     * Whether or not organization members can create new repositories. Defaults to `true`.
     * 
     */
    @Export(name="membersCanCreateRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanCreateRepositories;

    /**
     * @return Whether or not organization members can create new repositories. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> membersCanCreateRepositories() {
        return Codegen.optional(this.membersCanCreateRepositories);
    }
    /**
     * Whether or not organization members can fork private repositories. Defaults to `false`.
     * 
     */
    @Export(name="membersCanForkPrivateRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> membersCanForkPrivateRepositories;

    /**
     * @return Whether or not organization members can fork private repositories. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> membersCanForkPrivateRepositories() {
        return Codegen.optional(this.membersCanForkPrivateRepositories);
    }
    /**
     * The name for the organization.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether or not secret scanning is enabled for new repositories. Defaults to `false`.
     * 
     */
    @Export(name="secretScanningEnabledForNewRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> secretScanningEnabledForNewRepositories;

    /**
     * @return Whether or not secret scanning is enabled for new repositories. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> secretScanningEnabledForNewRepositories() {
        return Codegen.optional(this.secretScanningEnabledForNewRepositories);
    }
    /**
     * Whether or not secret scanning push protection is enabled for new repositories. Defaults to `false`.
     * 
     */
    @Export(name="secretScanningPushProtectionEnabledForNewRepositories", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> secretScanningPushProtectionEnabledForNewRepositories;

    /**
     * @return Whether or not secret scanning push protection is enabled for new repositories. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> secretScanningPushProtectionEnabledForNewRepositories() {
        return Codegen.optional(this.secretScanningPushProtectionEnabledForNewRepositories);
    }
    /**
     * The Twitter username for the organization.
     * 
     */
    @Export(name="twitterUsername", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> twitterUsername;

    /**
     * @return The Twitter username for the organization.
     * 
     */
    public Output<Optional<String>> twitterUsername() {
        return Codegen.optional(this.twitterUsername);
    }
    /**
     * Whether or not commit signatures are required for commits to the organization. Defaults to `false`.
     * 
     */
    @Export(name="webCommitSignoffRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> webCommitSignoffRequired;

    /**
     * @return Whether or not commit signatures are required for commits to the organization. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> webCommitSignoffRequired() {
        return Codegen.optional(this.webCommitSignoffRequired);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationSettings(String name) {
        this(name, OrganizationSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationSettings(String name, OrganizationSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationSettings(String name, OrganizationSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/organizationSettings:OrganizationSettings", name, args == null ? OrganizationSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationSettings(String name, Output<String> id, @Nullable OrganizationSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/organizationSettings:OrganizationSettings", name, state, makeResourceOptions(options, id));
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
    public static OrganizationSettings get(String name, Output<String> id, @Nullable OrganizationSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationSettings(name, id, state, options);
    }
}
