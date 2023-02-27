// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create and manage columns for GitHub projects.
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
//			_, err = github.NewProjectColumn(ctx, "column", &github.ProjectColumnArgs{
//				ProjectId: project.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ProjectColumn struct {
	pulumi.CustomResourceState

	// The ID of the column.
	ColumnId pulumi.IntOutput    `pulumi:"columnId"`
	Etag     pulumi.StringOutput `pulumi:"etag"`
	// The name of the column.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of an existing project that the column will be created in.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
}

// NewProjectColumn registers a new resource with the given unique name, arguments, and options.
func NewProjectColumn(ctx *pulumi.Context,
	name string, args *ProjectColumnArgs, opts ...pulumi.ResourceOption) (*ProjectColumn, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	var resource ProjectColumn
	err := ctx.RegisterResource("github:index/projectColumn:ProjectColumn", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectColumn gets an existing ProjectColumn resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectColumn(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectColumnState, opts ...pulumi.ResourceOption) (*ProjectColumn, error) {
	var resource ProjectColumn
	err := ctx.ReadResource("github:index/projectColumn:ProjectColumn", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectColumn resources.
type projectColumnState struct {
	// The ID of the column.
	ColumnId *int    `pulumi:"columnId"`
	Etag     *string `pulumi:"etag"`
	// The name of the column.
	Name *string `pulumi:"name"`
	// The ID of an existing project that the column will be created in.
	ProjectId *string `pulumi:"projectId"`
}

type ProjectColumnState struct {
	// The ID of the column.
	ColumnId pulumi.IntPtrInput
	Etag     pulumi.StringPtrInput
	// The name of the column.
	Name pulumi.StringPtrInput
	// The ID of an existing project that the column will be created in.
	ProjectId pulumi.StringPtrInput
}

func (ProjectColumnState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectColumnState)(nil)).Elem()
}

type projectColumnArgs struct {
	// The name of the column.
	Name *string `pulumi:"name"`
	// The ID of an existing project that the column will be created in.
	ProjectId string `pulumi:"projectId"`
}

// The set of arguments for constructing a ProjectColumn resource.
type ProjectColumnArgs struct {
	// The name of the column.
	Name pulumi.StringPtrInput
	// The ID of an existing project that the column will be created in.
	ProjectId pulumi.StringInput
}

func (ProjectColumnArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectColumnArgs)(nil)).Elem()
}

type ProjectColumnInput interface {
	pulumi.Input

	ToProjectColumnOutput() ProjectColumnOutput
	ToProjectColumnOutputWithContext(ctx context.Context) ProjectColumnOutput
}

func (*ProjectColumn) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectColumn)(nil)).Elem()
}

func (i *ProjectColumn) ToProjectColumnOutput() ProjectColumnOutput {
	return i.ToProjectColumnOutputWithContext(context.Background())
}

func (i *ProjectColumn) ToProjectColumnOutputWithContext(ctx context.Context) ProjectColumnOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectColumnOutput)
}

// ProjectColumnArrayInput is an input type that accepts ProjectColumnArray and ProjectColumnArrayOutput values.
// You can construct a concrete instance of `ProjectColumnArrayInput` via:
//
//	ProjectColumnArray{ ProjectColumnArgs{...} }
type ProjectColumnArrayInput interface {
	pulumi.Input

	ToProjectColumnArrayOutput() ProjectColumnArrayOutput
	ToProjectColumnArrayOutputWithContext(context.Context) ProjectColumnArrayOutput
}

type ProjectColumnArray []ProjectColumnInput

func (ProjectColumnArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectColumn)(nil)).Elem()
}

func (i ProjectColumnArray) ToProjectColumnArrayOutput() ProjectColumnArrayOutput {
	return i.ToProjectColumnArrayOutputWithContext(context.Background())
}

func (i ProjectColumnArray) ToProjectColumnArrayOutputWithContext(ctx context.Context) ProjectColumnArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectColumnArrayOutput)
}

// ProjectColumnMapInput is an input type that accepts ProjectColumnMap and ProjectColumnMapOutput values.
// You can construct a concrete instance of `ProjectColumnMapInput` via:
//
//	ProjectColumnMap{ "key": ProjectColumnArgs{...} }
type ProjectColumnMapInput interface {
	pulumi.Input

	ToProjectColumnMapOutput() ProjectColumnMapOutput
	ToProjectColumnMapOutputWithContext(context.Context) ProjectColumnMapOutput
}

type ProjectColumnMap map[string]ProjectColumnInput

func (ProjectColumnMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectColumn)(nil)).Elem()
}

func (i ProjectColumnMap) ToProjectColumnMapOutput() ProjectColumnMapOutput {
	return i.ToProjectColumnMapOutputWithContext(context.Background())
}

func (i ProjectColumnMap) ToProjectColumnMapOutputWithContext(ctx context.Context) ProjectColumnMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectColumnMapOutput)
}

type ProjectColumnOutput struct{ *pulumi.OutputState }

func (ProjectColumnOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectColumn)(nil)).Elem()
}

func (o ProjectColumnOutput) ToProjectColumnOutput() ProjectColumnOutput {
	return o
}

func (o ProjectColumnOutput) ToProjectColumnOutputWithContext(ctx context.Context) ProjectColumnOutput {
	return o
}

// The ID of the column.
func (o ProjectColumnOutput) ColumnId() pulumi.IntOutput {
	return o.ApplyT(func(v *ProjectColumn) pulumi.IntOutput { return v.ColumnId }).(pulumi.IntOutput)
}

func (o ProjectColumnOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectColumn) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name of the column.
func (o ProjectColumnOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectColumn) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of an existing project that the column will be created in.
func (o ProjectColumnOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProjectColumn) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

type ProjectColumnArrayOutput struct{ *pulumi.OutputState }

func (ProjectColumnArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectColumn)(nil)).Elem()
}

func (o ProjectColumnArrayOutput) ToProjectColumnArrayOutput() ProjectColumnArrayOutput {
	return o
}

func (o ProjectColumnArrayOutput) ToProjectColumnArrayOutputWithContext(ctx context.Context) ProjectColumnArrayOutput {
	return o
}

func (o ProjectColumnArrayOutput) Index(i pulumi.IntInput) ProjectColumnOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProjectColumn {
		return vs[0].([]*ProjectColumn)[vs[1].(int)]
	}).(ProjectColumnOutput)
}

type ProjectColumnMapOutput struct{ *pulumi.OutputState }

func (ProjectColumnMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectColumn)(nil)).Elem()
}

func (o ProjectColumnMapOutput) ToProjectColumnMapOutput() ProjectColumnMapOutput {
	return o
}

func (o ProjectColumnMapOutput) ToProjectColumnMapOutputWithContext(ctx context.Context) ProjectColumnMapOutput {
	return o
}

func (o ProjectColumnMapOutput) MapIndex(k pulumi.StringInput) ProjectColumnOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProjectColumn {
		return vs[0].(map[string]*ProjectColumn)[vs[1].(string)]
	}).(ProjectColumnOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectColumnInput)(nil)).Elem(), &ProjectColumn{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectColumnArrayInput)(nil)).Elem(), ProjectColumnArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectColumnMapInput)(nil)).Elem(), ProjectColumnMap{})
	pulumi.RegisterOutputType(ProjectColumnOutput{})
	pulumi.RegisterOutputType(ProjectColumnArrayOutput{})
	pulumi.RegisterOutputType(ProjectColumnMapOutput{})
}
