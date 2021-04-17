// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
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
// 	"github.com/pulumi/pulumi-github/sdk/v4/go/github"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		project, err := github.NewOrganizationProject(ctx, "project", &github.OrganizationProjectArgs{
// 			Body: pulumi.String("This is an organization project."),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		column, err := github.NewProjectColumn(ctx, "column", &github.ProjectColumnArgs{
// 			ProjectId: project.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = github.NewProjectCard(ctx, "card", &github.ProjectCardArgs{
// 			ColumnId: column.ColumnId,
// 			Note:     pulumi.String("## Unaccepted 👇"),
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
// A GitHub Project Card can be imported using its [Card ID](https://developer.github.com/v3/projects/cards/#get-a-project-card)
//
// ```sh
//  $ pulumi import github:index/projectCard:ProjectCard card 01234567
// ```
type ProjectCard struct {
	pulumi.CustomResourceState

	CardId pulumi.IntOutput `pulumi:"cardId"`
	// The ID of the card.
	ColumnId pulumi.StringOutput `pulumi:"columnId"`
	Etag     pulumi.StringOutput `pulumi:"etag"`
	// The note contents of the card. Markdown supported.
	Note pulumi.StringOutput `pulumi:"note"`
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
	if args.Note == nil {
		return nil, errors.New("invalid value for required argument 'Note'")
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
	CardId *int `pulumi:"cardId"`
	// The ID of the card.
	ColumnId *string `pulumi:"columnId"`
	Etag     *string `pulumi:"etag"`
	// The note contents of the card. Markdown supported.
	Note *string `pulumi:"note"`
}

type ProjectCardState struct {
	CardId pulumi.IntPtrInput
	// The ID of the card.
	ColumnId pulumi.StringPtrInput
	Etag     pulumi.StringPtrInput
	// The note contents of the card. Markdown supported.
	Note pulumi.StringPtrInput
}

func (ProjectCardState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectCardState)(nil)).Elem()
}

type projectCardArgs struct {
	// The ID of the card.
	ColumnId string `pulumi:"columnId"`
	// The note contents of the card. Markdown supported.
	Note string `pulumi:"note"`
}

// The set of arguments for constructing a ProjectCard resource.
type ProjectCardArgs struct {
	// The ID of the card.
	ColumnId pulumi.StringInput
	// The note contents of the card. Markdown supported.
	Note pulumi.StringInput
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
	return reflect.TypeOf((*ProjectCard)(nil))
}

func (i *ProjectCard) ToProjectCardOutput() ProjectCardOutput {
	return i.ToProjectCardOutputWithContext(context.Background())
}

func (i *ProjectCard) ToProjectCardOutputWithContext(ctx context.Context) ProjectCardOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCardOutput)
}

func (i *ProjectCard) ToProjectCardPtrOutput() ProjectCardPtrOutput {
	return i.ToProjectCardPtrOutputWithContext(context.Background())
}

func (i *ProjectCard) ToProjectCardPtrOutputWithContext(ctx context.Context) ProjectCardPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCardPtrOutput)
}

type ProjectCardPtrInput interface {
	pulumi.Input

	ToProjectCardPtrOutput() ProjectCardPtrOutput
	ToProjectCardPtrOutputWithContext(ctx context.Context) ProjectCardPtrOutput
}

type projectCardPtrType ProjectCardArgs

func (*projectCardPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCard)(nil))
}

func (i *projectCardPtrType) ToProjectCardPtrOutput() ProjectCardPtrOutput {
	return i.ToProjectCardPtrOutputWithContext(context.Background())
}

func (i *projectCardPtrType) ToProjectCardPtrOutputWithContext(ctx context.Context) ProjectCardPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCardPtrOutput)
}

