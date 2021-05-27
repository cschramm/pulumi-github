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
    'BranchProtectionRequiredPullRequestReview',
    'BranchProtectionRequiredStatusCheck',
    'BranchProtectionV3RequiredPullRequestReviews',
    'BranchProtectionV3RequiredStatusChecks',
    'BranchProtectionV3Restrictions',
    'OrganizationWebhookConfiguration',
    'ProviderAppAuth',
    'RepositoryPages',
    'RepositoryPagesSource',
    'RepositoryTemplate',
    'RepositoryWebhookConfiguration',
    'TeamSyncGroupMappingGroup',
    'GetCollaboratorsCollaboratorResult',
    'GetOrganizationTeamSyncGroupsGroupResult',
    'GetOrganizationTeamsTeamResult',
    'GetRepositoryPageResult',
    'GetRepositoryPageSourceResult',
    'GetRepositoryPullRequestsResultResult',
]

@pulumi.output_type
class BranchProtectionRequiredPullRequestReview(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dismissStaleReviews":
            suggest = "dismiss_stale_reviews"
        elif key == "dismissalRestrictions":
            suggest = "dismissal_restrictions"
        elif key == "requireCodeOwnerReviews":
            suggest = "require_code_owner_reviews"
        elif key == "requiredApprovingReviewCount":
            suggest = "required_approving_review_count"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in BranchProtectionRequiredPullRequestReview. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        BranchProtectionRequiredPullRequestReview.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        BranchProtectionRequiredPullRequestReview.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dismiss_stale_reviews: Optional[bool] = None,
                 dismissal_restrictions: Optional[Sequence[str]] = None,
                 require_code_owner_reviews: Optional[bool] = None,
                 required_approving_review_count: Optional[int] = None):
        if dismiss_stale_reviews is not None:
            pulumi.set(__self__, "dismiss_stale_reviews", dismiss_stale_reviews)
        if dismissal_restrictions is not None:
            pulumi.set(__self__, "dismissal_restrictions", dismissal_restrictions)
        if require_code_owner_reviews is not None:
            pulumi.set(__self__, "require_code_owner_reviews", require_code_owner_reviews)
        if required_approving_review_count is not None:
            pulumi.set(__self__, "required_approving_review_count", required_approving_review_count)

    @property
    @pulumi.getter(name="dismissStaleReviews")
    def dismiss_stale_reviews(self) -> Optional[bool]:
        return pulumi.get(self, "dismiss_stale_reviews")

    @property
    @pulumi.getter(name="dismissalRestrictions")
    def dismissal_restrictions(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "dismissal_restrictions")

    @property
    @pulumi.getter(name="requireCodeOwnerReviews")
    def require_code_owner_reviews(self) -> Optional[bool]:
        return pulumi.get(self, "require_code_owner_reviews")

    @property
    @pulumi.getter(name="requiredApprovingReviewCount")
    def required_approving_review_count(self) -> Optional[int]:
        return pulumi.get(self, "required_approving_review_count")


@pulumi.output_type
class BranchProtectionRequiredStatusCheck(dict):
    def __init__(__self__, *,
                 contexts: Optional[Sequence[str]] = None,
                 strict: Optional[bool] = None):
        if contexts is not None:
            pulumi.set(__self__, "contexts", contexts)
        if strict is not None:
            pulumi.set(__self__, "strict", strict)

    @property
    @pulumi.getter
    def contexts(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "contexts")

    @property
    @pulumi.getter
    def strict(self) -> Optional[bool]:
        return pulumi.get(self, "strict")


