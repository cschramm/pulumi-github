// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IssueLabelArgs extends com.pulumi.resources.ResourceArgs {

    public static final IssueLabelArgs Empty = new IssueLabelArgs();

    /**
     * A 6 character hex code, **without the leading #**, identifying the color of the label.
     * 
     */
    @Import(name="color", required=true)
    private Output<String> color;

    /**
     * @return A 6 character hex code, **without the leading #**, identifying the color of the label.
     * 
     */
    public Output<String> color() {
        return this.color;
    }

    /**
     * A short description of the label.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A short description of the label.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the label.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the label.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The GitHub repository
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return The GitHub repository
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    private IssueLabelArgs() {}

    private IssueLabelArgs(IssueLabelArgs $) {
        this.color = $.color;
        this.description = $.description;
        this.name = $.name;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IssueLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IssueLabelArgs $;

        public Builder() {
            $ = new IssueLabelArgs();
        }

        public Builder(IssueLabelArgs defaults) {
            $ = new IssueLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param color A 6 character hex code, **without the leading #**, identifying the color of the label.
         * 
         * @return builder
         * 
         */
        public Builder color(Output<String> color) {
            $.color = color;
            return this;
        }

        /**
         * @param color A 6 character hex code, **without the leading #**, identifying the color of the label.
         * 
         * @return builder
         * 
         */
        public Builder color(String color) {
            return color(Output.of(color));
        }

        /**
         * @param description A short description of the label.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A short description of the label.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the label.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the label.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param repository The GitHub repository
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository The GitHub repository
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public IssueLabelArgs build() {
            if ($.color == null) {
                throw new MissingRequiredPropertyException("IssueLabelArgs", "color");
            }
            if ($.repository == null) {
                throw new MissingRequiredPropertyException("IssueLabelArgs", "repository");
            }
            return $;
        }
    }

}
