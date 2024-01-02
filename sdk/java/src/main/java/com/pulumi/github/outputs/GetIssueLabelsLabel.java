// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIssueLabelsLabel {
    /**
     * @return The hexadecimal color code for the label, without the leading #.
     * 
     */
    private String color;
    /**
     * @return A short description of the label.
     * 
     */
    private String description;
    /**
     * @return The name of the label.
     * 
     */
    private String name;
    /**
     * @return The URL of the label.
     * 
     */
    private String url;

    private GetIssueLabelsLabel() {}
    /**
     * @return The hexadecimal color code for the label, without the leading #.
     * 
     */
    public String color() {
        return this.color;
    }
    /**
     * @return A short description of the label.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The name of the label.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The URL of the label.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIssueLabelsLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String color;
        private String description;
        private String name;
        private String url;
        public Builder() {}
        public Builder(GetIssueLabelsLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder color(String color) {
            if (color == null) {
              throw new MissingRequiredPropertyException("GetIssueLabelsLabel", "color");
            }
            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetIssueLabelsLabel", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIssueLabelsLabel", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetIssueLabelsLabel", "url");
            }
            this.url = url;
            return this;
        }
        public GetIssueLabelsLabel build() {
            final var _resultValue = new GetIssueLabelsLabel();
            _resultValue.color = color;
            _resultValue.description = description;
            _resultValue.name = name;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
