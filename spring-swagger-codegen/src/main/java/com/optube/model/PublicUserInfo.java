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

/**
 * public User Info Object
 */
@ApiModel(description = "public User Info Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-01T20:13:50.454+02:00")
public class PublicUserInfo {
  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("profilePictureUrl")
  private String profilePictureUrl = null;

  public PublicUserInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public PublicUserInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public PublicUserInfo profilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }

   /**
   * Get profilePictureUrl
   * @return profilePictureUrl
  **/
  @ApiModelProperty(value = "")
  public String getProfilePictureUrl() {
    return profilePictureUrl;
  }

  public void setProfilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicUserInfo publicUserInfo = (PublicUserInfo) o;
    return Objects.equals(this.userId, publicUserInfo.userId) &&
        Objects.equals(this.userName, publicUserInfo.userName) &&
        Objects.equals(this.profilePictureUrl, publicUserInfo.profilePictureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, profilePictureUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicUserInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
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
