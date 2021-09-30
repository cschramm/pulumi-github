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
    'GetRepositoryResult',
    'AwaitableGetRepositoryResult',
    'get_repository',
]

@pulumi.output_type
class GetRepositoryResult:
    """
    A collection of values returned by getRepository.
    """
    def __init__(__self__, allow_merge_commit=None, allow_rebase_merge=None, allow_squash_merge=None, archived=None, branches=None, default_branch=None, description=None, full_name=None, git_clone_url=None, has_downloads=None, has_issues=None, has_projects=None, has_wiki=None, homepage_url=None, html_url=None, http_clone_url=None, id=None, name=None, node_id=None, pages=None, private=None, repo_id=None, ssh_clone_url=None, svn_url=None, topics=None, visibility=None):
        if allow_merge_commit and not isinstance(allow_merge_commit, bool):
            raise TypeError("Expected argument 'allow_merge_commit' to be a bool")
        pulumi.set(__self__, "allow_merge_commit", allow_merge_commit)
        if allow_rebase_merge and not isinstance(allow_rebase_merge, bool):
            raise TypeError("Expected argument 'allow_rebase_merge' to be a bool")
        pulumi.set(__self__, "allow_rebase_merge", allow_rebase_merge)
        if allow_squash_merge and not isinstance(allow_squash_merge, bool):
            raise TypeError("Expected argument 'allow_squash_merge' to be a bool")
        pulumi.set(__self__, "allow_squash_merge", allow_squash_merge)
        if archived and not isinstance(archived, bool):
            raise TypeError("Expected argument 'archived' to be a bool")
        pulumi.set(__self__, "archived", archived)
        if branches and not isinstance(branches, list):
            raise TypeError("Expected argument 'branches' to be a list")
        pulumi.set(__self__, "branches", branches)
        if default_branch and not isinstance(default_branch, str):
            raise TypeError("Expected argument 'default_branch' to be a str")
        pulumi.set(__self__, "default_branch", default_branch)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if full_name and not isinstance(full_name, str):
            raise TypeError("Expected argument 'full_name' to be a str")
        pulumi.set(__self__, "full_name", full_name)
        if git_clone_url and not isinstance(git_clone_url, str):
            raise TypeError("Expected argument 'git_clone_url' to be a str")
        pulumi.set(__self__, "git_clone_url", git_clone_url)
        if has_downloads and not isinstance(has_downloads, bool):
            raise TypeError("Expected argument 'has_downloads' to be a bool")
        pulumi.set(__self__, "has_downloads", has_downloads)
        if has_issues and not isinstance(has_issues, bool):
            raise TypeError("Expected argument 'has_issues' to be a bool")
        pulumi.set(__self__, "has_issues", has_issues)
        if has_projects and not isinstance(has_projects, bool):
            raise TypeError("Expected argument 'has_projects' to be a bool")
        pulumi.set(__self__, "has_projects", has_projects)
        if has_wiki and not isinstance(has_wiki, bool):
            raise TypeError("Expected argument 'has_wiki' to be a bool")
        pulumi.set(__self__, "has_wiki", has_wiki)
        if homepage_url and not isinstance(homepage_url, str):
            raise TypeError("Expected argument 'homepage_url' to be a str")
        pulumi.set(__self__, "homepage_url", homepage_url)
        if html_url and not isinstance(html_url, str):
            raise TypeError("Expected argument 'html_url' to be a str")
        pulumi.set(__self__, "html_url", html_url)
        if http_clone_url and not isinstance(http_clone_url, str):
            raise TypeError("Expected argument 'http_clone_url' to be a str")
        pulumi.set(__self__, "http_clone_url", http_clone_url)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_id and not isinstance(node_id, str):
            raise TypeError("Expected argument 'node_id' to be a str")
        pulumi.set(__self__, "node_id", node_id)
        if pages and not isinstance(pages, list):
            raise TypeError("Expected argument 'pages' to be a list")
        pulumi.set(__self__, "pages", pages)
        if private and not isinstance(private, bool):
            raise TypeError("Expected argument 'private' to be a bool")
        pulumi.set(__self__, "private", private)
        if repo_id and not isinstance(repo_id, int):
            raise TypeError("Expected argument 'repo_id' to be a int")
        pulumi.set(__self__, "repo_id", repo_id)
        if ssh_clone_url and not isinstance(ssh_clone_url, str):
            raise TypeError("Expected argument 'ssh_clone_url' to be a str")
        pulumi.set(__self__, "ssh_clone_url", ssh_clone_url)
        if svn_url and not isinstance(svn_url, str):
            raise TypeError("Expected argument 'svn_url' to be a str")
        pulumi.set(__self__, "svn_url", svn_url)
        if topics and not isinstance(topics, list):
            raise TypeError("Expected argument 'topics' to be a list")
        pulumi.set(__self__, "topics", topics)
        if visibility and not isinstance(visibility, str):
            raise TypeError("Expected argument 'visibility' to be a str")
        pulumi.set(__self__, "visibility", visibility)

    @property
    @pulumi.getter(name="allowMergeCommit")
    def allow_merge_commit(self) -> bool:
        """
        Whether the repository allows merge commits.
        """
        return pulumi.get(self, "allow_merge_commit")

    @property
    @pulumi.getter(name="allowRebaseMerge")
    def allow_rebase_merge(self) -> bool:
        """
        Whether the repository allows rebase merges.
        """
        return pulumi.get(self, "allow_rebase_merge")

    @property
    @pulumi.getter(name="allowSquashMerge")
    def allow_squash_merge(self) -> bool:
        """
        Whether the repository allows squash merges.
        """
        return pulumi.get(self, "allow_squash_merge")

    @property
    @pulumi.getter
    def archived(self) -> bool:
        """
        Whether the repository is archived.
        """
        return pulumi.get(self, "archived")

    @property
    @pulumi.getter
    def branches(self) -> Sequence['outputs.GetRepositoryBranchResult']:
        """
        The list of this repository's branches. Each element of `branches` has the following attributes:
        """
        return pulumi.get(self, "branches")

    @property
    @pulumi.getter(name="defaultBranch")
    def default_branch(self) -> str:
        """
        The name of the default branch of the repository.
        """
        return pulumi.get(self, "default_branch")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        A description of the repository.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fullName")
    def full_name(self) -> str:
        return pulumi.get(self, "full_name")

    @property
    @pulumi.getter(name="gitCloneUrl")
    def git_clone_url(self) -> str:
        """
        URL that can be provided to `git clone` to clone the repository anonymously via the git protocol.
        """
        return pulumi.get(self, "git_clone_url")

    @property
    @pulumi.getter(name="hasDownloads")
    def has_downloads(self) -> bool:
        """
        Whether the repository has Downloads feature enabled.
        """
        return pulumi.get(self, "has_downloads")

    @property
    @pulumi.getter(name="hasIssues")
    def has_issues(self) -> bool:
        """
        Whether the repository has GitHub Issues enabled.
        """
        return pulumi.get(self, "has_issues")

    @property
    @pulumi.getter(name="hasProjects")
    def has_projects(self) -> bool:
        """
        Whether the repository has the GitHub Projects enabled.
        """
        return pulumi.get(self, "has_projects")

    @property
    @pulumi.getter(name="hasWiki")
    def has_wiki(self) -> bool:
        """
        Whether the repository has the GitHub Wiki enabled.
        """
        return pulumi.get(self, "has_wiki")

    @property
    @pulumi.getter(name="homepageUrl")
    def homepage_url(self) -> Optional[str]:
        """
        URL of a page describing the project.
        """
        return pulumi.get(self, "homepage_url")

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> str:
        """
        URL to the repository on the web.
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter(name="httpCloneUrl")
    def http_clone_url(self) -> str:
        """
        URL that can be provided to `git clone` to clone the repository via HTTPS.
        """
        return pulumi.get(self, "http_clone_url")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the branch.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> str:
        """
        GraphQL global node id for use with v4 API
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter
    def pages(self) -> Sequence['outputs.GetRepositoryPageResult']:
        """
        The repository's GitHub Pages configuration.
        """
        return pulumi.get(self, "pages")

    @property
    @pulumi.getter
    def private(self) -> bool:
        """
        Whether the repository is private.
        """
        return pulumi.get(self, "private")

    @property
    @pulumi.getter(name="repoId")
    def repo_id(self) -> int:
        """
        GitHub ID for the repository
        """
        return pulumi.get(self, "repo_id")

    @property
    @pulumi.getter(name="sshCloneUrl")
    def ssh_clone_url(self) -> str:
        """
        URL that can be provided to `git clone` to clone the repository via SSH.
        """
        return pulumi.get(self, "ssh_clone_url")

    @property
    @pulumi.getter(name="svnUrl")
    def svn_url(self) -> str:
        """
        URL that can be provided to `svn checkout` to check out the repository via GitHub's Subversion protocol emulation.
        """
        return pulumi.get(self, "svn_url")

    @property
    @pulumi.getter
    def topics(self) -> Sequence[str]:
        """
        The list of topics of the repository.
        """
        return pulumi.get(self, "topics")

    @property
    @pulumi.getter
    def visibility(self) -> str:
        """
        Whether the repository is public, private or internal.
        """
        return pulumi.get(self, "visibility")


