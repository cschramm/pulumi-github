// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.github.outputs.GetReleaseAsset;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReleaseResult {
    /**
     * @return **Deprecated**: Use `assets_url` resource instead
     * 
     * @deprecated
     * use assets_url instead
     * 
     */
    @Deprecated /* use assets_url instead */
    private String assertsUrl;
    /**
     * @return Collection of assets for the release. Each asset conforms to the following schema:
     * 
     */
    private List<GetReleaseAsset> assets;
    /**
     * @return URL of any associated assets with the release
     * 
     */
    private String assetsUrl;
    /**
     * @return Contents of the description (body) of a release
     * 
     */
    private String body;
    /**
     * @return Date the asset was created
     * 
     */
    private String createdAt;
    /**
     * @return (`Boolean`) indicates whether the release is a draft
     * 
     */
    private Boolean draft;
    /**
     * @return URL directing to detailed information on the release
     * 
     */
    private String htmlUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The file name of the asset
     * 
     */
    private String name;
    private String owner;
    /**
     * @return (`Boolean`) indicates whether the release is a prerelease
     * 
     */
    private Boolean prerelease;
    /**
     * @return Date of release publishing
     * 
     */
    private String publishedAt;
    /**
     * @return ID of release
     * 
     */
    private @Nullable Integer releaseId;
    /**
     * @return Tag of release
     * 
     */
    private @Nullable String releaseTag;
    private String repository;
    private String retrieveBy;
    /**
     * @return Download URL of a specific release in `tar.gz` format
     * 
     */
    private String tarballUrl;
    /**
     * @return Commitish value that determines where the Git release is created from
     * 
     */
    private String targetCommitish;
    /**
     * @return URL that can be used to upload Assets to the release
     * 
     */
    private String uploadUrl;
    /**
     * @return URL of the asset
     * 
     */
    private String url;
    /**
     * @return Download URL of a specific release in `zip` format
     * 
     */
    private String zipballUrl;

    private GetReleaseResult() {}
    /**
     * @return **Deprecated**: Use `assets_url` resource instead
     * 
     * @deprecated
     * use assets_url instead
     * 
     */
    @Deprecated /* use assets_url instead */
    public String assertsUrl() {
        return this.assertsUrl;
    }
    /**
     * @return Collection of assets for the release. Each asset conforms to the following schema:
     * 
     */
    public List<GetReleaseAsset> assets() {
        return this.assets;
    }
    /**
     * @return URL of any associated assets with the release
     * 
     */
    public String assetsUrl() {
        return this.assetsUrl;
    }
    /**
     * @return Contents of the description (body) of a release
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return Date the asset was created
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return (`Boolean`) indicates whether the release is a draft
     * 
     */
    public Boolean draft() {
        return this.draft;
    }
    /**
     * @return URL directing to detailed information on the release
     * 
     */
    public String htmlUrl() {
        return this.htmlUrl;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The file name of the asset
     * 
     */
    public String name() {
        return this.name;
    }
    public String owner() {
        return this.owner;
    }
    /**
     * @return (`Boolean`) indicates whether the release is a prerelease
     * 
     */
    public Boolean prerelease() {
        return this.prerelease;
    }
    /**
     * @return Date of release publishing
     * 
     */
    public String publishedAt() {
        return this.publishedAt;
    }
    /**
     * @return ID of release
     * 
     */
    public Optional<Integer> releaseId() {
        return Optional.ofNullable(this.releaseId);
    }
    /**
     * @return Tag of release
     * 
     */
    public Optional<String> releaseTag() {
        return Optional.ofNullable(this.releaseTag);
    }
    public String repository() {
        return this.repository;
    }
    public String retrieveBy() {
        return this.retrieveBy;
    }
    /**
     * @return Download URL of a specific release in `tar.gz` format
     * 
     */
    public String tarballUrl() {
        return this.tarballUrl;
    }
    /**
     * @return Commitish value that determines where the Git release is created from
     * 
     */
    public String targetCommitish() {
        return this.targetCommitish;
    }
    /**
     * @return URL that can be used to upload Assets to the release
     * 
     */
    public String uploadUrl() {
        return this.uploadUrl;
    }
    /**
     * @return URL of the asset
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Download URL of a specific release in `zip` format
     * 
     */
    public String zipballUrl() {
        return this.zipballUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReleaseResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String assertsUrl;
        private List<GetReleaseAsset> assets;
        private String assetsUrl;
        private String body;
        private String createdAt;
        private Boolean draft;
        private String htmlUrl;
        private String id;
        private String name;
        private String owner;
        private Boolean prerelease;
        private String publishedAt;
        private @Nullable Integer releaseId;
        private @Nullable String releaseTag;
        private String repository;
        private String retrieveBy;
        private String tarballUrl;
        private String targetCommitish;
        private String uploadUrl;
        private String url;
        private String zipballUrl;
        public Builder() {}
        public Builder(GetReleaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertsUrl = defaults.assertsUrl;
    	      this.assets = defaults.assets;
    	      this.assetsUrl = defaults.assetsUrl;
    	      this.body = defaults.body;
    	      this.createdAt = defaults.createdAt;
    	      this.draft = defaults.draft;
    	      this.htmlUrl = defaults.htmlUrl;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.prerelease = defaults.prerelease;
    	      this.publishedAt = defaults.publishedAt;
    	      this.releaseId = defaults.releaseId;
    	      this.releaseTag = defaults.releaseTag;
    	      this.repository = defaults.repository;
    	      this.retrieveBy = defaults.retrieveBy;
    	      this.tarballUrl = defaults.tarballUrl;
    	      this.targetCommitish = defaults.targetCommitish;
    	      this.uploadUrl = defaults.uploadUrl;
    	      this.url = defaults.url;
    	      this.zipballUrl = defaults.zipballUrl;
        }

        @CustomType.Setter
        public Builder assertsUrl(String assertsUrl) {
            if (assertsUrl == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "assertsUrl");
            }
            this.assertsUrl = assertsUrl;
            return this;
        }
        @CustomType.Setter
        public Builder assets(List<GetReleaseAsset> assets) {
            if (assets == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "assets");
            }
            this.assets = assets;
            return this;
        }
        public Builder assets(GetReleaseAsset... assets) {
            return assets(List.of(assets));
        }
        @CustomType.Setter
        public Builder assetsUrl(String assetsUrl) {
            if (assetsUrl == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "assetsUrl");
            }
            this.assetsUrl = assetsUrl;
            return this;
        }
        @CustomType.Setter
        public Builder body(String body) {
            if (body == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "body");
            }
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder draft(Boolean draft) {
            if (draft == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "draft");
            }
            this.draft = draft;
            return this;
        }
        @CustomType.Setter
        public Builder htmlUrl(String htmlUrl) {
            if (htmlUrl == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "htmlUrl");
            }
            this.htmlUrl = htmlUrl;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder prerelease(Boolean prerelease) {
            if (prerelease == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "prerelease");
            }
            this.prerelease = prerelease;
            return this;
        }
        @CustomType.Setter
        public Builder publishedAt(String publishedAt) {
            if (publishedAt == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "publishedAt");
            }
            this.publishedAt = publishedAt;
            return this;
        }
        @CustomType.Setter
        public Builder releaseId(@Nullable Integer releaseId) {

            this.releaseId = releaseId;
            return this;
        }
        @CustomType.Setter
        public Builder releaseTag(@Nullable String releaseTag) {

            this.releaseTag = releaseTag;
            return this;
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            if (repository == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "repository");
            }
            this.repository = repository;
            return this;
        }
        @CustomType.Setter
        public Builder retrieveBy(String retrieveBy) {
            if (retrieveBy == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "retrieveBy");
            }
            this.retrieveBy = retrieveBy;
            return this;
        }
        @CustomType.Setter
        public Builder tarballUrl(String tarballUrl) {
            if (tarballUrl == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "tarballUrl");
            }
            this.tarballUrl = tarballUrl;
            return this;
        }
        @CustomType.Setter
        public Builder targetCommitish(String targetCommitish) {
            if (targetCommitish == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "targetCommitish");
            }
            this.targetCommitish = targetCommitish;
            return this;
        }
        @CustomType.Setter
        public Builder uploadUrl(String uploadUrl) {
            if (uploadUrl == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "uploadUrl");
            }
            this.uploadUrl = uploadUrl;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "url");
            }
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder zipballUrl(String zipballUrl) {
            if (zipballUrl == null) {
              throw new MissingRequiredPropertyException("GetReleaseResult", "zipballUrl");
            }
            this.zipballUrl = zipballUrl;
            return this;
        }
        public GetReleaseResult build() {
            final var _resultValue = new GetReleaseResult();
            _resultValue.assertsUrl = assertsUrl;
            _resultValue.assets = assets;
            _resultValue.assetsUrl = assetsUrl;
            _resultValue.body = body;
            _resultValue.createdAt = createdAt;
            _resultValue.draft = draft;
            _resultValue.htmlUrl = htmlUrl;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.prerelease = prerelease;
            _resultValue.publishedAt = publishedAt;
            _resultValue.releaseId = releaseId;
            _resultValue.releaseTag = releaseTag;
            _resultValue.repository = repository;
            _resultValue.retrieveBy = retrieveBy;
            _resultValue.tarballUrl = tarballUrl;
            _resultValue.targetCommitish = targetCommitish;
            _resultValue.uploadUrl = uploadUrl;
            _resultValue.url = url;
            _resultValue.zipballUrl = zipballUrl;
            return _resultValue;
        }
    }
}
