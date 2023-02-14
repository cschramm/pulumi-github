// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type UserInvitationAccepter struct {
	pulumi.CustomResourceState

	// Allow the ID to be unset. This will result in the resource being skipped when the ID is not set instead of returning an error.
	AllowEmptyId pulumi.BoolPtrOutput `pulumi:"allowEmptyId"`
	// ID of the invitation to accept. Must be set when `allowEmptyId` is `false`.
	InvitationId pulumi.StringPtrOutput `pulumi:"invitationId"`
}

// NewUserInvitationAccepter registers a new resource with the given unique name, arguments, and options.
func NewUserInvitationAccepter(ctx *pulumi.Context,
	name string, args *UserInvitationAccepterArgs, opts ...pulumi.ResourceOption) (*UserInvitationAccepter, error) {
	if args == nil {
		args = &UserInvitationAccepterArgs{}
	}

	var resource UserInvitationAccepter
	err := ctx.RegisterResource("github:index/userInvitationAccepter:UserInvitationAccepter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserInvitationAccepter gets an existing UserInvitationAccepter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserInvitationAccepter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserInvitationAccepterState, opts ...pulumi.ResourceOption) (*UserInvitationAccepter, error) {
	var resource UserInvitationAccepter
	err := ctx.ReadResource("github:index/userInvitationAccepter:UserInvitationAccepter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserInvitationAccepter resources.
type userInvitationAccepterState struct {
	// Allow the ID to be unset. This will result in the resource being skipped when the ID is not set instead of returning an error.
	AllowEmptyId *bool `pulumi:"allowEmptyId"`
	// ID of the invitation to accept. Must be set when `allowEmptyId` is `false`.
	InvitationId *string `pulumi:"invitationId"`
}

type UserInvitationAccepterState struct {
	// Allow the ID to be unset. This will result in the resource being skipped when the ID is not set instead of returning an error.
	AllowEmptyId pulumi.BoolPtrInput
	// ID of the invitation to accept. Must be set when `allowEmptyId` is `false`.
	InvitationId pulumi.StringPtrInput
}

func (UserInvitationAccepterState) ElementType() reflect.Type {
	return reflect.TypeOf((*userInvitationAccepterState)(nil)).Elem()
}

type userInvitationAccepterArgs struct {
	// Allow the ID to be unset. This will result in the resource being skipped when the ID is not set instead of returning an error.
	AllowEmptyId *bool `pulumi:"allowEmptyId"`
	// ID of the invitation to accept. Must be set when `allowEmptyId` is `false`.
	InvitationId *string `pulumi:"invitationId"`
}

// The set of arguments for constructing a UserInvitationAccepter resource.
type UserInvitationAccepterArgs struct {
	// Allow the ID to be unset. This will result in the resource being skipped when the ID is not set instead of returning an error.
	AllowEmptyId pulumi.BoolPtrInput
	// ID of the invitation to accept. Must be set when `allowEmptyId` is `false`.
	InvitationId pulumi.StringPtrInput
}

func (UserInvitationAccepterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userInvitationAccepterArgs)(nil)).Elem()
}

type UserInvitationAccepterInput interface {
	pulumi.Input

	ToUserInvitationAccepterOutput() UserInvitationAccepterOutput
	ToUserInvitationAccepterOutputWithContext(ctx context.Context) UserInvitationAccepterOutput
}

func (*UserInvitationAccepter) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInvitationAccepter)(nil)).Elem()
}

func (i *UserInvitationAccepter) ToUserInvitationAccepterOutput() UserInvitationAccepterOutput {
	return i.ToUserInvitationAccepterOutputWithContext(context.Background())
}

func (i *UserInvitationAccepter) ToUserInvitationAccepterOutputWithContext(ctx context.Context) UserInvitationAccepterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInvitationAccepterOutput)
}

// UserInvitationAccepterArrayInput is an input type that accepts UserInvitationAccepterArray and UserInvitationAccepterArrayOutput values.
// You can construct a concrete instance of `UserInvitationAccepterArrayInput` via:
//
//	UserInvitationAccepterArray{ UserInvitationAccepterArgs{...} }
type UserInvitationAccepterArrayInput interface {
	pulumi.Input

	ToUserInvitationAccepterArrayOutput() UserInvitationAccepterArrayOutput
	ToUserInvitationAccepterArrayOutputWithContext(context.Context) UserInvitationAccepterArrayOutput
}

type UserInvitationAccepterArray []UserInvitationAccepterInput

func (UserInvitationAccepterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserInvitationAccepter)(nil)).Elem()
}

