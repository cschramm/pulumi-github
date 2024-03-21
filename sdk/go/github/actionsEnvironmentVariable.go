// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-github/sdk/v6/go/github/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create and manage GitHub Actions variables within your GitHub repository environments.
// You must have write access to a repository to use this resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-github/sdk/v6/go/github"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := github.NewActionsEnvironmentVariable(ctx, "exampleVariable", &github.ActionsEnvironmentVariableArgs{
//				Environment:  pulumi.String("example_environment"),
//				Value:        pulumi.String("example_variable_value"),
//				VariableName: pulumi.String("example_variable_name"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-github/sdk/v6/go/github"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			repo, err := github.LookupRepository(ctx, &github.LookupRepositoryArgs{
//				FullName: pulumi.StringRef("my-org/repo"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			repoEnvironment, err := github.NewRepositoryEnvironment(ctx, "repoEnvironment", &github.RepositoryEnvironmentArgs{
//				Repository:  pulumi.String(repo.Name),
//				Environment: pulumi.String("example_environment"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = github.NewActionsEnvironmentVariable(ctx, "exampleVariable", &github.ActionsEnvironmentVariableArgs{
//				Repository:   pulumi.String(repo.Name),
//				Environment:  repoEnvironment.Environment,
//				VariableName: pulumi.String("example_variable_name"),
//				Value:        pulumi.String("example_variable_value"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// This resource can be imported using an ID made up of the repository name, environment name, and variable name:
//
// ```sh
// $ pulumi import github:index/actionsEnvironmentVariable:ActionsEnvironmentVariable test_variable myrepo:myenv:myvariable
// ```
type ActionsEnvironmentVariable struct {
	pulumi.CustomResourceState

	// Date of actionsEnvironmentSecret creation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Name of the environment.
	Environment pulumi.StringOutput `pulumi:"environment"`
	// Name of the repository.
	Repository pulumi.StringOutput `pulumi:"repository"`
	// Date of actionsEnvironmentSecret update.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// Value of the variable
	Value pulumi.StringOutput `pulumi:"value"`
	// Name of the variable.
	VariableName pulumi.StringOutput `pulumi:"variableName"`
}

// NewActionsEnvironmentVariable registers a new resource with the given unique name, arguments, and options.
func NewActionsEnvironmentVariable(ctx *pulumi.Context,
	name string, args *ActionsEnvironmentVariableArgs, opts ...pulumi.ResourceOption) (*ActionsEnvironmentVariable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Repository == nil {
		return nil, errors.New("invalid value for required argument 'Repository'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	if args.VariableName == nil {
		return nil, errors.New("invalid value for required argument 'VariableName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ActionsEnvironmentVariable
	err := ctx.RegisterResource("github:index/actionsEnvironmentVariable:ActionsEnvironmentVariable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetActionsEnvironmentVariable gets an existing ActionsEnvironmentVariable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetActionsEnvironmentVariable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActionsEnvironmentVariableState, opts ...pulumi.ResourceOption) (*ActionsEnvironmentVariable, error) {
	var resource ActionsEnvironmentVariable
	err := ctx.ReadResource("github:index/actionsEnvironmentVariable:ActionsEnvironmentVariable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ActionsEnvironmentVariable resources.
type actionsEnvironmentVariableState struct {
	// Date of actionsEnvironmentSecret creation.
	CreatedAt *string `pulumi:"createdAt"`
	// Name of the environment.
	Environment *string `pulumi:"environment"`
	// Name of the repository.
	Repository *string `pulumi:"repository"`
	// Date of actionsEnvironmentSecret update.
	UpdatedAt *string `pulumi:"updatedAt"`
	// Value of the variable
	Value *string `pulumi:"value"`
	// Name of the variable.
	VariableName *string `pulumi:"variableName"`
}

type ActionsEnvironmentVariableState struct {
	// Date of actionsEnvironmentSecret creation.
	CreatedAt pulumi.StringPtrInput
	// Name of the environment.
	Environment pulumi.StringPtrInput
	// Name of the repository.
	Repository pulumi.StringPtrInput
	// Date of actionsEnvironmentSecret update.
	UpdatedAt pulumi.StringPtrInput
	// Value of the variable
	Value pulumi.StringPtrInput
	// Name of the variable.
	VariableName pulumi.StringPtrInput
}

func (ActionsEnvironmentVariableState) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsEnvironmentVariableState)(nil)).Elem()
}

type actionsEnvironmentVariableArgs struct {
	// Name of the environment.
	Environment string `pulumi:"environment"`
	// Name of the repository.
	Repository string `pulumi:"repository"`
	// Value of the variable
	Value string `pulumi:"value"`
	// Name of the variable.
	VariableName string `pulumi:"variableName"`
}

// The set of arguments for constructing a ActionsEnvironmentVariable resource.
type ActionsEnvironmentVariableArgs struct {
	// Name of the environment.
	Environment pulumi.StringInput
	// Name of the repository.
	Repository pulumi.StringInput
	// Value of the variable
	Value pulumi.StringInput
	// Name of the variable.
	VariableName pulumi.StringInput
}

func (ActionsEnvironmentVariableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsEnvironmentVariableArgs)(nil)).Elem()
}

type ActionsEnvironmentVariableInput interface {
	pulumi.Input

	ToActionsEnvironmentVariableOutput() ActionsEnvironmentVariableOutput
	ToActionsEnvironmentVariableOutputWithContext(ctx context.Context) ActionsEnvironmentVariableOutput
}

func (*ActionsEnvironmentVariable) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionsEnvironmentVariable)(nil)).Elem()
}