class AwaitableGetRepositoryResult(GetRepositoryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepositoryResult(
            allow_merge_commit=self.allow_merge_commit,
            allow_rebase_merge=self.allow_rebase_merge,
            allow_squash_merge=self.allow_squash_merge,
            archived=self.archived,
            branches=self.branches,
            default_branch=self.default_branch,
            description=self.description,
            full_name=self.full_name,
            git_clone_url=self.git_clone_url,
            has_downloads=self.has_downloads,
            has_issues=self.has_issues,
            has_projects=self.has_projects,
            has_wiki=self.has_wiki,
            homepage_url=self.homepage_url,
            html_url=self.html_url,
            http_clone_url=self.http_clone_url,
            id=self.id,
            name=self.name,
            node_id=self.node_id,
            pages=self.pages,
            private=self.private,
            repo_id=self.repo_id,
            ssh_clone_url=self.ssh_clone_url,
            svn_url=self.svn_url,
            topics=self.topics,
            visibility=self.visibility)


def get_repository(description: Optional[str] = None,
                   full_name: Optional[str] = None,
                   homepage_url: Optional[str] = None,
                   name: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepositoryResult:
    """
    Use this data source to retrieve information about a GitHub repository.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_github as github

    example = github.get_repository(full_name="hashicorp/terraform")
    ```


    :param str description: A description of the repository.
    :param str full_name: Full name of the repository (in `org/name` format).
    :param str homepage_url: URL of a page describing the project.
    :param str name: The name of the repository.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['fullName'] = full_name
    __args__['homepageUrl'] = homepage_url
    __args__['name'] = name
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('github:index/getRepository:getRepository', __args__, opts=opts, typ=GetRepositoryResult).value

    return AwaitableGetRepositoryResult(
        allow_merge_commit=__ret__.allow_merge_commit,
        allow_rebase_merge=__ret__.allow_rebase_merge,
        allow_squash_merge=__ret__.allow_squash_merge,
        archived=__ret__.archived,
        branches=__ret__.branches,
        default_branch=__ret__.default_branch,
        description=__ret__.description,
        full_name=__ret__.full_name,
        git_clone_url=__ret__.git_clone_url,
        has_downloads=__ret__.has_downloads,
        has_issues=__ret__.has_issues,
        has_projects=__ret__.has_projects,
        has_wiki=__ret__.has_wiki,
        homepage_url=__ret__.homepage_url,
        html_url=__ret__.html_url,
        http_clone_url=__ret__.http_clone_url,
        id=__ret__.id,
        name=__ret__.name,
        node_id=__ret__.node_id,
        pages=__ret__.pages,
        private=__ret__.private,
        repo_id=__ret__.repo_id,
        ssh_clone_url=__ret__.ssh_clone_url,
        svn_url=__ret__.svn_url,
        topics=__ret__.topics,
        visibility=__ret__.visibility)