// ProjectCardArrayInput is an input type that accepts ProjectCardArray and ProjectCardArrayOutput values.
// You can construct a concrete instance of `ProjectCardArrayInput` via:
//
//          ProjectCardArray{ ProjectCardArgs{...} }
type ProjectCardArrayInput interface {
	pulumi.Input

	ToProjectCardArrayOutput() ProjectCardArrayOutput
	ToProjectCardArrayOutputWithContext(context.Context) ProjectCardArrayOutput
}

type ProjectCardArray []ProjectCardInput

func (ProjectCardArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ProjectCard)(nil))
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
//          ProjectCardMap{ "key": ProjectCardArgs{...} }
type ProjectCardMapInput interface {
	pulumi.Input

	ToProjectCardMapOutput() ProjectCardMapOutput
	ToProjectCardMapOutputWithContext(context.Context) ProjectCardMapOutput
}

type ProjectCardMap map[string]ProjectCardInput

func (ProjectCardMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ProjectCard)(nil))
}

func (i ProjectCardMap) ToProjectCardMapOutput() ProjectCardMapOutput {
	return i.ToProjectCardMapOutputWithContext(context.Background())
}

func (i ProjectCardMap) ToProjectCardMapOutputWithContext(ctx context.Context) ProjectCardMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectCardMapOutput)
}

type ProjectCardOutput struct {
	*pulumi.OutputState
}

func (ProjectCardOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectCard)(nil))
}

func (o ProjectCardOutput) ToProjectCardOutput() ProjectCardOutput {
	return o
}

func (o ProjectCardOutput) ToProjectCardOutputWithContext(ctx context.Context) ProjectCardOutput {
	return o
}

func (o ProjectCardOutput) ToProjectCardPtrOutput() ProjectCardPtrOutput {
	return o.ToProjectCardPtrOutputWithContext(context.Background())
}

func (o ProjectCardOutput) ToProjectCardPtrOutputWithContext(ctx context.Context) ProjectCardPtrOutput {
	return o.ApplyT(func(v ProjectCard) *ProjectCard {
		return &v
	}).(ProjectCardPtrOutput)
}

type ProjectCardPtrOutput struct {
	*pulumi.OutputState
}

func (ProjectCardPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectCard)(nil))
}

func (o ProjectCardPtrOutput) ToProjectCardPtrOutput() ProjectCardPtrOutput {
	return o
}

func (o ProjectCardPtrOutput) ToProjectCardPtrOutputWithContext(ctx context.Context) ProjectCardPtrOutput {
	return o
}

type ProjectCardArrayOutput struct{ *pulumi.OutputState }

func (ProjectCardArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProjectCard)(nil))
}

func (o ProjectCardArrayOutput) ToProjectCardArrayOutput() ProjectCardArrayOutput {
	return o
}

func (o ProjectCardArrayOutput) ToProjectCardArrayOutputWithContext(ctx context.Context) ProjectCardArrayOutput {
	return o
}

func (o ProjectCardArrayOutput) Index(i pulumi.IntInput) ProjectCardOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProjectCard {
		return vs[0].([]ProjectCard)[vs[1].(int)]
	}).(ProjectCardOutput)
}

type ProjectCardMapOutput struct{ *pulumi.OutputState }

func (ProjectCardMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ProjectCard)(nil))
}

func (o ProjectCardMapOutput) ToProjectCardMapOutput() ProjectCardMapOutput {
	return o
}

func (o ProjectCardMapOutput) ToProjectCardMapOutputWithContext(ctx context.Context) ProjectCardMapOutput {
	return o
}

func (o ProjectCardMapOutput) MapIndex(k pulumi.StringInput) ProjectCardOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ProjectCard {
		return vs[0].(map[string]ProjectCard)[vs[1].(string)]
	}).(ProjectCardOutput)
}

func init() {
	pulumi.RegisterOutputType(ProjectCardOutput{})
	pulumi.RegisterOutputType(ProjectCardPtrOutput{})
	pulumi.RegisterOutputType(ProjectCardArrayOutput{})
	pulumi.RegisterOutputType(ProjectCardMapOutput{})
}
