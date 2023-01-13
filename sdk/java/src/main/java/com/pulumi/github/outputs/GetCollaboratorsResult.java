// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.github.outputs.GetCollaboratorsCollaborator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCollaboratorsResult {
    private @Nullable String affiliation;
    /**
     * @return An Array of GitHub collaborators.  Each `collaborator` block consists of the fields documented below.
     * 
     */
    private List<GetCollaboratorsCollaborator> collaborators;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String owner;
    private String repository;

    private GetCollaboratorsResult() {}
    public Optional<String> affiliation() {
        return Optional.ofNullable(this.affiliation);
    }
    /**
     * @return An Array of GitHub collaborators.  Each `collaborator` block consists of the fields documented below.
     * 
     */
    public List<GetCollaboratorsCollaborator> collaborators() {
        return this.collaborators;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String owner() {
        return this.owner;
    }
    public String repository() {
        return this.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCollaboratorsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String affiliation;
        private List<GetCollaboratorsCollaborator> collaborators;
        private String id;
        private String owner;
        private String repository;
        public Builder() {}
        public Builder(GetCollaboratorsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affiliation = defaults.affiliation;
    	      this.collaborators = defaults.collaborators;
    	      this.id = defaults.id;
    	      this.owner = defaults.owner;
    	      this.repository = defaults.repository;
        }

        @CustomType.Setter
        public Builder affiliation(@Nullable String affiliation) {
            this.affiliation = affiliation;
            return this;
        }
        @CustomType.Setter
        public Builder collaborators(List<GetCollaboratorsCollaborator> collaborators) {
            this.collaborators = Objects.requireNonNull(collaborators);
            return this;
        }
        public Builder collaborators(GetCollaboratorsCollaborator... collaborators) {
            return collaborators(List.of(collaborators));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public GetCollaboratorsResult build() {
            final var o = new GetCollaboratorsResult();
            o.affiliation = affiliation;
            o.collaborators = collaborators;
            o.id = id;
            o.owner = owner;
            o.repository = repository;
            return o;
        }
    }
}