@pulumi.output_type
class BranchProtectionV3RequiredPullRequestReviews(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dismissStaleReviews":
            suggest = "dismiss_stale_reviews"
        elif key == "dismissalTeams":
            suggest = "dismissal_teams"
        elif key == "dismissalUsers":
            suggest = "dismissal_users"
        elif key == "includeAdmins":
            suggest = "include_admins"
        elif key == "requireCodeOwnerReviews":
            suggest = "require_code_owner_reviews"
        elif key == "requiredApprovingReviewCount":
            suggest = "required_approving_review_count"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in BranchProtectionV3RequiredPullRequestReviews. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        BranchProtectionV3RequiredPullRequestReviews.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        BranchProtectionV3RequiredPullRequestReviews.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 dismiss_stale_reviews: Optional[bool] = None,
                 dismissal_teams: Optional[Sequence[str]] = None,
                 dismissal_users: Optional[Sequence[str]] = None,
                 include_admins: Optional[bool] = None,
                 require_code_owner_reviews: Optional[bool] = None,
                 required_approving_review_count: Optional[int] = None):
        if dismiss_stale_reviews is not None:
            pulumi.set(__self__, "dismiss_stale_reviews", dismiss_stale_reviews)
        if dismissal_teams is not None:
            pulumi.set(__self__, "dismissal_teams", dismissal_teams)
        if dismissal_users is not None:
            pulumi.set(__self__, "dismissal_users", dismissal_users)
        if include_admins is not None:
            pulumi.set(__self__, "include_admins", include_admins)
        if require_code_owner_reviews is not None:
            pulumi.set(__self__, "require_code_owner_reviews", require_code_owner_reviews)
        if required_approving_review_count is not None:
            pulumi.set(__self__, "required_approving_review_count", required_approving_review_count)

    @property
    @pulumi.getter(name="dismissStaleReviews")
    def dismiss_stale_reviews(self) -> Optional[bool]:
        return pulumi.get(self, "dismiss_stale_reviews")

    @property
    @pulumi.getter(name="dismissalTeams")
    def dismissal_teams(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "dismissal_teams")

    @property
    @pulumi.getter(name="dismissalUsers")
    def dismissal_users(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "dismissal_users")

    @property
    @pulumi.getter(name="includeAdmins")
    def include_admins(self) -> Optional[bool]:
        return pulumi.get(self, "include_admins")

    @property
    @pulumi.getter(name="requireCodeOwnerReviews")
    def require_code_owner_reviews(self) -> Optional[bool]:
        return pulumi.get(self, "require_code_owner_reviews")

    @property
    @pulumi.getter(name="requiredApprovingReviewCount")
    def required_approving_review_count(self) -> Optional[int]:
        return pulumi.get(self, "required_approving_review_count")


@pulumi.output_type
class BranchProtectionV3RequiredStatusChecks(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "includeAdmins":
            suggest = "include_admins"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in BranchProtectionV3RequiredStatusChecks. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        BranchProtectionV3RequiredStatusChecks.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        BranchProtectionV3RequiredStatusChecks.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 contexts: Optional[Sequence[str]] = None,
                 include_admins: Optional[bool] = None,
                 strict: Optional[bool] = None):
        if contexts is not None:
            pulumi.set(__self__, "contexts", contexts)
        if include_admins is not None:
            pulumi.set(__self__, "include_admins", include_admins)
        if strict is not None:
            pulumi.set(__self__, "strict", strict)

    @property
    @pulumi.getter
    def contexts(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "contexts")

    @property
    @pulumi.getter(name="includeAdmins")
    def include_admins(self) -> Optional[bool]:
        return pulumi.get(self, "include_admins")

    @property
    @pulumi.getter
    def strict(self) -> Optional[bool]:
        return pulumi.get(self, "strict")


@pulumi.output_type
class BranchProtectionV3Restrictions(dict):
    def __init__(__self__, *,
                 apps: Optional[Sequence[str]] = None,
                 teams: Optional[Sequence[str]] = None,
                 users: Optional[Sequence[str]] = None):
        if apps is not None:
            pulumi.set(__self__, "apps", apps)
        if teams is not None:
            pulumi.set(__self__, "teams", teams)
        if users is not None:
            pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def apps(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "apps")

    @property
    @pulumi.getter
    def teams(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "teams")

    @property
    @pulumi.getter
    def users(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "users")


