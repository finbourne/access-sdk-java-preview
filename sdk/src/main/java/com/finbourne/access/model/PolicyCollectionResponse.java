/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1956
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.Link;
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
 * A PolicyCollection encapsulating one or more Policies and PolicyCollections
 */
@ApiModel(description = "A PolicyCollection encapsulating one or more Policies and PolicyCollections")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyCollectionResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private PolicyCollectionId id;

  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<PolicyId> policies = null;

  public static final String SERIALIZED_NAME_POLICY_COLLECTIONS = "policyCollections";
  @SerializedName(SERIALIZED_NAME_POLICY_COLLECTIONS)
  private List<PolicyCollectionId> policyCollections = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public PolicyCollectionResponse id(PolicyCollectionId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public PolicyCollectionId getId() {
    return id;
  }

  public void setId(PolicyCollectionId id) {
    this.id = id;
  }


  public PolicyCollectionResponse policies(List<PolicyId> policies) {
    this.policies = policies; 
    return this;
  }

  public PolicyCollectionResponse addPoliciesItem(PolicyId policiesItem) {
   
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * The identifiers of the Policies in this collection
   * @return policies
  **/
  @ApiModelProperty(value = "The identifiers of the Policies in this collection")
  public List<PolicyId> getPolicies() {
    return policies;
  }

  public void setPolicies(List<PolicyId> policies) {
    this.policies = policies;
  }


  public PolicyCollectionResponse policyCollections(List<PolicyCollectionId> policyCollections) {
    this.policyCollections = policyCollections; 
    return this;
  }

  public PolicyCollectionResponse addPolicyCollectionsItem(PolicyCollectionId policyCollectionsItem) {
   
    if (this.policyCollections == null) {
      this.policyCollections = new ArrayList<>();
    }
    this.policyCollections.add(policyCollectionsItem);
    return this;
  }

   /**
   * The identifiers of the PolicyCollections in this collection
   * @return policyCollections
  **/
  @ApiModelProperty(value = "The identifiers of the PolicyCollections in this collection")
  public List<PolicyCollectionId> getPolicyCollections() {
    return policyCollections;
  }

  public void setPolicyCollections(List<PolicyCollectionId> policyCollections) {
    this.policyCollections = policyCollections;
  }


  public PolicyCollectionResponse description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * A description of this policy collection
   * @return description
  **/
  @ApiModelProperty(value = "A description of this policy collection")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public PolicyCollectionResponse links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public PolicyCollectionResponse addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    sb.append("class PolicyCollectionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    policyCollections: ").append(toIndentedString(policyCollections)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
