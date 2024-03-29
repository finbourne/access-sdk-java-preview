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
import com.finbourne.access.model.RequestDetails;
import com.finbourne.access.model.ResourceDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specification for a server side evaluation of entitlement.
 */
@ApiModel(description = "Specification for a server side evaluation of entitlement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EvaluationRequest {
  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private RequestDetails request;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private ResourceDetails resource;


  public EvaluationRequest request(RequestDetails request) {
    this.request = request; 
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(required = true, value = "")
  public RequestDetails getRequest() {
    return request;
  }

  public void setRequest(RequestDetails request) {
    this.request = request;
  }


  public EvaluationRequest resource(ResourceDetails resource) {
    this.resource = resource; 
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceDetails getResource() {
    return resource;
  }

  public void setResource(ResourceDetails resource) {
    this.resource = resource;
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
    sb.append("class EvaluationRequest {\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
