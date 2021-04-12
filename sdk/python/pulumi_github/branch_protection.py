# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['BranchProtectionArgs', 'BranchProtection']

@pulumi.input_type
class BranchProtectionArgs:
    def __init__(__self__, *,
                 pattern: pulumi.Input[str],
                 repository_id: pulumi.Input[str],
                 allows_deletions: Optional[pulumi.Input[bool]] = None,
                 allows_force_pushes: Optional[pulumi.Input[bool]] = None,
                 enforce_admins: Optional[pulumi.Input[bool]] = None,
                 push_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 require_signed_commits: Optional[pulumi.Input[bool]] = None,
                 required_pull_request_reviews: Optional[pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredPullRequestReviewArgs']]]] = None,
                 required_status_checks: Optional[pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredStatusCheckArgs']]]] = None):
        """
        The set of arguments for constructing a BranchProtection resource.
        :param pulumi.Input[str] pattern: Identifies the protection rule pattern.
        :param pulumi.Input[str] repository_id: The name or node ID of the repository associated with this branch protection rule.
        :param pulumi.Input[bool] allows_deletions: Boolean, setting this to `true` to allow the branch to be deleted.
        :param pulumi.Input[bool] allows_force_pushes: Boolean, setting this to `true` to allow force pushes on the branch.
        :param pulumi.Input[bool] enforce_admins: Boolean, setting this to `true` enforces status checks for repository administrators.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] push_restrictions: The list of actor IDs that may push to the branch.
        :param pulumi.Input[bool] require_signed_commits: Boolean, setting this to `true` requires all commits to be signed with GPG.
        :param pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredPullRequestReviewArgs']]] required_pull_request_reviews: Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
        :param pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredStatusCheckArgs']]] required_status_checks: Enforce restrictions for required status checks. See Required Status Checks below for details.
        """
        pulumi.set(__self__, "pattern", pattern)
        pulumi.set(__self__, "repository_id", repository_id)
        if allows_deletions is not None:
            pulumi.set(__self__, "allows_deletions", allows_deletions)
        if allows_force_pushes is not None:
            pulumi.set(__self__, "allows_force_pushes", allows_force_pushes)
        if enforce_admins is not None:
            pulumi.set(__self__, "enforce_admins", enforce_admins)
        if push_restrictions is not None:
            pulumi.set(__self__, "push_restrictions", push_restrictions)
        if require_signed_commits is not None:
            pulumi.set(__self__, "require_signed_commits", require_signed_commits)
        if required_pull_request_reviews is not None:
            pulumi.set(__self__, "required_pull_request_reviews", required_pull_request_reviews)
        if required_status_checks is not None:
            pulumi.set(__self__, "required_status_checks", required_status_checks)

    @property
    @pulumi.getter
    def pattern(self) -> pulumi.Input[str]:
        """
        Identifies the protection rule pattern.
        """
        return pulumi.get(self, "pattern")

    @pattern.setter
    def pattern(self, value: pulumi.Input[str]):
        pulumi.set(self, "pattern", value)

    @property
    @pulumi.getter(name="repositoryId")
    def repository_id(self) -> pulumi.Input[str]:
        """
        The name or node ID of the repository associated with this branch protection rule.
        """
        return pulumi.get(self, "repository_id")

    @repository_id.setter
    def repository_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository_id", value)

    @property
    @pulumi.getter(name="allowsDeletions")
    def allows_deletions(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean, setting this to `true` to allow the branch to be deleted.
        """
        return pulumi.get(self, "allows_deletions")

    @allows_deletions.setter
    def allows_deletions(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allows_deletions", value)

    @property
    @pulumi.getter(name="allowsForcePushes")
    def allows_force_pushes(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean, setting this to `true` to allow force pushes on the branch.
        """
        return pulumi.get(self, "allows_force_pushes")

    @allows_force_pushes.setter
    def allows_force_pushes(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allows_force_pushes", value)

    @property
    @pulumi.getter(name="enforceAdmins")
    def enforce_admins(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean, setting this to `true` enforces status checks for repository administrators.
        """
        return pulumi.get(self, "enforce_admins")

    @enforce_admins.setter
    def enforce_admins(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enforce_admins", value)

    @property
    @pulumi.getter(name="pushRestrictions")
    def push_restrictions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of actor IDs that may push to the branch.
        """
        return pulumi.get(self, "push_restrictions")

    @push_restrictions.setter
    def push_restrictions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "push_restrictions", value)

    @property
    @pulumi.getter(name="requireSignedCommits")
    def require_signed_commits(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean, setting this to `true` requires all commits to be signed with GPG.
        """
        return pulumi.get(self, "require_signed_commits")

    @require_signed_commits.setter
    def require_signed_commits(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "require_signed_commits", value)

    @property
    @pulumi.getter(name="requiredPullRequestReviews")
    def required_pull_request_reviews(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredPullRequestReviewArgs']]]]:
        """
        Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
        """
        return pulumi.get(self, "required_pull_request_reviews")

    @required_pull_request_reviews.setter
    def required_pull_request_reviews(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredPullRequestReviewArgs']]]]):
        pulumi.set(self, "required_pull_request_reviews", value)

    @property
    @pulumi.getter(name="requiredStatusChecks")
    def required_status_checks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredStatusCheckArgs']]]]:
        """
        Enforce restrictions for required status checks. See Required Status Checks below for details.
        """
        return pulumi.get(self, "required_status_checks")

    @required_status_checks.setter
    def required_status_checks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BranchProtectionRequiredStatusCheckArgs']]]]):
        pulumi.set(self, "required_status_checks", value)


class BranchProtection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allows_deletions: Optional[pulumi.Input[bool]] = None,
                 allows_force_pushes: Optional[pulumi.Input[bool]] = None,
                 enforce_admins: Optional[pulumi.Input[bool]] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 push_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 repository_id: Optional[pulumi.Input[str]] = None,
                 require_signed_commits: Optional[pulumi.Input[bool]] = None,
                 required_pull_request_reviews: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredPullRequestReviewArgs']]]]] = None,
                 required_status_checks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredStatusCheckArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Protects a GitHub branch.

        This resource allows you to configure branch protection for repositories in your organization. When applied, the branch will be protected from forced pushes and deletion. Additional constraints, such as required status checks or restrictions on users, teams, and apps, can also be configured.

        ## Import

        GitHub Branch Protection can be imported using an ID made up of `repository:pattern`, e.g.

        ```sh
         $ pulumi import github:index/branchProtection:BranchProtection terraform terraform:main
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allows_deletions: Boolean, setting this to `true` to allow the branch to be deleted.
        :param pulumi.Input[bool] allows_force_pushes: Boolean, setting this to `true` to allow force pushes on the branch.
        :param pulumi.Input[bool] enforce_admins: Boolean, setting this to `true` enforces status checks for repository administrators.
        :param pulumi.Input[str] pattern: Identifies the protection rule pattern.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] push_restrictions: The list of actor IDs that may push to the branch.
        :param pulumi.Input[str] repository_id: The name or node ID of the repository associated with this branch protection rule.
        :param pulumi.Input[bool] require_signed_commits: Boolean, setting this to `true` requires all commits to be signed with GPG.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredPullRequestReviewArgs']]]] required_pull_request_reviews: Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredStatusCheckArgs']]]] required_status_checks: Enforce restrictions for required status checks. See Required Status Checks below for details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BranchProtectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Protects a GitHub branch.

        This resource allows you to configure branch protection for repositories in your organization. When applied, the branch will be protected from forced pushes and deletion. Additional constraints, such as required status checks or restrictions on users, teams, and apps, can also be configured.

        ## Import

        GitHub Branch Protection can be imported using an ID made up of `repository:pattern`, e.g.

        ```sh
         $ pulumi import github:index/branchProtection:BranchProtection terraform terraform:main
        ```

        :param str resource_name: The name of the resource.
        :param BranchProtectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BranchProtectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allows_deletions: Optional[pulumi.Input[bool]] = None,
                 allows_force_pushes: Optional[pulumi.Input[bool]] = None,
                 enforce_admins: Optional[pulumi.Input[bool]] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 push_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 repository_id: Optional[pulumi.Input[str]] = None,
                 require_signed_commits: Optional[pulumi.Input[bool]] = None,
                 required_pull_request_reviews: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredPullRequestReviewArgs']]]]] = None,
                 required_status_checks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredStatusCheckArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['allows_deletions'] = allows_deletions
            __props__['allows_force_pushes'] = allows_force_pushes
            __props__['enforce_admins'] = enforce_admins
            if pattern is None and not opts.urn:
                raise TypeError("Missing required property 'pattern'")
            __props__['pattern'] = pattern
            __props__['push_restrictions'] = push_restrictions
            if repository_id is None and not opts.urn:
                raise TypeError("Missing required property 'repository_id'")
            __props__['repository_id'] = repository_id
            __props__['require_signed_commits'] = require_signed_commits
            __props__['required_pull_request_reviews'] = required_pull_request_reviews
            __props__['required_status_checks'] = required_status_checks
        super(BranchProtection, __self__).__init__(
            'github:index/branchProtection:BranchProtection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allows_deletions: Optional[pulumi.Input[bool]] = None,
            allows_force_pushes: Optional[pulumi.Input[bool]] = None,
            enforce_admins: Optional[pulumi.Input[bool]] = None,
            pattern: Optional[pulumi.Input[str]] = None,
            push_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            repository_id: Optional[pulumi.Input[str]] = None,
            require_signed_commits: Optional[pulumi.Input[bool]] = None,
            required_pull_request_reviews: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredPullRequestReviewArgs']]]]] = None,
            required_status_checks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredStatusCheckArgs']]]]] = None) -> 'BranchProtection':
        """
        Get an existing BranchProtection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allows_deletions: Boolean, setting this to `true` to allow the branch to be deleted.
        :param pulumi.Input[bool] allows_force_pushes: Boolean, setting this to `true` to allow force pushes on the branch.
        :param pulumi.Input[bool] enforce_admins: Boolean, setting this to `true` enforces status checks for repository administrators.
        :param pulumi.Input[str] pattern: Identifies the protection rule pattern.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] push_restrictions: The list of actor IDs that may push to the branch.
        :param pulumi.Input[str] repository_id: The name or node ID of the repository associated with this branch protection rule.
        :param pulumi.Input[bool] require_signed_commits: Boolean, setting this to `true` requires all commits to be signed with GPG.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredPullRequestReviewArgs']]]] required_pull_request_reviews: Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BranchProtectionRequiredStatusCheckArgs']]]] required_status_checks: Enforce restrictions for required status checks. See Required Status Checks below for details.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["allows_deletions"] = allows_deletions
        __props__["allows_force_pushes"] = allows_force_pushes
        __props__["enforce_admins"] = enforce_admins
        __props__["pattern"] = pattern
        __props__["push_restrictions"] = push_restrictions
        __props__["repository_id"] = repository_id
        __props__["require_signed_commits"] = require_signed_commits
        __props__["required_pull_request_reviews"] = required_pull_request_reviews
        __props__["required_status_checks"] = required_status_checks
        return BranchProtection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowsDeletions")
    def allows_deletions(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean, setting this to `true` to allow the branch to be deleted.
        """
        return pulumi.get(self, "allows_deletions")

    @property
    @pulumi.getter(name="allowsForcePushes")
    def allows_force_pushes(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean, setting this to `true` to allow force pushes on the branch.
        """
        return pulumi.get(self, "allows_force_pushes")

    @property
    @pulumi.getter(name="enforceAdmins")
    def enforce_admins(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean, setting this to `true` enforces status checks for repository administrators.
        """
        return pulumi.get(self, "enforce_admins")

    @property
    @pulumi.getter
    def pattern(self) -> pulumi.Output[str]:
        """
        Identifies the protection rule pattern.
        """
        return pulumi.get(self, "pattern")

    @property
    @pulumi.getter(name="pushRestrictions")
    def push_restrictions(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The list of actor IDs that may push to the branch.
        """
        return pulumi.get(self, "push_restrictions")

    @property
    @pulumi.getter(name="repositoryId")
    def repository_id(self) -> pulumi.Output[str]:
        """
        The name or node ID of the repository associated with this branch protection rule.
        """
        return pulumi.get(self, "repository_id")

    @property
    @pulumi.getter(name="requireSignedCommits")
    def require_signed_commits(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean, setting this to `true` requires all commits to be signed with GPG.
        """
        return pulumi.get(self, "require_signed_commits")

    @property
    @pulumi.getter(name="requiredPullRequestReviews")
    def required_pull_request_reviews(self) -> pulumi.Output[Optional[Sequence['outputs.BranchProtectionRequiredPullRequestReview']]]:
        """
        Enforce restrictions for pull request reviews. See Required Pull Request Reviews below for details.
        """
        return pulumi.get(self, "required_pull_request_reviews")

    @property
    @pulumi.getter(name="requiredStatusChecks")
    def required_status_checks(self) -> pulumi.Output[Optional[Sequence['outputs.BranchProtectionRequiredStatusCheck']]]:
        """
        Enforce restrictions for required status checks. See Required Status Checks below for details.
        """
        return pulumi.get(self, "required_status_checks")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

