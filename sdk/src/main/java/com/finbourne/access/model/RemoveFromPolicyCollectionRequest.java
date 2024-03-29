/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.3031
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.PolicyCollectionId;
import com.finbourne.access.model.PolicyId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Base properties to create or update a policy collection
 */
@ApiModel(description = "Base properties to create or update a policy collection")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RemoveFromPolicyCollectionRequest {
  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<PolicyId> policies = null;

  public static final String SERIALIZED_NAME_POLICY_COLLECTIONS = "policyCollections";
  @SerializedName(SERIALIZED_NAME_POLICY_COLLECTIONS)
  private List<PolicyCollectionId> policyCollections = null;


  public RemoveFromPolicyCollectionRequest policies(List<PolicyId> policies) {
    this.policies = policies; 
    return this;
  }

  public RemoveFromPolicyCollectionRequest addPoliciesItem(PolicyId policiesItem) {
   
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * The identifiers of the Policies to be removed from the collection.
   * @return policies
  **/
  @ApiModelProperty(value = "The identifiers of the Policies to be removed from the collection.")
  public List<PolicyId> getPolicies() {
    return policies;
  }

  public void setPolicies(List<PolicyId> policies) {
    this.policies = policies;
  }


  public RemoveFromPolicyCollectionRequest policyCollections(List<PolicyCollectionId> policyCollections) {
    this.policyCollections = policyCollections; 
    return this;
  }

  public RemoveFromPolicyCollectionRequest addPolicyCollectionsItem(PolicyCollectionId policyCollectionsItem) {
   
    if (this.policyCollections == null) {
      this.policyCollections = new ArrayList<>();
    }
    this.policyCollections.add(policyCollectionsItem);
    return this;
  }

   /**
   * The identifiers of the PolicyCollections to be removed from the collection.
   * @return policyCollections
  **/
  @ApiModelProperty(value = "The identifiers of the PolicyCollections to be removed from the collection.")
  public List<PolicyCollectionId> getPolicyCollections() {
    return policyCollections;
  }

  public void setPolicyCollections(List<PolicyCollectionId> policyCollections) {
    this.policyCollections = policyCollections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveFromPolicyCollectionRequest {\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    policyCollections: ").append(toIndentedString(policyCollections)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