@pulumi.output_type
class OrganizationWebhookConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "contentType":
            suggest = "content_type"
        elif key == "insecureSsl":
            suggest = "insecure_ssl"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OrganizationWebhookConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OrganizationWebhookConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OrganizationWebhookConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 url: str,
                 content_type: Optional[str] = None,
                 insecure_ssl: Optional[bool] = None,
                 secret: Optional[str] = None):
        """
        :param str url: URL of the webhook
        """
        pulumi.set(__self__, "url", url)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if insecure_ssl is not None:
            pulumi.set(__self__, "insecure_ssl", insecure_ssl)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        URL of the webhook
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[str]:
        return pulumi.get(self, "content_type")

    @property
    @pulumi.getter(name="insecureSsl")
    def insecure_ssl(self) -> Optional[bool]:
        return pulumi.get(self, "insecure_ssl")

    @property
    @pulumi.getter
    def secret(self) -> Optional[str]:
        return pulumi.get(self, "secret")


@pulumi.output_type
class ProviderAppAuth(dict):
    def __init__(__self__, *,
                 id: str,
                 installation_id: str,
                 pem_file: str):
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "installation_id", installation_id)
        pulumi.set(__self__, "pem_file", pem_file)

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="installationId")
    def installation_id(self) -> str:
        return pulumi.get(self, "installation_id")

    @property
    @pulumi.getter(name="pemFile")
    def pem_file(self) -> str:
        return pulumi.get(self, "pem_file")


@pulumi.output_type
class RepositoryPages(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "htmlUrl":
            suggest = "html_url"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryPages. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryPages.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryPages.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 source: 'outputs.RepositoryPagesSource',
                 cname: Optional[str] = None,
                 custom404: Optional[bool] = None,
                 html_url: Optional[str] = None,
                 status: Optional[str] = None,
                 url: Optional[str] = None):
        """
        :param 'RepositoryPagesSourceArgs' source: The source branch and directory for the rendered Pages site. See GitHub Pages Source below for details.
        :param str cname: The custom domain for the repository. This can only be set after the repository has been created.
        :param bool custom404: Whether the rendered GitHub Pages site has a custom 404 page.
        :param str html_url: The absolute URL (including scheme) of the rendered GitHub Pages site e.g. `https://username.github.io`.
        :param str status: The GitHub Pages site's build status e.g. `building` or `built`.
        """
        pulumi.set(__self__, "source", source)
        if cname is not None:
            pulumi.set(__self__, "cname", cname)
        if custom404 is not None:
            pulumi.set(__self__, "custom404", custom404)
        if html_url is not None:
            pulumi.set(__self__, "html_url", html_url)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def source(self) -> 'outputs.RepositoryPagesSource':
        """
        The source branch and directory for the rendered Pages site. See GitHub Pages Source below for details.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def cname(self) -> Optional[str]:
        """
        The custom domain for the repository. This can only be set after the repository has been created.
        """
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter
    def custom404(self) -> Optional[bool]:
        """
        Whether the rendered GitHub Pages site has a custom 404 page.
        """
        return pulumi.get(self, "custom404")

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> Optional[str]:
        """
        The absolute URL (including scheme) of the rendered GitHub Pages site e.g. `https://username.github.io`.
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The GitHub Pages site's build status e.g. `building` or `built`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def url(self) -> Optional[str]:
        return pulumi.get(self, "url")


@pulumi.output_type
class RepositoryPagesSource(dict):
    def __init__(__self__, *,
                 branch: str,
                 path: Optional[str] = None):
        """
        :param str branch: The repository branch used to publish the site's source files. (i.e. `main` or `gh-pages`.
        :param str path: The repository directory from which the site publishes (Default: `/`).
        """
        pulumi.set(__self__, "branch", branch)
        if path is not None:
            pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def branch(self) -> str:
        """
        The repository branch used to publish the site's source files. (i.e. `main` or `gh-pages`.
        """
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter
    def path(self) -> Optional[str]:
        """
        The repository directory from which the site publishes (Default: `/`).
        """
        return pulumi.get(self, "path")


