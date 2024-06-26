# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ReleaseArgs', 'Release']

@pulumi.input_type
class ReleaseArgs:
    def __init__(__self__, *,
                 repository: pulumi.Input[str],
                 tag_name: pulumi.Input[str],
                 body: Optional[pulumi.Input[str]] = None,
                 discussion_category_name: Optional[pulumi.Input[str]] = None,
                 draft: Optional[pulumi.Input[bool]] = None,
                 generate_release_notes: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 prerelease: Optional[pulumi.Input[bool]] = None,
                 target_commitish: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Release resource.
        :param pulumi.Input[str] repository: The name of the repository.
        :param pulumi.Input[str] tag_name: The name of the tag.
        :param pulumi.Input[str] body: Text describing the contents of the tag.
        :param pulumi.Input[str] discussion_category_name: If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see [Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).
        :param pulumi.Input[bool] draft: Set to `false` to create a published release.
        :param pulumi.Input[bool] generate_release_notes: Set to `true` to automatically generate the name and body for this release. If `name` is specified, the specified `name` will be used; otherwise, a name will be automatically generated. If `body` is specified, the `body` will be pre-pended to the automatically generated notes.
        :param pulumi.Input[str] name: The name of the release.
        :param pulumi.Input[bool] prerelease: Set to `false` to identify the release as a full release.
        :param pulumi.Input[str] target_commitish: The branch name or commit SHA the tag is created from. Defaults to the default branch of the repository.
        """
        pulumi.set(__self__, "repository", repository)
        pulumi.set(__self__, "tag_name", tag_name)
        if body is not None:
            pulumi.set(__self__, "body", body)
        if discussion_category_name is not None:
            pulumi.set(__self__, "discussion_category_name", discussion_category_name)
        if draft is not None:
            pulumi.set(__self__, "draft", draft)
        if generate_release_notes is not None:
            pulumi.set(__self__, "generate_release_notes", generate_release_notes)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if prerelease is not None:
            pulumi.set(__self__, "prerelease", prerelease)
        if target_commitish is not None:
            pulumi.set(__self__, "target_commitish", target_commitish)

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Input[str]:
        """
        The name of the repository.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter(name="tagName")
    def tag_name(self) -> pulumi.Input[str]:
        """
        The name of the tag.
        """
        return pulumi.get(self, "tag_name")

    @tag_name.setter
    def tag_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "tag_name", value)

    @property
    @pulumi.getter
    def body(self) -> Optional[pulumi.Input[str]]:
        """
        Text describing the contents of the tag.
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter(name="discussionCategoryName")
    def discussion_category_name(self) -> Optional[pulumi.Input[str]]:
        """
        If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see [Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).
        """
        return pulumi.get(self, "discussion_category_name")

    @discussion_category_name.setter
    def discussion_category_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "discussion_category_name", value)

    @property
    @pulumi.getter
    def draft(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `false` to create a published release.
        """
        return pulumi.get(self, "draft")

    @draft.setter
    def draft(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "draft", value)

    @property
    @pulumi.getter(name="generateReleaseNotes")
    def generate_release_notes(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `true` to automatically generate the name and body for this release. If `name` is specified, the specified `name` will be used; otherwise, a name will be automatically generated. If `body` is specified, the `body` will be pre-pended to the automatically generated notes.
        """
        return pulumi.get(self, "generate_release_notes")

    @generate_release_notes.setter
    def generate_release_notes(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "generate_release_notes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the release.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def prerelease(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `false` to identify the release as a full release.
        """
        return pulumi.get(self, "prerelease")

    @prerelease.setter
    def prerelease(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "prerelease", value)

    @property
    @pulumi.getter(name="targetCommitish")
    def target_commitish(self) -> Optional[pulumi.Input[str]]:
        """
        The branch name or commit SHA the tag is created from. Defaults to the default branch of the repository.
        """
        return pulumi.get(self, "target_commitish")

    @target_commitish.setter
    def target_commitish(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_commitish", value)


@pulumi.input_type
class _ReleaseState:
    def __init__(__self__, *,
                 body: Optional[pulumi.Input[str]] = None,
                 discussion_category_name: Optional[pulumi.Input[str]] = None,
                 draft: Optional[pulumi.Input[bool]] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 generate_release_notes: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 prerelease: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 tag_name: Optional[pulumi.Input[str]] = None,
                 target_commitish: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Release resources.
        :param pulumi.Input[str] body: Text describing the contents of the tag.
        :param pulumi.Input[str] discussion_category_name: If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see [Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).
        :param pulumi.Input[bool] draft: Set to `false` to create a published release.
        :param pulumi.Input[bool] generate_release_notes: Set to `true` to automatically generate the name and body for this release. If `name` is specified, the specified `name` will be used; otherwise, a name will be automatically generated. If `body` is specified, the `body` will be pre-pended to the automatically generated notes.
        :param pulumi.Input[str] name: The name of the release.
        :param pulumi.Input[bool] prerelease: Set to `false` to identify the release as a full release.
        :param pulumi.Input[str] repository: The name of the repository.
        :param pulumi.Input[str] tag_name: The name of the tag.
        :param pulumi.Input[str] target_commitish: The branch name or commit SHA the tag is created from. Defaults to the default branch of the repository.
        """
        if body is not None:
            pulumi.set(__self__, "body", body)
        if discussion_category_name is not None:
            pulumi.set(__self__, "discussion_category_name", discussion_category_name)
        if draft is not None:
            pulumi.set(__self__, "draft", draft)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if generate_release_notes is not None:
            pulumi.set(__self__, "generate_release_notes", generate_release_notes)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if prerelease is not None:
            pulumi.set(__self__, "prerelease", prerelease)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)
        if tag_name is not None:
            pulumi.set(__self__, "tag_name", tag_name)
        if target_commitish is not None:
            pulumi.set(__self__, "target_commitish", target_commitish)

    @property
    @pulumi.getter
    def body(self) -> Optional[pulumi.Input[str]]:
        """
        Text describing the contents of the tag.
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter(name="discussionCategoryName")
    def discussion_category_name(self) -> Optional[pulumi.Input[str]]:
        """
        If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see [Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).
        """
        return pulumi.get(self, "discussion_category_name")

    @discussion_category_name.setter
    def discussion_category_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "discussion_category_name", value)

    @property
    @pulumi.getter
    def draft(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `false` to create a published release.
        """
        return pulumi.get(self, "draft")

    @draft.setter
    def draft(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "draft", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter(name="generateReleaseNotes")
    def generate_release_notes(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `true` to automatically generate the name and body for this release. If `name` is specified, the specified `name` will be used; otherwise, a name will be automatically generated. If `body` is specified, the `body` will be pre-pended to the automatically generated notes.
        """
        return pulumi.get(self, "generate_release_notes")

    @generate_release_notes.setter
    def generate_release_notes(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "generate_release_notes", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the release.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def prerelease(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `false` to identify the release as a full release.
        """
        return pulumi.get(self, "prerelease")

    @prerelease.setter
    def prerelease(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "prerelease", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the repository.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter(name="tagName")
    def tag_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the tag.
        """
        return pulumi.get(self, "tag_name")

    @tag_name.setter
    def tag_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag_name", value)

    @property
    @pulumi.getter(name="targetCommitish")
    def target_commitish(self) -> Optional[pulumi.Input[str]]:
        """
        The branch name or commit SHA the tag is created from. Defaults to the default branch of the repository.
        """
        return pulumi.get(self, "target_commitish")

    @target_commitish.setter
    def target_commitish(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_commitish", value)


class Release(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 discussion_category_name: Optional[pulumi.Input[str]] = None,
                 draft: Optional[pulumi.Input[bool]] = None,
                 generate_release_notes: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 prerelease: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 tag_name: Optional[pulumi.Input[str]] = None,
                 target_commitish: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to create and manage a release in a specific
        GitHub repository.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        repo = github.Repository("repo",
            name="repo",
            description="GitHub repo managed by Terraform",
            private=False)
        example = github.Release("example",
            repository=repo.name,
            tag_name="v1.0.0")
        ```

        ### On Non-Default Branch

        ```python
        import pulumi
        import pulumi_github as github

        example = github.Repository("example",
            name="repo",
            auto_init=True)
        example_branch = github.Branch("example",
            repository=example.name,
            branch="branch_name",
            source_branch=example.default_branch)
        example_release = github.Release("example",
            repository=example.name,
            tag_name="v1.0.0",
            target_commitish=example_branch.branch,
            draft=False,
            prerelease=False)
        ```

        ## Import

        This resource can be imported using the `name` of the repository, combined with the `id` of the release, and a `:` character for separating components, e.g.

        ```sh
        $ pulumi import github:index/release:Release example repo:12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] body: Text describing the contents of the tag.
        :param pulumi.Input[str] discussion_category_name: If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see [Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).
        :param pulumi.Input[bool] draft: Set to `false` to create a published release.
        :param pulumi.Input[bool] generate_release_notes: Set to `true` to automatically generate the name and body for this release. If `name` is specified, the specified `name` will be used; otherwise, a name will be automatically generated. If `body` is specified, the `body` will be pre-pended to the automatically generated notes.
        :param pulumi.Input[str] name: The name of the release.
        :param pulumi.Input[bool] prerelease: Set to `false` to identify the release as a full release.
        :param pulumi.Input[str] repository: The name of the repository.
        :param pulumi.Input[str] tag_name: The name of the tag.
        :param pulumi.Input[str] target_commitish: The branch name or commit SHA the tag is created from. Defaults to the default branch of the repository.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ReleaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create and manage a release in a specific
        GitHub repository.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        repo = github.Repository("repo",
            name="repo",
            description="GitHub repo managed by Terraform",
            private=False)
        example = github.Release("example",
            repository=repo.name,
            tag_name="v1.0.0")
        ```

        ### On Non-Default Branch

        ```python
        import pulumi
        import pulumi_github as github

        example = github.Repository("example",
            name="repo",
            auto_init=True)
        example_branch = github.Branch("example",
            repository=example.name,
            branch="branch_name",
            source_branch=example.default_branch)
        example_release = github.Release("example",
            repository=example.name,
            tag_name="v1.0.0",
            target_commitish=example_branch.branch,
            draft=False,
            prerelease=False)
        ```

        ## Import

        This resource can be imported using the `name` of the repository, combined with the `id` of the release, and a `:` character for separating components, e.g.

        ```sh
        $ pulumi import github:index/release:Release example repo:12345678
        ```

        :param str resource_name: The name of the resource.
        :param ReleaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ReleaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 discussion_category_name: Optional[pulumi.Input[str]] = None,
                 draft: Optional[pulumi.Input[bool]] = None,
                 generate_release_notes: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 prerelease: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 tag_name: Optional[pulumi.Input[str]] = None,
                 target_commitish: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ReleaseArgs.__new__(ReleaseArgs)

            __props__.__dict__["body"] = body
            __props__.__dict__["discussion_category_name"] = discussion_category_name
            __props__.__dict__["draft"] = draft
            __props__.__dict__["generate_release_notes"] = generate_release_notes
            __props__.__dict__["name"] = name
            __props__.__dict__["prerelease"] = prerelease
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
            if tag_name is None and not opts.urn:
                raise TypeError("Missing required property 'tag_name'")
            __props__.__dict__["tag_name"] = tag_name
            __props__.__dict__["target_commitish"] = target_commitish
            __props__.__dict__["etag"] = None
        super(Release, __self__).__init__(
            'github:index/release:Release',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            body: Optional[pulumi.Input[str]] = None,
            discussion_category_name: Optional[pulumi.Input[str]] = None,
            draft: Optional[pulumi.Input[bool]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            generate_release_notes: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            prerelease: Optional[pulumi.Input[bool]] = None,
            repository: Optional[pulumi.Input[str]] = None,
            tag_name: Optional[pulumi.Input[str]] = None,
            target_commitish: Optional[pulumi.Input[str]] = None) -> 'Release':
        """
        Get an existing Release resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] body: Text describing the contents of the tag.
        :param pulumi.Input[str] discussion_category_name: If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see [Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).
        :param pulumi.Input[bool] draft: Set to `false` to create a published release.
        :param pulumi.Input[bool] generate_release_notes: Set to `true` to automatically generate the name and body for this release. If `name` is specified, the specified `name` will be used; otherwise, a name will be automatically generated. If `body` is specified, the `body` will be pre-pended to the automatically generated notes.
        :param pulumi.Input[str] name: The name of the release.
        :param pulumi.Input[bool] prerelease: Set to `false` to identify the release as a full release.
        :param pulumi.Input[str] repository: The name of the repository.
        :param pulumi.Input[str] tag_name: The name of the tag.
        :param pulumi.Input[str] target_commitish: The branch name or commit SHA the tag is created from. Defaults to the default branch of the repository.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ReleaseState.__new__(_ReleaseState)

        __props__.__dict__["body"] = body
        __props__.__dict__["discussion_category_name"] = discussion_category_name
        __props__.__dict__["draft"] = draft
        __props__.__dict__["etag"] = etag
        __props__.__dict__["generate_release_notes"] = generate_release_notes
        __props__.__dict__["name"] = name
        __props__.__dict__["prerelease"] = prerelease
        __props__.__dict__["repository"] = repository
        __props__.__dict__["tag_name"] = tag_name
        __props__.__dict__["target_commitish"] = target_commitish
        return Release(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def body(self) -> pulumi.Output[Optional[str]]:
        """
        Text describing the contents of the tag.
        """
        return pulumi.get(self, "body")

    @property
    @pulumi.getter(name="discussionCategoryName")
    def discussion_category_name(self) -> pulumi.Output[Optional[str]]:
        """
        If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see [Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository).
        """
        return pulumi.get(self, "discussion_category_name")

    @property
    @pulumi.getter
    def draft(self) -> pulumi.Output[Optional[bool]]:
        """
        Set to `false` to create a published release.
        """
        return pulumi.get(self, "draft")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter(name="generateReleaseNotes")
    def generate_release_notes(self) -> pulumi.Output[Optional[bool]]:
        """
        Set to `true` to automatically generate the name and body for this release. If `name` is specified, the specified `name` will be used; otherwise, a name will be automatically generated. If `body` is specified, the `body` will be pre-pended to the automatically generated notes.
        """
        return pulumi.get(self, "generate_release_notes")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the release.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def prerelease(self) -> pulumi.Output[Optional[bool]]:
        """
        Set to `false` to identify the release as a full release.
        """
        return pulumi.get(self, "prerelease")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        """
        The name of the repository.
        """
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="tagName")
    def tag_name(self) -> pulumi.Output[str]:
        """
        The name of the tag.
        """
        return pulumi.get(self, "tag_name")

    @property
    @pulumi.getter(name="targetCommitish")
    def target_commitish(self) -> pulumi.Output[Optional[str]]:
        """
        The branch name or commit SHA the tag is created from. Defaults to the default branch of the repository.
        """
        return pulumi.get(self, "target_commitish")

