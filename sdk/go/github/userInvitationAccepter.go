// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage GitHub repository collaborator invitations.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-github/sdk/v4/go/github"
// 	"github.com/pulumi/pulumi-github/sdk/v4/go/github/providers"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleRepository, err := github.NewRepository(ctx, "exampleRepository", nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleRepositoryCollaborator, err := github.NewRepositoryCollaborator(ctx, "exampleRepositoryCollaborator", &github.RepositoryCollaboratorArgs{
// 			Repository: exampleRepository.Name,
// 			Username:   pulumi.String("example-username"),
// 			Permission: pulumi.String("push"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = providers.Newgithub(ctx, "invitee", &providers.githubArgs{
// 			Token: pulumi.Any(_var.Invitee_token),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = github.NewUserInvitationAccepter(ctx, "exampleUserInvitationAccepter", &github.UserInvitationAccepterArgs{
// 			InvitationId: exampleRepositoryCollaborator.InvitationId,
// 		}, pulumi.Provider("github.invitee"))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type UserInvitationAccepter struct {
	pulumi.CustomResourceState

	// ID of the invitation to accept
	InvitationId pulumi.StringOutput `pulumi:"invitationId"`
}

// NewUserInvitationAccepter registers a new resource with the given unique name, arguments, and options.
func NewUserInvitationAccepter(ctx *pulumi.Context,
	name string, args *UserInvitationAccepterArgs, opts ...pulumi.ResourceOption) (*UserInvitationAccepter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InvitationId == nil {
		return nil, errors.New("invalid value for required argument 'InvitationId'")
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
	// ID of the invitation to accept
	InvitationId *string `pulumi:"invitationId"`
}

type UserInvitationAccepterState struct {
	// ID of the invitation to accept
	InvitationId pulumi.StringPtrInput
}

func (UserInvitationAccepterState) ElementType() reflect.Type {
	return reflect.TypeOf((*userInvitationAccepterState)(nil)).Elem()
}

type userInvitationAccepterArgs struct {
	// ID of the invitation to accept
	InvitationId string `pulumi:"invitationId"`
}

// The set of arguments for constructing a UserInvitationAccepter resource.
type UserInvitationAccepterArgs struct {
	// ID of the invitation to accept
	InvitationId pulumi.StringInput
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
	return reflect.TypeOf((*UserInvitationAccepter)(nil))
}

func (i *UserInvitationAccepter) ToUserInvitationAccepterOutput() UserInvitationAccepterOutput {
	return i.ToUserInvitationAccepterOutputWithContext(context.Background())
}

func (i *UserInvitationAccepter) ToUserInvitationAccepterOutputWithContext(ctx context.Context) UserInvitationAccepterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInvitationAccepterOutput)
}

func (i *UserInvitationAccepter) ToUserInvitationAccepterPtrOutput() UserInvitationAccepterPtrOutput {
	return i.ToUserInvitationAccepterPtrOutputWithContext(context.Background())
}

func (i *UserInvitationAccepter) ToUserInvitationAccepterPtrOutputWithContext(ctx context.Context) UserInvitationAccepterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInvitationAccepterPtrOutput)
}

type UserInvitationAccepterPtrInput interface {
	pulumi.Input

	ToUserInvitationAccepterPtrOutput() UserInvitationAccepterPtrOutput
	ToUserInvitationAccepterPtrOutputWithContext(ctx context.Context) UserInvitationAccepterPtrOutput
}

type userInvitationAccepterPtrType UserInvitationAccepterArgs

func (*userInvitationAccepterPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInvitationAccepter)(nil))
}

func (i *userInvitationAccepterPtrType) ToUserInvitationAccepterPtrOutput() UserInvitationAccepterPtrOutput {
	return i.ToUserInvitationAccepterPtrOutputWithContext(context.Background())
}

func (i *userInvitationAccepterPtrType) ToUserInvitationAccepterPtrOutputWithContext(ctx context.Context) UserInvitationAccepterPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInvitationAccepterPtrOutput)
}

// UserInvitationAccepterArrayInput is an input type that accepts UserInvitationAccepterArray and UserInvitationAccepterArrayOutput values.
// You can construct a concrete instance of `UserInvitationAccepterArrayInput` via:
//
//          UserInvitationAccepterArray{ UserInvitationAccepterArgs{...} }
type UserInvitationAccepterArrayInput interface {
	pulumi.Input

	ToUserInvitationAccepterArrayOutput() UserInvitationAccepterArrayOutput
	ToUserInvitationAccepterArrayOutputWithContext(context.Context) UserInvitationAccepterArrayOutput
}