@pulumi.output_type
class RepositoryTemplate(dict):
    def __init__(__self__, *,
                 owner: str,
                 repository: str):
        pulumi.set(__self__, "owner", owner)
        pulumi.set(__self__, "repository", repository)

    @property
    @pulumi.getter
    def owner(self) -> str:
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def repository(self) -> str:
        return pulumi.get(self, "repository")


@pulumi.output_type
class RepositoryWebhookConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "contentType":
            suggest = "content_type"
        elif key == "insecureSsl":
            suggest = "insecure_ssl"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RepositoryWebhookConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RepositoryWebhookConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RepositoryWebhookConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 url: str,
                 content_type: Optional[str] = None,
                 insecure_ssl: Optional[bool] = None,
                 secret: Optional[str] = None):
        """
        :param str url: URL of the webhook.  This is a sensitive attribute because it may include basic auth credentials.
        """
        pulumi.set(__self__, "url", url)
        if content_type is not None:
            pulumi.set(__self__, "content_type", content_type)
        if insecure_ssl is not None:
            pulumi.set(__self__, "insecure_ssl", insecure_ssl)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        URL of the webhook.  This is a sensitive attribute because it may include basic auth credentials.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="contentType")
    def content_type(self) -> Optional[str]:
        return pulumi.get(self, "content_type")

    @property
    @pulumi.getter(name="insecureSsl")
    def insecure_ssl(self) -> Optional[bool]:
        return pulumi.get(self, "insecure_ssl")

    @property
    @pulumi.getter
    def secret(self) -> Optional[str]:
        return pulumi.get(self, "secret")


