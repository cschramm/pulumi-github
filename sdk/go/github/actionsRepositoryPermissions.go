// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to enable and manage GitHub Actions permissions for a given repository.
// You must have admin access to an repository to use this resource.
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
//			example, err := github.NewRepository(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			_, err = github.NewActionsRepositoryPermissions(ctx, "test", &github.ActionsRepositoryPermissionsArgs{
//				AllowedActions: pulumi.String("selected"),
//				AllowedActionsConfig: &github.ActionsRepositoryPermissionsAllowedActionsConfigArgs{
//					GithubOwnedAllowed: pulumi.Bool(true),
//					PatternsAlloweds: pulumi.StringArray{
//						pulumi.String("actions/cache@*"),
//						pulumi.String("actions/checkout@*"),
//					},
//					VerifiedAllowed: pulumi.Bool(true),
//				},
//				Repository: example.Name,
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
// # This resource can be imported using the name of the GitHub repository
//
// ```sh
//
//	$ pulumi import github:index/actionsRepositoryPermissions:ActionsRepositoryPermissions test my-repository
//
// ```
type ActionsRepositoryPermissions struct {
	pulumi.CustomResourceState

	// The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
	AllowedActions pulumi.StringPtrOutput `pulumi:"allowedActions"`
	// Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
	AllowedActionsConfig ActionsRepositoryPermissionsAllowedActionsConfigPtrOutput `pulumi:"allowedActionsConfig"`
	// Should GitHub actions be enabled on this repository?
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The GitHub repository
	Repository pulumi.StringOutput `pulumi:"repository"`
}

// NewActionsRepositoryPermissions registers a new resource with the given unique name, arguments, and options.
func NewActionsRepositoryPermissions(ctx *pulumi.Context,
	name string, args *ActionsRepositoryPermissionsArgs, opts ...pulumi.ResourceOption) (*ActionsRepositoryPermissions, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Repository == nil {
		return nil, errors.New("invalid value for required argument 'Repository'")
	}
	var resource ActionsRepositoryPermissions
	err := ctx.RegisterResource("github:index/actionsRepositoryPermissions:ActionsRepositoryPermissions", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetActionsRepositoryPermissions gets an existing ActionsRepositoryPermissions resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetActionsRepositoryPermissions(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActionsRepositoryPermissionsState, opts ...pulumi.ResourceOption) (*ActionsRepositoryPermissions, error) {
	var resource ActionsRepositoryPermissions
	err := ctx.ReadResource("github:index/actionsRepositoryPermissions:ActionsRepositoryPermissions", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ActionsRepositoryPermissions resources.
type actionsRepositoryPermissionsState struct {
	// The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
	AllowedActions *string `pulumi:"allowedActions"`
	// Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
	AllowedActionsConfig *ActionsRepositoryPermissionsAllowedActionsConfig `pulumi:"allowedActionsConfig"`
	// Should GitHub actions be enabled on this repository?
	Enabled *bool `pulumi:"enabled"`
	// The GitHub repository
	Repository *string `pulumi:"repository"`
}

type ActionsRepositoryPermissionsState struct {
	// The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
	AllowedActions pulumi.StringPtrInput
	// Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
	AllowedActionsConfig ActionsRepositoryPermissionsAllowedActionsConfigPtrInput
	// Should GitHub actions be enabled on this repository?
	Enabled pulumi.BoolPtrInput
	// The GitHub repository
	Repository pulumi.StringPtrInput
}

func (ActionsRepositoryPermissionsState) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsRepositoryPermissionsState)(nil)).Elem()
}

type actionsRepositoryPermissionsArgs struct {
	// The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
	AllowedActions *string `pulumi:"allowedActions"`
	// Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
	AllowedActionsConfig *ActionsRepositoryPermissionsAllowedActionsConfig `pulumi:"allowedActionsConfig"`
	// Should GitHub actions be enabled on this repository?
	Enabled *bool `pulumi:"enabled"`
	// The GitHub repository
	Repository string `pulumi:"repository"`
}

// The set of arguments for constructing a ActionsRepositoryPermissions resource.
type ActionsRepositoryPermissionsArgs struct {
	// The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
	AllowedActions pulumi.StringPtrInput
	// Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
	AllowedActionsConfig ActionsRepositoryPermissionsAllowedActionsConfigPtrInput
	// Should GitHub actions be enabled on this repository?
	Enabled pulumi.BoolPtrInput
	// The GitHub repository
	Repository pulumi.StringInput
}

func (ActionsRepositoryPermissionsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsRepositoryPermissionsArgs)(nil)).Elem()
}

