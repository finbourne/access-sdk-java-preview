/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1988
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.RequestedActionKey;
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
 * The details of the requested evaluation
 */
@ApiModel(description = "The details of the requested evaluation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestDetails {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private RequestedActionKey action;

  public static final String SERIALIZED_NAME_FROM_EFFECTIVE_DATE = "fromEffectiveDate";
  @SerializedName(SERIALIZED_NAME_FROM_EFFECTIVE_DATE)
  private OffsetDateTime fromEffectiveDate;

  public static final String SERIALIZED_NAME_TO_EFFECTIVE_DATE = "toEffectiveDate";
  @SerializedName(SERIALIZED_NAME_TO_EFFECTIVE_DATE)
  private OffsetDateTime toEffectiveDate;

  public static final String SERIALIZED_NAME_FROM_AS_AT = "fromAsAt";
  @SerializedName(SERIALIZED_NAME_FROM_AS_AT)
  private OffsetDateTime fromAsAt;

  public static final String SERIALIZED_NAME_TO_AS_AT = "toAsAt";
  @SerializedName(SERIALIZED_NAME_TO_AS_AT)
  private OffsetDateTime toAsAt;


  public RequestDetails action(RequestedActionKey action) {
    this.action = action; 
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public RequestedActionKey getAction() {
    return action;
  }

  public void setAction(RequestedActionKey action) {
    this.action = action;
  }


  public RequestDetails fromEffectiveDate(OffsetDateTime fromEffectiveDate) {
    this.fromEffectiveDate = fromEffectiveDate; 
    return this;
  }

   /**
   * The start date for the requested effective date range for the resource (if null, UtcNow)
   * @return fromEffectiveDate
  **/
  @ApiModelProperty(value = "The start date for the requested effective date range for the resource (if null, UtcNow)")
  public OffsetDateTime getFromEffectiveDate() {
    return fromEffectiveDate;
  }

  public void setFromEffectiveDate(OffsetDateTime fromEffectiveDate) {
    this.fromEffectiveDate = fromEffectiveDate;
  }


  public RequestDetails toEffectiveDate(OffsetDateTime toEffectiveDate) {
    this.toEffectiveDate = toEffectiveDate; 
    return this;
  }

   /**
   * The end date for the requested effective date range for the resource (if null, same as from date)
   * @return toEffectiveDate
  **/
  @ApiModelProperty(value = "The end date for the requested effective date range for the resource (if null, same as from date)")
  public OffsetDateTime getToEffectiveDate() {
    return toEffectiveDate;
  }

  public void setToEffectiveDate(OffsetDateTime toEffectiveDate) {
    this.toEffectiveDate = toEffectiveDate;
  }


  public RequestDetails fromAsAt(OffsetDateTime fromAsAt) {
    this.fromAsAt = fromAsAt; 
    return this;
  }

   /**
   * The requested AsAt date for the resource (if null, Latest). If specifying a range of AsAt dates, this is the lower bounds.
   * @return fromAsAt
  **/
  @ApiModelProperty(value = "The requested AsAt date for the resource (if null, Latest). If specifying a range of AsAt dates, this is the lower bounds.")
  public OffsetDateTime getFromAsAt() {
    return fromAsAt;
  }

  public void setFromAsAt(OffsetDateTime fromAsAt) {
    this.fromAsAt = fromAsAt;
  }


  public RequestDetails toAsAt(OffsetDateTime toAsAt) {
    this.toAsAt = toAsAt; 
    return this;
  }

   /**
   * Upper bound if specifying a request that requires a range of AsAt dates. This is used if specifying the desire to grant access for a user between an AsAt range.
   * @return toAsAt
  **/
  @ApiModelProperty(value = "Upper bound if specifying a request that requires a range of AsAt dates. This is used if specifying the desire to grant access for a user between an AsAt range.")
  public OffsetDateTime getToAsAt() {
    return toAsAt;
  }

  public void setToAsAt(OffsetDateTime toAsAt) {
    this.toAsAt = toAsAt;
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
    sb.append("class RequestDetails {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    fromEffectiveDate: ").append(toIndentedString(fromEffectiveDate)).append("\n");
    sb.append("    toEffectiveDate: ").append(toIndentedString(toEffectiveDate)).append("\n");
    sb.append("    fromAsAt: ").append(toIndentedString(fromAsAt)).append("\n");
    sb.append("    toAsAt: ").append(toIndentedString(toAsAt)).append("\n");
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
