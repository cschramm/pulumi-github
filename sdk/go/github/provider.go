// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the github package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The GitHub Base API URL
	BaseUrl pulumi.StringPtrOutput `pulumi:"baseUrl"`
	// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
	//
	// Deprecated: Use owner (or GITHUB_OWNER) instead of organization (or GITHUB_ORGANIZATION)
	Organization pulumi.StringPtrOutput `pulumi:"organization"`
	// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
	Owner pulumi.StringPtrOutput `pulumi:"owner"`
	// The OAuth token used to connect to GitHub. Anonymous mode is enabled if both `token` and `app_auth` are not set.
	Token pulumi.StringPtrOutput `pulumi:"token"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.BaseUrl == nil {
		if d := getEnvOrDefault("https://api.github.com/", nil, "GITHUB_BASE_URL"); d != nil {
			args.BaseUrl = pulumi.StringPtr(d.(string))
		}
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:github", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The GitHub App credentials used to connect to GitHub. Conflicts with `token`. Anonymous mode is enabled if both `token`
	// and `app_auth` are not set.
	AppAuth *ProviderAppAuth `pulumi:"appAuth"`
	// The GitHub Base API URL
	BaseUrl *string `pulumi:"baseUrl"`
	// Enable `insecure` mode for testing purposes
	Insecure *bool `pulumi:"insecure"`
	// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
	//
	// Deprecated: Use owner (or GITHUB_OWNER) instead of organization (or GITHUB_ORGANIZATION)
	Organization *string `pulumi:"organization"`
	// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
	Owner *string `pulumi:"owner"`
	// Allow the provider to make parallel API calls to GitHub. You may want to set it to true when you have a private Github
	// Enterprise without strict rate limits. Although, it is not possible to enable this setting on github.com because we
	// enforce the respect of github.com's best practices to avoid hitting abuse rate limitsDefaults to false if not set
	ParallelRequests *bool `pulumi:"parallelRequests"`
	// Amount of time in milliseconds to sleep in between non-write requests to GitHub API. Defaults to 0ms if not set.
	ReadDelayMs *int `pulumi:"readDelayMs"`
	// The OAuth token used to connect to GitHub. Anonymous mode is enabled if both `token` and `app_auth` are not set.
	Token *string `pulumi:"token"`
	// Amount of time in milliseconds to sleep in between writes to GitHub API. Defaults to 1000ms or 1s if not set.
	WriteDelayMs *int `pulumi:"writeDelayMs"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The GitHub App credentials used to connect to GitHub. Conflicts with `token`. Anonymous mode is enabled if both `token`
	// and `app_auth` are not set.
	AppAuth ProviderAppAuthPtrInput
	// The GitHub Base API URL
	BaseUrl pulumi.StringPtrInput
	// Enable `insecure` mode for testing purposes
	Insecure pulumi.BoolPtrInput
	// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
	//
	// Deprecated: Use owner (or GITHUB_OWNER) instead of organization (or GITHUB_ORGANIZATION)
	Organization pulumi.StringPtrInput
	// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
	Owner pulumi.StringPtrInput
	// Allow the provider to make parallel API calls to GitHub. You may want to set it to true when you have a private Github
	// Enterprise without strict rate limits. Although, it is not possible to enable this setting on github.com because we
	// enforce the respect of github.com's best practices to avoid hitting abuse rate limitsDefaults to false if not set
	ParallelRequests pulumi.BoolPtrInput
	// Amount of time in milliseconds to sleep in between non-write requests to GitHub API. Defaults to 0ms if not set.
	ReadDelayMs pulumi.IntPtrInput
	// The OAuth token used to connect to GitHub. Anonymous mode is enabled if both `token` and `app_auth` are not set.
	Token pulumi.StringPtrInput
	// Amount of time in milliseconds to sleep in between writes to GitHub API. Defaults to 1000ms or 1s if not set.
	WriteDelayMs pulumi.IntPtrInput
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
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The GitHub Base API URL
func (o ProviderOutput) BaseUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.BaseUrl }).(pulumi.StringPtrOutput)
}

// The GitHub organization name to manage. Use this field instead of `owner` when managing organization accounts.
//
// Deprecated: Use owner (or GITHUB_OWNER) instead of organization (or GITHUB_ORGANIZATION)
func (o ProviderOutput) Organization() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Organization }).(pulumi.StringPtrOutput)
}

// The GitHub owner name to manage. Use this field instead of `organization` when managing individual accounts.
func (o ProviderOutput) Owner() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Owner }).(pulumi.StringPtrOutput)
}

// The OAuth token used to connect to GitHub. Anonymous mode is enabled if both `token` and `app_auth` are not set.
func (o ProviderOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Token }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
