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
import com.finbourne.access.model.IdSelectorDefinition;
import com.finbourne.access.model.MatchAllSelectorDefinition;
import com.finbourne.access.model.MetadataSelectorDefinition;
import com.finbourne.access.model.PolicySelectorDefinition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SelectorDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SelectorDefinition {
  public static final String SERIALIZED_NAME_METADATA_SELECTOR_DEFINITION = "metadataSelectorDefinition";
  @SerializedName(SERIALIZED_NAME_METADATA_SELECTOR_DEFINITION)
  private MetadataSelectorDefinition metadataSelectorDefinition;

  public static final String SERIALIZED_NAME_ID_SELECTOR_DEFINITION = "idSelectorDefinition";
  @SerializedName(SERIALIZED_NAME_ID_SELECTOR_DEFINITION)
  private IdSelectorDefinition idSelectorDefinition;

  public static final String SERIALIZED_NAME_MATCH_ALL_SELECTOR_DEFINITION = "matchAllSelectorDefinition";
  @SerializedName(SERIALIZED_NAME_MATCH_ALL_SELECTOR_DEFINITION)
  private MatchAllSelectorDefinition matchAllSelectorDefinition;

  public static final String SERIALIZED_NAME_POLICY_SELECTOR_DEFINITION = "policySelectorDefinition";
  @SerializedName(SERIALIZED_NAME_POLICY_SELECTOR_DEFINITION)
  private PolicySelectorDefinition policySelectorDefinition;


  public SelectorDefinition metadataSelectorDefinition(MetadataSelectorDefinition metadataSelectorDefinition) {
    this.metadataSelectorDefinition = metadataSelectorDefinition; 
    return this;
  }

   /**
   * Get metadataSelectorDefinition
   * @return metadataSelectorDefinition
  **/
  @ApiModelProperty(value = "")
  public MetadataSelectorDefinition getMetadataSelectorDefinition() {
    return metadataSelectorDefinition;
  }

  public void setMetadataSelectorDefinition(MetadataSelectorDefinition metadataSelectorDefinition) {
    this.metadataSelectorDefinition = metadataSelectorDefinition;
  }


  public SelectorDefinition idSelectorDefinition(IdSelectorDefinition idSelectorDefinition) {
    this.idSelectorDefinition = idSelectorDefinition; 
    return this;
  }

   /**
   * Get idSelectorDefinition
   * @return idSelectorDefinition
  **/
  @ApiModelProperty(value = "")
  public IdSelectorDefinition getIdSelectorDefinition() {
    return idSelectorDefinition;
  }

  public void setIdSelectorDefinition(IdSelectorDefinition idSelectorDefinition) {
    this.idSelectorDefinition = idSelectorDefinition;
  }


  public SelectorDefinition matchAllSelectorDefinition(MatchAllSelectorDefinition matchAllSelectorDefinition) {
    this.matchAllSelectorDefinition = matchAllSelectorDefinition; 
    return this;
  }

   /**
   * Get matchAllSelectorDefinition
   * @return matchAllSelectorDefinition
  **/
  @ApiModelProperty(value = "")
  public MatchAllSelectorDefinition getMatchAllSelectorDefinition() {
    return matchAllSelectorDefinition;
  }

  public void setMatchAllSelectorDefinition(MatchAllSelectorDefinition matchAllSelectorDefinition) {
    this.matchAllSelectorDefinition = matchAllSelectorDefinition;
  }


  public SelectorDefinition policySelectorDefinition(PolicySelectorDefinition policySelectorDefinition) {
    this.policySelectorDefinition = policySelectorDefinition; 
    return this;
  }

   /**
   * Get policySelectorDefinition
   * @return policySelectorDefinition
  **/
  @ApiModelProperty(value = "")
  public PolicySelectorDefinition getPolicySelectorDefinition() {
    return policySelectorDefinition;
  }

  public void setPolicySelectorDefinition(PolicySelectorDefinition policySelectorDefinition) {
    this.policySelectorDefinition = policySelectorDefinition;
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
    sb.append("class SelectorDefinition {\n");
    sb.append("    metadataSelectorDefinition: ").append(toIndentedString(metadataSelectorDefinition)).append("\n");
    sb.append("    idSelectorDefinition: ").append(toIndentedString(idSelectorDefinition)).append("\n");
    sb.append("    matchAllSelectorDefinition: ").append(toIndentedString(matchAllSelectorDefinition)).append("\n");
    sb.append("    policySelectorDefinition: ").append(toIndentedString(policySelectorDefinition)).append("\n");
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
