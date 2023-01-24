// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create and manage GitHub Actions runner groups within your GitHub enterprise organizations.
// You must have admin access to an organization to use this resource.
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
//			exampleRepository, err := github.NewRepository(ctx, "exampleRepository", nil)
//			if err != nil {
//				return err
//			}
//			_, err = github.NewActionsRunnerGroup(ctx, "exampleActionsRunnerGroup", &github.ActionsRunnerGroupArgs{
//				Visibility: pulumi.String("selected"),
//				SelectedRepositoryIds: pulumi.IntArray{
//					exampleRepository.RepoId,
//				},
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
// # This resource can be imported using the ID of the runner group
//
// ```sh
//
//	$ pulumi import github:index/actionsRunnerGroup:ActionsRunnerGroup test 7
//
// ```
type ActionsRunnerGroup struct {
	pulumi.CustomResourceState

	// Whether public repositories can be added to the runner group
	AllowsPublicRepositories pulumi.BoolOutput `pulumi:"allowsPublicRepositories"`
	// Whether this is the default runner group
	Default pulumi.BoolOutput `pulumi:"default"`
	// An etag representing the runner group object
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Whether the runner group is inherited from the enterprise level
	Inherited pulumi.BoolOutput `pulumi:"inherited"`
	// Name of the runner group
	Name pulumi.StringOutput `pulumi:"name"`
	// If true, the runner group will be restricted to running only the workflows specified in the selectedWorkflows array. Defaults to false.
	RestrictedToWorkflows pulumi.BoolOutput `pulumi:"restrictedToWorkflows"`
	// The GitHub API URL for the runner group's runners
	RunnersUrl pulumi.StringOutput `pulumi:"runnersUrl"`
	// GitHub API URL for the runner group's repositories
	SelectedRepositoriesUrl pulumi.StringOutput `pulumi:"selectedRepositoriesUrl"`
	// IDs of the repositories which should be added to the runner group
	SelectedRepositoryIds pulumi.IntArrayOutput `pulumi:"selectedRepositoryIds"`
	// List of workflows the runner group should be allowed to run. This setting will be ignored unless restrictedToWorkflows is set to true.
	SelectedWorkflows pulumi.StringArrayOutput `pulumi:"selectedWorkflows"`
	// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
	Visibility pulumi.StringOutput `pulumi:"visibility"`
}

// NewActionsRunnerGroup registers a new resource with the given unique name, arguments, and options.
func NewActionsRunnerGroup(ctx *pulumi.Context,
	name string, args *ActionsRunnerGroupArgs, opts ...pulumi.ResourceOption) (*ActionsRunnerGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Visibility == nil {
		return nil, errors.New("invalid value for required argument 'Visibility'")
	}
	var resource ActionsRunnerGroup
	err := ctx.RegisterResource("github:index/actionsRunnerGroup:ActionsRunnerGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetActionsRunnerGroup gets an existing ActionsRunnerGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetActionsRunnerGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActionsRunnerGroupState, opts ...pulumi.ResourceOption) (*ActionsRunnerGroup, error) {
	var resource ActionsRunnerGroup
	err := ctx.ReadResource("github:index/actionsRunnerGroup:ActionsRunnerGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ActionsRunnerGroup resources.
type actionsRunnerGroupState struct {
	// Whether public repositories can be added to the runner group
	AllowsPublicRepositories *bool `pulumi:"allowsPublicRepositories"`
	// Whether this is the default runner group
	Default *bool `pulumi:"default"`
	// An etag representing the runner group object
	Etag *string `pulumi:"etag"`
	// Whether the runner group is inherited from the enterprise level
	Inherited *bool `pulumi:"inherited"`
	// Name of the runner group
	Name *string `pulumi:"name"`
	// If true, the runner group will be restricted to running only the workflows specified in the selectedWorkflows array. Defaults to false.
	RestrictedToWorkflows *bool `pulumi:"restrictedToWorkflows"`
	// The GitHub API URL for the runner group's runners
	RunnersUrl *string `pulumi:"runnersUrl"`
	// GitHub API URL for the runner group's repositories
	SelectedRepositoriesUrl *string `pulumi:"selectedRepositoriesUrl"`
	// IDs of the repositories which should be added to the runner group
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
	// List of workflows the runner group should be allowed to run. This setting will be ignored unless restrictedToWorkflows is set to true.
	SelectedWorkflows []string `pulumi:"selectedWorkflows"`
	// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
	Visibility *string `pulumi:"visibility"`
}

type ActionsRunnerGroupState struct {
	// Whether public repositories can be added to the runner group
	AllowsPublicRepositories pulumi.BoolPtrInput
	// Whether this is the default runner group
	Default pulumi.BoolPtrInput
	// An etag representing the runner group object
	Etag pulumi.StringPtrInput
	// Whether the runner group is inherited from the enterprise level
	Inherited pulumi.BoolPtrInput
	// Name of the runner group
	Name pulumi.StringPtrInput
	// If true, the runner group will be restricted to running only the workflows specified in the selectedWorkflows array. Defaults to false.
	RestrictedToWorkflows pulumi.BoolPtrInput
	// The GitHub API URL for the runner group's runners
	RunnersUrl pulumi.StringPtrInput
	// GitHub API URL for the runner group's repositories
	SelectedRepositoriesUrl pulumi.StringPtrInput
	// IDs of the repositories which should be added to the runner group
	SelectedRepositoryIds pulumi.IntArrayInput
	// List of workflows the runner group should be allowed to run. This setting will be ignored unless restrictedToWorkflows is set to true.
	SelectedWorkflows pulumi.StringArrayInput
	// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
	Visibility pulumi.StringPtrInput
}

func (ActionsRunnerGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsRunnerGroupState)(nil)).Elem()
}

type actionsRunnerGroupArgs struct {
	// Name of the runner group
	Name *string `pulumi:"name"`
	// IDs of the repositories which should be added to the runner group
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
	// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
	Visibility string `pulumi:"visibility"`
}

// The set of arguments for constructing a ActionsRunnerGroup resource.
type ActionsRunnerGroupArgs struct {
	// Name of the runner group
	Name pulumi.StringPtrInput
	// IDs of the repositories which should be added to the runner group
	SelectedRepositoryIds pulumi.IntArrayInput
	// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
	Visibility pulumi.StringInput
}

func (ActionsRunnerGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsRunnerGroupArgs)(nil)).Elem()
}

