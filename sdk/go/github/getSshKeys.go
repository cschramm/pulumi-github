// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"github.com/pulumi/pulumi-github/sdk/v5/go/github/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve information about GitHub's SSH keys.
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
//			_, err := github.GetSshKeys(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSshKeys(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetSshKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSshKeysResult
	err := ctx.Invoke("github:index/getSshKeys:getSshKeys", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getSshKeys.
type GetSshKeysResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An array of GitHub's SSH public keys.
	Keys []string `pulumi:"keys"`
}
