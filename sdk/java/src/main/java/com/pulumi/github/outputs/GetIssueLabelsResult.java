// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.github.outputs.GetIssueLabelsLabel;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIssueLabelsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The list of this repository&#39;s labels. Each element of `labels` has the following attributes:
     * 
     */
    private List<GetIssueLabelsLabel> labels;
    private String repository;

    private GetIssueLabelsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of this repository&#39;s labels. Each element of `labels` has the following attributes:
     * 
     */
    public List<GetIssueLabelsLabel> labels() {
        return this.labels;
    }
    public String repository() {
        return this.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIssueLabelsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetIssueLabelsLabel> labels;
        private String repository;
        public Builder() {}
        public Builder(GetIssueLabelsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.repository = defaults.repository;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(List<GetIssueLabelsLabel> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(GetIssueLabelsLabel... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public GetIssueLabelsResult build() {
            final var o = new GetIssueLabelsResult();
            o.id = id;
            o.labels = labels;
            o.repository = repository;
            return o;
        }
    }
}