type ActionsRunnerGroupInput interface {
	pulumi.Input

	ToActionsRunnerGroupOutput() ActionsRunnerGroupOutput
	ToActionsRunnerGroupOutputWithContext(ctx context.Context) ActionsRunnerGroupOutput
}

func (*ActionsRunnerGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionsRunnerGroup)(nil)).Elem()
}

func (i *ActionsRunnerGroup) ToActionsRunnerGroupOutput() ActionsRunnerGroupOutput {
	return i.ToActionsRunnerGroupOutputWithContext(context.Background())
}

func (i *ActionsRunnerGroup) ToActionsRunnerGroupOutputWithContext(ctx context.Context) ActionsRunnerGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsRunnerGroupOutput)
}

// ActionsRunnerGroupArrayInput is an input type that accepts ActionsRunnerGroupArray and ActionsRunnerGroupArrayOutput values.
// You can construct a concrete instance of `ActionsRunnerGroupArrayInput` via:
//
//	ActionsRunnerGroupArray{ ActionsRunnerGroupArgs{...} }
type ActionsRunnerGroupArrayInput interface {
	pulumi.Input

	ToActionsRunnerGroupArrayOutput() ActionsRunnerGroupArrayOutput
	ToActionsRunnerGroupArrayOutputWithContext(context.Context) ActionsRunnerGroupArrayOutput
}

type ActionsRunnerGroupArray []ActionsRunnerGroupInput

func (ActionsRunnerGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionsRunnerGroup)(nil)).Elem()
}

func (i ActionsRunnerGroupArray) ToActionsRunnerGroupArrayOutput() ActionsRunnerGroupArrayOutput {
	return i.ToActionsRunnerGroupArrayOutputWithContext(context.Background())
}

func (i ActionsRunnerGroupArray) ToActionsRunnerGroupArrayOutputWithContext(ctx context.Context) ActionsRunnerGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsRunnerGroupArrayOutput)
}

// ActionsRunnerGroupMapInput is an input type that accepts ActionsRunnerGroupMap and ActionsRunnerGroupMapOutput values.
// You can construct a concrete instance of `ActionsRunnerGroupMapInput` via:
//
//	ActionsRunnerGroupMap{ "key": ActionsRunnerGroupArgs{...} }
type ActionsRunnerGroupMapInput interface {
	pulumi.Input

	ToActionsRunnerGroupMapOutput() ActionsRunnerGroupMapOutput
	ToActionsRunnerGroupMapOutputWithContext(context.Context) ActionsRunnerGroupMapOutput
}

type ActionsRunnerGroupMap map[string]ActionsRunnerGroupInput

func (ActionsRunnerGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionsRunnerGroup)(nil)).Elem()
}

func (i ActionsRunnerGroupMap) ToActionsRunnerGroupMapOutput() ActionsRunnerGroupMapOutput {
	return i.ToActionsRunnerGroupMapOutputWithContext(context.Background())
}

func (i ActionsRunnerGroupMap) ToActionsRunnerGroupMapOutputWithContext(ctx context.Context) ActionsRunnerGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsRunnerGroupMapOutput)
}

