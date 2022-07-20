// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Protects a GitHub branch.
//
// This resource allows you to configure branch protection for repositories in your organization. When applied, the branch will be protected from forced pushes and deletion. Additional constraints, such as required status checks or restrictions on users, teams, and apps, can also be configured.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-github/sdk/v4/go/github"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleRepository, err := github.NewRepository(ctx, "exampleRepository", nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleUser, err := github.GetUser(ctx, &GetUserArgs{
// 			Username: "example",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleTeam, err := github.NewTeam(ctx, "exampleTeam", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = github.NewBranchProtection(ctx, "exampleBranchProtection", &github.BranchProtectionArgs{
// 			RepositoryId:    exampleRepository.NodeId,
// 			Pattern:         pulumi.String("main"),
// 			EnforceAdmins:   pulumi.Bool(true),
// 			AllowsDeletions: pulumi.Bool(true),
// 			RequiredStatusChecks: BranchProtectionRequiredStatusCheckArray{
// 				&BranchProtectionRequiredStatusCheckArgs{
// 					Strict: pulumi.Bool(false),
// 					Contexts: pulumi.StringArray{
// 						pulumi.String("ci/travis"),
// 					},
// 				},
// 			},
// 			RequiredPullRequestReviews: BranchProtectionRequiredPullRequestReviewArray{
// 				&BranchProtectionRequiredPullRequestReviewArgs{
// 					DismissStaleReviews: pulumi.Bool(true),
// 					RestrictDismissals:  pulumi.Bool(true),
// 					DismissalRestrictions: pulumi.StringArray{
// 						pulumi.String(exampleUser.NodeId),
// 						exampleTeam.NodeId,
// 					},
// 				},
// 			},
// 			PushRestrictions: pulumi.StringArray{
// 				pulumi.String(exampleUser.NodeId),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = github.NewTeamRepository(ctx, "exampleTeamRepository", &github.TeamRepositoryArgs{
// 			TeamId:     exampleTeam.ID(),
// 			Repository: exampleRepository.Name,
// 			Permission: pulumi.String("pull"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// GitHub Branch Protection can be imported using an ID made up of `repository:pattern`, e.g.
//
// ```sh
//  $ pulumi import github:index/branchProtection:BranchProtection terraform terraform:main
// ```
type BranchProtection struct {
	pulumi.CustomResourceState

	// Boolean, setting this to `true` to allow the branch to be deleted.
	AllowsDeletions pulumi.BoolPtrOutput `pulumi:"allowsDeletions"`
	// Boolean, setting this to `true` to allow force pushes on the branch.
	AllowsForcePushes pulumi.BoolPtrOutput `pulumi:"allowsForcePushes"`
	// Boolean, setting this to `true` to block creating the branch.
	BlocksCreations pulumi.BoolPtrOutput `pulumi:"blocksCreations"`
	// Boolean, setting this to `true` enforces status checks for repository administrators.
	EnforceAdmins pulumi.BoolPtrOutput `pulumi:"enforceAdmins"`
	// Identifies the protection rule pattern.
	Pattern pulumi.StringOutput `pulumi:"pattern"`
	// The list of actor IDs that may push to the branch.
	PushRestrictions pulumi.StringArrayOutput `pulumi:"pushRestrictions"`
	// The name or node ID of the repository associated with this branch protection rule.
	RepositoryId pulumi.StringOutput `pulumi:"repositoryId"`
	// Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
	RequireConversationResolution pulumi.BoolPtrOutput `pulumi:"requireConversationResolution"`
	// Boolean, setting this to `true` requires all commits to be signed with GPG.
	RequireSignedCommits pulumi.BoolPtrOutput `pulumi:"requireSignedCommits"`
	// Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
	RequiredLinearHistory pulumi.BoolPtrOutput `pulumi:"requiredLinearHistory"`
	// Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
	RequiredPullRequestReviews BranchProtectionRequiredPullRequestReviewArrayOutput `pulumi:"requiredPullRequestReviews"`
	// Enforce restrictions for required status checks. See Required Status Checks below for details.
	RequiredStatusChecks BranchProtectionRequiredStatusCheckArrayOutput `pulumi:"requiredStatusChecks"`
}

