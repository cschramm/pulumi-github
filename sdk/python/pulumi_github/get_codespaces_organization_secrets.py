# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetCodespacesOrganizationSecretsResult',
    'AwaitableGetCodespacesOrganizationSecretsResult',
    'get_codespaces_organization_secrets',
]

@pulumi.output_type
class GetCodespacesOrganizationSecretsResult:
    """
    A collection of values returned by getCodespacesOrganizationSecrets.
    """
    def __init__(__self__, id=None, secrets=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if secrets and not isinstance(secrets, list):
            raise TypeError("Expected argument 'secrets' to be a list")
        pulumi.set(__self__, "secrets", secrets)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def secrets(self) -> Sequence['outputs.GetCodespacesOrganizationSecretsSecretResult']:
        """
        list of secrets for the repository
        """
        return pulumi.get(self, "secrets")


class AwaitableGetCodespacesOrganizationSecretsResult(GetCodespacesOrganizationSecretsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCodespacesOrganizationSecretsResult(
            id=self.id,
            secrets=self.secrets)


def get_codespaces_organization_secrets(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCodespacesOrganizationSecretsResult:
    """
    Use this data source to retrieve the list of codespaces secrets of the organization.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_github as github

    example = github.get_codespaces_organization_secrets()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('github:index/getCodespacesOrganizationSecrets:getCodespacesOrganizationSecrets', __args__, opts=opts, typ=GetCodespacesOrganizationSecretsResult).value

    return AwaitableGetCodespacesOrganizationSecretsResult(
        id=pulumi.get(__ret__, 'id'),
        secrets=pulumi.get(__ret__, 'secrets'))