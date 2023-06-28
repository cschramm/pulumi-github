// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := github.NewCodespacesOrganizationSecret(ctx, "exampleSecretCodespacesOrganizationSecret", &github.CodespacesOrganizationSecretArgs{
//				SecretName:     pulumi.String("example_secret_name"),
//				Visibility:     pulumi.String("private"),
//				PlaintextValue: pulumi.Any(_var.Some_secret_string),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = github.NewCodespacesOrganizationSecret(ctx, "exampleSecretIndex/codespacesOrganizationSecretCodespacesOrganizationSecret", &github.CodespacesOrganizationSecretArgs{
//				SecretName:     pulumi.String("example_secret_name"),
//				Visibility:     pulumi.String("private"),
//				EncryptedValue: pulumi.Any(_var.Some_encrypted_secret_string),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
//			repo, err := github.LookupRepository(ctx, &github.LookupRepositoryArgs{
//				FullName: pulumi.StringRef("my-org/repo"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = github.NewCodespacesOrganizationSecret(ctx, "exampleSecretCodespacesOrganizationSecret", &github.CodespacesOrganizationSecretArgs{
//				SecretName:     pulumi.String("example_secret_name"),
//				Visibility:     pulumi.String("selected"),
//				PlaintextValue: pulumi.Any(_var.Some_secret_string),
//				SelectedRepositoryIds: pulumi.IntArray{
//					*pulumi.Int(repo.RepoId),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = github.NewCodespacesOrganizationSecret(ctx, "exampleSecretIndex/codespacesOrganizationSecretCodespacesOrganizationSecret", &github.CodespacesOrganizationSecretArgs{
//				SecretName:     pulumi.String("example_secret_name"),
//				Visibility:     pulumi.String("selected"),
//				EncryptedValue: pulumi.Any(_var.Some_encrypted_secret_string),
//				SelectedRepositoryIds: pulumi.IntArray{
//					*pulumi.Int(repo.RepoId),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # This resource can be imported using an ID made up of the secret name
//
// ```sh
//
//	$ pulumi import github:index/codespacesOrganizationSecret:CodespacesOrganizationSecret test_secret test_secret_name
//
// ```
//
//	NOTEthe implementation is limited in that it won't fetch the value of the `plaintext_value` or `encrypted_value` fields when importing. You may need to ignore changes for these as a workaround.
type CodespacesOrganizationSecret struct {
	pulumi.CustomResourceState

	// Date of codespacesSecret creation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrOutput `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrOutput `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName pulumi.StringOutput `pulumi:"secretName"`
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds pulumi.IntArrayOutput `pulumi:"selectedRepositoryIds"`
	// Date of codespacesSecret update.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility pulumi.StringOutput `pulumi:"visibility"`
}

// NewCodespacesOrganizationSecret registers a new resource with the given unique name, arguments, and options.
func NewCodespacesOrganizationSecret(ctx *pulumi.Context,
	name string, args *CodespacesOrganizationSecretArgs, opts ...pulumi.ResourceOption) (*CodespacesOrganizationSecret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SecretName == nil {
		return nil, errors.New("invalid value for required argument 'SecretName'")
	}
	if args.Visibility == nil {
		return nil, errors.New("invalid value for required argument 'Visibility'")
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
	var resource CodespacesOrganizationSecret
	err := ctx.RegisterResource("github:index/codespacesOrganizationSecret:CodespacesOrganizationSecret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCodespacesOrganizationSecret gets an existing CodespacesOrganizationSecret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCodespacesOrganizationSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CodespacesOrganizationSecretState, opts ...pulumi.ResourceOption) (*CodespacesOrganizationSecret, error) {
	var resource CodespacesOrganizationSecret
	err := ctx.ReadResource("github:index/codespacesOrganizationSecret:CodespacesOrganizationSecret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CodespacesOrganizationSecret resources.
type codespacesOrganizationSecretState struct {
	// Date of codespacesSecret creation.
	CreatedAt *string `pulumi:"createdAt"`
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue *string `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue *string `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName *string `pulumi:"secretName"`
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
	// Date of codespacesSecret update.
	UpdatedAt *string `pulumi:"updatedAt"`
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility *string `pulumi:"visibility"`
}

type CodespacesOrganizationSecretState struct {
	// Date of codespacesSecret creation.
	CreatedAt pulumi.StringPtrInput
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrInput
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrInput
	// Name of the secret
	SecretName pulumi.StringPtrInput
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds pulumi.IntArrayInput
	// Date of codespacesSecret update.
	UpdatedAt pulumi.StringPtrInput
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility pulumi.StringPtrInput
}

func (CodespacesOrganizationSecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*codespacesOrganizationSecretState)(nil)).Elem()
}

type codespacesOrganizationSecretArgs struct {
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue *string `pulumi:"encryptedValue"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue *string `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName string `pulumi:"secretName"`
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility string `pulumi:"visibility"`
}

// The set of arguments for constructing a CodespacesOrganizationSecret resource.
type CodespacesOrganizationSecretArgs struct {
	// Encrypted value of the secret using the GitHub public key in Base64 format.
	EncryptedValue pulumi.StringPtrInput
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrInput
	// Name of the secret
	SecretName pulumi.StringInput
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds pulumi.IntArrayInput
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility pulumi.StringInput
}

func (CodespacesOrganizationSecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*codespacesOrganizationSecretArgs)(nil)).Elem()
}

