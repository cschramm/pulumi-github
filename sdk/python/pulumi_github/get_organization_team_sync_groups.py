# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetOrganizationTeamSyncGroupsResult',
    'AwaitableGetOrganizationTeamSyncGroupsResult',
    'get_organization_team_sync_groups',
]

@pulumi.output_type
class GetOrganizationTeamSyncGroupsResult:
    """
    A collection of values returned by getOrganizationTeamSyncGroups.
    """
    def __init__(__self__, groups=None, id=None):
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetOrganizationTeamSyncGroupsGroupResult']:
        """
        An Array of GitHub Identity Provider Groups.  Each `group` block consists of the fields documented below.
        """
        return pulumi.get(self, "groups")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetOrganizationTeamSyncGroupsResult(GetOrganizationTeamSyncGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationTeamSyncGroupsResult(
            groups=self.groups,
            id=self.id)


def get_organization_team_sync_groups(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationTeamSyncGroupsResult:
    """
    Use this data source to retrieve the identity provider (IdP) groups for an organization.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_github as github

    test = github.get_organization_team_sync_groups()
    ```
    """
    __args__ = dict()
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('github:index/getOrganizationTeamSyncGroups:getOrganizationTeamSyncGroups', __args__, opts=opts, typ=GetOrganizationTeamSyncGroupsResult).value

    return AwaitableGetOrganizationTeamSyncGroupsResult(
        groups=__ret__.groups,
        id=__ret__.id)
