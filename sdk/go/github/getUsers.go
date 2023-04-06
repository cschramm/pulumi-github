// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about multiple GitHub users at once.
//
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
//			example, err := github.GetUsers(ctx, &github.GetUsersArgs{
//				Usernames: []string{
//					"example1",
//					"example2",
//					"example3",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("validUsers", example.Logins)
//			ctx.Export("invalidUsers", example.UnknownLogins)
//			return nil
//		})
//	}
//
// ```
func GetUsers(ctx *pulumi.Context, args *GetUsersArgs, opts ...pulumi.InvokeOption) (*GetUsersResult, error) {
	var rv GetUsersResult
	err := ctx.Invoke("github:index/getUsers:getUsers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUsers.
type GetUsersArgs struct {
	// List of usernames.
	Usernames []string `pulumi:"usernames"`
}

// A collection of values returned by getUsers.
type GetUsersResult struct {
	// list of the user's publicly visible profile email (will be empty string in case if user decided not to show it).
	Emails []string `pulumi:"emails"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// list of logins of users that could be found.
	Logins []string `pulumi:"logins"`
	// list of Node IDs of users that could be found.
	NodeIds []string `pulumi:"nodeIds"`
	// list of logins without matching user.
	UnknownLogins []string `pulumi:"unknownLogins"`
	Usernames     []string `pulumi:"usernames"`
}

func GetUsersOutput(ctx *pulumi.Context, args GetUsersOutputArgs, opts ...pulumi.InvokeOption) GetUsersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetUsersResult, error) {
			args := v.(GetUsersArgs)
			r, err := GetUsers(ctx, &args, opts...)
			var s GetUsersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetUsersResultOutput)
}

// A collection of arguments for invoking getUsers.
type GetUsersOutputArgs struct {
	// List of usernames.
	Usernames pulumi.StringArrayInput `pulumi:"usernames"`
}

func (GetUsersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersArgs)(nil)).Elem()
}

// A collection of values returned by getUsers.
type GetUsersResultOutput struct{ *pulumi.OutputState }

func (GetUsersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUsersResult)(nil)).Elem()
}

func (o GetUsersResultOutput) ToGetUsersResultOutput() GetUsersResultOutput {
	return o
}

func (o GetUsersResultOutput) ToGetUsersResultOutputWithContext(ctx context.Context) GetUsersResultOutput {
	return o
}

// list of the user's publicly visible profile email (will be empty string in case if user decided not to show it).
func (o GetUsersResultOutput) Emails() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []string { return v.Emails }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetUsersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUsersResult) string { return v.Id }).(pulumi.StringOutput)
}

// list of logins of users that could be found.
func (o GetUsersResultOutput) Logins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []string { return v.Logins }).(pulumi.StringArrayOutput)
}

// list of Node IDs of users that could be found.
func (o GetUsersResultOutput) NodeIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []string { return v.NodeIds }).(pulumi.StringArrayOutput)
}

// list of logins without matching user.
func (o GetUsersResultOutput) UnknownLogins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []string { return v.UnknownLogins }).(pulumi.StringArrayOutput)
}

func (o GetUsersResultOutput) Usernames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetUsersResult) []string { return v.Usernames }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUsersResultOutput{})
}
