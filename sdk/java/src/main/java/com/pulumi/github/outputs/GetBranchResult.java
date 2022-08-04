// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.github.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBranchResult {
    private final String branch;
    /**
     * @return An etag representing the Branch object.
     * 
     */
    private final String etag;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A string representing a branch reference, in the form of `refs/heads/&lt;branch&gt;`.
     * 
     */
    private final String ref;
    private final String repository;
    /**
     * @return A string storing the reference&#39;s `HEAD` commit&#39;s SHA1.
     * 
     */
    private final String sha;

    @CustomType.Constructor
    private GetBranchResult(
        @CustomType.Parameter("branch") String branch,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ref") String ref,
        @CustomType.Parameter("repository") String repository,
        @CustomType.Parameter("sha") String sha) {
        this.branch = branch;
        this.etag = etag;
        this.id = id;
        this.ref = ref;
        this.repository = repository;
        this.sha = sha;
    }

    public String branch() {
        return this.branch;
    }
    /**
     * @return An etag representing the Branch object.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A string representing a branch reference, in the form of `refs/heads/&lt;branch&gt;`.
     * 
     */
    public String ref() {
        return this.ref;
    }
    public String repository() {
        return this.repository;
    }
    /**
     * @return A string storing the reference&#39;s `HEAD` commit&#39;s SHA1.
     * 
     */
    public String sha() {
        return this.sha;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBranchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String branch;
        private String etag;
        private String id;
        private String ref;
        private String repository;
        private String sha;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBranchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ref = defaults.ref;
    	      this.repository = defaults.repository;
    	      this.sha = defaults.sha;
        }

        public Builder branch(String branch) {
            this.branch = Objects.requireNonNull(branch);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ref(String ref) {
            this.ref = Objects.requireNonNull(ref);
            return this;
        }
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder sha(String sha) {
            this.sha = Objects.requireNonNull(sha);
            return this;
        }        public GetBranchResult build() {
            return new GetBranchResult(branch, etag, id, ref, repository, sha);
        }
    }
}