// NewBranchProtection registers a new resource with the given unique name, arguments, and options.
func NewBranchProtection(ctx *pulumi.Context,
	name string, args *BranchProtectionArgs, opts ...pulumi.ResourceOption) (*BranchProtection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Pattern == nil {
		return nil, errors.New("invalid value for required argument 'Pattern'")
	}
	if args.RepositoryId == nil {
		return nil, errors.New("invalid value for required argument 'RepositoryId'")
	}
	var resource BranchProtection
	err := ctx.RegisterResource("github:index/branchProtection:BranchProtection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBranchProtection gets an existing BranchProtection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBranchProtection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BranchProtectionState, opts ...pulumi.ResourceOption) (*BranchProtection, error) {
	var resource BranchProtection
	err := ctx.ReadResource("github:index/branchProtection:BranchProtection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BranchProtection resources.
type branchProtectionState struct {
	// Boolean, setting this to `true` to allow the branch to be deleted.
	AllowsDeletions *bool `pulumi:"allowsDeletions"`
	// Boolean, setting this to `true` to allow force pushes on the branch.
	AllowsForcePushes *bool `pulumi:"allowsForcePushes"`
	// Boolean, setting this to `true` to block creating the branch.
	BlocksCreations *bool `pulumi:"blocksCreations"`
	// Boolean, setting this to `true` enforces status checks for repository administrators.
	EnforceAdmins *bool `pulumi:"enforceAdmins"`
	// Identifies the protection rule pattern.
	Pattern *string `pulumi:"pattern"`
	// The list of actor IDs that may push to the branch.
	PushRestrictions []string `pulumi:"pushRestrictions"`
	// The name or node ID of the repository associated with this branch protection rule.
	RepositoryId *string `pulumi:"repositoryId"`
	// Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
	RequireConversationResolution *bool `pulumi:"requireConversationResolution"`
	// Boolean, setting this to `true` requires all commits to be signed with GPG.
	RequireSignedCommits *bool `pulumi:"requireSignedCommits"`
	// Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
	RequiredLinearHistory *bool `pulumi:"requiredLinearHistory"`
	// Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
	RequiredPullRequestReviews []BranchProtectionRequiredPullRequestReview `pulumi:"requiredPullRequestReviews"`
	// Enforce restrictions for required status checks. See Required Status Checks below for details.
	RequiredStatusChecks []BranchProtectionRequiredStatusCheck `pulumi:"requiredStatusChecks"`
}

type BranchProtectionState struct {
	// Boolean, setting this to `true` to allow the branch to be deleted.
	AllowsDeletions pulumi.BoolPtrInput
	// Boolean, setting this to `true` to allow force pushes on the branch.
	AllowsForcePushes pulumi.BoolPtrInput
	// Boolean, setting this to `true` to block creating the branch.
	BlocksCreations pulumi.BoolPtrInput
	// Boolean, setting this to `true` enforces status checks for repository administrators.
	EnforceAdmins pulumi.BoolPtrInput
	// Identifies the protection rule pattern.
	Pattern pulumi.StringPtrInput
	// The list of actor IDs that may push to the branch.
	PushRestrictions pulumi.StringArrayInput
	// The name or node ID of the repository associated with this branch protection rule.
	RepositoryId pulumi.StringPtrInput
	// Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
	RequireConversationResolution pulumi.BoolPtrInput
	// Boolean, setting this to `true` requires all commits to be signed with GPG.
	RequireSignedCommits pulumi.BoolPtrInput
	// Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
	RequiredLinearHistory pulumi.BoolPtrInput
	// Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
	RequiredPullRequestReviews BranchProtectionRequiredPullRequestReviewArrayInput
	// Enforce restrictions for required status checks. See Required Status Checks below for details.
	RequiredStatusChecks BranchProtectionRequiredStatusCheckArrayInput
}

func (BranchProtectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*branchProtectionState)(nil)).Elem()
}

type branchProtectionArgs struct {
	// Boolean, setting this to `true` to allow the branch to be deleted.
	AllowsDeletions *bool `pulumi:"allowsDeletions"`
	// Boolean, setting this to `true` to allow force pushes on the branch.
	AllowsForcePushes *bool `pulumi:"allowsForcePushes"`
	// Boolean, setting this to `true` to block creating the branch.
	BlocksCreations *bool `pulumi:"blocksCreations"`
	// Boolean, setting this to `true` enforces status checks for repository administrators.
	EnforceAdmins *bool `pulumi:"enforceAdmins"`
	// Identifies the protection rule pattern.
	Pattern string `pulumi:"pattern"`
	// The list of actor IDs that may push to the branch.
	PushRestrictions []string `pulumi:"pushRestrictions"`
	// The name or node ID of the repository associated with this branch protection rule.
	RepositoryId string `pulumi:"repositoryId"`
	// Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
	RequireConversationResolution *bool `pulumi:"requireConversationResolution"`
	// Boolean, setting this to `true` requires all commits to be signed with GPG.
	RequireSignedCommits *bool `pulumi:"requireSignedCommits"`
	// Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
	RequiredLinearHistory *bool `pulumi:"requiredLinearHistory"`
	// Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
	RequiredPullRequestReviews []BranchProtectionRequiredPullRequestReview `pulumi:"requiredPullRequestReviews"`
	// Enforce restrictions for required status checks. See Required Status Checks below for details.
	RequiredStatusChecks []BranchProtectionRequiredStatusCheck `pulumi:"requiredStatusChecks"`
}

// The set of arguments for constructing a BranchProtection resource.
type BranchProtectionArgs struct {
	// Boolean, setting this to `true` to allow the branch to be deleted.
	AllowsDeletions pulumi.BoolPtrInput
	// Boolean, setting this to `true` to allow force pushes on the branch.
	AllowsForcePushes pulumi.BoolPtrInput
	// Boolean, setting this to `true` to block creating the branch.
	BlocksCreations pulumi.BoolPtrInput
	// Boolean, setting this to `true` enforces status checks for repository administrators.
	EnforceAdmins pulumi.BoolPtrInput
	// Identifies the protection rule pattern.
	Pattern pulumi.StringInput
	// The list of actor IDs that may push to the branch.
	PushRestrictions pulumi.StringArrayInput
	// The name or node ID of the repository associated with this branch protection rule.
	RepositoryId pulumi.StringInput
	// Boolean, setting this to `true` requires all conversations on code must be resolved before a pull request can be merged.
	RequireConversationResolution pulumi.BoolPtrInput
	// Boolean, setting this to `true` requires all commits to be signed with GPG.
	RequireSignedCommits pulumi.BoolPtrInput
	// Boolean, setting this to `true` enforces a linear commit Git history, which prevents anyone from pushing merge commits to a branch
	RequiredLinearHistory pulumi.BoolPtrInput
	// Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
	RequiredPullRequestReviews BranchProtectionRequiredPullRequestReviewArrayInput
	// Enforce restrictions for required status checks. See Required Status Checks below for details.
	RequiredStatusChecks BranchProtectionRequiredStatusCheckArrayInput
}

func (BranchProtectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*branchProtectionArgs)(nil)).Elem()
}