type CodespacesOrganizationSecretInput interface {
	pulumi.Input

	ToCodespacesOrganizationSecretOutput() CodespacesOrganizationSecretOutput
	ToCodespacesOrganizationSecretOutputWithContext(ctx context.Context) CodespacesOrganizationSecretOutput
}

func (*CodespacesOrganizationSecret) ElementType() reflect.Type {
	return reflect.TypeOf((**CodespacesOrganizationSecret)(nil)).Elem()
}

func (i *CodespacesOrganizationSecret) ToCodespacesOrganizationSecretOutput() CodespacesOrganizationSecretOutput {
	return i.ToCodespacesOrganizationSecretOutputWithContext(context.Background())
}

func (i *CodespacesOrganizationSecret) ToCodespacesOrganizationSecretOutputWithContext(ctx context.Context) CodespacesOrganizationSecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesOrganizationSecretOutput)
}

// CodespacesOrganizationSecretArrayInput is an input type that accepts CodespacesOrganizationSecretArray and CodespacesOrganizationSecretArrayOutput values.
// You can construct a concrete instance of `CodespacesOrganizationSecretArrayInput` via:
//
//	CodespacesOrganizationSecretArray{ CodespacesOrganizationSecretArgs{...} }
type CodespacesOrganizationSecretArrayInput interface {
	pulumi.Input

	ToCodespacesOrganizationSecretArrayOutput() CodespacesOrganizationSecretArrayOutput
	ToCodespacesOrganizationSecretArrayOutputWithContext(context.Context) CodespacesOrganizationSecretArrayOutput
}

type CodespacesOrganizationSecretArray []CodespacesOrganizationSecretInput

func (CodespacesOrganizationSecretArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodespacesOrganizationSecret)(nil)).Elem()
}

func (i CodespacesOrganizationSecretArray) ToCodespacesOrganizationSecretArrayOutput() CodespacesOrganizationSecretArrayOutput {
	return i.ToCodespacesOrganizationSecretArrayOutputWithContext(context.Background())
}

func (i CodespacesOrganizationSecretArray) ToCodespacesOrganizationSecretArrayOutputWithContext(ctx context.Context) CodespacesOrganizationSecretArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesOrganizationSecretArrayOutput)
}

// CodespacesOrganizationSecretMapInput is an input type that accepts CodespacesOrganizationSecretMap and CodespacesOrganizationSecretMapOutput values.
// You can construct a concrete instance of `CodespacesOrganizationSecretMapInput` via:
//
//	CodespacesOrganizationSecretMap{ "key": CodespacesOrganizationSecretArgs{...} }
type CodespacesOrganizationSecretMapInput interface {
	pulumi.Input

	ToCodespacesOrganizationSecretMapOutput() CodespacesOrganizationSecretMapOutput
	ToCodespacesOrganizationSecretMapOutputWithContext(context.Context) CodespacesOrganizationSecretMapOutput
}

type CodespacesOrganizationSecretMap map[string]CodespacesOrganizationSecretInput

func (CodespacesOrganizationSecretMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodespacesOrganizationSecret)(nil)).Elem()
}

func (i CodespacesOrganizationSecretMap) ToCodespacesOrganizationSecretMapOutput() CodespacesOrganizationSecretMapOutput {
	return i.ToCodespacesOrganizationSecretMapOutputWithContext(context.Background())
}

func (i CodespacesOrganizationSecretMap) ToCodespacesOrganizationSecretMapOutputWithContext(ctx context.Context) CodespacesOrganizationSecretMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CodespacesOrganizationSecretMapOutput)
}

