/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1980
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.ActionId;
import com.finbourne.access.model.SelectorDefinition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PolicySelectorDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicySelectorDefinition {
  public static final String SERIALIZED_NAME_IDENTITY_RESTRICTION = "identityRestriction";
  @SerializedName(SERIALIZED_NAME_IDENTITY_RESTRICTION)
  private Map<String, String> identityRestriction = null;

  public static final String SERIALIZED_NAME_RESTRICTION_SELECTORS = "restrictionSelectors";
  @SerializedName(SERIALIZED_NAME_RESTRICTION_SELECTORS)
  private List<SelectorDefinition> restrictionSelectors = null;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<ActionId> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public PolicySelectorDefinition identityRestriction(Map<String, String> identityRestriction) {
    this.identityRestriction = identityRestriction; 
    return this;
  }

  public PolicySelectorDefinition putIdentityRestrictionItem(String key, String identityRestrictionItem) {
    if (this.identityRestriction == null) {
      this.identityRestriction = new HashMap<>();
    }
    this.identityRestriction.put(key, identityRestrictionItem);
    return this;
  }

   /**
   * Get identityRestriction
   * @return identityRestriction
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getIdentityRestriction() {
    return identityRestriction;
  }

  public void setIdentityRestriction(Map<String, String> identityRestriction) {
    this.identityRestriction = identityRestriction;
  }


  public PolicySelectorDefinition restrictionSelectors(List<SelectorDefinition> restrictionSelectors) {
    this.restrictionSelectors = restrictionSelectors; 
    return this;
  }

  public PolicySelectorDefinition addRestrictionSelectorsItem(SelectorDefinition restrictionSelectorsItem) {
   
    if (this.restrictionSelectors == null) {
      this.restrictionSelectors = new ArrayList<>();
    }
    this.restrictionSelectors.add(restrictionSelectorsItem);
    return this;
  }

   /**
   * Get restrictionSelectors
   * @return restrictionSelectors
  **/
  @ApiModelProperty(value = "")
  public List<SelectorDefinition> getRestrictionSelectors() {
    return restrictionSelectors;
  }

  public void setRestrictionSelectors(List<SelectorDefinition> restrictionSelectors) {
    this.restrictionSelectors = restrictionSelectors;
  }


  public PolicySelectorDefinition actions(List<ActionId> actions) {
    this.actions = actions; 
    return this;
  }

  public PolicySelectorDefinition addActionsItem(ActionId actionsItem) {
   
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ActionId> getActions() {
    return actions;
  }

  public void setActions(List<ActionId> actions) {
    this.actions = actions;
  }


  public PolicySelectorDefinition name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PolicySelectorDefinition description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    sb.append("class PolicySelectorDefinition {\n");
    sb.append("    identityRestriction: ").append(toIndentedString(identityRestriction)).append("\n");
    sb.append("    restrictionSelectors: ").append(toIndentedString(restrictionSelectors)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
