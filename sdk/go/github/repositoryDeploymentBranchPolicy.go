// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create and manage deployment branch policies.
//
// ## Import
//
// ```sh
//
//	$ pulumi import github:index/repositoryDeploymentBranchPolicy:RepositoryDeploymentBranchPolicy foo repo:env:id
//
// ```
type RepositoryDeploymentBranchPolicy struct {
	pulumi.CustomResourceState

	// The name of the environment. This environment must have `deployment_branch_policy.custom_branch_policies` set to true.
	EnvironmentName pulumi.StringOutput `pulumi:"environmentName"`
	// An etag representing the Branch object.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The name pattern that branches must match in order to deploy to the environment.
	Name pulumi.StringOutput `pulumi:"name"`
	// The repository to create the policy in.
	Repository pulumi.StringOutput `pulumi:"repository"`
}

// NewRepositoryDeploymentBranchPolicy registers a new resource with the given unique name, arguments, and options.
func NewRepositoryDeploymentBranchPolicy(ctx *pulumi.Context,
	name string, args *RepositoryDeploymentBranchPolicyArgs, opts ...pulumi.ResourceOption) (*RepositoryDeploymentBranchPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvironmentName == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentName'")
	}
	if args.Repository == nil {
		return nil, errors.New("invalid value for required argument 'Repository'")
	}
	var resource RepositoryDeploymentBranchPolicy
	err := ctx.RegisterResource("github:index/repositoryDeploymentBranchPolicy:RepositoryDeploymentBranchPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepositoryDeploymentBranchPolicy gets an existing RepositoryDeploymentBranchPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepositoryDeploymentBranchPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepositoryDeploymentBranchPolicyState, opts ...pulumi.ResourceOption) (*RepositoryDeploymentBranchPolicy, error) {
	var resource RepositoryDeploymentBranchPolicy
	err := ctx.ReadResource("github:index/repositoryDeploymentBranchPolicy:RepositoryDeploymentBranchPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RepositoryDeploymentBranchPolicy resources.
type repositoryDeploymentBranchPolicyState struct {
	// The name of the environment. This environment must have `deployment_branch_policy.custom_branch_policies` set to true.
	EnvironmentName *string `pulumi:"environmentName"`
	// An etag representing the Branch object.
	Etag *string `pulumi:"etag"`
	// The name pattern that branches must match in order to deploy to the environment.
	Name *string `pulumi:"name"`
	// The repository to create the policy in.
	Repository *string `pulumi:"repository"`
}

type RepositoryDeploymentBranchPolicyState struct {
	// The name of the environment. This environment must have `deployment_branch_policy.custom_branch_policies` set to true.
	EnvironmentName pulumi.StringPtrInput
	// An etag representing the Branch object.
	Etag pulumi.StringPtrInput
	// The name pattern that branches must match in order to deploy to the environment.
	Name pulumi.StringPtrInput
	// The repository to create the policy in.
	Repository pulumi.StringPtrInput
}

func (RepositoryDeploymentBranchPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryDeploymentBranchPolicyState)(nil)).Elem()
}

type repositoryDeploymentBranchPolicyArgs struct {
	// The name of the environment. This environment must have `deployment_branch_policy.custom_branch_policies` set to true.
	EnvironmentName string `pulumi:"environmentName"`
	// The name pattern that branches must match in order to deploy to the environment.
	Name *string `pulumi:"name"`
	// The repository to create the policy in.
	Repository string `pulumi:"repository"`
}

// The set of arguments for constructing a RepositoryDeploymentBranchPolicy resource.
type RepositoryDeploymentBranchPolicyArgs struct {
	// The name of the environment. This environment must have `deployment_branch_policy.custom_branch_policies` set to true.
	EnvironmentName pulumi.StringInput
	// The name pattern that branches must match in order to deploy to the environment.
	Name pulumi.StringPtrInput
	// The repository to create the policy in.
	Repository pulumi.StringInput
}

func (RepositoryDeploymentBranchPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repositoryDeploymentBranchPolicyArgs)(nil)).Elem()
}