type UserInvitationAccepterArray []UserInvitationAccepterInput

func (UserInvitationAccepterArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*UserInvitationAccepter)(nil))
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
//          UserInvitationAccepterMap{ "key": UserInvitationAccepterArgs{...} }
type UserInvitationAccepterMapInput interface {
	pulumi.Input

	ToUserInvitationAccepterMapOutput() UserInvitationAccepterMapOutput
	ToUserInvitationAccepterMapOutputWithContext(context.Context) UserInvitationAccepterMapOutput
}

type UserInvitationAccepterMap map[string]UserInvitationAccepterInput

func (UserInvitationAccepterMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*UserInvitationAccepter)(nil))
}

func (i UserInvitationAccepterMap) ToUserInvitationAccepterMapOutput() UserInvitationAccepterMapOutput {
	return i.ToUserInvitationAccepterMapOutputWithContext(context.Background())
}

func (i UserInvitationAccepterMap) ToUserInvitationAccepterMapOutputWithContext(ctx context.Context) UserInvitationAccepterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserInvitationAccepterMapOutput)
}

type UserInvitationAccepterOutput struct {
	*pulumi.OutputState
}

func (UserInvitationAccepterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*UserInvitationAccepter)(nil))
}

func (o UserInvitationAccepterOutput) ToUserInvitationAccepterOutput() UserInvitationAccepterOutput {
	return o
}

func (o UserInvitationAccepterOutput) ToUserInvitationAccepterOutputWithContext(ctx context.Context) UserInvitationAccepterOutput {
	return o
}

func (o UserInvitationAccepterOutput) ToUserInvitationAccepterPtrOutput() UserInvitationAccepterPtrOutput {
	return o.ToUserInvitationAccepterPtrOutputWithContext(context.Background())
}

func (o UserInvitationAccepterOutput) ToUserInvitationAccepterPtrOutputWithContext(ctx context.Context) UserInvitationAccepterPtrOutput {
	return o.ApplyT(func(v UserInvitationAccepter) *UserInvitationAccepter {
		return &v
	}).(UserInvitationAccepterPtrOutput)
}

type UserInvitationAccepterPtrOutput struct {
	*pulumi.OutputState
}

func (UserInvitationAccepterPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserInvitationAccepter)(nil))
}

func (o UserInvitationAccepterPtrOutput) ToUserInvitationAccepterPtrOutput() UserInvitationAccepterPtrOutput {
	return o
}

func (o UserInvitationAccepterPtrOutput) ToUserInvitationAccepterPtrOutputWithContext(ctx context.Context) UserInvitationAccepterPtrOutput {
	return o
}

type UserInvitationAccepterArrayOutput struct{ *pulumi.OutputState }

func (UserInvitationAccepterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]UserInvitationAccepter)(nil))
}

func (o UserInvitationAccepterArrayOutput) ToUserInvitationAccepterArrayOutput() UserInvitationAccepterArrayOutput {
	return o
}

func (o UserInvitationAccepterArrayOutput) ToUserInvitationAccepterArrayOutputWithContext(ctx context.Context) UserInvitationAccepterArrayOutput {
	return o
}

func (o UserInvitationAccepterArrayOutput) Index(i pulumi.IntInput) UserInvitationAccepterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) UserInvitationAccepter {
		return vs[0].([]UserInvitationAccepter)[vs[1].(int)]
	}).(UserInvitationAccepterOutput)
}

type UserInvitationAccepterMapOutput struct{ *pulumi.OutputState }

func (UserInvitationAccepterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]UserInvitationAccepter)(nil))
}

func (o UserInvitationAccepterMapOutput) ToUserInvitationAccepterMapOutput() UserInvitationAccepterMapOutput {
	return o
}

func (o UserInvitationAccepterMapOutput) ToUserInvitationAccepterMapOutputWithContext(ctx context.Context) UserInvitationAccepterMapOutput {
	return o
}

func (o UserInvitationAccepterMapOutput) MapIndex(k pulumi.StringInput) UserInvitationAccepterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) UserInvitationAccepter {
		return vs[0].(map[string]UserInvitationAccepter)[vs[1].(string)]
	}).(UserInvitationAccepterOutput)
}

func init() {
	pulumi.RegisterOutputType(UserInvitationAccepterOutput{})
	pulumi.RegisterOutputType(UserInvitationAccepterPtrOutput{})
	pulumi.RegisterOutputType(UserInvitationAccepterArrayOutput{})
	pulumi.RegisterOutputType(UserInvitationAccepterMapOutput{})
}
