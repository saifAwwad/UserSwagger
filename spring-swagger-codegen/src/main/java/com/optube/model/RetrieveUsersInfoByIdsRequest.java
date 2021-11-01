/*
 * Optube User API
 * API description in User optube.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.optube.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The Retrieve Users Info By Ids Request
 */
@ApiModel(description = "The Retrieve Users Info By Ids Request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T20:13:50.454+02:00")
public class RetrieveUsersInfoByIdsRequest {
  @JsonProperty("usersIds")
  private List<String> usersIds = null;

  public RetrieveUsersInfoByIdsRequest usersIds(List<String> usersIds) {
    this.usersIds = usersIds;
    return this;
  }

  public RetrieveUsersInfoByIdsRequest addUsersIdsItem(String usersIdsItem) {
    if (this.usersIds == null) {
      this.usersIds = new ArrayList<String>();
    }
    this.usersIds.add(usersIdsItem);
    return this;
  }

   /**
   * Get usersIds
   * @return usersIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getUsersIds() {
    return usersIds;
  }

  public void setUsersIds(List<String> usersIds) {
    this.usersIds = usersIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveUsersInfoByIdsRequest retrieveUsersInfoByIdsRequest = (RetrieveUsersInfoByIdsRequest) o;
    return Objects.equals(this.usersIds, retrieveUsersInfoByIdsRequest.usersIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usersIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveUsersInfoByIdsRequest {\n");
    
    sb.append("    usersIds: ").append(toIndentedString(usersIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