type RepositoryDeploymentBranchPolicyInput interface {
	pulumi.Input

	ToRepositoryDeploymentBranchPolicyOutput() RepositoryDeploymentBranchPolicyOutput
	ToRepositoryDeploymentBranchPolicyOutputWithContext(ctx context.Context) RepositoryDeploymentBranchPolicyOutput
}

func (*RepositoryDeploymentBranchPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryDeploymentBranchPolicy)(nil)).Elem()
}

func (i *RepositoryDeploymentBranchPolicy) ToRepositoryDeploymentBranchPolicyOutput() RepositoryDeploymentBranchPolicyOutput {
	return i.ToRepositoryDeploymentBranchPolicyOutputWithContext(context.Background())
}

func (i *RepositoryDeploymentBranchPolicy) ToRepositoryDeploymentBranchPolicyOutputWithContext(ctx context.Context) RepositoryDeploymentBranchPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryDeploymentBranchPolicyOutput)
}

// RepositoryDeploymentBranchPolicyArrayInput is an input type that accepts RepositoryDeploymentBranchPolicyArray and RepositoryDeploymentBranchPolicyArrayOutput values.
// You can construct a concrete instance of `RepositoryDeploymentBranchPolicyArrayInput` via:
//
//	RepositoryDeploymentBranchPolicyArray{ RepositoryDeploymentBranchPolicyArgs{...} }
type RepositoryDeploymentBranchPolicyArrayInput interface {
	pulumi.Input

	ToRepositoryDeploymentBranchPolicyArrayOutput() RepositoryDeploymentBranchPolicyArrayOutput
	ToRepositoryDeploymentBranchPolicyArrayOutputWithContext(context.Context) RepositoryDeploymentBranchPolicyArrayOutput
}

type RepositoryDeploymentBranchPolicyArray []RepositoryDeploymentBranchPolicyInput

func (RepositoryDeploymentBranchPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryDeploymentBranchPolicy)(nil)).Elem()
}

func (i RepositoryDeploymentBranchPolicyArray) ToRepositoryDeploymentBranchPolicyArrayOutput() RepositoryDeploymentBranchPolicyArrayOutput {
	return i.ToRepositoryDeploymentBranchPolicyArrayOutputWithContext(context.Background())
}

func (i RepositoryDeploymentBranchPolicyArray) ToRepositoryDeploymentBranchPolicyArrayOutputWithContext(ctx context.Context) RepositoryDeploymentBranchPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryDeploymentBranchPolicyArrayOutput)
}

// RepositoryDeploymentBranchPolicyMapInput is an input type that accepts RepositoryDeploymentBranchPolicyMap and RepositoryDeploymentBranchPolicyMapOutput values.
// You can construct a concrete instance of `RepositoryDeploymentBranchPolicyMapInput` via:
//
//	RepositoryDeploymentBranchPolicyMap{ "key": RepositoryDeploymentBranchPolicyArgs{...} }
type RepositoryDeploymentBranchPolicyMapInput interface {
	pulumi.Input

	ToRepositoryDeploymentBranchPolicyMapOutput() RepositoryDeploymentBranchPolicyMapOutput
	ToRepositoryDeploymentBranchPolicyMapOutputWithContext(context.Context) RepositoryDeploymentBranchPolicyMapOutput
}

type RepositoryDeploymentBranchPolicyMap map[string]RepositoryDeploymentBranchPolicyInput

func (RepositoryDeploymentBranchPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryDeploymentBranchPolicy)(nil)).Elem()
}

func (i RepositoryDeploymentBranchPolicyMap) ToRepositoryDeploymentBranchPolicyMapOutput() RepositoryDeploymentBranchPolicyMapOutput {
	return i.ToRepositoryDeploymentBranchPolicyMapOutputWithContext(context.Background())
}

func (i RepositoryDeploymentBranchPolicyMap) ToRepositoryDeploymentBranchPolicyMapOutputWithContext(ctx context.Context) RepositoryDeploymentBranchPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepositoryDeploymentBranchPolicyMapOutput)
}

