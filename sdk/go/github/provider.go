// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The provider type for the github package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.BaseUrl == nil {
		args.BaseUrl = pulumi.StringPtr(getEnvOrDefault("https://api.github.com/", nil, "GITHUB_BASE_URL").(string))
	}
	if args.Organization == nil {
		args.Organization = pulumi.StringPtr(getEnvOrDefault("", nil, "GITHUB_ORGANIZATION").(string))
	}
	if args.Token == nil {
		args.Token = pulumi.StringPtr(getEnvOrDefault("", nil, "GITHUB_TOKEN").(string))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:github", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The GitHub Base API URL
	BaseUrl *string `pulumi:"baseUrl"`
	// Enable `insecure` mode for testing purposes
	Insecure *bool `pulumi:"insecure"`
	// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
	Organization *string `pulumi:"organization"`
	// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
	Owner *string `pulumi:"owner"`
	// The OAuth token used to connect to GitHub. `anonymous` mode is enabled if `token` is not configured.
	Token *string `pulumi:"token"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The GitHub Base API URL
	BaseUrl pulumi.StringPtrInput
	// Enable `insecure` mode for testing purposes
	Insecure pulumi.BoolPtrInput
	// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
	Organization pulumi.StringPtrInput
	// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
	Owner pulumi.StringPtrInput
	// The OAuth token used to connect to GitHub. `anonymous` mode is enabled if `token` is not configured.
	Token pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct {
	*pulumi.OutputState
}

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Provider)(nil))
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ProviderOutput{})
}