@pulumi.output_type
class TeamSyncGroupMappingGroup(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "groupDescription":
            suggest = "group_description"
        elif key == "groupId":
            suggest = "group_id"
        elif key == "groupName":
            suggest = "group_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TeamSyncGroupMappingGroup. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TeamSyncGroupMappingGroup.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TeamSyncGroupMappingGroup.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 group_description: str,
                 group_id: str,
                 group_name: str):
        """
        :param str group_description: The description of the IdP group.
        :param str group_id: The ID of the IdP group.
        :param str group_name: The name of the IdP group.
        """
        pulumi.set(__self__, "group_description", group_description)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)

    @property
    @pulumi.getter(name="groupDescription")
    def group_description(self) -> str:
        """
        The description of the IdP group.
        """
        return pulumi.get(self, "group_description")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        The ID of the IdP group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        The name of the IdP group.
        """
        return pulumi.get(self, "group_name")


@pulumi.output_type
class GetCollaboratorsCollaboratorResult(dict):
    def __init__(__self__, *,
                 events_url: str,
                 followers_url: str,
                 following_url: str,
                 gists_url: str,
                 html_url: str,
                 id: int,
                 login: str,
                 organizations_url: str,
                 permission: str,
                 received_events_url: str,
                 repos_url: str,
                 site_admin: bool,
                 starred_url: str,
                 subscriptions_url: str,
                 type: str,
                 url: str):
        """
        :param str events_url: The GitHub API URL for the collaborator's events.
        :param str followers_url: The GitHub API URL for the collaborator's followers.
        :param str following_url: The GitHub API URL for those following the collaborator.
        :param str gists_url: The GitHub API URL for the collaborator's gists.
        :param str html_url: The GitHub HTML URL for the collaborator.
        :param int id: The ID of the collaborator.
        :param str login: The collaborator's login.
        :param str organizations_url: The GitHub API URL for the collaborator's organizations.
        :param str permission: The permission of the collaborator.
        :param str received_events_url: The GitHub API URL for the collaborator's received events.
        :param str repos_url: The GitHub API URL for the collaborator's repositories.
        :param bool site_admin: Whether the user is a GitHub admin.
        :param str starred_url: The GitHub API URL for the collaborator's starred repositories.
        :param str subscriptions_url: The GitHub API URL for the collaborator's subscribed repositories.
        :param str type: The type of the collaborator (ex. `user`).
        :param str url: The GitHub API URL for the collaborator.
        """
        pulumi.set(__self__, "events_url", events_url)
        pulumi.set(__self__, "followers_url", followers_url)
        pulumi.set(__self__, "following_url", following_url)
        pulumi.set(__self__, "gists_url", gists_url)
        pulumi.set(__self__, "html_url", html_url)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "login", login)
        pulumi.set(__self__, "organizations_url", organizations_url)
        pulumi.set(__self__, "permission", permission)
        pulumi.set(__self__, "received_events_url", received_events_url)
        pulumi.set(__self__, "repos_url", repos_url)
        pulumi.set(__self__, "site_admin", site_admin)
        pulumi.set(__self__, "starred_url", starred_url)
        pulumi.set(__self__, "subscriptions_url", subscriptions_url)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="eventsUrl")
    def events_url(self) -> str:
        """
        The GitHub API URL for the collaborator's events.
        """
        return pulumi.get(self, "events_url")

    @property
    @pulumi.getter(name="followersUrl")
    def followers_url(self) -> str:
        """
        The GitHub API URL for the collaborator's followers.
        """
        return pulumi.get(self, "followers_url")

    @property
    @pulumi.getter(name="followingUrl")
    def following_url(self) -> str:
        """
        The GitHub API URL for those following the collaborator.
        """
        return pulumi.get(self, "following_url")

    @property
    @pulumi.getter(name="gistsUrl")
    def gists_url(self) -> str:
        """
        The GitHub API URL for the collaborator's gists.
        """
        return pulumi.get(self, "gists_url")

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> str:
        """
        The GitHub HTML URL for the collaborator.
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The ID of the collaborator.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def login(self) -> str:
        """
        The collaborator's login.
        """
        return pulumi.get(self, "login")

    @property
    @pulumi.getter(name="organizationsUrl")
    def organizations_url(self) -> str:
        """
        The GitHub API URL for the collaborator's organizations.
        """
        return pulumi.get(self, "organizations_url")

    @property
    @pulumi.getter
    def permission(self) -> str:
        """
        The permission of the collaborator.
        """
        return pulumi.get(self, "permission")

    @property
    @pulumi.getter(name="receivedEventsUrl")
    def received_events_url(self) -> str:
        """
        The GitHub API URL for the collaborator's received events.
        """
        return pulumi.get(self, "received_events_url")

    @property
    @pulumi.getter(name="reposUrl")
    def repos_url(self) -> str:
        """
        The GitHub API URL for the collaborator's repositories.
        """
        return pulumi.get(self, "repos_url")

    @property
    @pulumi.getter(name="siteAdmin")
    def site_admin(self) -> bool:
        """
        Whether the user is a GitHub admin.
        """
        return pulumi.get(self, "site_admin")

    @property
    @pulumi.getter(name="starredUrl")
    def starred_url(self) -> str:
        """
        The GitHub API URL for the collaborator's starred repositories.
        """
        return pulumi.get(self, "starred_url")

    @property
    @pulumi.getter(name="subscriptionsUrl")
    def subscriptions_url(self) -> str:
        """
        The GitHub API URL for the collaborator's subscribed repositories.
        """
        return pulumi.get(self, "subscriptions_url")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the collaborator (ex. `user`).
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        The GitHub API URL for the collaborator.
        """
        return pulumi.get(self, "url")


@pulumi.output_type
class GetOrganizationTeamSyncGroupsGroupResult(dict):
    def __init__(__self__, *,
                 group_description: str,
                 group_id: str,
                 group_name: str):
        """
        :param str group_description: The description of the IdP group.
        :param str group_id: The ID of the IdP group.
        :param str group_name: The name of the IdP group.
        """
        pulumi.set(__self__, "group_description", group_description)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)

    @property
    @pulumi.getter(name="groupDescription")
    def group_description(self) -> str:
        """
        The description of the IdP group.
        """
        return pulumi.get(self, "group_description")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        The ID of the IdP group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        The name of the IdP group.
        """
        return pulumi.get(self, "group_name")


