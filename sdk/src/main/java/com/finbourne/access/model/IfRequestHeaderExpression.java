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
import com.finbourne.access.model.TextOperator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IfRequestHeaderExpression
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IfRequestHeaderExpression {
  public static final String SERIALIZED_NAME_HEADER_NAME = "headerName";
  @SerializedName(SERIALIZED_NAME_HEADER_NAME)
  private String headerName;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private TextOperator operator;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public IfRequestHeaderExpression headerName(String headerName) {
    this.headerName = headerName; 
    return this;
  }

   /**
   * Get headerName
   * @return headerName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }


  public IfRequestHeaderExpression operator(TextOperator operator) {
    this.operator = operator; 
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "")
  public TextOperator getOperator() {
    return operator;
  }

  public void setOperator(TextOperator operator) {
    this.operator = operator;
  }


  public IfRequestHeaderExpression value(String value) {
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
    sb.append("class IfRequestHeaderExpression {\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
