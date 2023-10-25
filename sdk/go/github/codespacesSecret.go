// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-github/sdk/v5/go/github/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Import
//
// This resource can be imported using an ID made up of the `repository` and `secret_name`:
//
// ```sh
//
//	$ pulumi import github:index/codespacesSecret:CodespacesSecret example_secret <repository>/<secret_name>
//
// ```
//
//	NOTEthe implementation is limited in that it won't fetch the value of the `plaintext_value` or `encrypted_value` fields when importing. You may need to ignore changes for these as a workaround.
type CodespacesSecret struct {
	pulumi.CustomResourceState

	// Date of codespacesSecret creation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrOutput `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrOutput `pulumi:"plaintextValue"`
	// Name of the repository
	Repository pulumi.StringOutput `pulumi:"repository"`
	// Name of the secret
	SecretName pulumi.StringOutput `pulumi:"secretName"`
	// Date of codespacesSecret update.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewCodespacesSecret registers a new resource with the given unique name, arguments, and options.
func NewCodespacesSecret(ctx *pulumi.Context,
	name string, args *CodespacesSecretArgs, opts ...pulumi.ResourceOption) (*CodespacesSecret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Repository == nil {
		return nil, errors.New("invalid value for required argument 'Repository'")
	}
	if args.SecretName == nil {
		return nil, errors.New("invalid value for required argument 'SecretName'")
	}
	if args.EncryptedValue != nil {
		args.EncryptedValue = pulumi.ToSecret(args.EncryptedValue).(pulumi.StringPtrInput)
	}
	if args.PlaintextValue != nil {
		args.PlaintextValue = pulumi.ToSecret(args.PlaintextValue).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"encryptedValue",
		"plaintextValue",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CodespacesSecret
	err := ctx.RegisterResource("github:index/codespacesSecret:CodespacesSecret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCodespacesSecret gets an existing CodespacesSecret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCodespacesSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CodespacesSecretState, opts ...pulumi.ResourceOption) (*CodespacesSecret, error) {
	var resource CodespacesSecret
	err := ctx.ReadResource("github:index/codespacesSecret:CodespacesSecret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CodespacesSecret resources.
type codespacesSecretState struct {
	// Date of codespacesSecret creation.
	CreatedAt *string `pulumi:"createdAt"`
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue *string `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue *string `pulumi:"plaintextValue"`
	// Name of the repository
	Repository *string `pulumi:"repository"`
	// Name of the secret
	SecretName *string `pulumi:"secretName"`
	// Date of codespacesSecret update.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type CodespacesSecretState struct {
	// Date of codespacesSecret creation.
	CreatedAt pulumi.StringPtrInput
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrInput
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrInput
	// Name of the repository
	Repository pulumi.StringPtrInput
	// Name of the secret
	SecretName pulumi.StringPtrInput
	// Date of codespacesSecret update.
	UpdatedAt pulumi.StringPtrInput
}

func (CodespacesSecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*codespacesSecretState)(nil)).Elem()
}

type codespacesSecretArgs struct {
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue *string `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue *string `pulumi:"plaintextValue"`
	// Name of the repository
	Repository string `pulumi:"repository"`
	// Name of the secret
	SecretName string `pulumi:"secretName"`
}

// The set of arguments for constructing a CodespacesSecret resource.
type CodespacesSecretArgs struct {
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrInput
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrInput
	// Name of the repository
	Repository pulumi.StringInput
	// Name of the secret
	SecretName pulumi.StringInput
}

func (CodespacesSecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*codespacesSecretArgs)(nil)).Elem()
}

type CodespacesSecretInput interface {
	pulumi.Input

	ToCodespacesSecretOutput() CodespacesSecretOutput
	ToCodespacesSecretOutputWithContext(ctx context.Context) CodespacesSecretOutput
}

func (*CodespacesSecret) ElementType() reflect.Type {
	return reflect.TypeOf((**CodespacesSecret)(nil)).Elem()
}

func (i *CodespacesSecret) ToCodespacesSecretOutput() CodespacesSecretOutput {
	return i.ToCodespacesSecretOutputWithContext(context.Background())
}

func (i *CodespacesSecret) ToCodespacesSecretOutputWithContext(ctx context.Context) CodespacesSecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesSecretOutput)
}

func (i *CodespacesSecret) ToOutput(ctx context.Context) pulumix.Output[*CodespacesSecret] {
	return pulumix.Output[*CodespacesSecret]{
		OutputState: i.ToCodespacesSecretOutputWithContext(ctx).OutputState,
	}
}

// CodespacesSecretArrayInput is an input type that accepts CodespacesSecretArray and CodespacesSecretArrayOutput values.
// You can construct a concrete instance of `CodespacesSecretArrayInput` via:
//
//	CodespacesSecretArray{ CodespacesSecretArgs{...} }
type CodespacesSecretArrayInput interface {
	pulumi.Input

	ToCodespacesSecretArrayOutput() CodespacesSecretArrayOutput
	ToCodespacesSecretArrayOutputWithContext(context.Context) CodespacesSecretArrayOutput
}

type CodespacesSecretArray []CodespacesSecretInput

func (CodespacesSecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodespacesSecret)(nil)).Elem()
}

func (i CodespacesSecretArray) ToCodespacesSecretArrayOutput() CodespacesSecretArrayOutput {
	return i.ToCodespacesSecretArrayOutputWithContext(context.Background())
}

func (i CodespacesSecretArray) ToCodespacesSecretArrayOutputWithContext(ctx context.Context) CodespacesSecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesSecretArrayOutput)
}

