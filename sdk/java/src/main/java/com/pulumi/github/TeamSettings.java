// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.github.TeamSettingsArgs;
import com.pulumi.github.Utilities;
import com.pulumi.github.inputs.TeamSettingsState;
import com.pulumi.github.outputs.TeamSettingsReviewRequestDelegation;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the team settings (in particular the request review delegation settings) within the organization
 * 
 * Creating this resource will alter the team Code Review settings.
 * 
 * The team must both belong to the same organization configured in the provider on GitHub.
 * 
 * &gt; **Note**: This resource relies on the v4 GraphQl GitHub API. If this API is not available, or the Stone Crop schema preview is not available, then this resource will not work as intended.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.github.Team;
 * import com.pulumi.github.TeamArgs;
 * import com.pulumi.github.TeamSettings;
 * import com.pulumi.github.TeamSettingsArgs;
 * import com.pulumi.github.inputs.TeamSettingsReviewRequestDelegationArgs;
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
 *         var someTeam = new Team(&#34;someTeam&#34;, TeamArgs.builder()        
 *             .description(&#34;Some cool team&#34;)
 *             .build());
 * 
 *         var codeReviewSettings = new TeamSettings(&#34;codeReviewSettings&#34;, TeamSettingsArgs.builder()        
 *             .teamId(someTeam.id())
 *             .reviewRequestDelegation(TeamSettingsReviewRequestDelegationArgs.builder()
 *                 .algorithm(&#34;ROUND_ROBIN&#34;)
 *                 .memberCount(1)
 *                 .notify(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * GitHub Teams can be imported using the GitHub team ID, or the team slug e.g.
 * 
 * ```sh
 *  $ pulumi import github:index/teamSettings:TeamSettings code_review_settings 1234567
 * ```
 * 
 *  or,
 * 
 * ```sh
 *  $ pulumi import github:index/teamSettings:TeamSettings code_review_settings SomeTeam
 * ```
 * 
 */
@ResourceType(type="github:index/teamSettings:TeamSettings")
public class TeamSettings extends com.pulumi.resources.CustomResource {
    /**
     * The settings for delegating code reviews to individuals on behalf of the team. If this block is present, even without any fields, then review request delegation will be enabled for the team. See GitHub Review Request Delegation below for details. See [GitHub&#39;s documentation](https://docs.github.com/en/organizations/organizing-members-into-teams/managing-code-review-settings-for-your-team#configuring-team-notifications) for more configuration details.
     * 
     */
    @Export(name="reviewRequestDelegation", refs={TeamSettingsReviewRequestDelegation.class}, tree="[0]")
    private Output</* @Nullable */ TeamSettingsReviewRequestDelegation> reviewRequestDelegation;

    /**
     * @return The settings for delegating code reviews to individuals on behalf of the team. If this block is present, even without any fields, then review request delegation will be enabled for the team. See GitHub Review Request Delegation below for details. See [GitHub&#39;s documentation](https://docs.github.com/en/organizations/organizing-members-into-teams/managing-code-review-settings-for-your-team#configuring-team-notifications) for more configuration details.
     * 
     */
    public Output<Optional<TeamSettingsReviewRequestDelegation>> reviewRequestDelegation() {
        return Codegen.optional(this.reviewRequestDelegation);
    }
    /**
     * The GitHub team id or the GitHub team slug
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return The GitHub team id or the GitHub team slug
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }
    /**
     * The slug of the Team within the Organization.
     * 
     */
    @Export(name="teamSlug", refs={String.class}, tree="[0]")
    private Output<String> teamSlug;

    /**
     * @return The slug of the Team within the Organization.
     * 
     */
    public Output<String> teamSlug() {
        return this.teamSlug;
    }
    /**
     * The unique ID of the Team on GitHub. Corresponds to the ID of the &#39;github_team_settings&#39; resource.
     * 
     */
    @Export(name="teamUid", refs={String.class}, tree="[0]")
    private Output<String> teamUid;

    /**
     * @return The unique ID of the Team on GitHub. Corresponds to the ID of the &#39;github_team_settings&#39; resource.
     * 
     */
    public Output<String> teamUid() {
        return this.teamUid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamSettings(String name) {
        this(name, TeamSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamSettings(String name, TeamSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamSettings(String name, TeamSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/teamSettings:TeamSettings", name, args == null ? TeamSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TeamSettings(String name, Output<String> id, @Nullable TeamSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("github:index/teamSettings:TeamSettings", name, state, makeResourceOptions(options, id));
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
    public static TeamSettings get(String name, Output<String> id, @Nullable TeamSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamSettings(name, id, state, options);
    }
}
