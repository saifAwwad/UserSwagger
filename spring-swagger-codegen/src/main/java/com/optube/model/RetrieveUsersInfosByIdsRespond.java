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
import com.optube.model.PublicUserInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RetrieveUsersInfosByIdsRespond
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T20:13:50.454+02:00")
public class RetrieveUsersInfosByIdsRespond {
  @JsonProperty("usersDetails")
  private List<PublicUserInfo> usersDetails = null;

  public RetrieveUsersInfosByIdsRespond usersDetails(List<PublicUserInfo> usersDetails) {
    this.usersDetails = usersDetails;
    return this;
  }

  public RetrieveUsersInfosByIdsRespond addUsersDetailsItem(PublicUserInfo usersDetailsItem) {
    if (this.usersDetails == null) {
      this.usersDetails = new ArrayList<PublicUserInfo>();
    }
    this.usersDetails.add(usersDetailsItem);
    return this;
  }

   /**
   * Get usersDetails
   * @return usersDetails
  **/
  @ApiModelProperty(value = "")
  public List<PublicUserInfo> getUsersDetails() {
    return usersDetails;
  }

  public void setUsersDetails(List<PublicUserInfo> usersDetails) {
    this.usersDetails = usersDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveUsersInfosByIdsRespond retrieveUsersInfosByIdsRespond = (RetrieveUsersInfosByIdsRespond) o;
    return Objects.equals(this.usersDetails, retrieveUsersInfosByIdsRespond.usersDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usersDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveUsersInfosByIdsRespond {\n");
    
    sb.append("    usersDetails: ").append(toIndentedString(usersDetails)).append("\n");
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