type ActionsRunnerGroupOutput struct{ *pulumi.OutputState }

func (ActionsRunnerGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionsRunnerGroup)(nil)).Elem()
}

func (o ActionsRunnerGroupOutput) ToActionsRunnerGroupOutput() ActionsRunnerGroupOutput {
	return o
}

func (o ActionsRunnerGroupOutput) ToActionsRunnerGroupOutputWithContext(ctx context.Context) ActionsRunnerGroupOutput {
	return o
}

// Whether public repositories can be added to the runner group
func (o ActionsRunnerGroupOutput) AllowsPublicRepositories() pulumi.BoolOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.BoolOutput { return v.AllowsPublicRepositories }).(pulumi.BoolOutput)
}

// Whether this is the default runner group
func (o ActionsRunnerGroupOutput) Default() pulumi.BoolOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.BoolOutput { return v.Default }).(pulumi.BoolOutput)
}

// An etag representing the runner group object
func (o ActionsRunnerGroupOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Whether the runner group is inherited from the enterprise level
func (o ActionsRunnerGroupOutput) Inherited() pulumi.BoolOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.BoolOutput { return v.Inherited }).(pulumi.BoolOutput)
}

// Name of the runner group
func (o ActionsRunnerGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// If true, the runner group will be restricted to running only the workflows specified in the selectedWorkflows array. Defaults to false.
func (o ActionsRunnerGroupOutput) RestrictedToWorkflows() pulumi.BoolOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.BoolOutput { return v.RestrictedToWorkflows }).(pulumi.BoolOutput)
}

// The GitHub API URL for the runner group's runners
func (o ActionsRunnerGroupOutput) RunnersUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.StringOutput { return v.RunnersUrl }).(pulumi.StringOutput)
}

// GitHub API URL for the runner group's repositories
func (o ActionsRunnerGroupOutput) SelectedRepositoriesUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.StringOutput { return v.SelectedRepositoriesUrl }).(pulumi.StringOutput)
}

// IDs of the repositories which should be added to the runner group
func (o ActionsRunnerGroupOutput) SelectedRepositoryIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.IntArrayOutput { return v.SelectedRepositoryIds }).(pulumi.IntArrayOutput)
}

// List of workflows the runner group should be allowed to run. This setting will be ignored unless restrictedToWorkflows is set to true.
func (o ActionsRunnerGroupOutput) SelectedWorkflows() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.StringArrayOutput { return v.SelectedWorkflows }).(pulumi.StringArrayOutput)
}

// Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
func (o ActionsRunnerGroupOutput) Visibility() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsRunnerGroup) pulumi.StringOutput { return v.Visibility }).(pulumi.StringOutput)
}

type ActionsRunnerGroupArrayOutput struct{ *pulumi.OutputState }

func (ActionsRunnerGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionsRunnerGroup)(nil)).Elem()
}

func (o ActionsRunnerGroupArrayOutput) ToActionsRunnerGroupArrayOutput() ActionsRunnerGroupArrayOutput {
	return o
}

func (o ActionsRunnerGroupArrayOutput) ToActionsRunnerGroupArrayOutputWithContext(ctx context.Context) ActionsRunnerGroupArrayOutput {
	return o
}

func (o ActionsRunnerGroupArrayOutput) Index(i pulumi.IntInput) ActionsRunnerGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ActionsRunnerGroup {
		return vs[0].([]*ActionsRunnerGroup)[vs[1].(int)]
	}).(ActionsRunnerGroupOutput)
}

type ActionsRunnerGroupMapOutput struct{ *pulumi.OutputState }

func (ActionsRunnerGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionsRunnerGroup)(nil)).Elem()
}

func (o ActionsRunnerGroupMapOutput) ToActionsRunnerGroupMapOutput() ActionsRunnerGroupMapOutput {
	return o
}

func (o ActionsRunnerGroupMapOutput) ToActionsRunnerGroupMapOutputWithContext(ctx context.Context) ActionsRunnerGroupMapOutput {
	return o
}

func (o ActionsRunnerGroupMapOutput) MapIndex(k pulumi.StringInput) ActionsRunnerGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ActionsRunnerGroup {
		return vs[0].(map[string]*ActionsRunnerGroup)[vs[1].(string)]
	}).(ActionsRunnerGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsRunnerGroupInput)(nil)).Elem(), &ActionsRunnerGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsRunnerGroupArrayInput)(nil)).Elem(), ActionsRunnerGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsRunnerGroupMapInput)(nil)).Elem(), ActionsRunnerGroupMap{})
	pulumi.RegisterOutputType(ActionsRunnerGroupOutput{})
	pulumi.RegisterOutputType(ActionsRunnerGroupArrayOutput{})
	pulumi.RegisterOutputType(ActionsRunnerGroupMapOutput{})
}
