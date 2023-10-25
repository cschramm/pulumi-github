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

// Use this data source to retrieve information about a GitHub resource through REST API.
func GetRestApi(ctx *pulumi.Context, args *GetRestApiArgs, opts ...pulumi.InvokeOption) (*GetRestApiResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRestApiResult
	err := ctx.Invoke("github:index/getRestApi:getRestApi", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRestApi.
type GetRestApiArgs struct {
	// REST API endpoint to send the GET request to.
	Endpoint string `pulumi:"endpoint"`
}

// A collection of values returned by getRestApi.
type GetRestApiResult struct {
	// A map of response body.
	Body map[string]interface{} `pulumi:"body"`
	// A response status code.
	Code     int    `pulumi:"code"`
	Endpoint string `pulumi:"endpoint"`
	// A map of response headers.
	Headers map[string]interface{} `pulumi:"headers"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A response status string.
	Status string `pulumi:"status"`
}

func GetRestApiOutput(ctx *pulumi.Context, args GetRestApiOutputArgs, opts ...pulumi.InvokeOption) GetRestApiResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRestApiResult, error) {
			args := v.(GetRestApiArgs)
			r, err := GetRestApi(ctx, &args, opts...)
			var s GetRestApiResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetRestApiResultOutput)
}

// A collection of arguments for invoking getRestApi.
type GetRestApiOutputArgs struct {
	// REST API endpoint to send the GET request to.
	Endpoint pulumi.StringInput `pulumi:"endpoint"`
}

func (GetRestApiOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRestApiArgs)(nil)).Elem()
}

// A collection of values returned by getRestApi.
type GetRestApiResultOutput struct{ *pulumi.OutputState }

func (GetRestApiResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRestApiResult)(nil)).Elem()
}

func (o GetRestApiResultOutput) ToGetRestApiResultOutput() GetRestApiResultOutput {
	return o
}

func (o GetRestApiResultOutput) ToGetRestApiResultOutputWithContext(ctx context.Context) GetRestApiResultOutput {
	return o
}

func (o GetRestApiResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetRestApiResult] {
	return pulumix.Output[GetRestApiResult]{
		OutputState: o.OutputState,
	}
}

// A map of response body.
func (o GetRestApiResultOutput) Body() pulumi.MapOutput {
	return o.ApplyT(func(v GetRestApiResult) map[string]interface{} { return v.Body }).(pulumi.MapOutput)
}

// A response status code.
func (o GetRestApiResultOutput) Code() pulumi.IntOutput {
	return o.ApplyT(func(v GetRestApiResult) int { return v.Code }).(pulumi.IntOutput)
}

func (o GetRestApiResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetRestApiResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

// A map of response headers.
func (o GetRestApiResultOutput) Headers() pulumi.MapOutput {
	return o.ApplyT(func(v GetRestApiResult) map[string]interface{} { return v.Headers }).(pulumi.MapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRestApiResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRestApiResult) string { return v.Id }).(pulumi.StringOutput)
}

// A response status string.
func (o GetRestApiResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetRestApiResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRestApiResultOutput{})
}
