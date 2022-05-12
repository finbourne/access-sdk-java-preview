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
import com.finbourne.access.model.EvaluationResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The result of an evaluation request
 */
@ApiModel(description = "The result of an evaluation request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EvaluationResponse {
  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private EvaluationResult result;

  public static final String SERIALIZED_NAME_DETAILED_MESSAGE = "detailedMessage";
  @SerializedName(SERIALIZED_NAME_DETAILED_MESSAGE)
  private String detailedMessage;


  public EvaluationResponse result(EvaluationResult result) {
    this.result = result; 
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")
  public EvaluationResult getResult() {
    return result;
  }

  public void setResult(EvaluationResult result) {
    this.result = result;
  }


  public EvaluationResponse detailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage; 
    return this;
  }

   /**
   * In the case of the evaluation being denied a message may be returned
   * @return detailedMessage
  **/
  @ApiModelProperty(value = "In the case of the evaluation being denied a message may be returned")
  public String getDetailedMessage() {
    return detailedMessage;
  }

  public void setDetailedMessage(String detailedMessage) {
    this.detailedMessage = detailedMessage;
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
    sb.append("class EvaluationResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    detailedMessage: ").append(toIndentedString(detailedMessage)).append("\n");
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