func (i UserInvitationAccepterArray) ToUserInvitationAccepterArrayOutput() UserInvitationAccepterArrayOutput {
	return i.ToUserInvitationAccepterArrayOutputWithContext(context.Background())
}

func (i UserInvitationAccepterArray) ToUserInvitationAccepterArrayOutputWithContext(ctx context.Context) UserInvitationAccepterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInvitationAccepterArrayOutput)
}

// UserInvitationAccepterMapInput is an input type that accepts UserInvitationAccepterMap and UserInvitationAccepterMapOutput values.
// You can construct a concrete instance of `UserInvitationAccepterMapInput` via:
//
//	UserInvitationAccepterMap{ "key": UserInvitationAccepterArgs{...} }
type UserInvitationAccepterMapInput interface {
	pulumi.Input

	ToUserInvitationAccepterMapOutput() UserInvitationAccepterMapOutput
	ToUserInvitationAccepterMapOutputWithContext(context.Context) UserInvitationAccepterMapOutput
}

type UserInvitationAccepterMap map[string]UserInvitationAccepterInput

func (UserInvitationAccepterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserInvitationAccepter)(nil)).Elem()
}

func (i UserInvitationAccepterMap) ToUserInvitationAccepterMapOutput() UserInvitationAccepterMapOutput {
	return i.ToUserInvitationAccepterMapOutputWithContext(context.Background())
}

func (i UserInvitationAccepterMap) ToUserInvitationAccepterMapOutputWithContext(ctx context.Context) UserInvitationAccepterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInvitationAccepterMapOutput)
}

type UserInvitationAccepterOutput struct{ *pulumi.OutputState }

func (UserInvitationAccepterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInvitationAccepter)(nil)).Elem()
}

func (o UserInvitationAccepterOutput) ToUserInvitationAccepterOutput() UserInvitationAccepterOutput {
	return o
}

func (o UserInvitationAccepterOutput) ToUserInvitationAccepterOutputWithContext(ctx context.Context) UserInvitationAccepterOutput {
	return o
}

// Allow the ID to be unset. This will result in the resource being skipped when the ID is not set instead of returning an error.
func (o UserInvitationAccepterOutput) AllowEmptyId() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *UserInvitationAccepter) pulumi.BoolPtrOutput { return v.AllowEmptyId }).(pulumi.BoolPtrOutput)
}

// ID of the invitation to accept. Must be set when `allowEmptyId` is `false`.
func (o UserInvitationAccepterOutput) InvitationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserInvitationAccepter) pulumi.StringPtrOutput { return v.InvitationId }).(pulumi.StringPtrOutput)
}

type UserInvitationAccepterArrayOutput struct{ *pulumi.OutputState }

func (UserInvitationAccepterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserInvitationAccepter)(nil)).Elem()
}

func (o UserInvitationAccepterArrayOutput) ToUserInvitationAccepterArrayOutput() UserInvitationAccepterArrayOutput {
	return o
}

func (o UserInvitationAccepterArrayOutput) ToUserInvitationAccepterArrayOutputWithContext(ctx context.Context) UserInvitationAccepterArrayOutput {
	return o
}

func (o UserInvitationAccepterArrayOutput) Index(i pulumi.IntInput) UserInvitationAccepterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserInvitationAccepter {
		return vs[0].([]*UserInvitationAccepter)[vs[1].(int)]
	}).(UserInvitationAccepterOutput)
}

type UserInvitationAccepterMapOutput struct{ *pulumi.OutputState }

func (UserInvitationAccepterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserInvitationAccepter)(nil)).Elem()
}

func (o UserInvitationAccepterMapOutput) ToUserInvitationAccepterMapOutput() UserInvitationAccepterMapOutput {
	return o
}

func (o UserInvitationAccepterMapOutput) ToUserInvitationAccepterMapOutputWithContext(ctx context.Context) UserInvitationAccepterMapOutput {
	return o
}

func (o UserInvitationAccepterMapOutput) MapIndex(k pulumi.StringInput) UserInvitationAccepterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserInvitationAccepter {
		return vs[0].(map[string]*UserInvitationAccepter)[vs[1].(string)]
	}).(UserInvitationAccepterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInvitationAccepterInput)(nil)).Elem(), &UserInvitationAccepter{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserInvitationAccepterArrayInput)(nil)).Elem(), UserInvitationAccepterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserInvitationAccepterMapInput)(nil)).Elem(), UserInvitationAccepterMap{})
	pulumi.RegisterOutputType(UserInvitationAccepterOutput{})
	pulumi.RegisterOutputType(UserInvitationAccepterArrayOutput{})
	pulumi.RegisterOutputType(UserInvitationAccepterMapOutput{})
}
