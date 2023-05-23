// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create and manage cards for GitHub projects.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-github/sdk/v5/go/github"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			project, err := github.NewOrganizationProject(ctx, "project", &github.OrganizationProjectArgs{
//				Body: pulumi.String("This is an organization project."),
//			})
//			if err != nil {
//				return err
//			}
//			column, err := github.NewProjectColumn(ctx, "column", &github.ProjectColumnArgs{
//				ProjectId: project.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = github.NewProjectCard(ctx, "card", &github.ProjectCardArgs{
//				ColumnId: column.ColumnId,
//				Note:     pulumi.String("## Unaccepted 👇"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Adding An Issue To A Project
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-github/sdk/v5/go/github"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			testRepository, err := github.NewRepository(ctx, "testRepository", &github.RepositoryArgs{
//				HasProjects: pulumi.Bool(true),
//				HasIssues:   pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			testIssue, err := github.NewIssue(ctx, "testIssue", &github.IssueArgs{
//				Repository: testRepository.ID(),
//				Title:      pulumi.String("Test issue title"),
//				Body:       pulumi.String("Test issue body"),
//			})
//			if err != nil {
//				return err
//			}
//			testRepositoryProject, err := github.NewRepositoryProject(ctx, "testRepositoryProject", &github.RepositoryProjectArgs{
//				Repository: testRepository.Name,
//				Body:       pulumi.String("this is a test project"),
//			})
//			if err != nil {
//				return err
//			}
//			testProjectColumn, err := github.NewProjectColumn(ctx, "testProjectColumn", &github.ProjectColumnArgs{
//				ProjectId: testRepositoryProject.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = github.NewProjectCard(ctx, "testProjectCard", &github.ProjectCardArgs{
//				ColumnId:    testProjectColumn.ColumnId,
//				ContentId:   testIssue.IssueId,
//				ContentType: pulumi.String("Issue"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// A GitHub Project Card can be imported using its [Card ID](https://developer.github.com/v3/projects/cards/#get-a-project-card)
//
// ```sh
//
//	$ pulumi import github:index/projectCard:ProjectCard card 01234567
//
// ```
type ProjectCard struct {
	pulumi.CustomResourceState

	// The ID of the card.
	CardId pulumi.IntOutput `pulumi:"cardId"`
	// The ID of the card.
	ColumnId pulumi.StringOutput `pulumi:"columnId"`
	// `github_issue.issue_id`.
	ContentId pulumi.IntPtrOutput `pulumi:"contentId"`
	// Must be either `Issue` or `PullRequest`
	//
	// **Remarks:** You must either set the `note` attribute or both `contentId` and `contentType`.
	// See note example or issue example for more information.
	ContentType pulumi.StringPtrOutput `pulumi:"contentType"`
	Etag        pulumi.StringOutput    `pulumi:"etag"`
	// The note contents of the card. Markdown supported.
	Note pulumi.StringPtrOutput `pulumi:"note"`
}