type ActionsRepositoryPermissionsInput interface {
	pulumi.Input

	ToActionsRepositoryPermissionsOutput() ActionsRepositoryPermissionsOutput
	ToActionsRepositoryPermissionsOutputWithContext(ctx context.Context) ActionsRepositoryPermissionsOutput
}

func (*ActionsRepositoryPermissions) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionsRepositoryPermissions)(nil)).Elem()
}

func (i *ActionsRepositoryPermissions) ToActionsRepositoryPermissionsOutput() ActionsRepositoryPermissionsOutput {
	return i.ToActionsRepositoryPermissionsOutputWithContext(context.Background())
}

func (i *ActionsRepositoryPermissions) ToActionsRepositoryPermissionsOutputWithContext(ctx context.Context) ActionsRepositoryPermissionsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsRepositoryPermissionsOutput)
}

// ActionsRepositoryPermissionsArrayInput is an input type that accepts ActionsRepositoryPermissionsArray and ActionsRepositoryPermissionsArrayOutput values.
// You can construct a concrete instance of `ActionsRepositoryPermissionsArrayInput` via:
//
//	ActionsRepositoryPermissionsArray{ ActionsRepositoryPermissionsArgs{...} }
type ActionsRepositoryPermissionsArrayInput interface {
	pulumi.Input

	ToActionsRepositoryPermissionsArrayOutput() ActionsRepositoryPermissionsArrayOutput
	ToActionsRepositoryPermissionsArrayOutputWithContext(context.Context) ActionsRepositoryPermissionsArrayOutput
}

type ActionsRepositoryPermissionsArray []ActionsRepositoryPermissionsInput

func (ActionsRepositoryPermissionsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionsRepositoryPermissions)(nil)).Elem()
}

func (i ActionsRepositoryPermissionsArray) ToActionsRepositoryPermissionsArrayOutput() ActionsRepositoryPermissionsArrayOutput {
	return i.ToActionsRepositoryPermissionsArrayOutputWithContext(context.Background())
}

func (i ActionsRepositoryPermissionsArray) ToActionsRepositoryPermissionsArrayOutputWithContext(ctx context.Context) ActionsRepositoryPermissionsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsRepositoryPermissionsArrayOutput)
}

// ActionsRepositoryPermissionsMapInput is an input type that accepts ActionsRepositoryPermissionsMap and ActionsRepositoryPermissionsMapOutput values.
// You can construct a concrete instance of `ActionsRepositoryPermissionsMapInput` via:
//
//	ActionsRepositoryPermissionsMap{ "key": ActionsRepositoryPermissionsArgs{...} }
type ActionsRepositoryPermissionsMapInput interface {
	pulumi.Input

	ToActionsRepositoryPermissionsMapOutput() ActionsRepositoryPermissionsMapOutput
	ToActionsRepositoryPermissionsMapOutputWithContext(context.Context) ActionsRepositoryPermissionsMapOutput
}

type ActionsRepositoryPermissionsMap map[string]ActionsRepositoryPermissionsInput

func (ActionsRepositoryPermissionsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionsRepositoryPermissions)(nil)).Elem()
}

func (i ActionsRepositoryPermissionsMap) ToActionsRepositoryPermissionsMapOutput() ActionsRepositoryPermissionsMapOutput {
	return i.ToActionsRepositoryPermissionsMapOutputWithContext(context.Background())
}

func (i ActionsRepositoryPermissionsMap) ToActionsRepositoryPermissionsMapOutputWithContext(ctx context.Context) ActionsRepositoryPermissionsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsRepositoryPermissionsMapOutput)
}

type ActionsRepositoryPermissionsOutput struct{ *pulumi.OutputState }

func (ActionsRepositoryPermissionsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionsRepositoryPermissions)(nil)).Elem()
}

func (o ActionsRepositoryPermissionsOutput) ToActionsRepositoryPermissionsOutput() ActionsRepositoryPermissionsOutput {
	return o
}

func (o ActionsRepositoryPermissionsOutput) ToActionsRepositoryPermissionsOutputWithContext(ctx context.Context) ActionsRepositoryPermissionsOutput {
	return o
}

// The permissions policy that controls the actions that are allowed to run. Can be one of: `all`, `localOnly`, or `selected`.
func (o ActionsRepositoryPermissionsOutput) AllowedActions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ActionsRepositoryPermissions) pulumi.StringPtrOutput { return v.AllowedActions }).(pulumi.StringPtrOutput)
}

// Sets the actions that are allowed in an repository. Only available when `allowedActions` = `selected`. See Allowed Actions Config below for details.
func (o ActionsRepositoryPermissionsOutput) AllowedActionsConfig() ActionsRepositoryPermissionsAllowedActionsConfigPtrOutput {
	return o.ApplyT(func(v *ActionsRepositoryPermissions) ActionsRepositoryPermissionsAllowedActionsConfigPtrOutput {
		return v.AllowedActionsConfig
	}).(ActionsRepositoryPermissionsAllowedActionsConfigPtrOutput)
}

// Should GitHub actions be enabled on this repository?
func (o ActionsRepositoryPermissionsOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ActionsRepositoryPermissions) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The GitHub repository
func (o ActionsRepositoryPermissionsOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsRepositoryPermissions) pulumi.StringOutput { return v.Repository }).(pulumi.StringOutput)
}

type ActionsRepositoryPermissionsArrayOutput struct{ *pulumi.OutputState }

func (ActionsRepositoryPermissionsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionsRepositoryPermissions)(nil)).Elem()
}

func (o ActionsRepositoryPermissionsArrayOutput) ToActionsRepositoryPermissionsArrayOutput() ActionsRepositoryPermissionsArrayOutput {
	return o
}

func (o ActionsRepositoryPermissionsArrayOutput) ToActionsRepositoryPermissionsArrayOutputWithContext(ctx context.Context) ActionsRepositoryPermissionsArrayOutput {
	return o
}

func (o ActionsRepositoryPermissionsArrayOutput) Index(i pulumi.IntInput) ActionsRepositoryPermissionsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ActionsRepositoryPermissions {
		return vs[0].([]*ActionsRepositoryPermissions)[vs[1].(int)]
	}).(ActionsRepositoryPermissionsOutput)
}

type ActionsRepositoryPermissionsMapOutput struct{ *pulumi.OutputState }

func (ActionsRepositoryPermissionsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionsRepositoryPermissions)(nil)).Elem()
}

func (o ActionsRepositoryPermissionsMapOutput) ToActionsRepositoryPermissionsMapOutput() ActionsRepositoryPermissionsMapOutput {
	return o
}

func (o ActionsRepositoryPermissionsMapOutput) ToActionsRepositoryPermissionsMapOutputWithContext(ctx context.Context) ActionsRepositoryPermissionsMapOutput {
	return o
}

func (o ActionsRepositoryPermissionsMapOutput) MapIndex(k pulumi.StringInput) ActionsRepositoryPermissionsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ActionsRepositoryPermissions {
		return vs[0].(map[string]*ActionsRepositoryPermissions)[vs[1].(string)]
	}).(ActionsRepositoryPermissionsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsRepositoryPermissionsInput)(nil)).Elem(), &ActionsRepositoryPermissions{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsRepositoryPermissionsArrayInput)(nil)).Elem(), ActionsRepositoryPermissionsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsRepositoryPermissionsMapInput)(nil)).Elem(), ActionsRepositoryPermissionsMap{})
	pulumi.RegisterOutputType(ActionsRepositoryPermissionsOutput{})
	pulumi.RegisterOutputType(ActionsRepositoryPermissionsArrayOutput{})
	pulumi.RegisterOutputType(ActionsRepositoryPermissionsMapOutput{})
}
