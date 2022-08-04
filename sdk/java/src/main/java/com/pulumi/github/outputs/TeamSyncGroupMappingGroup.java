// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TeamSyncGroupMappingGroup {
    /**
     * @return The description of the IdP group.
     * 
     */
    private final String groupDescription;
    /**
     * @return The ID of the IdP group.
     * 
     */
    private final String groupId;
    /**
     * @return The name of the IdP group.
     * 
     */
    private final String groupName;

    @CustomType.Constructor
    private TeamSyncGroupMappingGroup(
        @CustomType.Parameter("groupDescription") String groupDescription,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("groupName") String groupName) {
        this.groupDescription = groupDescription;
        this.groupId = groupId;
        this.groupName = groupName;
    }

    /**
     * @return The description of the IdP group.
     * 
     */
    public String groupDescription() {
        return this.groupDescription;
    }
    /**
     * @return The ID of the IdP group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The name of the IdP group.
     * 
     */
    public String groupName() {
        return this.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamSyncGroupMappingGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupDescription;
        private String groupId;
        private String groupName;

        public Builder() {
    	      // Empty
        }

        public Builder(TeamSyncGroupMappingGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupDescription = defaults.groupDescription;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
        }

        public Builder groupDescription(String groupDescription) {
            this.groupDescription = Objects.requireNonNull(groupDescription);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }        public TeamSyncGroupMappingGroup build() {
            return new TeamSyncGroupMappingGroup(groupDescription, groupId, groupName);
        }
    }
}
