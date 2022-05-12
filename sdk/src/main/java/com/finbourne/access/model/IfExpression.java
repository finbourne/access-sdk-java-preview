/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1972
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.IfIdentityClaimExpression;
import com.finbourne.access.model.IfIdentityScopeExpression;
import com.finbourne.access.model.IfRequestHeaderExpression;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IfExpression
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IfExpression {
  public static final String SERIALIZED_NAME_IF_REQUEST_HEADER_EXPRESSION = "ifRequestHeaderExpression";
  @SerializedName(SERIALIZED_NAME_IF_REQUEST_HEADER_EXPRESSION)
  private IfRequestHeaderExpression ifRequestHeaderExpression;

  public static final String SERIALIZED_NAME_IF_IDENTITY_CLAIM_EXPRESSION = "ifIdentityClaimExpression";
  @SerializedName(SERIALIZED_NAME_IF_IDENTITY_CLAIM_EXPRESSION)
  private IfIdentityClaimExpression ifIdentityClaimExpression;

  public static final String SERIALIZED_NAME_IF_IDENTITY_SCOPE_EXPRESSION = "ifIdentityScopeExpression";
  @SerializedName(SERIALIZED_NAME_IF_IDENTITY_SCOPE_EXPRESSION)
  private IfIdentityScopeExpression ifIdentityScopeExpression;


  public IfExpression ifRequestHeaderExpression(IfRequestHeaderExpression ifRequestHeaderExpression) {
    this.ifRequestHeaderExpression = ifRequestHeaderExpression; 
    return this;
  }

   /**
   * Get ifRequestHeaderExpression
   * @return ifRequestHeaderExpression
  **/
  @ApiModelProperty(value = "")
  public IfRequestHeaderExpression getIfRequestHeaderExpression() {
    return ifRequestHeaderExpression;
  }

  public void setIfRequestHeaderExpression(IfRequestHeaderExpression ifRequestHeaderExpression) {
    this.ifRequestHeaderExpression = ifRequestHeaderExpression;
  }


  public IfExpression ifIdentityClaimExpression(IfIdentityClaimExpression ifIdentityClaimExpression) {
    this.ifIdentityClaimExpression = ifIdentityClaimExpression; 
    return this;
  }

   /**
   * Get ifIdentityClaimExpression
   * @return ifIdentityClaimExpression
  **/
  @ApiModelProperty(value = "")
  public IfIdentityClaimExpression getIfIdentityClaimExpression() {
    return ifIdentityClaimExpression;
  }

  public void setIfIdentityClaimExpression(IfIdentityClaimExpression ifIdentityClaimExpression) {
    this.ifIdentityClaimExpression = ifIdentityClaimExpression;
  }


  public IfExpression ifIdentityScopeExpression(IfIdentityScopeExpression ifIdentityScopeExpression) {
    this.ifIdentityScopeExpression = ifIdentityScopeExpression; 
    return this;
  }

   /**
   * Get ifIdentityScopeExpression
   * @return ifIdentityScopeExpression
  **/
  @ApiModelProperty(value = "")
  public IfIdentityScopeExpression getIfIdentityScopeExpression() {
    return ifIdentityScopeExpression;
  }

  public void setIfIdentityScopeExpression(IfIdentityScopeExpression ifIdentityScopeExpression) {
    this.ifIdentityScopeExpression = ifIdentityScopeExpression;
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
    sb.append("class IfExpression {\n");
    sb.append("    ifRequestHeaderExpression: ").append(toIndentedString(ifRequestHeaderExpression)).append("\n");
    sb.append("    ifIdentityClaimExpression: ").append(toIndentedString(ifIdentityClaimExpression)).append("\n");
    sb.append("    ifIdentityScopeExpression: ").append(toIndentedString(ifIdentityScopeExpression)).append("\n");
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
