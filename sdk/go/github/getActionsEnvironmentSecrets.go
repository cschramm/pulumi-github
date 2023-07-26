// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-github/sdk/v5/go/github/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve the list of secrets of the repository environment.
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
//			_, err := github.GetActionsEnvironmentSecrets(ctx, &github.GetActionsEnvironmentSecretsArgs{
//				Environment: "exampleEnvironment",
//				Name:        pulumi.StringRef("exampleRepo"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetActionsEnvironmentSecrets(ctx *pulumi.Context, args *GetActionsEnvironmentSecretsArgs, opts ...pulumi.InvokeOption) (*GetActionsEnvironmentSecretsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetActionsEnvironmentSecretsResult
	err := ctx.Invoke("github:index/getActionsEnvironmentSecrets:getActionsEnvironmentSecrets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getActionsEnvironmentSecrets.
type GetActionsEnvironmentSecretsArgs struct {
	Environment string  `pulumi:"environment"`
	FullName    *string `pulumi:"fullName"`
	// Name of the secret
	Name *string `pulumi:"name"`
}

// A collection of values returned by getActionsEnvironmentSecrets.
type GetActionsEnvironmentSecretsResult struct {
	Environment string `pulumi:"environment"`
	FullName    string `pulumi:"fullName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the secret
	Name string `pulumi:"name"`
	// list of secrets for the environment
	Secrets []GetActionsEnvironmentSecretsSecret `pulumi:"secrets"`
}

func GetActionsEnvironmentSecretsOutput(ctx *pulumi.Context, args GetActionsEnvironmentSecretsOutputArgs, opts ...pulumi.InvokeOption) GetActionsEnvironmentSecretsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetActionsEnvironmentSecretsResult, error) {
			args := v.(GetActionsEnvironmentSecretsArgs)
			r, err := GetActionsEnvironmentSecrets(ctx, &args, opts...)
			var s GetActionsEnvironmentSecretsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetActionsEnvironmentSecretsResultOutput)
}

// A collection of arguments for invoking getActionsEnvironmentSecrets.
type GetActionsEnvironmentSecretsOutputArgs struct {
	Environment pulumi.StringInput    `pulumi:"environment"`
	FullName    pulumi.StringPtrInput `pulumi:"fullName"`
	// Name of the secret
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (GetActionsEnvironmentSecretsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetActionsEnvironmentSecretsArgs)(nil)).Elem()
}

// A collection of values returned by getActionsEnvironmentSecrets.
type GetActionsEnvironmentSecretsResultOutput struct{ *pulumi.OutputState }

func (GetActionsEnvironmentSecretsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetActionsEnvironmentSecretsResult)(nil)).Elem()
}

func (o GetActionsEnvironmentSecretsResultOutput) ToGetActionsEnvironmentSecretsResultOutput() GetActionsEnvironmentSecretsResultOutput {
	return o
}

func (o GetActionsEnvironmentSecretsResultOutput) ToGetActionsEnvironmentSecretsResultOutputWithContext(ctx context.Context) GetActionsEnvironmentSecretsResultOutput {
	return o
}

func (o GetActionsEnvironmentSecretsResultOutput) Environment() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsEnvironmentSecretsResult) string { return v.Environment }).(pulumi.StringOutput)
}

func (o GetActionsEnvironmentSecretsResultOutput) FullName() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsEnvironmentSecretsResult) string { return v.FullName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetActionsEnvironmentSecretsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsEnvironmentSecretsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the secret
func (o GetActionsEnvironmentSecretsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsEnvironmentSecretsResult) string { return v.Name }).(pulumi.StringOutput)
}

// list of secrets for the environment
func (o GetActionsEnvironmentSecretsResultOutput) Secrets() GetActionsEnvironmentSecretsSecretArrayOutput {
	return o.ApplyT(func(v GetActionsEnvironmentSecretsResult) []GetActionsEnvironmentSecretsSecret { return v.Secrets }).(GetActionsEnvironmentSecretsSecretArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetActionsEnvironmentSecretsResultOutput{})
}
