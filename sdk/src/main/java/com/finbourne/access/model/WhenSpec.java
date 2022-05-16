/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1984
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * WhenSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhenSpec {
  public static final String SERIALIZED_NAME_ACTIVATE = "activate";
  @SerializedName(SERIALIZED_NAME_ACTIVATE)
  private OffsetDateTime activate;

  public static final String SERIALIZED_NAME_DEACTIVATE = "deactivate";
  @SerializedName(SERIALIZED_NAME_DEACTIVATE)
  private OffsetDateTime deactivate;


  public WhenSpec activate(OffsetDateTime activate) {
    this.activate = activate; 
    return this;
  }

   /**
   * Get activate
   * @return activate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getActivate() {
    return activate;
  }

  public void setActivate(OffsetDateTime activate) {
    this.activate = activate;
  }


  public WhenSpec deactivate(OffsetDateTime deactivate) {
    this.deactivate = deactivate; 
    return this;
  }

   /**
   * Get deactivate
   * @return deactivate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDeactivate() {
    return deactivate;
  }

  public void setDeactivate(OffsetDateTime deactivate) {
    this.deactivate = deactivate;
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
    sb.append("class WhenSpec {\n");
    sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
    sb.append("    deactivate: ").append(toIndentedString(deactivate)).append("\n");
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
