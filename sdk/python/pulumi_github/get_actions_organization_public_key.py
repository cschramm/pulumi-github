# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetActionsOrganizationPublicKeyResult',
    'AwaitableGetActionsOrganizationPublicKeyResult',
    'get_actions_organization_public_key',
]

@pulumi.output_type
class GetActionsOrganizationPublicKeyResult:
    """
    A collection of values returned by getActionsOrganizationPublicKey.
    """
    def __init__(__self__, id=None, key=None, key_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if key and not isinstance(key, str):
            raise TypeError("Expected argument 'key' to be a str")
        pulumi.set(__self__, "key", key)
        if key_id and not isinstance(key_id, str):
            raise TypeError("Expected argument 'key_id' to be a str")
        pulumi.set(__self__, "key_id", key_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Actual key retrieved.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter(name="keyId")
    def key_id(self) -> str:
        """
        ID of the key that has been retrieved.
        """
        return pulumi.get(self, "key_id")


class AwaitableGetActionsOrganizationPublicKeyResult(GetActionsOrganizationPublicKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetActionsOrganizationPublicKeyResult(
            id=self.id,
            key=self.key,
            key_id=self.key_id)


def get_actions_organization_public_key(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetActionsOrganizationPublicKeyResult:
    """
    Use this data source to retrieve information about a GitHub Actions Organization public key. This data source is required to be used with other GitHub secrets interactions.
    Note that the provider `token` must have admin rights to an organization to retrieve it's action public key.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_github as github

    example = github.get_actions_organization_public_key()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('github:index/getActionsOrganizationPublicKey:getActionsOrganizationPublicKey', __args__, opts=opts, typ=GetActionsOrganizationPublicKeyResult).value

    return AwaitableGetActionsOrganizationPublicKeyResult(
        id=__ret__.id,
        key=__ret__.key,
        key_id=__ret__.key_id)
