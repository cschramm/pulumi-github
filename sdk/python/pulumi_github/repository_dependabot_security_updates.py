# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RepositoryDependabotSecurityUpdatesArgs', 'RepositoryDependabotSecurityUpdates']

@pulumi.input_type
class RepositoryDependabotSecurityUpdatesArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 repository: pulumi.Input[str]):
        """
        The set of arguments for constructing a RepositoryDependabotSecurityUpdates resource.
        :param pulumi.Input[bool] enabled: The state of the automated security fixes.
        :param pulumi.Input[str] repository: The GitHub repository.
        """
        RepositoryDependabotSecurityUpdatesArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enabled=enabled,
            repository=repository,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enabled: Optional[pulumi.Input[bool]] = None,
             repository: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if enabled is None:
            raise TypeError("Missing 'enabled' argument")
        if repository is None:
            raise TypeError("Missing 'repository' argument")

        _setter("enabled", enabled)
        _setter("repository", repository)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        The state of the automated security fixes.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Input[str]:
        """
        The GitHub repository.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository", value)


@pulumi.input_type
class _RepositoryDependabotSecurityUpdatesState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RepositoryDependabotSecurityUpdates resources.
        :param pulumi.Input[bool] enabled: The state of the automated security fixes.
        :param pulumi.Input[str] repository: The GitHub repository.
        """
        _RepositoryDependabotSecurityUpdatesState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enabled=enabled,
            repository=repository,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enabled: Optional[pulumi.Input[bool]] = None,
             repository: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):

        if enabled is not None:
            _setter("enabled", enabled)
        if repository is not None:
            _setter("repository", repository)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        The state of the automated security fixes.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        The GitHub repository.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)


class RepositoryDependabotSecurityUpdates(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a RepositoryDependabotSecurityUpdates resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: The state of the automated security fixes.
        :param pulumi.Input[str] repository: The GitHub repository.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepositoryDependabotSecurityUpdatesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a RepositoryDependabotSecurityUpdates resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param RepositoryDependabotSecurityUpdatesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepositoryDependabotSecurityUpdatesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RepositoryDependabotSecurityUpdatesArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepositoryDependabotSecurityUpdatesArgs.__new__(RepositoryDependabotSecurityUpdatesArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
        super(RepositoryDependabotSecurityUpdates, __self__).__init__(
            'github:index/repositoryDependabotSecurityUpdates:RepositoryDependabotSecurityUpdates',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            repository: Optional[pulumi.Input[str]] = None) -> 'RepositoryDependabotSecurityUpdates':
        """
        Get an existing RepositoryDependabotSecurityUpdates resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: The state of the automated security fixes.
        :param pulumi.Input[str] repository: The GitHub repository.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepositoryDependabotSecurityUpdatesState.__new__(_RepositoryDependabotSecurityUpdatesState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["repository"] = repository
        return RepositoryDependabotSecurityUpdates(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        The state of the automated security fixes.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        """
        The GitHub repository.
        """
        return pulumi.get(self, "repository")