func (i *ActionsEnvironmentVariable) ToActionsEnvironmentVariableOutput() ActionsEnvironmentVariableOutput {
	return i.ToActionsEnvironmentVariableOutputWithContext(context.Background())
}

func (i *ActionsEnvironmentVariable) ToActionsEnvironmentVariableOutputWithContext(ctx context.Context) ActionsEnvironmentVariableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsEnvironmentVariableOutput)
}

// ActionsEnvironmentVariableArrayInput is an input type that accepts ActionsEnvironmentVariableArray and ActionsEnvironmentVariableArrayOutput values.
// You can construct a concrete instance of `ActionsEnvironmentVariableArrayInput` via:
//
//	ActionsEnvironmentVariableArray{ ActionsEnvironmentVariableArgs{...} }
type ActionsEnvironmentVariableArrayInput interface {
	pulumi.Input

	ToActionsEnvironmentVariableArrayOutput() ActionsEnvironmentVariableArrayOutput
	ToActionsEnvironmentVariableArrayOutputWithContext(context.Context) ActionsEnvironmentVariableArrayOutput
}

type ActionsEnvironmentVariableArray []ActionsEnvironmentVariableInput

func (ActionsEnvironmentVariableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionsEnvironmentVariable)(nil)).Elem()
}

func (i ActionsEnvironmentVariableArray) ToActionsEnvironmentVariableArrayOutput() ActionsEnvironmentVariableArrayOutput {
	return i.ToActionsEnvironmentVariableArrayOutputWithContext(context.Background())
}

func (i ActionsEnvironmentVariableArray) ToActionsEnvironmentVariableArrayOutputWithContext(ctx context.Context) ActionsEnvironmentVariableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsEnvironmentVariableArrayOutput)
}

// ActionsEnvironmentVariableMapInput is an input type that accepts ActionsEnvironmentVariableMap and ActionsEnvironmentVariableMapOutput values.
// You can construct a concrete instance of `ActionsEnvironmentVariableMapInput` via:
//
//	ActionsEnvironmentVariableMap{ "key": ActionsEnvironmentVariableArgs{...} }
type ActionsEnvironmentVariableMapInput interface {
	pulumi.Input

	ToActionsEnvironmentVariableMapOutput() ActionsEnvironmentVariableMapOutput
	ToActionsEnvironmentVariableMapOutputWithContext(context.Context) ActionsEnvironmentVariableMapOutput
}

type ActionsEnvironmentVariableMap map[string]ActionsEnvironmentVariableInput

func (ActionsEnvironmentVariableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionsEnvironmentVariable)(nil)).Elem()
}

func (i ActionsEnvironmentVariableMap) ToActionsEnvironmentVariableMapOutput() ActionsEnvironmentVariableMapOutput {
	return i.ToActionsEnvironmentVariableMapOutputWithContext(context.Background())
}