// NewProjectCard registers a new resource with the given unique name, arguments, and options.
func NewProjectCard(ctx *pulumi.Context,
	name string, args *ProjectCardArgs, opts ...pulumi.ResourceOption) (*ProjectCard, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ColumnId == nil {
		return nil, errors.New("invalid value for required argument 'ColumnId'")
	}
	var resource ProjectCard
	err := ctx.RegisterResource("github:index/projectCard:ProjectCard", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectCard gets an existing ProjectCard resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectCard(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectCardState, opts ...pulumi.ResourceOption) (*ProjectCard, error) {
	var resource ProjectCard
	err := ctx.ReadResource("github:index/projectCard:ProjectCard", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectCard resources.
type projectCardState struct {
	// The ID of the card.
	CardId *int `pulumi:"cardId"`
	// The ID of the card.
	ColumnId *string `pulumi:"columnId"`
	// `github_issue.issue_id`.
	ContentId *int `pulumi:"contentId"`
	// Must be either `Issue` or `PullRequest`
	//
	// **Remarks:** You must either set the `note` attribute or both `contentId` and `contentType`.
	// See note example or issue example for more information.
	ContentType *string `pulumi:"contentType"`
	Etag        *string `pulumi:"etag"`
	// The note contents of the card. Markdown supported.
	Note *string `pulumi:"note"`
}

type ProjectCardState struct {
	// The ID of the card.
	CardId pulumi.IntPtrInput
	// The ID of the card.
	ColumnId pulumi.StringPtrInput
	// `github_issue.issue_id`.
	ContentId pulumi.IntPtrInput
	// Must be either `Issue` or `PullRequest`
	//
	// **Remarks:** You must either set the `note` attribute or both `contentId` and `contentType`.
	// See note example or issue example for more information.
	ContentType pulumi.StringPtrInput
	Etag        pulumi.StringPtrInput
	// The note contents of the card. Markdown supported.
	Note pulumi.StringPtrInput
}

func (ProjectCardState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectCardState)(nil)).Elem()
}

type projectCardArgs struct {
	// The ID of the card.
	ColumnId string `pulumi:"columnId"`
	// `github_issue.issue_id`.
	ContentId *int `pulumi:"contentId"`
	// Must be either `Issue` or `PullRequest`
	//
	// **Remarks:** You must either set the `note` attribute or both `contentId` and `contentType`.
	// See note example or issue example for more information.
	ContentType *string `pulumi:"contentType"`
	// The note contents of the card. Markdown supported.
	Note *string `pulumi:"note"`
}

// The set of arguments for constructing a ProjectCard resource.
type ProjectCardArgs struct {
	// The ID of the card.
	ColumnId pulumi.StringInput
	// `github_issue.issue_id`.
	ContentId pulumi.IntPtrInput
	// Must be either `Issue` or `PullRequest`
	//
	// **Remarks:** You must either set the `note` attribute or both `contentId` and `contentType`.
	// See note example or issue example for more information.
	ContentType pulumi.StringPtrInput
	// The note contents of the card. Markdown supported.
	Note pulumi.StringPtrInput
}

func (ProjectCardArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectCardArgs)(nil)).Elem()
}

type ProjectCardInput interface {
	pulumi.Input

	ToProjectCardOutput() ProjectCardOutput
	ToProjectCardOutputWithContext(ctx context.Context) ProjectCardOutput
}

func (*ProjectCard) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCard)(nil)).Elem()
}

func (i *ProjectCard) ToProjectCardOutput() ProjectCardOutput {
	return i.ToProjectCardOutputWithContext(context.Background())
}

func (i *ProjectCard) ToProjectCardOutputWithContext(ctx context.Context) ProjectCardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCardOutput)
}

// ProjectCardArrayInput is an input type that accepts ProjectCardArray and ProjectCardArrayOutput values.
// You can construct a concrete instance of `ProjectCardArrayInput` via:
//
//	ProjectCardArray{ ProjectCardArgs{...} }
type ProjectCardArrayInput interface {
	pulumi.Input

	ToProjectCardArrayOutput() ProjectCardArrayOutput
	ToProjectCardArrayOutputWithContext(context.Context) ProjectCardArrayOutput
}

type ProjectCardArray []ProjectCardInput

func (ProjectCardArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectCard)(nil)).Elem()
}

func (i ProjectCardArray) ToProjectCardArrayOutput() ProjectCardArrayOutput {
	return i.ToProjectCardArrayOutputWithContext(context.Background())
}

func (i ProjectCardArray) ToProjectCardArrayOutputWithContext(ctx context.Context) ProjectCardArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCardArrayOutput)
}

