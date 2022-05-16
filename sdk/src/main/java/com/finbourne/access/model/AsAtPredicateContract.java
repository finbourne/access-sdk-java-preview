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
 * AsAtPredicateContract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AsAtPredicateContract {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_DATE_TIME_OFFSET = "dateTimeOffset";
  @SerializedName(SERIALIZED_NAME_DATE_TIME_OFFSET)
  private OffsetDateTime dateTimeOffset;


  public AsAtPredicateContract value(String value) {
    this.value = value; 
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public AsAtPredicateContract dateTimeOffset(OffsetDateTime dateTimeOffset) {
    this.dateTimeOffset = dateTimeOffset; 
    return this;
  }

   /**
   * Get dateTimeOffset
   * @return dateTimeOffset
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateTimeOffset() {
    return dateTimeOffset;
  }

  public void setDateTimeOffset(OffsetDateTime dateTimeOffset) {
    this.dateTimeOffset = dateTimeOffset;
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
    sb.append("class AsAtPredicateContract {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dateTimeOffset: ").append(toIndentedString(dateTimeOffset)).append("\n");
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
