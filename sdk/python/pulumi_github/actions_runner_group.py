# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ActionsRunnerGroupArgs', 'ActionsRunnerGroup']

@pulumi.input_type
class ActionsRunnerGroupArgs:
    def __init__(__self__, *,
                 visibility: pulumi.Input[str],
                 allows_public_repositories: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 restricted_to_workflows: Optional[pulumi.Input[bool]] = None,
                 selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 selected_workflows: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ActionsRunnerGroup resource.
        :param pulumi.Input[str] visibility: Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        :param pulumi.Input[bool] allows_public_repositories: Whether public repositories can be added to the runner group. Defaults to false.
        :param pulumi.Input[str] name: Name of the runner group
        :param pulumi.Input[bool] restricted_to_workflows: If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] selected_repository_ids: IDs of the repositories which should be added to the runner group
        :param pulumi.Input[Sequence[pulumi.Input[str]]] selected_workflows: List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        """
        pulumi.set(__self__, "visibility", visibility)
        if allows_public_repositories is not None:
            pulumi.set(__self__, "allows_public_repositories", allows_public_repositories)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if restricted_to_workflows is not None:
            pulumi.set(__self__, "restricted_to_workflows", restricted_to_workflows)
        if selected_repository_ids is not None:
            pulumi.set(__self__, "selected_repository_ids", selected_repository_ids)
        if selected_workflows is not None:
            pulumi.set(__self__, "selected_workflows", selected_workflows)

    @property
    @pulumi.getter
    def visibility(self) -> pulumi.Input[str]:
        """
        Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        """
        return pulumi.get(self, "visibility")

    @visibility.setter
    def visibility(self, value: pulumi.Input[str]):
        pulumi.set(self, "visibility", value)

    @property
    @pulumi.getter(name="allowsPublicRepositories")
    def allows_public_repositories(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether public repositories can be added to the runner group. Defaults to false.
        """
        return pulumi.get(self, "allows_public_repositories")

    @allows_public_repositories.setter
    def allows_public_repositories(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allows_public_repositories", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the runner group
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="restrictedToWorkflows")
    def restricted_to_workflows(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        """
        return pulumi.get(self, "restricted_to_workflows")

    @restricted_to_workflows.setter
    def restricted_to_workflows(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restricted_to_workflows", value)

    @property
    @pulumi.getter(name="selectedRepositoryIds")
    def selected_repository_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        IDs of the repositories which should be added to the runner group
        """
        return pulumi.get(self, "selected_repository_ids")

    @selected_repository_ids.setter
    def selected_repository_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "selected_repository_ids", value)

    @property
    @pulumi.getter(name="selectedWorkflows")
    def selected_workflows(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        """
        return pulumi.get(self, "selected_workflows")

    @selected_workflows.setter
    def selected_workflows(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "selected_workflows", value)


@pulumi.input_type
class _ActionsRunnerGroupState:
    def __init__(__self__, *,
                 allows_public_repositories: Optional[pulumi.Input[bool]] = None,
                 default: Optional[pulumi.Input[bool]] = None,
                 etag: Optional[pulumi.Input[str]] = None,
                 inherited: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 restricted_to_workflows: Optional[pulumi.Input[bool]] = None,
                 runners_url: Optional[pulumi.Input[str]] = None,
                 selected_repositories_url: Optional[pulumi.Input[str]] = None,
                 selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 selected_workflows: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 visibility: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ActionsRunnerGroup resources.
        :param pulumi.Input[bool] allows_public_repositories: Whether public repositories can be added to the runner group. Defaults to false.
        :param pulumi.Input[bool] default: Whether this is the default runner group
        :param pulumi.Input[str] etag: An etag representing the runner group object
        :param pulumi.Input[bool] inherited: Whether the runner group is inherited from the enterprise level
        :param pulumi.Input[str] name: Name of the runner group
        :param pulumi.Input[bool] restricted_to_workflows: If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        :param pulumi.Input[str] runners_url: The GitHub API URL for the runner group's runners
        :param pulumi.Input[str] selected_repositories_url: GitHub API URL for the runner group's repositories
        :param pulumi.Input[Sequence[pulumi.Input[int]]] selected_repository_ids: IDs of the repositories which should be added to the runner group
        :param pulumi.Input[Sequence[pulumi.Input[str]]] selected_workflows: List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        :param pulumi.Input[str] visibility: Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        """
        if allows_public_repositories is not None:
            pulumi.set(__self__, "allows_public_repositories", allows_public_repositories)
        if default is not None:
            pulumi.set(__self__, "default", default)
        if etag is not None:
            pulumi.set(__self__, "etag", etag)
        if inherited is not None:
            pulumi.set(__self__, "inherited", inherited)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if restricted_to_workflows is not None:
            pulumi.set(__self__, "restricted_to_workflows", restricted_to_workflows)
        if runners_url is not None:
            pulumi.set(__self__, "runners_url", runners_url)
        if selected_repositories_url is not None:
            pulumi.set(__self__, "selected_repositories_url", selected_repositories_url)
        if selected_repository_ids is not None:
            pulumi.set(__self__, "selected_repository_ids", selected_repository_ids)
        if selected_workflows is not None:
            pulumi.set(__self__, "selected_workflows", selected_workflows)
        if visibility is not None:
            pulumi.set(__self__, "visibility", visibility)

    @property
    @pulumi.getter(name="allowsPublicRepositories")
    def allows_public_repositories(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether public repositories can be added to the runner group. Defaults to false.
        """
        return pulumi.get(self, "allows_public_repositories")

    @allows_public_repositories.setter
    def allows_public_repositories(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allows_public_repositories", value)

    @property
    @pulumi.getter
    def default(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this is the default runner group
        """
        return pulumi.get(self, "default")

    @default.setter
    def default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "default", value)

    @property
    @pulumi.getter
    def etag(self) -> Optional[pulumi.Input[str]]:
        """
        An etag representing the runner group object
        """
        return pulumi.get(self, "etag")

    @etag.setter
    def etag(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "etag", value)

    @property
    @pulumi.getter
    def inherited(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the runner group is inherited from the enterprise level
        """
        return pulumi.get(self, "inherited")

    @inherited.setter
    def inherited(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inherited", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the runner group
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="restrictedToWorkflows")
    def restricted_to_workflows(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        """
        return pulumi.get(self, "restricted_to_workflows")

    @restricted_to_workflows.setter
    def restricted_to_workflows(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restricted_to_workflows", value)

    @property
    @pulumi.getter(name="runnersUrl")
    def runners_url(self) -> Optional[pulumi.Input[str]]:
        """
        The GitHub API URL for the runner group's runners
        """
        return pulumi.get(self, "runners_url")

    @runners_url.setter
    def runners_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runners_url", value)

    @property
    @pulumi.getter(name="selectedRepositoriesUrl")
    def selected_repositories_url(self) -> Optional[pulumi.Input[str]]:
        """
        GitHub API URL for the runner group's repositories
        """
        return pulumi.get(self, "selected_repositories_url")

    @selected_repositories_url.setter
    def selected_repositories_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "selected_repositories_url", value)

    @property
    @pulumi.getter(name="selectedRepositoryIds")
    def selected_repository_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        IDs of the repositories which should be added to the runner group
        """
        return pulumi.get(self, "selected_repository_ids")

    @selected_repository_ids.setter
    def selected_repository_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "selected_repository_ids", value)

    @property
    @pulumi.getter(name="selectedWorkflows")
    def selected_workflows(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        """
        return pulumi.get(self, "selected_workflows")

    @selected_workflows.setter
    def selected_workflows(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "selected_workflows", value)

    @property
    @pulumi.getter
    def visibility(self) -> Optional[pulumi.Input[str]]:
        """
        Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        """
        return pulumi.get(self, "visibility")

    @visibility.setter
    def visibility(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "visibility", value)


class ActionsRunnerGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allows_public_repositories: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 restricted_to_workflows: Optional[pulumi.Input[bool]] = None,
                 selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 selected_workflows: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource allows you to create and manage GitHub Actions runner groups within your GitHub enterprise organizations.
        You must have admin access to an organization to use this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        example_repository = github.Repository("exampleRepository")
        example_actions_runner_group = github.ActionsRunnerGroup("exampleActionsRunnerGroup",
            visibility="selected",
            selected_repository_ids=[example_repository.repo_id])
        ```

        ## Import

        This resource can be imported using the ID of the runner group

        ```sh
         $ pulumi import github:index/actionsRunnerGroup:ActionsRunnerGroup test 7
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allows_public_repositories: Whether public repositories can be added to the runner group. Defaults to false.
        :param pulumi.Input[str] name: Name of the runner group
        :param pulumi.Input[bool] restricted_to_workflows: If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] selected_repository_ids: IDs of the repositories which should be added to the runner group
        :param pulumi.Input[Sequence[pulumi.Input[str]]] selected_workflows: List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        :param pulumi.Input[str] visibility: Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ActionsRunnerGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to create and manage GitHub Actions runner groups within your GitHub enterprise organizations.
        You must have admin access to an organization to use this resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_github as github

        example_repository = github.Repository("exampleRepository")
        example_actions_runner_group = github.ActionsRunnerGroup("exampleActionsRunnerGroup",
            visibility="selected",
            selected_repository_ids=[example_repository.repo_id])
        ```

        ## Import

        This resource can be imported using the ID of the runner group

        ```sh
         $ pulumi import github:index/actionsRunnerGroup:ActionsRunnerGroup test 7
        ```

        :param str resource_name: The name of the resource.
        :param ActionsRunnerGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ActionsRunnerGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allows_public_repositories: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 restricted_to_workflows: Optional[pulumi.Input[bool]] = None,
                 selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 selected_workflows: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ActionsRunnerGroupArgs.__new__(ActionsRunnerGroupArgs)

            __props__.__dict__["allows_public_repositories"] = allows_public_repositories
            __props__.__dict__["name"] = name
            __props__.__dict__["restricted_to_workflows"] = restricted_to_workflows
            __props__.__dict__["selected_repository_ids"] = selected_repository_ids
            __props__.__dict__["selected_workflows"] = selected_workflows
            if visibility is None and not opts.urn:
                raise TypeError("Missing required property 'visibility'")
            __props__.__dict__["visibility"] = visibility
            __props__.__dict__["default"] = None
            __props__.__dict__["etag"] = None
            __props__.__dict__["inherited"] = None
            __props__.__dict__["runners_url"] = None
            __props__.__dict__["selected_repositories_url"] = None
        super(ActionsRunnerGroup, __self__).__init__(
            'github:index/actionsRunnerGroup:ActionsRunnerGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allows_public_repositories: Optional[pulumi.Input[bool]] = None,
            default: Optional[pulumi.Input[bool]] = None,
            etag: Optional[pulumi.Input[str]] = None,
            inherited: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            restricted_to_workflows: Optional[pulumi.Input[bool]] = None,
            runners_url: Optional[pulumi.Input[str]] = None,
            selected_repositories_url: Optional[pulumi.Input[str]] = None,
            selected_repository_ids: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            selected_workflows: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            visibility: Optional[pulumi.Input[str]] = None) -> 'ActionsRunnerGroup':
        """
        Get an existing ActionsRunnerGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allows_public_repositories: Whether public repositories can be added to the runner group. Defaults to false.
        :param pulumi.Input[bool] default: Whether this is the default runner group
        :param pulumi.Input[str] etag: An etag representing the runner group object
        :param pulumi.Input[bool] inherited: Whether the runner group is inherited from the enterprise level
        :param pulumi.Input[str] name: Name of the runner group
        :param pulumi.Input[bool] restricted_to_workflows: If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        :param pulumi.Input[str] runners_url: The GitHub API URL for the runner group's runners
        :param pulumi.Input[str] selected_repositories_url: GitHub API URL for the runner group's repositories
        :param pulumi.Input[Sequence[pulumi.Input[int]]] selected_repository_ids: IDs of the repositories which should be added to the runner group
        :param pulumi.Input[Sequence[pulumi.Input[str]]] selected_workflows: List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        :param pulumi.Input[str] visibility: Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ActionsRunnerGroupState.__new__(_ActionsRunnerGroupState)

        __props__.__dict__["allows_public_repositories"] = allows_public_repositories
        __props__.__dict__["default"] = default
        __props__.__dict__["etag"] = etag
        __props__.__dict__["inherited"] = inherited
        __props__.__dict__["name"] = name
        __props__.__dict__["restricted_to_workflows"] = restricted_to_workflows
        __props__.__dict__["runners_url"] = runners_url
        __props__.__dict__["selected_repositories_url"] = selected_repositories_url
        __props__.__dict__["selected_repository_ids"] = selected_repository_ids
        __props__.__dict__["selected_workflows"] = selected_workflows
        __props__.__dict__["visibility"] = visibility
        return ActionsRunnerGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowsPublicRepositories")
    def allows_public_repositories(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether public repositories can be added to the runner group. Defaults to false.
        """
        return pulumi.get(self, "allows_public_repositories")

    @property
    @pulumi.getter
    def default(self) -> pulumi.Output[bool]:
        """
        Whether this is the default runner group
        """
        return pulumi.get(self, "default")

    @property
    @pulumi.getter
    def etag(self) -> pulumi.Output[str]:
        """
        An etag representing the runner group object
        """
        return pulumi.get(self, "etag")

    @property
    @pulumi.getter
    def inherited(self) -> pulumi.Output[bool]:
        """
        Whether the runner group is inherited from the enterprise level
        """
        return pulumi.get(self, "inherited")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the runner group
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="restrictedToWorkflows")
    def restricted_to_workflows(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the runner group will be restricted to running only the workflows specified in the selected_workflows array. Defaults to false.
        """
        return pulumi.get(self, "restricted_to_workflows")

    @property
    @pulumi.getter(name="runnersUrl")
    def runners_url(self) -> pulumi.Output[str]:
        """
        The GitHub API URL for the runner group's runners
        """
        return pulumi.get(self, "runners_url")

    @property
    @pulumi.getter(name="selectedRepositoriesUrl")
    def selected_repositories_url(self) -> pulumi.Output[str]:
        """
        GitHub API URL for the runner group's repositories
        """
        return pulumi.get(self, "selected_repositories_url")

    @property
    @pulumi.getter(name="selectedRepositoryIds")
    def selected_repository_ids(self) -> pulumi.Output[Optional[Sequence[int]]]:
        """
        IDs of the repositories which should be added to the runner group
        """
        return pulumi.get(self, "selected_repository_ids")

    @property
    @pulumi.getter(name="selectedWorkflows")
    def selected_workflows(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of workflows the runner group should be allowed to run. This setting will be ignored unless restricted_to_workflows is set to true.
        """
        return pulumi.get(self, "selected_workflows")

    @property
    @pulumi.getter
    def visibility(self) -> pulumi.Output[str]:
        """
        Visibility of a runner group. Whether the runner group can include `all`, `selected`, or `private` repositories. A value of `private` is not currently supported due to limitations in the GitHub API.
        """
        return pulumi.get(self, "visibility")

