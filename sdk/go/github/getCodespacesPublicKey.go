// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a GitHub Codespaces public key. This data source is required to be used with other GitHub secrets interactions.
// Note that the provider `token` must have admin rights to a repository to retrieve it's Codespaces public key.
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
//			_, err := github.GetCodespacesPublicKey(ctx, &github.GetCodespacesPublicKeyArgs{
//				Repository: "example_repo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetCodespacesPublicKey(ctx *pulumi.Context, args *GetCodespacesPublicKeyArgs, opts ...pulumi.InvokeOption) (*GetCodespacesPublicKeyResult, error) {
	var rv GetCodespacesPublicKeyResult
	err := ctx.Invoke("github:index/getCodespacesPublicKey:getCodespacesPublicKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCodespacesPublicKey.
type GetCodespacesPublicKeyArgs struct {
	// Name of the repository to get public key from.
	Repository string `pulumi:"repository"`
}

// A collection of values returned by getCodespacesPublicKey.
type GetCodespacesPublicKeyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Actual key retrieved.
	Key string `pulumi:"key"`
	// ID of the key that has been retrieved.
	KeyId      string `pulumi:"keyId"`
	Repository string `pulumi:"repository"`
}

func GetCodespacesPublicKeyOutput(ctx *pulumi.Context, args GetCodespacesPublicKeyOutputArgs, opts ...pulumi.InvokeOption) GetCodespacesPublicKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCodespacesPublicKeyResult, error) {
			args := v.(GetCodespacesPublicKeyArgs)
			r, err := GetCodespacesPublicKey(ctx, &args, opts...)
			var s GetCodespacesPublicKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCodespacesPublicKeyResultOutput)
}

// A collection of arguments for invoking getCodespacesPublicKey.
type GetCodespacesPublicKeyOutputArgs struct {
	// Name of the repository to get public key from.
	Repository pulumi.StringInput `pulumi:"repository"`
}

func (GetCodespacesPublicKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCodespacesPublicKeyArgs)(nil)).Elem()
}

// A collection of values returned by getCodespacesPublicKey.
type GetCodespacesPublicKeyResultOutput struct{ *pulumi.OutputState }

func (GetCodespacesPublicKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCodespacesPublicKeyResult)(nil)).Elem()
}

func (o GetCodespacesPublicKeyResultOutput) ToGetCodespacesPublicKeyResultOutput() GetCodespacesPublicKeyResultOutput {
	return o
}

func (o GetCodespacesPublicKeyResultOutput) ToGetCodespacesPublicKeyResultOutputWithContext(ctx context.Context) GetCodespacesPublicKeyResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetCodespacesPublicKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCodespacesPublicKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

// Actual key retrieved.
func (o GetCodespacesPublicKeyResultOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v GetCodespacesPublicKeyResult) string { return v.Key }).(pulumi.StringOutput)
}

// ID of the key that has been retrieved.
func (o GetCodespacesPublicKeyResultOutput) KeyId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCodespacesPublicKeyResult) string { return v.KeyId }).(pulumi.StringOutput)
}

func (o GetCodespacesPublicKeyResultOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v GetCodespacesPublicKeyResult) string { return v.Repository }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCodespacesPublicKeyResultOutput{})
}
