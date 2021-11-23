# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetRepositoryFileResult',
    'AwaitableGetRepositoryFileResult',
    'get_repository_file',
]

@pulumi.output_type
class GetRepositoryFileResult:
    """
    A collection of values returned by getRepositoryFile.
    """
    def __init__(__self__, branch=None, commit_author=None, commit_email=None, commit_message=None, commit_sha=None, content=None, file=None, id=None, repository=None, sha=None):
        if branch and not isinstance(branch, str):
            raise TypeError("Expected argument 'branch' to be a str")
        pulumi.set(__self__, "branch", branch)
        if commit_author and not isinstance(commit_author, str):
            raise TypeError("Expected argument 'commit_author' to be a str")
        pulumi.set(__self__, "commit_author", commit_author)
        if commit_email and not isinstance(commit_email, str):
            raise TypeError("Expected argument 'commit_email' to be a str")
        pulumi.set(__self__, "commit_email", commit_email)
        if commit_message and not isinstance(commit_message, str):
            raise TypeError("Expected argument 'commit_message' to be a str")
        pulumi.set(__self__, "commit_message", commit_message)
        if commit_sha and not isinstance(commit_sha, str):
            raise TypeError("Expected argument 'commit_sha' to be a str")
        pulumi.set(__self__, "commit_sha", commit_sha)
        if content and not isinstance(content, str):
            raise TypeError("Expected argument 'content' to be a str")
        pulumi.set(__self__, "content", content)
        if file and not isinstance(file, str):
            raise TypeError("Expected argument 'file' to be a str")
        pulumi.set(__self__, "file", file)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if repository and not isinstance(repository, str):
            raise TypeError("Expected argument 'repository' to be a str")
        pulumi.set(__self__, "repository", repository)
        if sha and not isinstance(sha, str):
            raise TypeError("Expected argument 'sha' to be a str")
        pulumi.set(__self__, "sha", sha)

    @property
    @pulumi.getter
    def branch(self) -> Optional[str]:
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter(name="commitAuthor")
    def commit_author(self) -> str:
        """
        Committer author name.
        """
        return pulumi.get(self, "commit_author")

    @property
    @pulumi.getter(name="commitEmail")
    def commit_email(self) -> str:
        """
        Committer email address.
        """
        return pulumi.get(self, "commit_email")

    @property
    @pulumi.getter(name="commitMessage")
    def commit_message(self) -> str:
        """
        Commit message when file was last updated.
        """
        return pulumi.get(self, "commit_message")

    @property
    @pulumi.getter(name="commitSha")
    def commit_sha(self) -> str:
        """
        The SHA of the commit that modified the file.
        """
        return pulumi.get(self, "commit_sha")

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        The file content.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def file(self) -> str:
        return pulumi.get(self, "file")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def repository(self) -> str:
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter
    def sha(self) -> str:
        """
        The SHA blob of the file.
        """
        return pulumi.get(self, "sha")


class AwaitableGetRepositoryFileResult(GetRepositoryFileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepositoryFileResult(
            branch=self.branch,
            commit_author=self.commit_author,
            commit_email=self.commit_email,
            commit_message=self.commit_message,
            commit_sha=self.commit_sha,
            content=self.content,
            file=self.file,
            id=self.id,
            repository=self.repository,
            sha=self.sha)


def get_repository_file(branch: Optional[str] = None,
                        file: Optional[str] = None,
                        repository: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepositoryFileResult:
    """
    This data source allows you to read files within a
    GitHub repository.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_github as github

    foo = github.get_repository_file(repository=github_repository["foo"]["name"],
        branch="main",
        file=".gitignore")
    ```


    :param str branch: Git branch (defaults to `main`).
           The branch must already exist, it will not be created if it does not already exist.
    :param str file: The path of the file to manage.
    :param str repository: The repository to create the file in.
    """
    __args__ = dict()
    __args__['branch'] = branch
    __args__['file'] = file
    __args__['repository'] = repository
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('github:index/getRepositoryFile:getRepositoryFile', __args__, opts=opts, typ=GetRepositoryFileResult).value

    return AwaitableGetRepositoryFileResult(
        branch=__ret__.branch,
        commit_author=__ret__.commit_author,
        commit_email=__ret__.commit_email,
        commit_message=__ret__.commit_message,
        commit_sha=__ret__.commit_sha,
        content=__ret__.content,
        file=__ret__.file,
        id=__ret__.id,
        repository=__ret__.repository,
        sha=__ret__.sha)
