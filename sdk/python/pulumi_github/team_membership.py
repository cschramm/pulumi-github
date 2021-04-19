# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TeamMembershipArgs', 'TeamMembership']

@pulumi.input_type
class TeamMembershipArgs:
    def __init__(__self__, *,
                 team_id: pulumi.Input[str],
                 username: pulumi.Input[str],
                 role: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TeamMembership resource.
        :param pulumi.Input[str] team_id: The GitHub team id
        :param pulumi.Input[str] username: The user to add to the team.
        :param pulumi.Input[str] role: The role of the user within the team.
               Must be one of `member` or `maintainer`. Defaults to `member`.
        """
        pulumi.set(__self__, "team_id", team_id)
        pulumi.set(__self__, "username", username)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Input[str]:
        """
        The GitHub team id
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        The user to add to the team.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        The role of the user within the team.
        Must be one of `member` or `maintainer`. Defaults to `member`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)


@pulumi.input_type
class _TeamMembershipState:
    def __init__(__self__, *,
                 etag: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TeamMembership resources.
        :param pulumi.Input[str] role: The role of the user within the team.
               Must be one of `member` or `maintainer`. Defaults to `member`.
        :param pulumi.Input[str] team_id: The GitHub team id
        :param pulumi.Input[str] username: The user to add to the team.
        """
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if team_id is not None:
            pulumi.set(__self__, "team_id", team_id)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        The role of the user within the team.
        Must be one of `member` or `maintainer`. Defaults to `member`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[str]]:
        """
        The GitHub team id
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The user to add to the team.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class TeamMembership(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a GitHub team membership resource.

        This resource allows you to add/remove users from teams in your organization. When applied,
        the user will be added to the team. If the user hasn't accepted their invitation to the
        organization, they won't be part of the team until they do. When
        destroyed, the user will be removed from the team.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        # Add a user to the organization
        membership_for_some_user = github.Membership("membershipForSomeUser",
            username="SomeUser",
            role="member")
        some_team = github.Team("someTeam", description="Some cool team")
        some_team_membership = github.TeamMembership("someTeamMembership",
            team_id=some_team.id,
            username="SomeUser",
            role="member")
        ```

        ## Import

        GitHub Team Membership can be imported using an ID made up of `teamid:username`, e.g.

        ```sh
         $ pulumi import github:index/teamMembership:TeamMembership member 1234567:someuser
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] role: The role of the user within the team.
               Must be one of `member` or `maintainer`. Defaults to `member`.
        :param pulumi.Input[str] team_id: The GitHub team id
        :param pulumi.Input[str] username: The user to add to the team.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamMembershipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a GitHub team membership resource.

        This resource allows you to add/remove users from teams in your organization. When applied,
        the user will be added to the team. If the user hasn't accepted their invitation to the
        organization, they won't be part of the team until they do. When
        destroyed, the user will be removed from the team.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        # Add a user to the organization
        membership_for_some_user = github.Membership("membershipForSomeUser",
            username="SomeUser",
            role="member")
        some_team = github.Team("someTeam", description="Some cool team")
        some_team_membership = github.TeamMembership("someTeamMembership",
            team_id=some_team.id,
            username="SomeUser",
            role="member")
        ```

        ## Import

        GitHub Team Membership can be imported using an ID made up of `teamid:username`, e.g.

        ```sh
         $ pulumi import github:index/teamMembership:TeamMembership member 1234567:someuser
        ```

        :param str resource_name: The name of the resource.
        :param TeamMembershipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamMembershipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamMembershipArgs.__new__(TeamMembershipArgs)

            __props__.__dict__["role"] = role
            if team_id is None and not opts.urn:
                raise TypeError("Missing required property 'team_id'")
            __props__.__dict__["team_id"] = team_id
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
            __props__.__dict__["etag"] = None
        super(TeamMembership, __self__).__init__(
            'github:index/teamMembership:TeamMembership',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            etag: Optional[pulumi.Input[str]] = None,
            role: Optional[pulumi.Input[str]] = None,
            team_id: Optional[pulumi.Input[str]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'TeamMembership':
        """
        Get an existing TeamMembership resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] role: The role of the user within the team.
               Must be one of `member` or `maintainer`. Defaults to `member`.
        :param pulumi.Input[str] team_id: The GitHub team id
        :param pulumi.Input[str] username: The user to add to the team.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamMembershipState.__new__(_TeamMembershipState)

        __props__.__dict__["etag"] = etag
        __props__.__dict__["role"] = role
        __props__.__dict__["team_id"] = team_id
        __props__.__dict__["username"] = username
        return TeamMembership(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[Optional[str]]:
        """
        The role of the user within the team.
        Must be one of `member` or `maintainer`. Defaults to `member`.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[str]:
        """
        The GitHub team id
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        The user to add to the team.
        """
        return pulumi.get(self, "username")

