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
// # This resource can be imported using an ID made up of the secret name
//
// ```sh
//
//	$ pulumi import github:index/codespacesUserSecret:CodespacesUserSecret test_secret test_secret_name
//
// ```
//
//	NOTEthe implementation is limited in that it won't fetch the value of the `plaintext_value` or `encrypted_value` fields when importing. You may need to ignore changes for these as a workaround.
type CodespacesUserSecret struct {
	pulumi.CustomResourceState

	// Date of codespacesSecret creation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrOutput `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrOutput `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName pulumi.StringOutput `pulumi:"secretName"`
	// An array of repository ids that can access the user secret.
	SelectedRepositoryIds pulumi.IntArrayOutput `pulumi:"selectedRepositoryIds"`
	// Date of codespacesSecret update.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewCodespacesUserSecret registers a new resource with the given unique name, arguments, and options.
func NewCodespacesUserSecret(ctx *pulumi.Context,
	name string, args *CodespacesUserSecretArgs, opts ...pulumi.ResourceOption) (*CodespacesUserSecret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
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
	var resource CodespacesUserSecret
	err := ctx.RegisterResource("github:index/codespacesUserSecret:CodespacesUserSecret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCodespacesUserSecret gets an existing CodespacesUserSecret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCodespacesUserSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CodespacesUserSecretState, opts ...pulumi.ResourceOption) (*CodespacesUserSecret, error) {
	var resource CodespacesUserSecret
	err := ctx.ReadResource("github:index/codespacesUserSecret:CodespacesUserSecret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CodespacesUserSecret resources.
type codespacesUserSecretState struct {
	// Date of codespacesSecret creation.
	CreatedAt *string `pulumi:"createdAt"`
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue *string `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue *string `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName *string `pulumi:"secretName"`
	// An array of repository ids that can access the user secret.
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
	// Date of codespacesSecret update.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type CodespacesUserSecretState struct {
	// Date of codespacesSecret creation.
	CreatedAt pulumi.StringPtrInput
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrInput
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrInput
	// Name of the secret
	SecretName pulumi.StringPtrInput
	// An array of repository ids that can access the user secret.
	SelectedRepositoryIds pulumi.IntArrayInput
	// Date of codespacesSecret update.
	UpdatedAt pulumi.StringPtrInput
}

func (CodespacesUserSecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*codespacesUserSecretState)(nil)).Elem()
}

type codespacesUserSecretArgs struct {
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue *string `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue *string `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName string `pulumi:"secretName"`
	// An array of repository ids that can access the user secret.
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
}

// The set of arguments for constructing a CodespacesUserSecret resource.
type CodespacesUserSecretArgs struct {
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrInput
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrInput
	// Name of the secret
	SecretName pulumi.StringInput
	// An array of repository ids that can access the user secret.
	SelectedRepositoryIds pulumi.IntArrayInput
}

func (CodespacesUserSecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*codespacesUserSecretArgs)(nil)).Elem()
}

type CodespacesUserSecretInput interface {
	pulumi.Input

	ToCodespacesUserSecretOutput() CodespacesUserSecretOutput
	ToCodespacesUserSecretOutputWithContext(ctx context.Context) CodespacesUserSecretOutput
}

func (*CodespacesUserSecret) ElementType() reflect.Type {
	return reflect.TypeOf((**CodespacesUserSecret)(nil)).Elem()
}

func (i *CodespacesUserSecret) ToCodespacesUserSecretOutput() CodespacesUserSecretOutput {
	return i.ToCodespacesUserSecretOutputWithContext(context.Background())
}

func (i *CodespacesUserSecret) ToCodespacesUserSecretOutputWithContext(ctx context.Context) CodespacesUserSecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesUserSecretOutput)
}

func (i *CodespacesUserSecret) ToOutput(ctx context.Context) pulumix.Output[*CodespacesUserSecret] {
	return pulumix.Output[*CodespacesUserSecret]{
		OutputState: i.ToCodespacesUserSecretOutputWithContext(ctx).OutputState,
	}
}

// CodespacesUserSecretArrayInput is an input type that accepts CodespacesUserSecretArray and CodespacesUserSecretArrayOutput values.
// You can construct a concrete instance of `CodespacesUserSecretArrayInput` via:
//
//	CodespacesUserSecretArray{ CodespacesUserSecretArgs{...} }
type CodespacesUserSecretArrayInput interface {
	pulumi.Input

	ToCodespacesUserSecretArrayOutput() CodespacesUserSecretArrayOutput
	ToCodespacesUserSecretArrayOutputWithContext(context.Context) CodespacesUserSecretArrayOutput
}

type CodespacesUserSecretArray []CodespacesUserSecretInput

func (CodespacesUserSecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodespacesUserSecret)(nil)).Elem()
}

func (i CodespacesUserSecretArray) ToCodespacesUserSecretArrayOutput() CodespacesUserSecretArrayOutput {
	return i.ToCodespacesUserSecretArrayOutputWithContext(context.Background())
}

func (i CodespacesUserSecretArray) ToCodespacesUserSecretArrayOutputWithContext(ctx context.Context) CodespacesUserSecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesUserSecretArrayOutput)
}

func (i CodespacesUserSecretArray) ToOutput(ctx context.Context) pulumix.Output[[]*CodespacesUserSecret] {
	return pulumix.Output[[]*CodespacesUserSecret]{
		OutputState: i.ToCodespacesUserSecretArrayOutputWithContext(ctx).OutputState,
	}
}

