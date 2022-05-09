/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1964
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.DateUnit;
import com.finbourne.access.model.PointInTimeSpecification;
import com.finbourne.access.model.RelativeToDateTime;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AsAtRelative
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AsAtRelative {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private PointInTimeSpecification date;

  public static final String SERIALIZED_NAME_ADJUSTMENT = "adjustment";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT)
  private Integer adjustment;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private DateUnit unit;

  public static final String SERIALIZED_NAME_RELATIVE_TO_DATE_TIME = "relativeToDateTime";
  @SerializedName(SERIALIZED_NAME_RELATIVE_TO_DATE_TIME)
  private RelativeToDateTime relativeToDateTime;


  public AsAtRelative date(PointInTimeSpecification date) {
    this.date = date; 
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public PointInTimeSpecification getDate() {
    return date;
  }

  public void setDate(PointInTimeSpecification date) {
    this.date = date;
  }


  public AsAtRelative adjustment(Integer adjustment) {
    this.adjustment = adjustment; 
    return this;
  }

   /**
   * Get adjustment
   * @return adjustment
  **/
  @ApiModelProperty(value = "")
  public Integer getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(Integer adjustment) {
    this.adjustment = adjustment;
  }


  public AsAtRelative unit(DateUnit unit) {
    this.unit = unit; 
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")
  public DateUnit getUnit() {
    return unit;
  }

  public void setUnit(DateUnit unit) {
    this.unit = unit;
  }


  public AsAtRelative relativeToDateTime(RelativeToDateTime relativeToDateTime) {
    this.relativeToDateTime = relativeToDateTime; 
    return this;
  }

   /**
   * Get relativeToDateTime
   * @return relativeToDateTime
  **/
  @ApiModelProperty(value = "")
  public RelativeToDateTime getRelativeToDateTime() {
    return relativeToDateTime;
  }

  public void setRelativeToDateTime(RelativeToDateTime relativeToDateTime) {
    this.relativeToDateTime = relativeToDateTime;
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
    sb.append("class AsAtRelative {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    adjustment: ").append(toIndentedString(adjustment)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    relativeToDateTime: ").append(toIndentedString(relativeToDateTime)).append("\n");
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
