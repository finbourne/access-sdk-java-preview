/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1954
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.NonTransitiveSupervisorRoleResource;
import com.finbourne.access.model.PolicyIdRoleResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RoleResourceRequest
 */
@ApiModel(description = "RoleResourceRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleResourceRequest {
  public static final String SERIALIZED_NAME_NON_TRANSITIVE_SUPERVISOR_ROLE_RESOURCE = "nonTransitiveSupervisorRoleResource";
  @SerializedName(SERIALIZED_NAME_NON_TRANSITIVE_SUPERVISOR_ROLE_RESOURCE)
  private NonTransitiveSupervisorRoleResource nonTransitiveSupervisorRoleResource;

  public static final String SERIALIZED_NAME_POLICY_ID_ROLE_RESOURCE = "policyIdRoleResource";
  @SerializedName(SERIALIZED_NAME_POLICY_ID_ROLE_RESOURCE)
  private PolicyIdRoleResource policyIdRoleResource;


  public RoleResourceRequest nonTransitiveSupervisorRoleResource(NonTransitiveSupervisorRoleResource nonTransitiveSupervisorRoleResource) {
    this.nonTransitiveSupervisorRoleResource = nonTransitiveSupervisorRoleResource; 
    return this;
  }

   /**
   * Get nonTransitiveSupervisorRoleResource
   * @return nonTransitiveSupervisorRoleResource
  **/
  @ApiModelProperty(value = "")
  public NonTransitiveSupervisorRoleResource getNonTransitiveSupervisorRoleResource() {
    return nonTransitiveSupervisorRoleResource;
  }

  public void setNonTransitiveSupervisorRoleResource(NonTransitiveSupervisorRoleResource nonTransitiveSupervisorRoleResource) {
    this.nonTransitiveSupervisorRoleResource = nonTransitiveSupervisorRoleResource;
  }


  public RoleResourceRequest policyIdRoleResource(PolicyIdRoleResource policyIdRoleResource) {
    this.policyIdRoleResource = policyIdRoleResource; 
    return this;
  }

   /**
   * Get policyIdRoleResource
   * @return policyIdRoleResource
  **/
  @ApiModelProperty(value = "")
  public PolicyIdRoleResource getPolicyIdRoleResource() {
    return policyIdRoleResource;
  }

  public void setPolicyIdRoleResource(PolicyIdRoleResource policyIdRoleResource) {
    this.policyIdRoleResource = policyIdRoleResource;
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
    sb.append("class RoleResourceRequest {\n");
    sb.append("    nonTransitiveSupervisorRoleResource: ").append(toIndentedString(nonTransitiveSupervisorRoleResource)).append("\n");
    sb.append("    policyIdRoleResource: ").append(toIndentedString(policyIdRoleResource)).append("\n");
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