type RepositoryDeploymentBranchPolicyOutput struct{ *pulumi.OutputState }

func (RepositoryDeploymentBranchPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RepositoryDeploymentBranchPolicy)(nil)).Elem()
}

func (o RepositoryDeploymentBranchPolicyOutput) ToRepositoryDeploymentBranchPolicyOutput() RepositoryDeploymentBranchPolicyOutput {
	return o
}

func (o RepositoryDeploymentBranchPolicyOutput) ToRepositoryDeploymentBranchPolicyOutputWithContext(ctx context.Context) RepositoryDeploymentBranchPolicyOutput {
	return o
}

// The name of the environment. This environment must have `deployment_branch_policy.custom_branch_policies` set to true.
func (o RepositoryDeploymentBranchPolicyOutput) EnvironmentName() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryDeploymentBranchPolicy) pulumi.StringOutput { return v.EnvironmentName }).(pulumi.StringOutput)
}

// An etag representing the Branch object.
func (o RepositoryDeploymentBranchPolicyOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryDeploymentBranchPolicy) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The name pattern that branches must match in order to deploy to the environment.
func (o RepositoryDeploymentBranchPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryDeploymentBranchPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The repository to create the policy in.
func (o RepositoryDeploymentBranchPolicyOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v *RepositoryDeploymentBranchPolicy) pulumi.StringOutput { return v.Repository }).(pulumi.StringOutput)
}

type RepositoryDeploymentBranchPolicyArrayOutput struct{ *pulumi.OutputState }

func (RepositoryDeploymentBranchPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RepositoryDeploymentBranchPolicy)(nil)).Elem()
}

func (o RepositoryDeploymentBranchPolicyArrayOutput) ToRepositoryDeploymentBranchPolicyArrayOutput() RepositoryDeploymentBranchPolicyArrayOutput {
	return o
}

func (o RepositoryDeploymentBranchPolicyArrayOutput) ToRepositoryDeploymentBranchPolicyArrayOutputWithContext(ctx context.Context) RepositoryDeploymentBranchPolicyArrayOutput {
	return o
}

func (o RepositoryDeploymentBranchPolicyArrayOutput) Index(i pulumi.IntInput) RepositoryDeploymentBranchPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RepositoryDeploymentBranchPolicy {
		return vs[0].([]*RepositoryDeploymentBranchPolicy)[vs[1].(int)]
	}).(RepositoryDeploymentBranchPolicyOutput)
}

type RepositoryDeploymentBranchPolicyMapOutput struct{ *pulumi.OutputState }

func (RepositoryDeploymentBranchPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RepositoryDeploymentBranchPolicy)(nil)).Elem()
}

func (o RepositoryDeploymentBranchPolicyMapOutput) ToRepositoryDeploymentBranchPolicyMapOutput() RepositoryDeploymentBranchPolicyMapOutput {
	return o
}

func (o RepositoryDeploymentBranchPolicyMapOutput) ToRepositoryDeploymentBranchPolicyMapOutputWithContext(ctx context.Context) RepositoryDeploymentBranchPolicyMapOutput {
	return o
}

func (o RepositoryDeploymentBranchPolicyMapOutput) MapIndex(k pulumi.StringInput) RepositoryDeploymentBranchPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RepositoryDeploymentBranchPolicy {
		return vs[0].(map[string]*RepositoryDeploymentBranchPolicy)[vs[1].(string)]
	}).(RepositoryDeploymentBranchPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryDeploymentBranchPolicyInput)(nil)).Elem(), &RepositoryDeploymentBranchPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryDeploymentBranchPolicyArrayInput)(nil)).Elem(), RepositoryDeploymentBranchPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepositoryDeploymentBranchPolicyMapInput)(nil)).Elem(), RepositoryDeploymentBranchPolicyMap{})
	pulumi.RegisterOutputType(RepositoryDeploymentBranchPolicyOutput{})
	pulumi.RegisterOutputType(RepositoryDeploymentBranchPolicyArrayOutput{})
	pulumi.RegisterOutputType(RepositoryDeploymentBranchPolicyMapOutput{})
}
