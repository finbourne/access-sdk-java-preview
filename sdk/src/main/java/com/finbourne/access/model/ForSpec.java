/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1982
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.AsAtRangeForSpec;
import com.finbourne.access.model.AsAtRelative;
import com.finbourne.access.model.EffectiveDateHasQuality;
import com.finbourne.access.model.EffectiveDateRelative;
import com.finbourne.access.model.EffectiveRange;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ForSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ForSpec {
  public static final String SERIALIZED_NAME_AS_AT_RANGE_FOR_SPEC = "asAtRangeForSpec";
  @SerializedName(SERIALIZED_NAME_AS_AT_RANGE_FOR_SPEC)
  private AsAtRangeForSpec asAtRangeForSpec;

  public static final String SERIALIZED_NAME_AS_AT_RELATIVE = "asAtRelative";
  @SerializedName(SERIALIZED_NAME_AS_AT_RELATIVE)
  private AsAtRelative asAtRelative;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE_HAS_QUALITY = "effectiveDateHasQuality";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE_HAS_QUALITY)
  private EffectiveDateHasQuality effectiveDateHasQuality;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE_RELATIVE = "effectiveDateRelative";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE_RELATIVE)
  private EffectiveDateRelative effectiveDateRelative;

  public static final String SERIALIZED_NAME_EFFECTIVE_RANGE = "effectiveRange";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_RANGE)
  private EffectiveRange effectiveRange;


  public ForSpec asAtRangeForSpec(AsAtRangeForSpec asAtRangeForSpec) {
    this.asAtRangeForSpec = asAtRangeForSpec; 
    return this;
  }

   /**
   * Get asAtRangeForSpec
   * @return asAtRangeForSpec
  **/
  @ApiModelProperty(value = "")
  public AsAtRangeForSpec getAsAtRangeForSpec() {
    return asAtRangeForSpec;
  }

  public void setAsAtRangeForSpec(AsAtRangeForSpec asAtRangeForSpec) {
    this.asAtRangeForSpec = asAtRangeForSpec;
  }


  public ForSpec asAtRelative(AsAtRelative asAtRelative) {
    this.asAtRelative = asAtRelative; 
    return this;
  }

   /**
   * Get asAtRelative
   * @return asAtRelative
  **/
  @ApiModelProperty(value = "")
  public AsAtRelative getAsAtRelative() {
    return asAtRelative;
  }

  public void setAsAtRelative(AsAtRelative asAtRelative) {
    this.asAtRelative = asAtRelative;
  }


  public ForSpec effectiveDateHasQuality(EffectiveDateHasQuality effectiveDateHasQuality) {
    this.effectiveDateHasQuality = effectiveDateHasQuality; 
    return this;
  }

   /**
   * Get effectiveDateHasQuality
   * @return effectiveDateHasQuality
  **/
  @ApiModelProperty(value = "")
  public EffectiveDateHasQuality getEffectiveDateHasQuality() {
    return effectiveDateHasQuality;
  }

  public void setEffectiveDateHasQuality(EffectiveDateHasQuality effectiveDateHasQuality) {
    this.effectiveDateHasQuality = effectiveDateHasQuality;
  }


  public ForSpec effectiveDateRelative(EffectiveDateRelative effectiveDateRelative) {
    this.effectiveDateRelative = effectiveDateRelative; 
    return this;
  }

   /**
   * Get effectiveDateRelative
   * @return effectiveDateRelative
  **/
  @ApiModelProperty(value = "")
  public EffectiveDateRelative getEffectiveDateRelative() {
    return effectiveDateRelative;
  }

  public void setEffectiveDateRelative(EffectiveDateRelative effectiveDateRelative) {
    this.effectiveDateRelative = effectiveDateRelative;
  }


  public ForSpec effectiveRange(EffectiveRange effectiveRange) {
    this.effectiveRange = effectiveRange; 
    return this;
  }

   /**
   * Get effectiveRange
   * @return effectiveRange
  **/
  @ApiModelProperty(value = "")
  public EffectiveRange getEffectiveRange() {
    return effectiveRange;
  }

  public void setEffectiveRange(EffectiveRange effectiveRange) {
    this.effectiveRange = effectiveRange;
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
    sb.append("class ForSpec {\n");
    sb.append("    asAtRangeForSpec: ").append(toIndentedString(asAtRangeForSpec)).append("\n");
    sb.append("    asAtRelative: ").append(toIndentedString(asAtRelative)).append("\n");
    sb.append("    effectiveDateHasQuality: ").append(toIndentedString(effectiveDateHasQuality)).append("\n");
    sb.append("    effectiveDateRelative: ").append(toIndentedString(effectiveDateRelative)).append("\n");
    sb.append("    effectiveRange: ").append(toIndentedString(effectiveRange)).append("\n");
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
