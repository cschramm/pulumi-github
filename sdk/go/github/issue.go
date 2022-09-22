// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Issue struct {
	pulumi.CustomResourceState

	// List of Logins for Users to assign to this issue
	Assignees pulumi.StringArrayOutput `pulumi:"assignees"`
	Body      pulumi.StringPtrOutput   `pulumi:"body"`
	Etag      pulumi.StringOutput      `pulumi:"etag"`
	IssueId   pulumi.IntOutput         `pulumi:"issueId"`
	// List of names of labels on the issue
	Labels          pulumi.StringArrayOutput `pulumi:"labels"`
	MilestoneNumber pulumi.IntPtrOutput      `pulumi:"milestoneNumber"`
	Number          pulumi.IntOutput         `pulumi:"number"`
	Repository      pulumi.StringOutput      `pulumi:"repository"`
	Title           pulumi.StringOutput      `pulumi:"title"`
}

// NewIssue registers a new resource with the given unique name, arguments, and options.
func NewIssue(ctx *pulumi.Context,
	name string, args *IssueArgs, opts ...pulumi.ResourceOption) (*Issue, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Repository == nil {
		return nil, errors.New("invalid value for required argument 'Repository'")
	}
	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	var resource Issue
	err := ctx.RegisterResource("github:index/issue:Issue", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIssue gets an existing Issue resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIssue(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IssueState, opts ...pulumi.ResourceOption) (*Issue, error) {
	var resource Issue
	err := ctx.ReadResource("github:index/issue:Issue", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Issue resources.
type issueState struct {
	// List of Logins for Users to assign to this issue
	Assignees []string `pulumi:"assignees"`
	Body      *string  `pulumi:"body"`
	Etag      *string  `pulumi:"etag"`
	IssueId   *int     `pulumi:"issueId"`
	// List of names of labels on the issue
	Labels          []string `pulumi:"labels"`
	MilestoneNumber *int     `pulumi:"milestoneNumber"`
	Number          *int     `pulumi:"number"`
	Repository      *string  `pulumi:"repository"`
	Title           *string  `pulumi:"title"`
}

type IssueState struct {
	// List of Logins for Users to assign to this issue
	Assignees pulumi.StringArrayInput
	Body      pulumi.StringPtrInput
	Etag      pulumi.StringPtrInput
	IssueId   pulumi.IntPtrInput
	// List of names of labels on the issue
	Labels          pulumi.StringArrayInput
	MilestoneNumber pulumi.IntPtrInput
	Number          pulumi.IntPtrInput
	Repository      pulumi.StringPtrInput
	Title           pulumi.StringPtrInput
}

func (IssueState) ElementType() reflect.Type {
	return reflect.TypeOf((*issueState)(nil)).Elem()
}

type issueArgs struct {
	// List of Logins for Users to assign to this issue
	Assignees []string `pulumi:"assignees"`
	Body      *string  `pulumi:"body"`
	// List of names of labels on the issue
	Labels          []string `pulumi:"labels"`
	MilestoneNumber *int     `pulumi:"milestoneNumber"`
	Repository      string   `pulumi:"repository"`
	Title           string   `pulumi:"title"`
}

// The set of arguments for constructing a Issue resource.
type IssueArgs struct {
	// List of Logins for Users to assign to this issue
	Assignees pulumi.StringArrayInput
	Body      pulumi.StringPtrInput
	// List of names of labels on the issue
	Labels          pulumi.StringArrayInput
	MilestoneNumber pulumi.IntPtrInput
	Repository      pulumi.StringInput
	Title           pulumi.StringInput
}

func (IssueArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*issueArgs)(nil)).Elem()
}

type IssueInput interface {
	pulumi.Input

	ToIssueOutput() IssueOutput
	ToIssueOutputWithContext(ctx context.Context) IssueOutput
}

func (*Issue) ElementType() reflect.Type {
	return reflect.TypeOf((**Issue)(nil)).Elem()
}

func (i *Issue) ToIssueOutput() IssueOutput {
	return i.ToIssueOutputWithContext(context.Background())
}

func (i *Issue) ToIssueOutputWithContext(ctx context.Context) IssueOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IssueOutput)
}

// IssueArrayInput is an input type that accepts IssueArray and IssueArrayOutput values.
// You can construct a concrete instance of `IssueArrayInput` via:
//
//	IssueArray{ IssueArgs{...} }
type IssueArrayInput interface {
	pulumi.Input

	ToIssueArrayOutput() IssueArrayOutput
	ToIssueArrayOutputWithContext(context.Context) IssueArrayOutput
}

