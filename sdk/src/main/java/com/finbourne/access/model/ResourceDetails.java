/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1950
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.EntitlementMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Details about the resource being requested that may be pertinent to the entitlement evaluation
 */
@ApiModel(description = "Details about the resource being requested that may be pertinent to the entitlement evaluation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResourceDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Map<String, String> id = new HashMap<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, List<EntitlementMetadata>> metadata = null;


  public ResourceDetails id(Map<String, String> id) {
    this.id = id; 
    return this;
  }

  public ResourceDetails putIdItem(String key, String idItem) {
    this.id.put(key, idItem);
    return this;
  }

   /**
   * The identifier of the resource being evaluated
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of the resource being evaluated")
  public Map<String, String> getId() {
    return id;
  }

  public void setId(Map<String, String> id) {
    this.id = id;
  }


  public ResourceDetails metadata(Map<String, List<EntitlementMetadata>> metadata) {
    this.metadata = metadata; 
    return this;
  }

  public ResourceDetails putMetadataItem(String key, List<EntitlementMetadata> metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Any metadata associated with the resource being requested
   * @return metadata
  **/
  @ApiModelProperty(value = "Any metadata associated with the resource being requested")
  public Map<String, List<EntitlementMetadata>> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, List<EntitlementMetadata>> metadata) {
    this.metadata = metadata;
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
    sb.append("class ResourceDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
