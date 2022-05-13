/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1978
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.AsAtPredicateContract;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AsAtRangeForSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AsAtRangeForSpec {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private AsAtPredicateContract from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private AsAtPredicateContract to;


  public AsAtRangeForSpec from(AsAtPredicateContract from) {
    this.from = from; 
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(required = true, value = "")
  public AsAtPredicateContract getFrom() {
    return from;
  }

  public void setFrom(AsAtPredicateContract from) {
    this.from = from;
  }


  public AsAtRangeForSpec to(AsAtPredicateContract to) {
    this.to = to; 
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  public AsAtPredicateContract getTo() {
    return to;
  }

  public void setTo(AsAtPredicateContract to) {
    this.to = to;
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
    sb.append("class AsAtRangeForSpec {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
