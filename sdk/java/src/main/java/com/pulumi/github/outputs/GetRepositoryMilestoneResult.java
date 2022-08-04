// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRepositoryMilestoneResult {
    /**
     * @return Description of the milestone.
     * 
     */
    private final String description;
    /**
     * @return The milestone due date (in ISO-8601 `yyyy-mm-dd` format).
     * 
     */
    private final String dueDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Integer number;
    private final String owner;
    private final String repository;
    /**
     * @return State of the milestone.
     * 
     */
    private final String state;
    /**
     * @return Title of the milestone.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GetRepositoryMilestoneResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dueDate") String dueDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("number") Integer number,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("repository") String repository,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("title") String title) {
        this.description = description;
        this.dueDate = dueDate;
        this.id = id;
        this.number = number;
        this.owner = owner;
        this.repository = repository;
        this.state = state;
        this.title = title;
    }

    /**
     * @return Description of the milestone.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The milestone due date (in ISO-8601 `yyyy-mm-dd` format).
     * 
     */
    public String dueDate() {
        return this.dueDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer number() {
        return this.number;
    }
    public String owner() {
        return this.owner;
    }
    public String repository() {
        return this.repository;
    }
    /**
     * @return State of the milestone.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Title of the milestone.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryMilestoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String dueDate;
        private String id;
        private Integer number;
        private String owner;
        private String repository;
        private String state;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryMilestoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dueDate = defaults.dueDate;
    	      this.id = defaults.id;
    	      this.number = defaults.number;
    	      this.owner = defaults.owner;
    	      this.repository = defaults.repository;
    	      this.state = defaults.state;
    	      this.title = defaults.title;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dueDate(String dueDate) {
            this.dueDate = Objects.requireNonNull(dueDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GetRepositoryMilestoneResult build() {
            return new GetRepositoryMilestoneResult(description, dueDate, id, number, owner, repository, state, title);
        }
    }
}