@pulumi.output_type
class GetOrganizationTeamsTeamResult(dict):
    def __init__(__self__, *,
                 description: str,
                 id: int,
                 members: Sequence[str],
                 name: str,
                 node_id: str,
                 privacy: str,
                 slug: str):
        """
        :param str description: the team's description.
        :param int id: the ID of the team.
        :param Sequence[str] members: List of team members.
        :param str name: the team's full name.
        :param str node_id: the Node ID of the team.
        :param str privacy: the team's privacy type.
        :param str slug: the slug of the team.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "members", members)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "node_id", node_id)
        pulumi.set(__self__, "privacy", privacy)
        pulumi.set(__self__, "slug", slug)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        the team's description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        the ID of the team.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def members(self) -> Sequence[str]:
        """
        List of team members.
        """
        return pulumi.get(self, "members")

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
    def privacy(self) -> str:
        """
        the team's privacy type.
        """
        return pulumi.get(self, "privacy")

    @property
    @pulumi.getter
    def slug(self) -> str:
        """
        the slug of the team.
        """
        return pulumi.get(self, "slug")


@pulumi.output_type
class GetRepositoryPageResult(dict):
    def __init__(__self__, *,
                 cname: str,
                 custom404: bool,
                 html_url: str,
                 sources: Sequence['outputs.GetRepositoryPageSourceResult'],
                 status: str,
                 url: str):
        """
        :param str html_url: URL to the repository on the web.
        """
        pulumi.set(__self__, "cname", cname)
        pulumi.set(__self__, "custom404", custom404)
        pulumi.set(__self__, "html_url", html_url)
        pulumi.set(__self__, "sources", sources)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def cname(self) -> str:
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter
    def custom404(self) -> bool:
        return pulumi.get(self, "custom404")

    @property
    @pulumi.getter(name="htmlUrl")
    def html_url(self) -> str:
        """
        URL to the repository on the web.
        """
        return pulumi.get(self, "html_url")

    @property
    @pulumi.getter
    def sources(self) -> Sequence['outputs.GetRepositoryPageSourceResult']:
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def url(self) -> str:
        return pulumi.get(self, "url")


@pulumi.output_type
class GetRepositoryPageSourceResult(dict):
    def __init__(__self__, *,
                 branch: str,
                 path: str):
        pulumi.set(__self__, "branch", branch)
        pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def branch(self) -> str:
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")


@pulumi.output_type
class GetRepositoryPullRequestsResultResult(dict):
    def __init__(__self__, *,
                 base_ref: str,
                 base_sha: str,
                 body: str,
                 draft: bool,
                 head_owner: str,
                 head_ref: str,
                 head_repository: str,
                 head_sha: str,
                 labels: Sequence[str],
                 maintainer_can_modify: bool,
                 number: int,
                 opened_at: int,
                 opened_by: str,
                 state: str,
                 title: str,
                 updated_at: int):
        """
        :param str base_ref: If set, filters Pull Requests by base branch name.
        :param str base_sha: Head commit SHA of the Pull Request base.
        :param str body: Body of the Pull Request.
        :param bool draft: Indicates Whether this Pull Request is a draft.
        :param str head_owner: Owner of the Pull Request head repository.
        :param str head_ref: If set, filters Pull Requests by head user or head organization and branch name in the format of "user:ref-name" or "organization:ref-name". For example: "github:new-script-format" or "octocat:test-branch".
        :param str head_repository: Name of the Pull Request head repository.
        :param str head_sha: Head commit SHA of the Pull Request head.
        :param Sequence[str] labels: List of label names set on the Pull Request.
        :param bool maintainer_can_modify: Indicates whether the base repository maintainers can modify the Pull Request.
        :param int number: The number of the Pull Request within the repository.
        :param int opened_at: Unix timestamp indicating the Pull Request creation time.
        :param str opened_by: GitHub login of the user who opened the Pull Request.
        :param str state: If set, filters Pull Requests by state. Can be "open", "closed", or "all". Default: "open".
        :param str title: The title of the Pull Request.
        :param int updated_at: The timestamp of the last Pull Request update.
        """
        pulumi.set(__self__, "base_ref", base_ref)
        pulumi.set(__self__, "base_sha", base_sha)
        pulumi.set(__self__, "body", body)
        pulumi.set(__self__, "draft", draft)
        pulumi.set(__self__, "head_owner", head_owner)
        pulumi.set(__self__, "head_ref", head_ref)
        pulumi.set(__self__, "head_repository", head_repository)
        pulumi.set(__self__, "head_sha", head_sha)
        pulumi.set(__self__, "labels", labels)
        pulumi.set(__self__, "maintainer_can_modify", maintainer_can_modify)
        pulumi.set(__self__, "number", number)
        pulumi.set(__self__, "opened_at", opened_at)
        pulumi.set(__self__, "opened_by", opened_by)
        pulumi.set(__self__, "state", state)
        pulumi.set(__self__, "title", title)
        pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="baseRef")
    def base_ref(self) -> str:
        """
        If set, filters Pull Requests by base branch name.
        """
        return pulumi.get(self, "base_ref")

    @property
    @pulumi.getter(name="baseSha")
    def base_sha(self) -> str:
        """
        Head commit SHA of the Pull Request base.
        """
        return pulumi.get(self, "base_sha")

    @property
    @pulumi.getter
    def body(self) -> str:
        """
        Body of the Pull Request.
        """
        return pulumi.get(self, "body")

    @property
    @pulumi.getter
    def draft(self) -> bool:
        """
        Indicates Whether this Pull Request is a draft.
        """
        return pulumi.get(self, "draft")

    @property
    @pulumi.getter(name="headOwner")
    def head_owner(self) -> str:
        """
        Owner of the Pull Request head repository.
        """
        return pulumi.get(self, "head_owner")

    @property
    @pulumi.getter(name="headRef")
    def head_ref(self) -> str:
        """
        If set, filters Pull Requests by head user or head organization and branch name in the format of "user:ref-name" or "organization:ref-name". For example: "github:new-script-format" or "octocat:test-branch".
        """
        return pulumi.get(self, "head_ref")

    @property
    @pulumi.getter(name="headRepository")
    def head_repository(self) -> str:
        """
        Name of the Pull Request head repository.
        """
        return pulumi.get(self, "head_repository")

    @property
    @pulumi.getter(name="headSha")
    def head_sha(self) -> str:
        """
        Head commit SHA of the Pull Request head.
        """
        return pulumi.get(self, "head_sha")

    @property
    @pulumi.getter
    def labels(self) -> Sequence[str]:
        """
        List of label names set on the Pull Request.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="maintainerCanModify")
    def maintainer_can_modify(self) -> bool:
        """
        Indicates whether the base repository maintainers can modify the Pull Request.
        """
        return pulumi.get(self, "maintainer_can_modify")

    @property
    @pulumi.getter
    def number(self) -> int:
        """
        The number of the Pull Request within the repository.
        """
        return pulumi.get(self, "number")

    @property
    @pulumi.getter(name="openedAt")
    def opened_at(self) -> int:
        """
        Unix timestamp indicating the Pull Request creation time.
        """
        return pulumi.get(self, "opened_at")

    @property
    @pulumi.getter(name="openedBy")
    def opened_by(self) -> str:
        """
        GitHub login of the user who opened the Pull Request.
        """
        return pulumi.get(self, "opened_by")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        If set, filters Pull Requests by state. Can be "open", "closed", or "all". Default: "open".
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def title(self) -> str:
        """
        The title of the Pull Request.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> int:
        """
        The timestamp of the last Pull Request update.
        """
        return pulumi.get(self, "updated_at")


