// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create and manage blocks for GitHub organizations.
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
//			_, err := github.NewOrganizationBlock(ctx, "example", &github.OrganizationBlockArgs{
//				Username: pulumi.String("paultyng"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type OrganizationBlock struct {
	pulumi.CustomResourceState

	Etag pulumi.StringOutput `pulumi:"etag"`
	// The name of the user to block.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewOrganizationBlock registers a new resource with the given unique name, arguments, and options.
func NewOrganizationBlock(ctx *pulumi.Context,
	name string, args *OrganizationBlockArgs, opts ...pulumi.ResourceOption) (*OrganizationBlock, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource OrganizationBlock
	err := ctx.RegisterResource("github:index/organizationBlock:OrganizationBlock", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationBlock gets an existing OrganizationBlock resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationBlock(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationBlockState, opts ...pulumi.ResourceOption) (*OrganizationBlock, error) {
	var resource OrganizationBlock
	err := ctx.ReadResource("github:index/organizationBlock:OrganizationBlock", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationBlock resources.
type organizationBlockState struct {
	Etag *string `pulumi:"etag"`
	// The name of the user to block.
	Username *string `pulumi:"username"`
}

type OrganizationBlockState struct {
	Etag pulumi.StringPtrInput
	// The name of the user to block.
	Username pulumi.StringPtrInput
}

func (OrganizationBlockState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationBlockState)(nil)).Elem()
}

type organizationBlockArgs struct {
	// The name of the user to block.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a OrganizationBlock resource.
type OrganizationBlockArgs struct {
	// The name of the user to block.
	Username pulumi.StringInput
}

func (OrganizationBlockArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationBlockArgs)(nil)).Elem()
}

type OrganizationBlockInput interface {
	pulumi.Input

	ToOrganizationBlockOutput() OrganizationBlockOutput
	ToOrganizationBlockOutputWithContext(ctx context.Context) OrganizationBlockOutput
}

func (*OrganizationBlock) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationBlock)(nil)).Elem()
}

func (i *OrganizationBlock) ToOrganizationBlockOutput() OrganizationBlockOutput {
	return i.ToOrganizationBlockOutputWithContext(context.Background())
}

func (i *OrganizationBlock) ToOrganizationBlockOutputWithContext(ctx context.Context) OrganizationBlockOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationBlockOutput)
}

// OrganizationBlockArrayInput is an input type that accepts OrganizationBlockArray and OrganizationBlockArrayOutput values.
// You can construct a concrete instance of `OrganizationBlockArrayInput` via:
//
//	OrganizationBlockArray{ OrganizationBlockArgs{...} }
type OrganizationBlockArrayInput interface {
	pulumi.Input

	ToOrganizationBlockArrayOutput() OrganizationBlockArrayOutput
	ToOrganizationBlockArrayOutputWithContext(context.Context) OrganizationBlockArrayOutput
}

type OrganizationBlockArray []OrganizationBlockInput

func (OrganizationBlockArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationBlock)(nil)).Elem()
}

func (i OrganizationBlockArray) ToOrganizationBlockArrayOutput() OrganizationBlockArrayOutput {
	return i.ToOrganizationBlockArrayOutputWithContext(context.Background())
}

func (i OrganizationBlockArray) ToOrganizationBlockArrayOutputWithContext(ctx context.Context) OrganizationBlockArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationBlockArrayOutput)
}

// OrganizationBlockMapInput is an input type that accepts OrganizationBlockMap and OrganizationBlockMapOutput values.
// You can construct a concrete instance of `OrganizationBlockMapInput` via:
//
//	OrganizationBlockMap{ "key": OrganizationBlockArgs{...} }
type OrganizationBlockMapInput interface {
	pulumi.Input

	ToOrganizationBlockMapOutput() OrganizationBlockMapOutput
	ToOrganizationBlockMapOutputWithContext(context.Context) OrganizationBlockMapOutput
}

type OrganizationBlockMap map[string]OrganizationBlockInput

func (OrganizationBlockMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationBlock)(nil)).Elem()
}

func (i OrganizationBlockMap) ToOrganizationBlockMapOutput() OrganizationBlockMapOutput {
	return i.ToOrganizationBlockMapOutputWithContext(context.Background())
}

func (i OrganizationBlockMap) ToOrganizationBlockMapOutputWithContext(ctx context.Context) OrganizationBlockMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationBlockMapOutput)
}

type OrganizationBlockOutput struct{ *pulumi.OutputState }

func (OrganizationBlockOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationBlock)(nil)).Elem()
}

func (o OrganizationBlockOutput) ToOrganizationBlockOutput() OrganizationBlockOutput {
	return o
}

func (o OrganizationBlockOutput) ToOrganizationBlockOutputWithContext(ctx context.Context) OrganizationBlockOutput {
	return o
}

func (o OrganizationBlockOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationBlock) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name of the user to block.
func (o OrganizationBlockOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationBlock) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type OrganizationBlockArrayOutput struct{ *pulumi.OutputState }

func (OrganizationBlockArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationBlock)(nil)).Elem()
}

func (o OrganizationBlockArrayOutput) ToOrganizationBlockArrayOutput() OrganizationBlockArrayOutput {
	return o
}

func (o OrganizationBlockArrayOutput) ToOrganizationBlockArrayOutputWithContext(ctx context.Context) OrganizationBlockArrayOutput {
	return o
}

func (o OrganizationBlockArrayOutput) Index(i pulumi.IntInput) OrganizationBlockOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationBlock {
		return vs[0].([]*OrganizationBlock)[vs[1].(int)]
	}).(OrganizationBlockOutput)
}

type OrganizationBlockMapOutput struct{ *pulumi.OutputState }

func (OrganizationBlockMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationBlock)(nil)).Elem()
}

func (o OrganizationBlockMapOutput) ToOrganizationBlockMapOutput() OrganizationBlockMapOutput {
	return o
}

func (o OrganizationBlockMapOutput) ToOrganizationBlockMapOutputWithContext(ctx context.Context) OrganizationBlockMapOutput {
	return o
}

func (o OrganizationBlockMapOutput) MapIndex(k pulumi.StringInput) OrganizationBlockOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationBlock {
		return vs[0].(map[string]*OrganizationBlock)[vs[1].(string)]
	}).(OrganizationBlockOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationBlockInput)(nil)).Elem(), &OrganizationBlock{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationBlockArrayInput)(nil)).Elem(), OrganizationBlockArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationBlockMapInput)(nil)).Elem(), OrganizationBlockMap{})
	pulumi.RegisterOutputType(OrganizationBlockOutput{})
	pulumi.RegisterOutputType(OrganizationBlockArrayOutput{})
	pulumi.RegisterOutputType(OrganizationBlockMapOutput{})
}
