// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmuGroupMappingState extends com.pulumi.resources.ResourceArgs {

    public static final EmuGroupMappingState Empty = new EmuGroupMappingState();

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="groupId")
    private @Nullable Output<Integer> groupId;

    public Optional<Output<Integer>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    @Import(name="teamSlug")
    private @Nullable Output<String> teamSlug;

    public Optional<Output<String>> teamSlug() {
        return Optional.ofNullable(this.teamSlug);
    }

    private EmuGroupMappingState() {}

    private EmuGroupMappingState(EmuGroupMappingState $) {
        this.etag = $.etag;
        this.groupId = $.groupId;
        this.teamSlug = $.teamSlug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmuGroupMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmuGroupMappingState $;

        public Builder() {
            $ = new EmuGroupMappingState();
        }

        public Builder(EmuGroupMappingState defaults) {
            $ = new EmuGroupMappingState(Objects.requireNonNull(defaults));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder groupId(@Nullable Output<Integer> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(Integer groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder teamSlug(@Nullable Output<String> teamSlug) {
            $.teamSlug = teamSlug;
            return this;
        }

        public Builder teamSlug(String teamSlug) {
            return teamSlug(Output.of(teamSlug));
        }

        public EmuGroupMappingState build() {
            return $;
        }
    }

}