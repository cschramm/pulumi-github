# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ActionsRepositoryAccessLevelArgs', 'ActionsRepositoryAccessLevel']

@pulumi.input_type
class ActionsRepositoryAccessLevelArgs:
    def __init__(__self__, *,
                 access_level: pulumi.Input[str],
                 repository: pulumi.Input[str]):
        """
        The set of arguments for constructing a ActionsRepositoryAccessLevel resource.
        :param pulumi.Input[str] access_level: Where the actions or reusable workflows of the repository may be used. Possible values are `none`, `user`, `organization`, or `enterprise`.
        :param pulumi.Input[str] repository: The GitHub repository
        """
        pulumi.set(__self__, "access_level", access_level)
        pulumi.set(__self__, "repository", repository)

    @property
    @pulumi.getter(name="accessLevel")
    def access_level(self) -> pulumi.Input[str]:
        """
        Where the actions or reusable workflows of the repository may be used. Possible values are `none`, `user`, `organization`, or `enterprise`.
        """
        return pulumi.get(self, "access_level")

    @access_level.setter
    def access_level(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_level", value)

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Input[str]:
        """
        The GitHub repository
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository", value)


@pulumi.input_type
class _ActionsRepositoryAccessLevelState:
    def __init__(__self__, *,
                 access_level: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ActionsRepositoryAccessLevel resources.
        :param pulumi.Input[str] access_level: Where the actions or reusable workflows of the repository may be used. Possible values are `none`, `user`, `organization`, or `enterprise`.
        :param pulumi.Input[str] repository: The GitHub repository
        """
        if access_level is not None:
            pulumi.set(__self__, "access_level", access_level)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)

    @property
    @pulumi.getter(name="accessLevel")
    def access_level(self) -> Optional[pulumi.Input[str]]:
        """
        Where the actions or reusable workflows of the repository may be used. Possible values are `none`, `user`, `organization`, or `enterprise`.
        """
        return pulumi.get(self, "access_level")

    @access_level.setter
    def access_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_level", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        The GitHub repository
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)


class ActionsRepositoryAccessLevel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_level: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to set the access level of a non-public repositories actions and reusable workflows for use in other repositories.
        You must have admin access to a repository to use this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        example = github.Repository("example", visibility="private")
        test = github.ActionsRepositoryAccessLevel("test",
            access_level="user",
            repository=example.name)
        ```

        ## Import

        This resource can be imported using the name of the GitHub repository:

        ```sh
         $ pulumi import github:index/actionsRepositoryAccessLevel:ActionsRepositoryAccessLevel test <github_repository_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_level: Where the actions or reusable workflows of the repository may be used. Possible values are `none`, `user`, `organization`, or `enterprise`.
        :param pulumi.Input[str] repository: The GitHub repository
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ActionsRepositoryAccessLevelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to set the access level of a non-public repositories actions and reusable workflows for use in other repositories.
        You must have admin access to a repository to use this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        example = github.Repository("example", visibility="private")
        test = github.ActionsRepositoryAccessLevel("test",
            access_level="user",
            repository=example.name)
        ```

        ## Import

        This resource can be imported using the name of the GitHub repository:

        ```sh
         $ pulumi import github:index/actionsRepositoryAccessLevel:ActionsRepositoryAccessLevel test <github_repository_name>
        ```

        :param str resource_name: The name of the resource.
        :param ActionsRepositoryAccessLevelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ActionsRepositoryAccessLevelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_level: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ActionsRepositoryAccessLevelArgs.__new__(ActionsRepositoryAccessLevelArgs)

            if access_level is None and not opts.urn:
                raise TypeError("Missing required property 'access_level'")
            __props__.__dict__["access_level"] = access_level
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
        super(ActionsRepositoryAccessLevel, __self__).__init__(
            'github:index/actionsRepositoryAccessLevel:ActionsRepositoryAccessLevel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_level: Optional[pulumi.Input[str]] = None,
            repository: Optional[pulumi.Input[str]] = None) -> 'ActionsRepositoryAccessLevel':
        """
        Get an existing ActionsRepositoryAccessLevel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_level: Where the actions or reusable workflows of the repository may be used. Possible values are `none`, `user`, `organization`, or `enterprise`.
        :param pulumi.Input[str] repository: The GitHub repository
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ActionsRepositoryAccessLevelState.__new__(_ActionsRepositoryAccessLevelState)

        __props__.__dict__["access_level"] = access_level
        __props__.__dict__["repository"] = repository
        return ActionsRepositoryAccessLevel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessLevel")
    def access_level(self) -> pulumi.Output[str]:
        """
        Where the actions or reusable workflows of the repository may be used. Possible values are `none`, `user`, `organization`, or `enterprise`.
        """
        return pulumi.get(self, "access_level")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        """
        The GitHub repository
        """
        return pulumi.get(self, "repository")