type BranchProtectionInput interface {
	pulumi.Input

	ToBranchProtectionOutput() BranchProtectionOutput
	ToBranchProtectionOutputWithContext(ctx context.Context) BranchProtectionOutput
}

func (*BranchProtection) ElementType() reflect.Type {
	return reflect.TypeOf((**BranchProtection)(nil)).Elem()
}

func (i *BranchProtection) ToBranchProtectionOutput() BranchProtectionOutput {
	return i.ToBranchProtectionOutputWithContext(context.Background())
}

func (i *BranchProtection) ToBranchProtectionOutputWithContext(ctx context.Context) BranchProtectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BranchProtectionOutput)
}

// BranchProtectionArrayInput is an input type that accepts BranchProtectionArray and BranchProtectionArrayOutput values.
// You can construct a concrete instance of `BranchProtectionArrayInput` via:
//
//          BranchProtectionArray{ BranchProtectionArgs{...} }
type BranchProtectionArrayInput interface {
	pulumi.Input

	ToBranchProtectionArrayOutput() BranchProtectionArrayOutput
	ToBranchProtectionArrayOutputWithContext(context.Context) BranchProtectionArrayOutput
}

type BranchProtectionArray []BranchProtectionInput

func (BranchProtectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BranchProtection)(nil)).Elem()
}

