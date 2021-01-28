// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type ActionsOrganizationSecret struct {
	pulumi.CustomResourceState

	// Date of actionsSecret creation.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringOutput `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName pulumi.StringOutput `pulumi:"secretName"`
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds pulumi.IntArrayOutput `pulumi:"selectedRepositoryIds"`
	// Date of actionsSecret update.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility pulumi.StringOutput `pulumi:"visibility"`
}

// NewActionsOrganizationSecret registers a new resource with the given unique name, arguments, and options.
func NewActionsOrganizationSecret(ctx *pulumi.Context,
	name string, args *ActionsOrganizationSecretArgs, opts ...pulumi.ResourceOption) (*ActionsOrganizationSecret, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PlaintextValue == nil {
		return nil, errors.New("invalid value for required argument 'PlaintextValue'")
	}
	if args.SecretName == nil {
		return nil, errors.New("invalid value for required argument 'SecretName'")
	}
	if args.Visibility == nil {
		return nil, errors.New("invalid value for required argument 'Visibility'")
	}
	var resource ActionsOrganizationSecret
	err := ctx.RegisterResource("github:index/actionsOrganizationSecret:ActionsOrganizationSecret", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetActionsOrganizationSecret gets an existing ActionsOrganizationSecret resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetActionsOrganizationSecret(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActionsOrganizationSecretState, opts ...pulumi.ResourceOption) (*ActionsOrganizationSecret, error) {
	var resource ActionsOrganizationSecret
	err := ctx.ReadResource("github:index/actionsOrganizationSecret:ActionsOrganizationSecret", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ActionsOrganizationSecret resources.
type actionsOrganizationSecretState struct {
	// Date of actionsSecret creation.
	CreatedAt *string `pulumi:"createdAt"`
	// Plaintext value of the secret to be encrypted
	PlaintextValue *string `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName *string `pulumi:"secretName"`
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
	// Date of actionsSecret update.
	UpdatedAt *string `pulumi:"updatedAt"`
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility *string `pulumi:"visibility"`
}

type ActionsOrganizationSecretState struct {
	// Date of actionsSecret creation.
	CreatedAt pulumi.StringPtrInput
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringPtrInput
	// Name of the secret
	SecretName pulumi.StringPtrInput
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds pulumi.IntArrayInput
	// Date of actionsSecret update.
	UpdatedAt pulumi.StringPtrInput
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility pulumi.StringPtrInput
}

func (ActionsOrganizationSecretState) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsOrganizationSecretState)(nil)).Elem()
}

type actionsOrganizationSecretArgs struct {
	// Plaintext value of the secret to be encrypted
	PlaintextValue string `pulumi:"plaintextValue"`
	// Name of the secret
	SecretName string `pulumi:"secretName"`
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds []int `pulumi:"selectedRepositoryIds"`
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility string `pulumi:"visibility"`
}

// The set of arguments for constructing a ActionsOrganizationSecret resource.
type ActionsOrganizationSecretArgs struct {
	// Plaintext value of the secret to be encrypted
	PlaintextValue pulumi.StringInput
	// Name of the secret
	SecretName pulumi.StringInput
	// An array of repository ids that can access the organization secret.
	SelectedRepositoryIds pulumi.IntArrayInput
	// Configures the access that repositories have to the organization secret.
	// Must be one of `all`, `private`, `selected`. `selectedRepositoryIds` is required if set to `selected`.
	Visibility pulumi.StringInput
}

func (ActionsOrganizationSecretArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*actionsOrganizationSecretArgs)(nil)).Elem()
}

type ActionsOrganizationSecretInput interface {
	pulumi.Input

	ToActionsOrganizationSecretOutput() ActionsOrganizationSecretOutput
	ToActionsOrganizationSecretOutputWithContext(ctx context.Context) ActionsOrganizationSecretOutput
}

func (*ActionsOrganizationSecret) ElementType() reflect.Type {
	return reflect.TypeOf((*ActionsOrganizationSecret)(nil))
}

func (i *ActionsOrganizationSecret) ToActionsOrganizationSecretOutput() ActionsOrganizationSecretOutput {
	return i.ToActionsOrganizationSecretOutputWithContext(context.Background())
}

func (i *ActionsOrganizationSecret) ToActionsOrganizationSecretOutputWithContext(ctx context.Context) ActionsOrganizationSecretOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionsOrganizationSecretOutput)
}

type ActionsOrganizationSecretOutput struct {
	*pulumi.OutputState
}

func (ActionsOrganizationSecretOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ActionsOrganizationSecret)(nil))
}

func (o ActionsOrganizationSecretOutput) ToActionsOrganizationSecretOutput() ActionsOrganizationSecretOutput {
	return o
}

func (o ActionsOrganizationSecretOutput) ToActionsOrganizationSecretOutputWithContext(ctx context.Context) ActionsOrganizationSecretOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ActionsOrganizationSecretOutput{})
}