// ProjectCardMapInput is an input type that accepts ProjectCardMap and ProjectCardMapOutput values.
// You can construct a concrete instance of `ProjectCardMapInput` via:
//
//	ProjectCardMap{ "key": ProjectCardArgs{...} }
type ProjectCardMapInput interface {
	pulumi.Input

	ToProjectCardMapOutput() ProjectCardMapOutput
	ToProjectCardMapOutputWithContext(context.Context) ProjectCardMapOutput
}

type ProjectCardMap map[string]ProjectCardInput

func (ProjectCardMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectCard)(nil)).Elem()
}

func (i ProjectCardMap) ToProjectCardMapOutput() ProjectCardMapOutput {
	return i.ToProjectCardMapOutputWithContext(context.Background())
}

func (i ProjectCardMap) ToProjectCardMapOutputWithContext(ctx context.Context) ProjectCardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCardMapOutput)
}

type ProjectCardOutput struct{ *pulumi.OutputState }

func (ProjectCardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCard)(nil)).Elem()
}

func (o ProjectCardOutput) ToProjectCardOutput() ProjectCardOutput {
	return o
}

func (o ProjectCardOutput) ToProjectCardOutputWithContext(ctx context.Context) ProjectCardOutput {
	return o
}

// The ID of the card.
func (o ProjectCardOutput) CardId() pulumi.IntOutput {
	return o.ApplyT(func(v *ProjectCard) pulumi.IntOutput { return v.CardId }).(pulumi.IntOutput)
}

// The ID of the card.
func (o ProjectCardOutput) ColumnId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCard) pulumi.StringOutput { return v.ColumnId }).(pulumi.StringOutput)
}

// `github_issue.issue_id`.
func (o ProjectCardOutput) ContentId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ProjectCard) pulumi.IntPtrOutput { return v.ContentId }).(pulumi.IntPtrOutput)
}

// Must be either `Issue` or `PullRequest`
//
// **Remarks:** You must either set the `note` attribute or both `contentId` and `contentType`.
// See note example or issue example for more information.
func (o ProjectCardOutput) ContentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectCard) pulumi.StringPtrOutput { return v.ContentType }).(pulumi.StringPtrOutput)
}

func (o ProjectCardOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectCard) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The note contents of the card. Markdown supported.
func (o ProjectCardOutput) Note() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProjectCard) pulumi.StringPtrOutput { return v.Note }).(pulumi.StringPtrOutput)
}

type ProjectCardArrayOutput struct{ *pulumi.OutputState }

func (ProjectCardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectCard)(nil)).Elem()
}

func (o ProjectCardArrayOutput) ToProjectCardArrayOutput() ProjectCardArrayOutput {
	return o
}

func (o ProjectCardArrayOutput) ToProjectCardArrayOutputWithContext(ctx context.Context) ProjectCardArrayOutput {
	return o
}

func (o ProjectCardArrayOutput) Index(i pulumi.IntInput) ProjectCardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectCard {
		return vs[0].([]*ProjectCard)[vs[1].(int)]
	}).(ProjectCardOutput)
}

type ProjectCardMapOutput struct{ *pulumi.OutputState }

func (ProjectCardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectCard)(nil)).Elem()
}

func (o ProjectCardMapOutput) ToProjectCardMapOutput() ProjectCardMapOutput {
	return o
}

func (o ProjectCardMapOutput) ToProjectCardMapOutputWithContext(ctx context.Context) ProjectCardMapOutput {
	return o
}

func (o ProjectCardMapOutput) MapIndex(k pulumi.StringInput) ProjectCardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectCard {
		return vs[0].(map[string]*ProjectCard)[vs[1].(string)]
	}).(ProjectCardOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCardInput)(nil)).Elem(), &ProjectCard{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCardArrayInput)(nil)).Elem(), ProjectCardArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectCardMapInput)(nil)).Elem(), ProjectCardMap{})
	pulumi.RegisterOutputType(ProjectCardOutput{})
	pulumi.RegisterOutputType(ProjectCardArrayOutput{})
	pulumi.RegisterOutputType(ProjectCardMapOutput{})
}
