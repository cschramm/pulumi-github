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
    'GetTeamResult',
    'AwaitableGetTeamResult',
    'get_team',
    'get_team_output',
]

@pulumi.output_type
class GetTeamResult:
    """
    A collection of values returned by getTeam.
    """
    def __init__(__self__, description=None, id=None, members=None, membership_type=None, name=None, node_id=None, permission=None, privacy=None, repositories=None, results_per_page=None, slug=None, summary_only=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        pulumi.set(__self__, "members", members)
        if membership_type and not isinstance(membership_type, str):
            raise TypeError("Expected argument 'membership_type' to be a str")
        pulumi.set(__self__, "membership_type", membership_type)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if permission and not isinstance(permission, str):
            raise TypeError("Expected argument 'permission' to be a str")
        pulumi.set(__self__, "permission", permission)
        if privacy and not isinstance(privacy, str):
            raise TypeError("Expected argument 'privacy' to be a str")
        pulumi.set(__self__, "privacy", privacy)
        if repositories and not isinstance(repositories, list):
            raise TypeError("Expected argument 'repositories' to be a list")
        pulumi.set(__self__, "repositories", repositories)
        if results_per_page and not isinstance(results_per_page, int):
            raise TypeError("Expected argument 'results_per_page' to be a int")
        pulumi.set(__self__, "results_per_page", results_per_page)
        if slug and not isinstance(slug, str):
            raise TypeError("Expected argument 'slug' to be a str")
        pulumi.set(__self__, "slug", slug)
        if summary_only and not isinstance(summary_only, bool):
            raise TypeError("Expected argument 'summary_only' to be a bool")
        pulumi.set(__self__, "summary_only", summary_only)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        the team's description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def members(self) -> Sequence[str]:
        """
        List of team members (list of GitHub usernames). Not returned if `summary_only = true`
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter(name="membershipType")
    def membership_type(self) -> Optional[str]:
        return pulumi.get(self, "membership_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        the team's full name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> str:
        """
        the Node ID of the team.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter
    def permission(self) -> str:
        """
        the team's permission level.
        """
        return pulumi.get(self, "permission")

    @property
    @pulumi.getter
    def privacy(self) -> str:
        """
        the team's privacy type.
        """
        return pulumi.get(self, "privacy")

    @property
    @pulumi.getter
    def repositories(self) -> Sequence[str]:
        """
        List of team repositories (list of repo names). Not returned if `summary_only = true`
        """
        return pulumi.get(self, "repositories")

    @property
    @pulumi.getter(name="resultsPerPage")
    def results_per_page(self) -> Optional[int]:
        return pulumi.get(self, "results_per_page")

    @property
    @pulumi.getter
    def slug(self) -> str:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter(name="summaryOnly")
    def summary_only(self) -> Optional[bool]:
        return pulumi.get(self, "summary_only")


class AwaitableGetTeamResult(GetTeamResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTeamResult(
            description=self.description,
            id=self.id,
            members=self.members,
            membership_type=self.membership_type,
            name=self.name,
            node_id=self.node_id,
            permission=self.permission,
            privacy=self.privacy,
            repositories=self.repositories,
            results_per_page=self.results_per_page,
            slug=self.slug,
            summary_only=self.summary_only)


def get_team(membership_type: Optional[str] = None,
             results_per_page: Optional[int] = None,
             slug: Optional[str] = None,
             summary_only: Optional[bool] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTeamResult:
    """
    Use this data source to retrieve information about a GitHub team.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_github as github

    example = github.get_team(slug="example")
    ```


    :param str membership_type: Type of membershp to be requested to fill the list of members. Can be either "all" or "immediate". Default: "all"
    :param int results_per_page: Set the number of results per graphql query. Reducing this number can alleviate timeout errors. Accepts a value between 0 - 100. Defaults to `100`.
    :param str slug: The team slug.
    :param bool summary_only: Exclude the members and repositories of the team from the returned result. Defaults to `false`.
    """
    __args__ = dict()
    __args__['membershipType'] = membership_type
    __args__['resultsPerPage'] = results_per_page
    __args__['slug'] = slug
    __args__['summaryOnly'] = summary_only
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('github:index/getTeam:getTeam', __args__, opts=opts, typ=GetTeamResult).value

    return AwaitableGetTeamResult(
        description=__ret__.description,
        id=__ret__.id,
        members=__ret__.members,
        membership_type=__ret__.membership_type,
        name=__ret__.name,
        node_id=__ret__.node_id,
        permission=__ret__.permission,
        privacy=__ret__.privacy,
        repositories=__ret__.repositories,
        results_per_page=__ret__.results_per_page,
        slug=__ret__.slug,
        summary_only=__ret__.summary_only)


@_utilities.lift_output_func(get_team)
def get_team_output(membership_type: Optional[pulumi.Input[Optional[str]]] = None,
                    results_per_page: Optional[pulumi.Input[Optional[int]]] = None,
                    slug: Optional[pulumi.Input[str]] = None,
                    summary_only: Optional[pulumi.Input[Optional[bool]]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTeamResult]:
    """
    Use this data source to retrieve information about a GitHub team.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_github as github

    example = github.get_team(slug="example")
    ```


    :param str membership_type: Type of membershp to be requested to fill the list of members. Can be either "all" or "immediate". Default: "all"
    :param int results_per_page: Set the number of results per graphql query. Reducing this number can alleviate timeout errors. Accepts a value between 0 - 100. Defaults to `100`.
    :param str slug: The team slug.
    :param bool summary_only: Exclude the members and repositories of the team from the returned result. Defaults to `false`.
    """
    ...
