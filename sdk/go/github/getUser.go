// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about a GitHub user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-github/sdk/v4/go/github"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := github.GetUser(ctx, &github.GetUserArgs{
// 			Username: "example",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		current, err := github.GetUser(ctx, &github.GetUserArgs{
// 			Username: "",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("currentGithubLogin", current.Login)
// 		return nil
// 	})
// }
// ```
func GetUser(ctx *pulumi.Context, args *GetUserArgs, opts ...pulumi.InvokeOption) (*GetUserResult, error) {
	var rv GetUserResult
	err := ctx.Invoke("github:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type GetUserArgs struct {
	// The username. Use an empty string `""` to retrieve information about the currently authenticated user.
	Username string `pulumi:"username"`
}

// A collection of values returned by getUser.
type GetUserResult struct {
	// the user's avatar URL.
	AvatarUrl string `pulumi:"avatarUrl"`
	// the user's bio.
	Bio string `pulumi:"bio"`
	// the user's blog location.
	Blog string `pulumi:"blog"`
	// the user's company name.
	Company string `pulumi:"company"`
	// the creation date.
	CreatedAt string `pulumi:"createdAt"`
	// the user's email.
	Email string `pulumi:"email"`
	// the number of followers.
	Followers int `pulumi:"followers"`
	// the number of following users.
	Following int `pulumi:"following"`
	// list of user's GPG keys.
	GpgKeys []string `pulumi:"gpgKeys"`
	// the user's gravatar ID.
	GravatarId string `pulumi:"gravatarId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// the user's location.
	Location string `pulumi:"location"`
	// the user's login.
	Login string `pulumi:"login"`
	// the user's full name.
	Name string `pulumi:"name"`
	// the Node ID of the user.
	NodeId string `pulumi:"nodeId"`
	// the number of public gists.
	PublicGists int `pulumi:"publicGists"`
	// the number of public repositories.
	PublicRepos int `pulumi:"publicRepos"`
	// whether the user is a GitHub admin.
	SiteAdmin bool `pulumi:"siteAdmin"`
	// list of user's SSH keys.
	SshKeys []string `pulumi:"sshKeys"`
	// the update date.
	UpdatedAt string `pulumi:"updatedAt"`
	Username  string `pulumi:"username"`
}