func (i ActionsEnvironmentVariableMap) ToActionsEnvironmentVariableMapOutputWithContext(ctx context.Context) ActionsEnvironmentVariableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsEnvironmentVariableMapOutput)
}

type ActionsEnvironmentVariableOutput struct{ *pulumi.OutputState }

func (ActionsEnvironmentVariableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ActionsEnvironmentVariable)(nil)).Elem()
}

func (o ActionsEnvironmentVariableOutput) ToActionsEnvironmentVariableOutput() ActionsEnvironmentVariableOutput {
	return o
}

func (o ActionsEnvironmentVariableOutput) ToActionsEnvironmentVariableOutputWithContext(ctx context.Context) ActionsEnvironmentVariableOutput {
	return o
}

// Date of actionsEnvironmentSecret creation.
func (o ActionsEnvironmentVariableOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsEnvironmentVariable) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Name of the environment.
func (o ActionsEnvironmentVariableOutput) Environment() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsEnvironmentVariable) pulumi.StringOutput { return v.Environment }).(pulumi.StringOutput)
}

// Name of the repository.
func (o ActionsEnvironmentVariableOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsEnvironmentVariable) pulumi.StringOutput { return v.Repository }).(pulumi.StringOutput)
}

// Date of actionsEnvironmentSecret update.
func (o ActionsEnvironmentVariableOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsEnvironmentVariable) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// Value of the variable
func (o ActionsEnvironmentVariableOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsEnvironmentVariable) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

// Name of the variable.
func (o ActionsEnvironmentVariableOutput) VariableName() pulumi.StringOutput {
	return o.ApplyT(func(v *ActionsEnvironmentVariable) pulumi.StringOutput { return v.VariableName }).(pulumi.StringOutput)
}

type ActionsEnvironmentVariableArrayOutput struct{ *pulumi.OutputState }

func (ActionsEnvironmentVariableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ActionsEnvironmentVariable)(nil)).Elem()
}

func (o ActionsEnvironmentVariableArrayOutput) ToActionsEnvironmentVariableArrayOutput() ActionsEnvironmentVariableArrayOutput {
	return o
}

func (o ActionsEnvironmentVariableArrayOutput) ToActionsEnvironmentVariableArrayOutputWithContext(ctx context.Context) ActionsEnvironmentVariableArrayOutput {
	return o
}

func (o ActionsEnvironmentVariableArrayOutput) Index(i pulumi.IntInput) ActionsEnvironmentVariableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ActionsEnvironmentVariable {
		return vs[0].([]*ActionsEnvironmentVariable)[vs[1].(int)]
	}).(ActionsEnvironmentVariableOutput)
}

type ActionsEnvironmentVariableMapOutput struct{ *pulumi.OutputState }

func (ActionsEnvironmentVariableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ActionsEnvironmentVariable)(nil)).Elem()
}

func (o ActionsEnvironmentVariableMapOutput) ToActionsEnvironmentVariableMapOutput() ActionsEnvironmentVariableMapOutput {
	return o
}

func (o ActionsEnvironmentVariableMapOutput) ToActionsEnvironmentVariableMapOutputWithContext(ctx context.Context) ActionsEnvironmentVariableMapOutput {
	return o
}

func (o ActionsEnvironmentVariableMapOutput) MapIndex(k pulumi.StringInput) ActionsEnvironmentVariableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ActionsEnvironmentVariable {
		return vs[0].(map[string]*ActionsEnvironmentVariable)[vs[1].(string)]
	}).(ActionsEnvironmentVariableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsEnvironmentVariableInput)(nil)).Elem(), &ActionsEnvironmentVariable{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsEnvironmentVariableArrayInput)(nil)).Elem(), ActionsEnvironmentVariableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionsEnvironmentVariableMapInput)(nil)).Elem(), ActionsEnvironmentVariableMap{})
	pulumi.RegisterOutputType(ActionsEnvironmentVariableOutput{})
	pulumi.RegisterOutputType(ActionsEnvironmentVariableArrayOutput{})
	pulumi.RegisterOutputType(ActionsEnvironmentVariableMapOutput{})
}
