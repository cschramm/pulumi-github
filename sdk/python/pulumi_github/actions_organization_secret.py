# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['ActionsOrganizationSecretArgs', 'ActionsOrganizationSecret']

@pulumi.input_type
class ActionsOrganizationSecretArgs:
    def __init__(__self__, *,
                 plaintext_value: pulumi.Input[str],
                 secret_name: pulumi.Input[str],
                 visibility: pulumi.Input[str],
                 selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None):
        """
        The set of arguments for constructing a ActionsOrganizationSecret resource.
        :param pulumi.Input[str] plaintext_value: Plaintext value of the secret to be encrypted
        :param pulumi.Input[str] secret_name: Name of the secret
        :param pulumi.Input[str] visibility: Configures the access that repositories have to the organization secret.
               Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] selected_repository_ids: An array of repository ids that can access the organization secret.
        """
        pulumi.set(__self__, "plaintext_value", plaintext_value)
        pulumi.set(__self__, "secret_name", secret_name)
        pulumi.set(__self__, "visibility", visibility)
        if selected_repository_ids is not None:
            pulumi.set(__self__, "selected_repository_ids", selected_repository_ids)

    @property
    @pulumi.getter(name="plaintextValue")
    def plaintext_value(self) -> pulumi.Input[str]:
        """
        Plaintext value of the secret to be encrypted
        """
        return pulumi.get(self, "plaintext_value")

    @plaintext_value.setter
    def plaintext_value(self, value: pulumi.Input[str]):
        pulumi.set(self, "plaintext_value", value)

    @property
    @pulumi.getter(name="secretName")
    def secret_name(self) -> pulumi.Input[str]:
        """
        Name of the secret
        """
        return pulumi.get(self, "secret_name")

    @secret_name.setter
    def secret_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_name", value)

    @property
    @pulumi.getter
    def visibility(self) -> pulumi.Input[str]:
        """
        Configures the access that repositories have to the organization secret.
        Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
        """
        return pulumi.get(self, "visibility")

    @visibility.setter
    def visibility(self, value: pulumi.Input[str]):
        pulumi.set(self, "visibility", value)

    @property
    @pulumi.getter(name="selectedRepositoryIds")
    def selected_repository_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        An array of repository ids that can access the organization secret.
        """
        return pulumi.get(self, "selected_repository_ids")

    @selected_repository_ids.setter
    def selected_repository_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "selected_repository_ids", value)


class ActionsOrganizationSecret(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 plaintext_value: Optional[pulumi.Input[str]] = None,
                 secret_name: Optional[pulumi.Input[str]] = None,
                 selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a ActionsOrganizationSecret resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] plaintext_value: Plaintext value of the secret to be encrypted
        :param pulumi.Input[str] secret_name: Name of the secret
        :param pulumi.Input[Sequence[pulumi.Input[int]]] selected_repository_ids: An array of repository ids that can access the organization secret.
        :param pulumi.Input[str] visibility: Configures the access that repositories have to the organization secret.
               Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ActionsOrganizationSecretArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ActionsOrganizationSecret resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ActionsOrganizationSecretArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ActionsOrganizationSecretArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 plaintext_value: Optional[pulumi.Input[str]] = None,
                 secret_name: Optional[pulumi.Input[str]] = None,
                 selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
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

            if plaintext_value is None and not opts.urn:
                raise TypeError("Missing required property 'plaintext_value'")
            __props__['plaintext_value'] = plaintext_value
            if secret_name is None and not opts.urn:
                raise TypeError("Missing required property 'secret_name'")
            __props__['secret_name'] = secret_name
            __props__['selected_repository_ids'] = selected_repository_ids
            if visibility is None and not opts.urn:
                raise TypeError("Missing required property 'visibility'")
            __props__['visibility'] = visibility
            __props__['created_at'] = None
            __props__['updated_at'] = None
        super(ActionsOrganizationSecret, __self__).__init__(
            'github:index/actionsOrganizationSecret:ActionsOrganizationSecret',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            plaintext_value: Optional[pulumi.Input[str]] = None,
            secret_name: Optional[pulumi.Input[str]] = None,
            selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            visibility: Optional[pulumi.Input[str]] = None) -> 'ActionsOrganizationSecret':
        """
        Get an existing ActionsOrganizationSecret resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: Date of actions_secret creation.
        :param pulumi.Input[str] plaintext_value: Plaintext value of the secret to be encrypted
        :param pulumi.Input[str] secret_name: Name of the secret
        :param pulumi.Input[Sequence[pulumi.Input[int]]] selected_repository_ids: An array of repository ids that can access the organization secret.
        :param pulumi.Input[str] updated_at: Date of actions_secret update.
        :param pulumi.Input[str] visibility: Configures the access that repositories have to the organization secret.
               Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["created_at"] = created_at
        __props__["plaintext_value"] = plaintext_value
        __props__["secret_name"] = secret_name
        __props__["selected_repository_ids"] = selected_repository_ids
        __props__["updated_at"] = updated_at
        __props__["visibility"] = visibility
        return ActionsOrganizationSecret(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Date of actions_secret creation.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="plaintextValue")
    def plaintext_value(self) -> pulumi.Output[str]:
        """
        Plaintext value of the secret to be encrypted
        """
        return pulumi.get(self, "plaintext_value")

    @property
    @pulumi.getter(name="secretName")
    def secret_name(self) -> pulumi.Output[str]:
        """
        Name of the secret
        """
        return pulumi.get(self, "secret_name")

    @property
    @pulumi.getter(name="selectedRepositoryIds")
    def selected_repository_ids(self) -> pulumi.Output[Optional[Sequence[int]]]:
        """
        An array of repository ids that can access the organization secret.
        """
        return pulumi.get(self, "selected_repository_ids")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        Date of actions_secret update.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def visibility(self) -> pulumi.Output[str]:
        """
        Configures the access that repositories have to the organization secret.
        Must be one of `all`, `private`, `selected`. `selected_repository_ids` is required if set to `selected`.
        """
        return pulumi.get(self, "visibility")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

