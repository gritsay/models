/**
 * WellNet API gate for mobile apps
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ResponseSignUpModelData {
  
  @SerializedName("username")
  private String username = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("mobile")
  private String mobile = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("api_token")
  private String apiToken = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApiToken() {
    return apiToken;
  }
  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseSignUpModelData responseSignUpModelData = (ResponseSignUpModelData) o;
    return (this.username == null ? responseSignUpModelData.username == null : this.username.equals(responseSignUpModelData.username)) &&
        (this.firstName == null ? responseSignUpModelData.firstName == null : this.firstName.equals(responseSignUpModelData.firstName)) &&
        (this.lastName == null ? responseSignUpModelData.lastName == null : this.lastName.equals(responseSignUpModelData.lastName)) &&
        (this.mobile == null ? responseSignUpModelData.mobile == null : this.mobile.equals(responseSignUpModelData.mobile)) &&
        (this.email == null ? responseSignUpModelData.email == null : this.email.equals(responseSignUpModelData.email)) &&
        (this.apiToken == null ? responseSignUpModelData.apiToken == null : this.apiToken.equals(responseSignUpModelData.apiToken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.mobile == null ? 0: this.mobile.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.apiToken == null ? 0: this.apiToken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSignUpModelData {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  mobile: ").append(mobile).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  apiToken: ").append(apiToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