func (i CodespacesSecretArray) ToOutput(ctx context.Context) pulumix.Output[[]*CodespacesSecret] {
	return pulumix.Output[[]*CodespacesSecret]{
		OutputState: i.ToCodespacesSecretArrayOutputWithContext(ctx).OutputState,
	}
}

// CodespacesSecretMapInput is an input type that accepts CodespacesSecretMap and CodespacesSecretMapOutput values.
// You can construct a concrete instance of `CodespacesSecretMapInput` via:
//
//	CodespacesSecretMap{ "key": CodespacesSecretArgs{...} }
type CodespacesSecretMapInput interface {
	pulumi.Input

	ToCodespacesSecretMapOutput() CodespacesSecretMapOutput
	ToCodespacesSecretMapOutputWithContext(context.Context) CodespacesSecretMapOutput
}

type CodespacesSecretMap map[string]CodespacesSecretInput

func (CodespacesSecretMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodespacesSecret)(nil)).Elem()
}

func (i CodespacesSecretMap) ToCodespacesSecretMapOutput() CodespacesSecretMapOutput {
	return i.ToCodespacesSecretMapOutputWithContext(context.Background())
}

func (i CodespacesSecretMap) ToCodespacesSecretMapOutputWithContext(ctx context.Context) CodespacesSecretMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesSecretMapOutput)
}

func (i CodespacesSecretMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CodespacesSecret] {
	return pulumix.Output[map[string]*CodespacesSecret]{
		OutputState: i.ToCodespacesSecretMapOutputWithContext(ctx).OutputState,
	}
}

type CodespacesSecretOutput struct{ *pulumi.OutputState }

func (CodespacesSecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CodespacesSecret)(nil)).Elem()
}

func (o CodespacesSecretOutput) ToCodespacesSecretOutput() CodespacesSecretOutput {
	return o
}

func (o CodespacesSecretOutput) ToCodespacesSecretOutputWithContext(ctx context.Context) CodespacesSecretOutput {
	return o
}

func (o CodespacesSecretOutput) ToOutput(ctx context.Context) pulumix.Output[*CodespacesSecret] {
	return pulumix.Output[*CodespacesSecret]{
		OutputState: o.OutputState,
	}
}

// Date of codespacesSecret creation.
func (o CodespacesSecretOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesSecret) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Encrypted value of the secret using the GitHub public key in Base64 format.
func (o CodespacesSecretOutput) EncryptedValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CodespacesSecret) pulumi.StringPtrOutput { return v.EncryptedValue }).(pulumi.StringPtrOutput)
}

// Plaintext value of the secret to be encrypted
func (o CodespacesSecretOutput) PlaintextValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CodespacesSecret) pulumi.StringPtrOutput { return v.PlaintextValue }).(pulumi.StringPtrOutput)
}

// Name of the repository
func (o CodespacesSecretOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesSecret) pulumi.StringOutput { return v.Repository }).(pulumi.StringOutput)
}

// Name of the secret
func (o CodespacesSecretOutput) SecretName() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesSecret) pulumi.StringOutput { return v.SecretName }).(pulumi.StringOutput)
}

// Date of codespacesSecret update.
func (o CodespacesSecretOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesSecret) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type CodespacesSecretArrayOutput struct{ *pulumi.OutputState }

func (CodespacesSecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodespacesSecret)(nil)).Elem()
}

func (o CodespacesSecretArrayOutput) ToCodespacesSecretArrayOutput() CodespacesSecretArrayOutput {
	return o
}

func (o CodespacesSecretArrayOutput) ToCodespacesSecretArrayOutputWithContext(ctx context.Context) CodespacesSecretArrayOutput {
	return o
}

func (o CodespacesSecretArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CodespacesSecret] {
	return pulumix.Output[[]*CodespacesSecret]{
		OutputState: o.OutputState,
	}
}

func (o CodespacesSecretArrayOutput) Index(i pulumi.IntInput) CodespacesSecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CodespacesSecret {
		return vs[0].([]*CodespacesSecret)[vs[1].(int)]
	}).(CodespacesSecretOutput)
}

type CodespacesSecretMapOutput struct{ *pulumi.OutputState }

func (CodespacesSecretMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodespacesSecret)(nil)).Elem()
}

func (o CodespacesSecretMapOutput) ToCodespacesSecretMapOutput() CodespacesSecretMapOutput {
	return o
}

func (o CodespacesSecretMapOutput) ToCodespacesSecretMapOutputWithContext(ctx context.Context) CodespacesSecretMapOutput {
	return o
}

func (o CodespacesSecretMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CodespacesSecret] {
	return pulumix.Output[map[string]*CodespacesSecret]{
		OutputState: o.OutputState,
	}
}

func (o CodespacesSecretMapOutput) MapIndex(k pulumi.StringInput) CodespacesSecretOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CodespacesSecret {
		return vs[0].(map[string]*CodespacesSecret)[vs[1].(string)]
	}).(CodespacesSecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesSecretInput)(nil)).Elem(), &CodespacesSecret{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesSecretArrayInput)(nil)).Elem(), CodespacesSecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesSecretMapInput)(nil)).Elem(), CodespacesSecretMap{})
	pulumi.RegisterOutputType(CodespacesSecretOutput{})
	pulumi.RegisterOutputType(CodespacesSecretArrayOutput{})
	pulumi.RegisterOutputType(CodespacesSecretMapOutput{})
}