type IssueArray []IssueInput

func (IssueArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Issue)(nil)).Elem()
}

func (i IssueArray) ToIssueArrayOutput() IssueArrayOutput {
	return i.ToIssueArrayOutputWithContext(context.Background())
}

func (i IssueArray) ToIssueArrayOutputWithContext(ctx context.Context) IssueArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IssueArrayOutput)
}

// IssueMapInput is an input type that accepts IssueMap and IssueMapOutput values.
// You can construct a concrete instance of `IssueMapInput` via:
//
//	IssueMap{ "key": IssueArgs{...} }
type IssueMapInput interface {
	pulumi.Input

	ToIssueMapOutput() IssueMapOutput
	ToIssueMapOutputWithContext(context.Context) IssueMapOutput
}

type IssueMap map[string]IssueInput

func (IssueMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Issue)(nil)).Elem()
}

func (i IssueMap) ToIssueMapOutput() IssueMapOutput {
	return i.ToIssueMapOutputWithContext(context.Background())
}

func (i IssueMap) ToIssueMapOutputWithContext(ctx context.Context) IssueMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IssueMapOutput)
}

type IssueOutput struct{ *pulumi.OutputState }

func (IssueOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Issue)(nil)).Elem()
}

func (o IssueOutput) ToIssueOutput() IssueOutput {
	return o
}

func (o IssueOutput) ToIssueOutputWithContext(ctx context.Context) IssueOutput {
	return o
}

// List of Logins for Users to assign to this issue
func (o IssueOutput) Assignees() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Issue) pulumi.StringArrayOutput { return v.Assignees }).(pulumi.StringArrayOutput)
}

func (o IssueOutput) Body() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Issue) pulumi.StringPtrOutput { return v.Body }).(pulumi.StringPtrOutput)
}

func (o IssueOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *Issue) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o IssueOutput) IssueId() pulumi.IntOutput {
	return o.ApplyT(func(v *Issue) pulumi.IntOutput { return v.IssueId }).(pulumi.IntOutput)
}

// List of names of labels on the issue
func (o IssueOutput) Labels() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Issue) pulumi.StringArrayOutput { return v.Labels }).(pulumi.StringArrayOutput)
}

func (o IssueOutput) MilestoneNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Issue) pulumi.IntPtrOutput { return v.MilestoneNumber }).(pulumi.IntPtrOutput)
}

func (o IssueOutput) Number() pulumi.IntOutput {
	return o.ApplyT(func(v *Issue) pulumi.IntOutput { return v.Number }).(pulumi.IntOutput)
}

func (o IssueOutput) Repository() pulumi.StringOutput {
	return o.ApplyT(func(v *Issue) pulumi.StringOutput { return v.Repository }).(pulumi.StringOutput)
}

func (o IssueOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *Issue) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

type IssueArrayOutput struct{ *pulumi.OutputState }

func (IssueArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Issue)(nil)).Elem()
}

func (o IssueArrayOutput) ToIssueArrayOutput() IssueArrayOutput {
	return o
}

func (o IssueArrayOutput) ToIssueArrayOutputWithContext(ctx context.Context) IssueArrayOutput {
	return o
}

func (o IssueArrayOutput) Index(i pulumi.IntInput) IssueOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Issue {
		return vs[0].([]*Issue)[vs[1].(int)]
	}).(IssueOutput)
}

type IssueMapOutput struct{ *pulumi.OutputState }

func (IssueMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Issue)(nil)).Elem()
}

func (o IssueMapOutput) ToIssueMapOutput() IssueMapOutput {
	return o
}

func (o IssueMapOutput) ToIssueMapOutputWithContext(ctx context.Context) IssueMapOutput {
	return o
}

func (o IssueMapOutput) MapIndex(k pulumi.StringInput) IssueOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Issue {
		return vs[0].(map[string]*Issue)[vs[1].(string)]
	}).(IssueOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IssueInput)(nil)).Elem(), &Issue{})
	pulumi.RegisterInputType(reflect.TypeOf((*IssueArrayInput)(nil)).Elem(), IssueArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IssueMapInput)(nil)).Elem(), IssueMap{})
	pulumi.RegisterOutputType(IssueOutput{})
	pulumi.RegisterOutputType(IssueArrayOutput{})
	pulumi.RegisterOutputType(IssueMapOutput{})
}