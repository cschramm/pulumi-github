// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-github/sdk/v5/go/github/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve a GitHub Actions organization registration token. This token can then be used to register a self-hosted runner.
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
//			_, err := github.GetActionsOrganizationRegistrationToken(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetActionsOrganizationRegistrationToken(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetActionsOrganizationRegistrationTokenResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetActionsOrganizationRegistrationTokenResult
	err := ctx.Invoke("github:index/getActionsOrganizationRegistrationToken:getActionsOrganizationRegistrationToken", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getActionsOrganizationRegistrationToken.
type GetActionsOrganizationRegistrationTokenResult struct {
	// The token expiration date.
	ExpiresAt int `pulumi:"expiresAt"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The token that has been retrieved.
	Token string `pulumi:"token"`
}

func GetActionsOrganizationRegistrationTokenOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetActionsOrganizationRegistrationTokenResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetActionsOrganizationRegistrationTokenResult, error) {
		r, err := GetActionsOrganizationRegistrationToken(ctx, opts...)
		var s GetActionsOrganizationRegistrationTokenResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetActionsOrganizationRegistrationTokenResultOutput)
}

// A collection of values returned by getActionsOrganizationRegistrationToken.
type GetActionsOrganizationRegistrationTokenResultOutput struct{ *pulumi.OutputState }

func (GetActionsOrganizationRegistrationTokenResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetActionsOrganizationRegistrationTokenResult)(nil)).Elem()
}

func (o GetActionsOrganizationRegistrationTokenResultOutput) ToGetActionsOrganizationRegistrationTokenResultOutput() GetActionsOrganizationRegistrationTokenResultOutput {
	return o
}

func (o GetActionsOrganizationRegistrationTokenResultOutput) ToGetActionsOrganizationRegistrationTokenResultOutputWithContext(ctx context.Context) GetActionsOrganizationRegistrationTokenResultOutput {
	return o
}

// The token expiration date.
func (o GetActionsOrganizationRegistrationTokenResultOutput) ExpiresAt() pulumi.IntOutput {
	return o.ApplyT(func(v GetActionsOrganizationRegistrationTokenResult) int { return v.ExpiresAt }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetActionsOrganizationRegistrationTokenResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsOrganizationRegistrationTokenResult) string { return v.Id }).(pulumi.StringOutput)
}

// The token that has been retrieved.
func (o GetActionsOrganizationRegistrationTokenResultOutput) Token() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsOrganizationRegistrationTokenResult) string { return v.Token }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetActionsOrganizationRegistrationTokenResultOutput{})
}
