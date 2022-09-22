// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetActionsSecrets(ctx *pulumi.Context, args *GetActionsSecretsArgs, opts ...pulumi.InvokeOption) (*GetActionsSecretsResult, error) {
	var rv GetActionsSecretsResult
	err := ctx.Invoke("github:index/getActionsSecrets:getActionsSecrets", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getActionsSecrets.
type GetActionsSecretsArgs struct {
	FullName *string `pulumi:"fullName"`
	Name     *string `pulumi:"name"`
}

// A collection of values returned by getActionsSecrets.
type GetActionsSecretsResult struct {
	FullName string `pulumi:"fullName"`
	// The provider-assigned unique ID for this managed resource.
	Id      string                    `pulumi:"id"`
	Name    string                    `pulumi:"name"`
	Secrets []GetActionsSecretsSecret `pulumi:"secrets"`
}

func GetActionsSecretsOutput(ctx *pulumi.Context, args GetActionsSecretsOutputArgs, opts ...pulumi.InvokeOption) GetActionsSecretsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetActionsSecretsResult, error) {
			args := v.(GetActionsSecretsArgs)
			r, err := GetActionsSecrets(ctx, &args, opts...)
			var s GetActionsSecretsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetActionsSecretsResultOutput)
}

// A collection of arguments for invoking getActionsSecrets.
type GetActionsSecretsOutputArgs struct {
	FullName pulumi.StringPtrInput `pulumi:"fullName"`
	Name     pulumi.StringPtrInput `pulumi:"name"`
}

func (GetActionsSecretsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetActionsSecretsArgs)(nil)).Elem()
}

// A collection of values returned by getActionsSecrets.
type GetActionsSecretsResultOutput struct{ *pulumi.OutputState }

func (GetActionsSecretsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetActionsSecretsResult)(nil)).Elem()
}

func (o GetActionsSecretsResultOutput) ToGetActionsSecretsResultOutput() GetActionsSecretsResultOutput {
	return o
}

func (o GetActionsSecretsResultOutput) ToGetActionsSecretsResultOutputWithContext(ctx context.Context) GetActionsSecretsResultOutput {
	return o
}

func (o GetActionsSecretsResultOutput) FullName() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsSecretsResult) string { return v.FullName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetActionsSecretsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsSecretsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetActionsSecretsResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetActionsSecretsResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetActionsSecretsResultOutput) Secrets() GetActionsSecretsSecretArrayOutput {
	return o.ApplyT(func(v GetActionsSecretsResult) []GetActionsSecretsSecret { return v.Secrets }).(GetActionsSecretsSecretArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetActionsSecretsResultOutput{})
}