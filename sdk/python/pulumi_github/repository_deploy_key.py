# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RepositoryDeployKeyArgs', 'RepositoryDeployKey']

@pulumi.input_type
class RepositoryDeployKeyArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 repository: pulumi.Input[str],
                 title: pulumi.Input[str],
                 read_only: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a RepositoryDeployKey resource.
        :param pulumi.Input[str] key: A SSH key.
        :param pulumi.Input[str] repository: Name of the GitHub repository.
        :param pulumi.Input[str] title: A title.
        :param pulumi.Input[bool] read_only: A boolean qualifying the key to be either read only or read/write.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "repository", repository)
        pulumi.set(__self__, "title", title)
        if read_only is not None:
            pulumi.set(__self__, "read_only", read_only)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        A SSH key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Input[str]:
        """
        Name of the GitHub repository.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        A title.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean qualifying the key to be either read only or read/write.
        """
        return pulumi.get(self, "read_only")

    @read_only.setter
    def read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "read_only", value)


@pulumi.input_type
class _RepositoryDeployKeyState:
    def __init__(__self__, *,
                 etag: Optional[pulumi.Input[str]] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RepositoryDeployKey resources.
        :param pulumi.Input[str] key: A SSH key.
        :param pulumi.Input[bool] read_only: A boolean qualifying the key to be either read only or read/write.
        :param pulumi.Input[str] repository: Name of the GitHub repository.
        :param pulumi.Input[str] title: A title.
        """
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if key is not None:
            pulumi.set(__self__, "key", key)
        if read_only is not None:
            pulumi.set(__self__, "read_only", read_only)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        A SSH key.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        A boolean qualifying the key to be either read only or read/write.
        """
        return pulumi.get(self, "read_only")

    @read_only.setter
    def read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "read_only", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the GitHub repository.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        A title.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)


class RepositoryDeployKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a GitHub repository deploy key resource.

        A deploy key is an SSH key that is stored on your server and grants
        access to a single GitHub repository. This key is attached directly to the repository instead of to a personal user
        account.

        This resource allows you to add/remove repository deploy keys.

        Further documentation on GitHub repository deploy keys:
        - [About deploy keys](https://developer.github.com/guides/managing-deploy-keys/#deploy-keys)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        # Add a deploy key
        example_repository_deploy_key = github.RepositoryDeployKey("exampleRepositoryDeployKey",
            key="ssh-rsa AAA...",
            read_only=False,
            repository="test-repo",
            title="Repository test key")
        ```

        ## Import

        Repository deploy keys can be imported using a colon-separated pair of repository name and GitHub's key id. The latter can be obtained by GitHub's SDKs and API.

        ```sh
         $ pulumi import github:index/repositoryDeployKey:RepositoryDeployKey foo test-repo:23824728
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: A SSH key.
        :param pulumi.Input[bool] read_only: A boolean qualifying the key to be either read only or read/write.
        :param pulumi.Input[str] repository: Name of the GitHub repository.
        :param pulumi.Input[str] title: A title.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepositoryDeployKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a GitHub repository deploy key resource.

        A deploy key is an SSH key that is stored on your server and grants
        access to a single GitHub repository. This key is attached directly to the repository instead of to a personal user
        account.

        This resource allows you to add/remove repository deploy keys.

        Further documentation on GitHub repository deploy keys:
        - [About deploy keys](https://developer.github.com/guides/managing-deploy-keys/#deploy-keys)

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        # Add a deploy key
        example_repository_deploy_key = github.RepositoryDeployKey("exampleRepositoryDeployKey",
            key="ssh-rsa AAA...",
            read_only=False,
            repository="test-repo",
            title="Repository test key")
        ```

        ## Import

        Repository deploy keys can be imported using a colon-separated pair of repository name and GitHub's key id. The latter can be obtained by GitHub's SDKs and API.

        ```sh
         $ pulumi import github:index/repositoryDeployKey:RepositoryDeployKey foo test-repo:23824728
        ```

        :param str resource_name: The name of the resource.
        :param RepositoryDeployKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepositoryDeployKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
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
            __props__ = RepositoryDeployKeyArgs.__new__(RepositoryDeployKeyArgs)

            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            __props__.__dict__["read_only"] = read_only
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            __props__.__dict__["etag"] = None
        super(RepositoryDeployKey, __self__).__init__(
            'github:index/repositoryDeployKey:RepositoryDeployKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            etag: Optional[pulumi.Input[str]] = None,
            key: Optional[pulumi.Input[str]] = None,
            read_only: Optional[pulumi.Input[bool]] = None,
            repository: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None) -> 'RepositoryDeployKey':
        """
        Get an existing RepositoryDeployKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: A SSH key.
        :param pulumi.Input[bool] read_only: A boolean qualifying the key to be either read only or read/write.
        :param pulumi.Input[str] repository: Name of the GitHub repository.
        :param pulumi.Input[str] title: A title.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepositoryDeployKeyState.__new__(_RepositoryDeployKeyState)

        __props__.__dict__["etag"] = etag
        __props__.__dict__["key"] = key
        __props__.__dict__["read_only"] = read_only
        __props__.__dict__["repository"] = repository
        __props__.__dict__["title"] = title
        return RepositoryDeployKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        A SSH key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> pulumi.Output[Optional[bool]]:
        """
        A boolean qualifying the key to be either read only or read/write.
        """
        return pulumi.get(self, "read_only")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        """
        Name of the GitHub repository.
        """
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        A title.
        """
        return pulumi.get(self, "title")

