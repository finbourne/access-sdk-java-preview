/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.2326
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.access.model.ForSpec;
import com.finbourne.access.model.Grant;
import com.finbourne.access.model.HowSpec;
import com.finbourne.access.model.IfExpression;
import com.finbourne.access.model.PolicyId;
import com.finbourne.access.model.PolicyType;
import com.finbourne.access.model.RoleId;
import com.finbourne.access.model.SelectorDefinition;
import com.finbourne.access.model.WhenSpec;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AttachedPolicyDefinitionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttachedPolicyDefinitionResponse {
  public static final String SERIALIZED_NAME_SOURCE_ROLE = "sourceRole";
  @SerializedName(SERIALIZED_NAME_SOURCE_ROLE)
  private RoleId sourceRole;

  public static final String SERIALIZED_NAME_ROLE_HIERARCHY_INDEX = "roleHierarchyIndex";
  @SerializedName(SERIALIZED_NAME_ROLE_HIERARCHY_INDEX)
  private Integer roleHierarchyIndex;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<String> applications = null;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policyType";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private PolicyType policyType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private PolicyId id;

  public static final String SERIALIZED_NAME_GRANT = "grant";
  @SerializedName(SERIALIZED_NAME_GRANT)
  private Grant grant;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<SelectorDefinition> selectors = null;

  public static final String SERIALIZED_NAME_FOR = "for";
  @SerializedName(SERIALIZED_NAME_FOR)
  private List<ForSpec> _for = null;

  public static final String SERIALIZED_NAME_IF = "if";
  @SerializedName(SERIALIZED_NAME_IF)
  private List<IfExpression> _if = null;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private WhenSpec when;

  public static final String SERIALIZED_NAME_HOW = "how";
  @SerializedName(SERIALIZED_NAME_HOW)
  private HowSpec how;


  public AttachedPolicyDefinitionResponse sourceRole(RoleId sourceRole) {
    this.sourceRole = sourceRole; 
    return this;
  }

   /**
   * Get sourceRole
   * @return sourceRole
  **/
  @ApiModelProperty(value = "")
  public RoleId getSourceRole() {
    return sourceRole;
  }

  public void setSourceRole(RoleId sourceRole) {
    this.sourceRole = sourceRole;
  }


  public AttachedPolicyDefinitionResponse roleHierarchyIndex(Integer roleHierarchyIndex) {
    this.roleHierarchyIndex = roleHierarchyIndex; 
    return this;
  }

   /**
   * Get roleHierarchyIndex
   * @return roleHierarchyIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getRoleHierarchyIndex() {
    return roleHierarchyIndex;
  }

  public void setRoleHierarchyIndex(Integer roleHierarchyIndex) {
    this.roleHierarchyIndex = roleHierarchyIndex;
  }


  public AttachedPolicyDefinitionResponse description(String description) {
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


  public AttachedPolicyDefinitionResponse applications(List<String> applications) {
    this.applications = applications; 
    return this;
  }

  public AttachedPolicyDefinitionResponse addApplicationsItem(String applicationsItem) {
   
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @ApiModelProperty(value = "")
  public List<String> getApplications() {
    return applications;
  }

  public void setApplications(List<String> applications) {
    this.applications = applications;
  }


  public AttachedPolicyDefinitionResponse policyType(PolicyType policyType) {
    this.policyType = policyType; 
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @ApiModelProperty(value = "")
  public PolicyType getPolicyType() {
    return policyType;
  }

  public void setPolicyType(PolicyType policyType) {
    this.policyType = policyType;
  }


  public AttachedPolicyDefinitionResponse id(PolicyId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public PolicyId getId() {
    return id;
  }

  public void setId(PolicyId id) {
    this.id = id;
  }


  public AttachedPolicyDefinitionResponse grant(Grant grant) {
    this.grant = grant; 
    return this;
  }

   /**
   * Get grant
   * @return grant
  **/
  @ApiModelProperty(value = "")
  public Grant getGrant() {
    return grant;
  }

  public void setGrant(Grant grant) {
    this.grant = grant;
  }


  public AttachedPolicyDefinitionResponse selectors(List<SelectorDefinition> selectors) {
    this.selectors = selectors; 
    return this;
  }

  public AttachedPolicyDefinitionResponse addSelectorsItem(SelectorDefinition selectorsItem) {
   
    if (this.selectors == null) {
      this.selectors = new ArrayList<>();
    }
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Get selectors
   * @return selectors
  **/
  @ApiModelProperty(value = "")
  public List<SelectorDefinition> getSelectors() {
    return selectors;
  }

  public void setSelectors(List<SelectorDefinition> selectors) {
    this.selectors = selectors;
  }


  public AttachedPolicyDefinitionResponse _for(List<ForSpec> _for) {
    this._for = _for; 
    return this;
  }

  public AttachedPolicyDefinitionResponse addForItem(ForSpec _forItem) {
   
    if (this._for == null) {
      this._for = new ArrayList<>();
    }
    this._for.add(_forItem);
    return this;
  }

   /**
   * Get _for
   * @return _for
  **/
  @ApiModelProperty(value = "")
  public List<ForSpec> getFor() {
    return _for;
  }

  public void setFor(List<ForSpec> _for) {
    this._for = _for;
  }


  public AttachedPolicyDefinitionResponse _if(List<IfExpression> _if) {
    this._if = _if; 
    return this;
  }

  public AttachedPolicyDefinitionResponse addIfItem(IfExpression _ifItem) {
   
    if (this._if == null) {
      this._if = new ArrayList<>();
    }
    this._if.add(_ifItem);
    return this;
  }

   /**
   * Get _if
   * @return _if
  **/
  @ApiModelProperty(value = "")
  public List<IfExpression> getIf() {
    return _if;
  }

  public void setIf(List<IfExpression> _if) {
    this._if = _if;
  }


  public AttachedPolicyDefinitionResponse when(WhenSpec when) {
    this.when = when; 
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @ApiModelProperty(value = "")
  public WhenSpec getWhen() {
    return when;
  }

  public void setWhen(WhenSpec when) {
    this.when = when;
  }


  public AttachedPolicyDefinitionResponse how(HowSpec how) {
    this.how = how; 
    return this;
  }

   /**
   * Get how
   * @return how
  **/
  @ApiModelProperty(value = "")
  public HowSpec getHow() {
    return how;
  }

  public void setHow(HowSpec how) {
    this.how = how;
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
    sb.append("class AttachedPolicyDefinitionResponse {\n");
    sb.append("    sourceRole: ").append(toIndentedString(sourceRole)).append("\n");
    sb.append("    roleHierarchyIndex: ").append(toIndentedString(roleHierarchyIndex)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
    sb.append("    selectors: ").append(toIndentedString(selectors)).append("\n");
    sb.append("    _for: ").append(toIndentedString(_for)).append("\n");
    sb.append("    _if: ").append(toIndentedString(_if)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    how: ").append(toIndentedString(how)).append("\n");
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
