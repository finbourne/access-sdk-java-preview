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
import com.finbourne.access.model.ForSpec;
import com.finbourne.access.model.Grant;
import com.finbourne.access.model.HowSpec;
import com.finbourne.access.model.IfExpression;
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
 * Request to create a policy
 */
@ApiModel(description = "Request to create a policy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PolicyCreationRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private List<String> applications = null;

  public static final String SERIALIZED_NAME_GRANT = "grant";
  @SerializedName(SERIALIZED_NAME_GRANT)
  private Grant grant;

  public static final String SERIALIZED_NAME_SELECTORS = "selectors";
  @SerializedName(SERIALIZED_NAME_SELECTORS)
  private List<SelectorDefinition> selectors = new ArrayList<>();

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


  public PolicyCreationRequest code(String code) {
    this.code = code; 
    return this;
  }

   /**
   * Code of the policy being created
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Code of the policy being created")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public PolicyCreationRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Description of what the policy will be used for
   * @return description
  **/
  @ApiModelProperty(value = "Description of what the policy will be used for")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public PolicyCreationRequest applications(List<String> applications) {
    this.applications = applications; 
    return this;
  }

  public PolicyCreationRequest addApplicationsItem(String applicationsItem) {
   
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * Applications this policy is used with
   * @return applications
  **/
  @ApiModelProperty(value = "Applications this policy is used with")
  public List<String> getApplications() {
    return applications;
  }

  public void setApplications(List<String> applications) {
    this.applications = applications;
  }


  public PolicyCreationRequest grant(Grant grant) {
    this.grant = grant; 
    return this;
  }

   /**
   * Get grant
   * @return grant
  **/
  @ApiModelProperty(required = true, value = "")
  public Grant getGrant() {
    return grant;
  }

  public void setGrant(Grant grant) {
    this.grant = grant;
  }


  public PolicyCreationRequest selectors(List<SelectorDefinition> selectors) {
    this.selectors = selectors; 
    return this;
  }

  public PolicyCreationRequest addSelectorsItem(SelectorDefinition selectorsItem) {
   
    this.selectors.add(selectorsItem);
    return this;
  }

   /**
   * Selectors that identify what resources this policy qualifies for
   * @return selectors
  **/
  @ApiModelProperty(required = true, value = "Selectors that identify what resources this policy qualifies for")
  public List<SelectorDefinition> getSelectors() {
    return selectors;
  }

  public void setSelectors(List<SelectorDefinition> selectors) {
    this.selectors = selectors;
  }


  public PolicyCreationRequest _for(List<ForSpec> _for) {
    this._for = _for; 
    return this;
  }

  public PolicyCreationRequest addForItem(ForSpec _forItem) {
   
    if (this._for == null) {
      this._for = new ArrayList<>();
    }
    this._for.add(_forItem);
    return this;
  }

   /**
   * \&quot;For Specification\&quot; for when the policy is to be applied
   * @return _for
  **/
  @ApiModelProperty(value = "\"For Specification\" for when the policy is to be applied")
  public List<ForSpec> getFor() {
    return _for;
  }

  public void setFor(List<ForSpec> _for) {
    this._for = _for;
  }


  public PolicyCreationRequest _if(List<IfExpression> _if) {
    this._if = _if; 
    return this;
  }

  public PolicyCreationRequest addIfItem(IfExpression _ifItem) {
   
    if (this._if == null) {
      this._if = new ArrayList<>();
    }
    this._if.add(_ifItem);
    return this;
  }

   /**
   * \&quot;If Specification\&quot; for when the policy is to be applied
   * @return _if
  **/
  @ApiModelProperty(value = "\"If Specification\" for when the policy is to be applied")
  public List<IfExpression> getIf() {
    return _if;
  }

  public void setIf(List<IfExpression> _if) {
    this._if = _if;
  }


  public PolicyCreationRequest when(WhenSpec when) {
    this.when = when; 
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @ApiModelProperty(required = true, value = "")
  public WhenSpec getWhen() {
    return when;
  }

  public void setWhen(WhenSpec when) {
    this.when = when;
  }


  public PolicyCreationRequest how(HowSpec how) {
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
    sb.append("class PolicyCreationRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
