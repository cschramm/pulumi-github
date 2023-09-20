// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package github

import (
	"github.com/pulumi/pulumi-github/sdk/v5/go/github/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve each organization member's SAML or SCIM user
// attributes.
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
//			_, err := github.GetOrganizationExternalIdentities(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetOrganizationExternalIdentities(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetOrganizationExternalIdentitiesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOrganizationExternalIdentitiesResult
	err := ctx.Invoke("github:index/getOrganizationExternalIdentities:getOrganizationExternalIdentities", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getOrganizationExternalIdentities.
type GetOrganizationExternalIdentitiesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// An Array of identities returned from GitHub
	Identities []GetOrganizationExternalIdentitiesIdentity `pulumi:"identities"`
}