// CodespacesUserSecretMapInput is an input type that accepts CodespacesUserSecretMap and CodespacesUserSecretMapOutput values.
// You can construct a concrete instance of `CodespacesUserSecretMapInput` via:
//
//	CodespacesUserSecretMap{ "key": CodespacesUserSecretArgs{...} }
type CodespacesUserSecretMapInput interface {
	pulumi.Input

	ToCodespacesUserSecretMapOutput() CodespacesUserSecretMapOutput
	ToCodespacesUserSecretMapOutputWithContext(context.Context) CodespacesUserSecretMapOutput
}

type CodespacesUserSecretMap map[string]CodespacesUserSecretInput

func (CodespacesUserSecretMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodespacesUserSecret)(nil)).Elem()
}

func (i CodespacesUserSecretMap) ToCodespacesUserSecretMapOutput() CodespacesUserSecretMapOutput {
	return i.ToCodespacesUserSecretMapOutputWithContext(context.Background())
}

func (i CodespacesUserSecretMap) ToCodespacesUserSecretMapOutputWithContext(ctx context.Context) CodespacesUserSecretMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesUserSecretMapOutput)
}

func (i CodespacesUserSecretMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CodespacesUserSecret] {
	return pulumix.Output[map[string]*CodespacesUserSecret]{
		OutputState: i.ToCodespacesUserSecretMapOutputWithContext(ctx).OutputState,
	}
}

type CodespacesUserSecretOutput struct{ *pulumi.OutputState }

func (CodespacesUserSecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CodespacesUserSecret)(nil)).Elem()
}

func (o CodespacesUserSecretOutput) ToCodespacesUserSecretOutput() CodespacesUserSecretOutput {
	return o
}

func (o CodespacesUserSecretOutput) ToCodespacesUserSecretOutputWithContext(ctx context.Context) CodespacesUserSecretOutput {
	return o
}

func (o CodespacesUserSecretOutput) ToOutput(ctx context.Context) pulumix.Output[*CodespacesUserSecret] {
	return pulumix.Output[*CodespacesUserSecret]{
		OutputState: o.OutputState,
	}
}

// Date of codespacesSecret creation.
func (o CodespacesUserSecretOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesUserSecret) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Encrypted value of the secret using the GitHub public key in Base64 format.
func (o CodespacesUserSecretOutput) EncryptedValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CodespacesUserSecret) pulumi.StringPtrOutput { return v.EncryptedValue }).(pulumi.StringPtrOutput)
}

// Plaintext value of the secret to be encrypted
func (o CodespacesUserSecretOutput) PlaintextValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CodespacesUserSecret) pulumi.StringPtrOutput { return v.PlaintextValue }).(pulumi.StringPtrOutput)
}

// Name of the secret
func (o CodespacesUserSecretOutput) SecretName() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesUserSecret) pulumi.StringOutput { return v.SecretName }).(pulumi.StringOutput)
}

// An array of repository ids that can access the user secret.
func (o CodespacesUserSecretOutput) SelectedRepositoryIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *CodespacesUserSecret) pulumi.IntArrayOutput { return v.SelectedRepositoryIds }).(pulumi.IntArrayOutput)
}

// Date of codespacesSecret update.
func (o CodespacesUserSecretOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesUserSecret) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type CodespacesUserSecretArrayOutput struct{ *pulumi.OutputState }

func (CodespacesUserSecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodespacesUserSecret)(nil)).Elem()
}

func (o CodespacesUserSecretArrayOutput) ToCodespacesUserSecretArrayOutput() CodespacesUserSecretArrayOutput {
	return o
}

func (o CodespacesUserSecretArrayOutput) ToCodespacesUserSecretArrayOutputWithContext(ctx context.Context) CodespacesUserSecretArrayOutput {
	return o
}

func (o CodespacesUserSecretArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CodespacesUserSecret] {
	return pulumix.Output[[]*CodespacesUserSecret]{
		OutputState: o.OutputState,
	}
}

func (o CodespacesUserSecretArrayOutput) Index(i pulumi.IntInput) CodespacesUserSecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CodespacesUserSecret {
		return vs[0].([]*CodespacesUserSecret)[vs[1].(int)]
	}).(CodespacesUserSecretOutput)
}

type CodespacesUserSecretMapOutput struct{ *pulumi.OutputState }

func (CodespacesUserSecretMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodespacesUserSecret)(nil)).Elem()
}

func (o CodespacesUserSecretMapOutput) ToCodespacesUserSecretMapOutput() CodespacesUserSecretMapOutput {
	return o
}

func (o CodespacesUserSecretMapOutput) ToCodespacesUserSecretMapOutputWithContext(ctx context.Context) CodespacesUserSecretMapOutput {
	return o
}

func (o CodespacesUserSecretMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CodespacesUserSecret] {
	return pulumix.Output[map[string]*CodespacesUserSecret]{
		OutputState: o.OutputState,
	}
}

func (o CodespacesUserSecretMapOutput) MapIndex(k pulumi.StringInput) CodespacesUserSecretOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CodespacesUserSecret {
		return vs[0].(map[string]*CodespacesUserSecret)[vs[1].(string)]
	}).(CodespacesUserSecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesUserSecretInput)(nil)).Elem(), &CodespacesUserSecret{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesUserSecretArrayInput)(nil)).Elem(), CodespacesUserSecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesUserSecretMapInput)(nil)).Elem(), CodespacesUserSecretMap{})
	pulumi.RegisterOutputType(CodespacesUserSecretOutput{})
	pulumi.RegisterOutputType(CodespacesUserSecretArrayOutput{})
	pulumi.RegisterOutputType(CodespacesUserSecretMapOutput{})
}
