# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RepositoryWebhookArgs', 'RepositoryWebhook']

@pulumi.input_type
class RepositoryWebhookArgs:
    def __init__(__self__, *,
                 events: pulumi.Input[Sequence[pulumi.Input[str]]],
                 repository: pulumi.Input[str],
                 active: Optional[pulumi.Input[bool]] = None,
                 configuration: Optional[pulumi.Input['RepositoryWebhookConfigurationArgs']] = None):
        """
        The set of arguments for constructing a RepositoryWebhook resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        :param pulumi.Input[str] repository: The repository of the webhook.
        :param pulumi.Input[bool] active: Indicate of the webhook should receive events. Defaults to `true`.
        :param pulumi.Input['RepositoryWebhookConfigurationArgs'] configuration: key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`. `secret` is [the shared secret, see API documentation](https://developer.github.com/v3/repos/hooks/#create-a-hook). `content_type` may be either form or json.
        """
        pulumi.set(__self__, "events", events)
        pulumi.set(__self__, "repository", repository)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)

    @property
    @pulumi.getter
    def events(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "events", value)

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Input[str]:
        """
        The repository of the webhook.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicate of the webhook should receive events. Defaults to `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['RepositoryWebhookConfigurationArgs']]:
        """
        key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`. `secret` is [the shared secret, see API documentation](https://developer.github.com/v3/repos/hooks/#create-a-hook). `content_type` may be either form or json.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['RepositoryWebhookConfigurationArgs']]):
        pulumi.set(self, "configuration", value)


@pulumi.input_type
class _RepositoryWebhookState:
    def __init__(__self__, *,
                 active: Optional[pulumi.Input[bool]] = None,
                 configuration: Optional[pulumi.Input['RepositoryWebhookConfigurationArgs']] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RepositoryWebhook resources.
        :param pulumi.Input[bool] active: Indicate of the webhook should receive events. Defaults to `true`.
        :param pulumi.Input['RepositoryWebhookConfigurationArgs'] configuration: key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`. `secret` is [the shared secret, see API documentation](https://developer.github.com/v3/repos/hooks/#create-a-hook). `content_type` may be either form or json.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        :param pulumi.Input[str] repository: The repository of the webhook.
        :param pulumi.Input[str] url: URL of the webhook.  This is a sensitive attribute because it may include basic auth credentials.
        """
        if active is not None:
            pulumi.set(__self__, "active", active)
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if events is not None:
            pulumi.set(__self__, "events", events)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicate of the webhook should receive events. Defaults to `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input['RepositoryWebhookConfigurationArgs']]:
        """
        key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`. `secret` is [the shared secret, see API documentation](https://developer.github.com/v3/repos/hooks/#create-a-hook). `content_type` may be either form or json.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input['RepositoryWebhookConfigurationArgs']]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def events(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        """
        return pulumi.get(self, "events")

    @events.setter
    def events(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "events", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        """
        The repository of the webhook.
        """
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        URL of the webhook.  This is a sensitive attribute because it may include basic auth credentials.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class RepositoryWebhook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['RepositoryWebhookConfigurationArgs']]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        This resource allows you to create and manage webhooks for repositories within your
        GitHub organization or personal account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        repo = github.Repository("repo",
            description="Terraform acceptance tests",
            homepage_url="http://example.com/",
            private=False)
        foo = github.RepositoryWebhook("foo",
            repository=repo.name,
            configuration=github.RepositoryWebhookConfigurationArgs(
                url="https://google.de/",
                content_type="form",
                insecure_ssl=False,
            ),
            active=False,
            events=["issues"])
        ```

        ## Import

        Repository webhooks can be imported using the `name` of the repository, combined with the `id` of the webhook, separated by a `/` character. The `id` of the webhook can be found in the URL of the webhook. For example`"https://github.com/foo-org/foo-repo/settings/hooks/14711452"`. Importing uses the name of the repository, as well as the ID of the webhook, e.g.

        ```sh
         $ pulumi import github:index/repositoryWebhook:RepositoryWebhook terraform terraform/11235813
        ```

         If secret is populated in the webhook's configuration, the value will be imported as "********".

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Indicate of the webhook should receive events. Defaults to `true`.
        :param pulumi.Input[pulumi.InputType['RepositoryWebhookConfigurationArgs']] configuration: key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`. `secret` is [the shared secret, see API documentation](https://developer.github.com/v3/repos/hooks/#create-a-hook). `content_type` may be either form or json.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        :param pulumi.Input[str] repository: The repository of the webhook.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepositoryWebhookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create and manage webhooks for repositories within your
        GitHub organization or personal account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        repo = github.Repository("repo",
            description="Terraform acceptance tests",
            homepage_url="http://example.com/",
            private=False)
        foo = github.RepositoryWebhook("foo",
            repository=repo.name,
            configuration=github.RepositoryWebhookConfigurationArgs(
                url="https://google.de/",
                content_type="form",
                insecure_ssl=False,
            ),
            active=False,
            events=["issues"])
        ```

        ## Import

        Repository webhooks can be imported using the `name` of the repository, combined with the `id` of the webhook, separated by a `/` character. The `id` of the webhook can be found in the URL of the webhook. For example`"https://github.com/foo-org/foo-repo/settings/hooks/14711452"`. Importing uses the name of the repository, as well as the ID of the webhook, e.g.

        ```sh
         $ pulumi import github:index/repositoryWebhook:RepositoryWebhook terraform terraform/11235813
        ```

         If secret is populated in the webhook's configuration, the value will be imported as "********".

        :param str resource_name: The name of the resource.
        :param RepositoryWebhookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepositoryWebhookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 configuration: Optional[pulumi.Input[pulumi.InputType['RepositoryWebhookConfigurationArgs']]] = None,
                 events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
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
            __props__ = RepositoryWebhookArgs.__new__(RepositoryWebhookArgs)

            __props__.__dict__["active"] = active
            __props__.__dict__["configuration"] = configuration
            if events is None and not opts.urn:
                raise TypeError("Missing required property 'events'")
            __props__.__dict__["events"] = events
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
            __props__.__dict__["etag"] = None
            __props__.__dict__["url"] = None
        super(RepositoryWebhook, __self__).__init__(
            'github:index/repositoryWebhook:RepositoryWebhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            active: Optional[pulumi.Input[bool]] = None,
            configuration: Optional[pulumi.Input[pulumi.InputType['RepositoryWebhookConfigurationArgs']]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            events: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            repository: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'RepositoryWebhook':
        """
        Get an existing RepositoryWebhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] active: Indicate of the webhook should receive events. Defaults to `true`.
        :param pulumi.Input[pulumi.InputType['RepositoryWebhookConfigurationArgs']] configuration: key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`. `secret` is [the shared secret, see API documentation](https://developer.github.com/v3/repos/hooks/#create-a-hook). `content_type` may be either form or json.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] events: A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        :param pulumi.Input[str] repository: The repository of the webhook.
        :param pulumi.Input[str] url: URL of the webhook.  This is a sensitive attribute because it may include basic auth credentials.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepositoryWebhookState.__new__(_RepositoryWebhookState)

        __props__.__dict__["active"] = active
        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["etag"] = etag
        __props__.__dict__["events"] = events
        __props__.__dict__["repository"] = repository
        __props__.__dict__["url"] = url
        return RepositoryWebhook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicate of the webhook should receive events. Defaults to `true`.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output[Optional['outputs.RepositoryWebhookConfiguration']]:
        """
        key/value pair of configuration for this webhook. Available keys are `url`, `content_type`, `secret` and `insecure_ssl`. `secret` is [the shared secret, see API documentation](https://developer.github.com/v3/repos/hooks/#create-a-hook). `content_type` may be either form or json.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def events(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of events which should trigger the webhook. See a list of [available events](https://developer.github.com/v3/activity/events/types/).
        """
        return pulumi.get(self, "events")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        """
        The repository of the webhook.
        """
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        URL of the webhook.  This is a sensitive attribute because it may include basic auth credentials.
        """
        return pulumi.get(self, "url")

