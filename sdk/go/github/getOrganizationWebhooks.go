// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-github/sdk/v5/go/github/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to retrieve all webhooks of the organization.
func GetOrganizationWebhooks(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetOrganizationWebhooksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOrganizationWebhooksResult
	err := ctx.Invoke("github:index/getOrganizationWebhooks:getOrganizationWebhooks", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getOrganizationWebhooks.
type GetOrganizationWebhooksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An Array of GitHub Webhooks.  Each `webhook` block consists of the fields documented below.
	// ***
	Webhooks []GetOrganizationWebhooksWebhook `pulumi:"webhooks"`
}

func GetOrganizationWebhooksOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetOrganizationWebhooksResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetOrganizationWebhooksResult, error) {
		r, err := GetOrganizationWebhooks(ctx, opts...)
		var s GetOrganizationWebhooksResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetOrganizationWebhooksResultOutput)
}

// A collection of values returned by getOrganizationWebhooks.
type GetOrganizationWebhooksResultOutput struct{ *pulumi.OutputState }

func (GetOrganizationWebhooksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOrganizationWebhooksResult)(nil)).Elem()
}

func (o GetOrganizationWebhooksResultOutput) ToGetOrganizationWebhooksResultOutput() GetOrganizationWebhooksResultOutput {
	return o
}

func (o GetOrganizationWebhooksResultOutput) ToGetOrganizationWebhooksResultOutputWithContext(ctx context.Context) GetOrganizationWebhooksResultOutput {
	return o
}

func (o GetOrganizationWebhooksResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetOrganizationWebhooksResult] {
	return pulumix.Output[GetOrganizationWebhooksResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetOrganizationWebhooksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrganizationWebhooksResult) string { return v.Id }).(pulumi.StringOutput)
}

// An Array of GitHub Webhooks.  Each `webhook` block consists of the fields documented below.
// ***
func (o GetOrganizationWebhooksResultOutput) Webhooks() GetOrganizationWebhooksWebhookArrayOutput {
	return o.ApplyT(func(v GetOrganizationWebhooksResult) []GetOrganizationWebhooksWebhook { return v.Webhooks }).(GetOrganizationWebhooksWebhookArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOrganizationWebhooksResultOutput{})
}
