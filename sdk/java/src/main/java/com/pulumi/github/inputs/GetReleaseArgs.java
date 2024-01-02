// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReleaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReleaseArgs Empty = new GetReleaseArgs();

    /**
     * Owner of the repository.
     * 
     */
    @Import(name="owner", required=true)
    private Output<String> owner;

    /**
     * @return Owner of the repository.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }

    /**
     * ID of the release to retrieve. Must be specified when `retrieve_by` = `id`.
     * 
     */
    @Import(name="releaseId")
    private @Nullable Output<Integer> releaseId;

    /**
     * @return ID of the release to retrieve. Must be specified when `retrieve_by` = `id`.
     * 
     */
    public Optional<Output<Integer>> releaseId() {
        return Optional.ofNullable(this.releaseId);
    }

    /**
     * Tag of the release to retrieve. Must be specified when `retrieve_by` = `tag`.
     * 
     */
    @Import(name="releaseTag")
    private @Nullable Output<String> releaseTag;

    /**
     * @return Tag of the release to retrieve. Must be specified when `retrieve_by` = `tag`.
     * 
     */
    public Optional<Output<String>> releaseTag() {
        return Optional.ofNullable(this.releaseTag);
    }

    /**
     * Name of the repository to retrieve the release from.
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return Name of the repository to retrieve the release from.
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    /**
     * Describes how to fetch the release. Valid values are `id`, `tag`, `latest`.
     * 
     */
    @Import(name="retrieveBy", required=true)
    private Output<String> retrieveBy;

    /**
     * @return Describes how to fetch the release. Valid values are `id`, `tag`, `latest`.
     * 
     */
    public Output<String> retrieveBy() {
        return this.retrieveBy;
    }

    private GetReleaseArgs() {}

    private GetReleaseArgs(GetReleaseArgs $) {
        this.owner = $.owner;
        this.releaseId = $.releaseId;
        this.releaseTag = $.releaseTag;
        this.repository = $.repository;
        this.retrieveBy = $.retrieveBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReleaseArgs $;

        public Builder() {
            $ = new GetReleaseArgs();
        }

        public Builder(GetReleaseArgs defaults) {
            $ = new GetReleaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param owner Owner of the repository.
         * 
         * @return builder
         * 
         */
        public Builder owner(Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Owner of the repository.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param releaseId ID of the release to retrieve. Must be specified when `retrieve_by` = `id`.
         * 
         * @return builder
         * 
         */
        public Builder releaseId(@Nullable Output<Integer> releaseId) {
            $.releaseId = releaseId;
            return this;
        }

        /**
         * @param releaseId ID of the release to retrieve. Must be specified when `retrieve_by` = `id`.
         * 
         * @return builder
         * 
         */
        public Builder releaseId(Integer releaseId) {
            return releaseId(Output.of(releaseId));
        }

        /**
         * @param releaseTag Tag of the release to retrieve. Must be specified when `retrieve_by` = `tag`.
         * 
         * @return builder
         * 
         */
        public Builder releaseTag(@Nullable Output<String> releaseTag) {
            $.releaseTag = releaseTag;
            return this;
        }

        /**
         * @param releaseTag Tag of the release to retrieve. Must be specified when `retrieve_by` = `tag`.
         * 
         * @return builder
         * 
         */
        public Builder releaseTag(String releaseTag) {
            return releaseTag(Output.of(releaseTag));
        }

        /**
         * @param repository Name of the repository to retrieve the release from.
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository Name of the repository to retrieve the release from.
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        /**
         * @param retrieveBy Describes how to fetch the release. Valid values are `id`, `tag`, `latest`.
         * 
         * @return builder
         * 
         */
        public Builder retrieveBy(Output<String> retrieveBy) {
            $.retrieveBy = retrieveBy;
            return this;
        }

        /**
         * @param retrieveBy Describes how to fetch the release. Valid values are `id`, `tag`, `latest`.
         * 
         * @return builder
         * 
         */
        public Builder retrieveBy(String retrieveBy) {
            return retrieveBy(Output.of(retrieveBy));
        }

        public GetReleaseArgs build() {
            if ($.owner == null) {
                throw new MissingRequiredPropertyException("GetReleaseArgs", "owner");
            }
            if ($.repository == null) {
                throw new MissingRequiredPropertyException("GetReleaseArgs", "repository");
            }
            if ($.retrieveBy == null) {
                throw new MissingRequiredPropertyException("GetReleaseArgs", "retrieveBy");
            }
            return $;
        }
    }

}