func (i BranchProtectionArray) ToBranchProtectionArrayOutput() BranchProtectionArrayOutput {
	return i.ToBranchProtectionArrayOutputWithContext(context.Background())
}

func (i BranchProtectionArray) ToBranchProtectionArrayOutputWithContext(ctx context.Context) BranchProtectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BranchProtectionArrayOutput)
}

// BranchProtectionMapInput is an input type that accepts BranchProtectionMap and BranchProtectionMapOutput values.
// You can construct a concrete instance of `BranchProtectionMapInput` via:
//
//          BranchProtectionMap{ "key": BranchProtectionArgs{...} }
type BranchProtectionMapInput interface {
	pulumi.Input

	ToBranchProtectionMapOutput() BranchProtectionMapOutput
	ToBranchProtectionMapOutputWithContext(context.Context) BranchProtectionMapOutput
}

type BranchProtectionMap map[string]BranchProtectionInput

func (BranchProtectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BranchProtection)(nil)).Elem()
}

func (i BranchProtectionMap) ToBranchProtectionMapOutput() BranchProtectionMapOutput {
	return i.ToBranchProtectionMapOutputWithContext(context.Background())
}

func (i BranchProtectionMap) ToBranchProtectionMapOutputWithContext(ctx context.Context) BranchProtectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BranchProtectionMapOutput)
}

type BranchProtectionOutput struct{ *pulumi.OutputState }

func (BranchProtectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BranchProtection)(nil)).Elem()
}

func (o BranchProtectionOutput) ToBranchProtectionOutput() BranchProtectionOutput {
	return o
}

func (o BranchProtectionOutput) ToBranchProtectionOutputWithContext(ctx context.Context) BranchProtectionOutput {
	return o
}

type BranchProtectionArrayOutput struct{ *pulumi.OutputState }

func (BranchProtectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BranchProtection)(nil)).Elem()
}

func (o BranchProtectionArrayOutput) ToBranchProtectionArrayOutput() BranchProtectionArrayOutput {
	return o
}

func (o BranchProtectionArrayOutput) ToBranchProtectionArrayOutputWithContext(ctx context.Context) BranchProtectionArrayOutput {
	return o
}

func (o BranchProtectionArrayOutput) Index(i pulumi.IntInput) BranchProtectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BranchProtection {
		return vs[0].([]*BranchProtection)[vs[1].(int)]
	}).(BranchProtectionOutput)
}

type BranchProtectionMapOutput struct{ *pulumi.OutputState }

func (BranchProtectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BranchProtection)(nil)).Elem()
}

func (o BranchProtectionMapOutput) ToBranchProtectionMapOutput() BranchProtectionMapOutput {
	return o
}

func (o BranchProtectionMapOutput) ToBranchProtectionMapOutputWithContext(ctx context.Context) BranchProtectionMapOutput {
	return o
}

func (o BranchProtectionMapOutput) MapIndex(k pulumi.StringInput) BranchProtectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BranchProtection {
		return vs[0].(map[string]*BranchProtection)[vs[1].(string)]
	}).(BranchProtectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BranchProtectionInput)(nil)).Elem(), &BranchProtection{})
	pulumi.RegisterInputType(reflect.TypeOf((*BranchProtectionArrayInput)(nil)).Elem(), BranchProtectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BranchProtectionMapInput)(nil)).Elem(), BranchProtectionMap{})
	pulumi.RegisterOutputType(BranchProtectionOutput{})
	pulumi.RegisterOutputType(BranchProtectionArrayOutput{})
	pulumi.RegisterOutputType(BranchProtectionMapOutput{})
}
