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
import com.finbourne.access.model.Link;
import com.finbourne.access.model.RoleId;
import com.finbourne.access.model.RoleResourceRequest;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Response object from the role API
 */
@ApiModel(description = "Response object from the role API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoleResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private RoleId id;

  public static final String SERIALIZED_NAME_ROLE_HIERARCHY_INDEX = "roleHierarchyIndex";
  @SerializedName(SERIALIZED_NAME_ROLE_HIERARCHY_INDEX)
  private Integer roleHierarchyIndex;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private RoleResourceRequest resource;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private WhenSpec when;

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private String permission;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Map<String, String> limit = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public RoleResponse id(RoleId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public RoleId getId() {
    return id;
  }

  public void setId(RoleId id) {
    this.id = id;
  }


  public RoleResponse roleHierarchyIndex(Integer roleHierarchyIndex) {
    this.roleHierarchyIndex = roleHierarchyIndex; 
    return this;
  }

   /**
   * The hierarchical index of the role
   * @return roleHierarchyIndex
  **/
  @ApiModelProperty(required = true, value = "The hierarchical index of the role")
  public Integer getRoleHierarchyIndex() {
    return roleHierarchyIndex;
  }

  public void setRoleHierarchyIndex(Integer roleHierarchyIndex) {
    this.roleHierarchyIndex = roleHierarchyIndex;
  }


  public RoleResponse description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The description of the role
   * @return description
  **/
  @ApiModelProperty(value = "The description of the role")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public RoleResponse resource(RoleResourceRequest resource) {
    this.resource = resource; 
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "")
  public RoleResourceRequest getResource() {
    return resource;
  }

  public void setResource(RoleResourceRequest resource) {
    this.resource = resource;
  }


  public RoleResponse when(WhenSpec when) {
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


  public RoleResponse permission(String permission) {
    this.permission = permission; 
    return this;
  }

   /**
   * The action key of the role
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "The action key of the role")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  public RoleResponse limit(Map<String, String> limit) {
    this.limit = limit; 
    return this;
  }

  public RoleResponse putLimitItem(String key, String limitItem) {
    if (this.limit == null) {
      this.limit = new HashMap<>();
    }
    this.limit.put(key, limitItem);
    return this;
  }

   /**
   * The identifiers of the role with the maximum privileges that this role can have
   * @return limit
  **/
  @ApiModelProperty(value = "The identifiers of the role with the maximum privileges that this role can have")
  public Map<String, String> getLimit() {
    return limit;
  }

  public void setLimit(Map<String, String> limit) {
    this.limit = limit;
  }


  public RoleResponse links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public RoleResponse addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    sb.append("class RoleResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roleHierarchyIndex: ").append(toIndentedString(roleHierarchyIndex)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