type CodespacesOrganizationSecretOutput struct{ *pulumi.OutputState }

func (CodespacesOrganizationSecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CodespacesOrganizationSecret)(nil)).Elem()
}

func (o CodespacesOrganizationSecretOutput) ToCodespacesOrganizationSecretOutput() CodespacesOrganizationSecretOutput {
	return o
}

func (o CodespacesOrganizationSecretOutput) ToCodespacesOrganizationSecretOutputWithContext(ctx context.Context) CodespacesOrganizationSecretOutput {
	return o
}

// Date of codespacesSecret creation.
func (o CodespacesOrganizationSecretOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesOrganizationSecret) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Encrypted value of the secret using the GitHub public key in Base64 format.
func (o CodespacesOrganizationSecretOutput) EncryptedValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CodespacesOrganizationSecret) pulumi.StringPtrOutput { return v.EncryptedValue }).(pulumi.StringPtrOutput)
}

// Plaintext value of the secret to be encrypted
func (o CodespacesOrganizationSecretOutput) PlaintextValue() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CodespacesOrganizationSecret) pulumi.StringPtrOutput { return v.PlaintextValue }).(pulumi.StringPtrOutput)
}

// Name of the secret
func (o CodespacesOrganizationSecretOutput) SecretName() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesOrganizationSecret) pulumi.StringOutput { return v.SecretName }).(pulumi.StringOutput)
}

// An array of repository ids that can access the organization secret.
func (o CodespacesOrganizationSecretOutput) SelectedRepositoryIds() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *CodespacesOrganizationSecret) pulumi.IntArrayOutput { return v.SelectedRepositoryIds }).(pulumi.IntArrayOutput)
}

// Date of codespacesSecret update.
func (o CodespacesOrganizationSecretOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesOrganizationSecret) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// Configures the access that repositories have to the organization secret.
// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
func (o CodespacesOrganizationSecretOutput) Visibility() pulumi.StringOutput {
	return o.ApplyT(func(v *CodespacesOrganizationSecret) pulumi.StringOutput { return v.Visibility }).(pulumi.StringOutput)
}

type CodespacesOrganizationSecretArrayOutput struct{ *pulumi.OutputState }

func (CodespacesOrganizationSecretArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CodespacesOrganizationSecret)(nil)).Elem()
}

func (o CodespacesOrganizationSecretArrayOutput) ToCodespacesOrganizationSecretArrayOutput() CodespacesOrganizationSecretArrayOutput {
	return o
}

func (o CodespacesOrganizationSecretArrayOutput) ToCodespacesOrganizationSecretArrayOutputWithContext(ctx context.Context) CodespacesOrganizationSecretArrayOutput {
	return o
}

func (o CodespacesOrganizationSecretArrayOutput) Index(i pulumi.IntInput) CodespacesOrganizationSecretOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CodespacesOrganizationSecret {
		return vs[0].([]*CodespacesOrganizationSecret)[vs[1].(int)]
	}).(CodespacesOrganizationSecretOutput)
}

type CodespacesOrganizationSecretMapOutput struct{ *pulumi.OutputState }

func (CodespacesOrganizationSecretMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CodespacesOrganizationSecret)(nil)).Elem()
}

func (o CodespacesOrganizationSecretMapOutput) ToCodespacesOrganizationSecretMapOutput() CodespacesOrganizationSecretMapOutput {
	return o
}

func (o CodespacesOrganizationSecretMapOutput) ToCodespacesOrganizationSecretMapOutputWithContext(ctx context.Context) CodespacesOrganizationSecretMapOutput {
	return o
}

func (o CodespacesOrganizationSecretMapOutput) MapIndex(k pulumi.StringInput) CodespacesOrganizationSecretOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CodespacesOrganizationSecret {
		return vs[0].(map[string]*CodespacesOrganizationSecret)[vs[1].(string)]
	}).(CodespacesOrganizationSecretOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesOrganizationSecretInput)(nil)).Elem(), &CodespacesOrganizationSecret{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesOrganizationSecretArrayInput)(nil)).Elem(), CodespacesOrganizationSecretArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CodespacesOrganizationSecretMapInput)(nil)).Elem(), CodespacesOrganizationSecretMap{})
	pulumi.RegisterOutputType(CodespacesOrganizationSecretOutput{})
	pulumi.RegisterOutputType(CodespacesOrganizationSecretArrayOutput{})
	pulumi.RegisterOutputType(CodespacesOrganizationSecretMapOutput{})
}
