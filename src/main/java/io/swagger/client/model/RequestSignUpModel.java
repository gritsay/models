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
public class RequestSignUpModel {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("os")
  private String os = null;
  @SerializedName("push_token")
  private String pushToken = null;

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
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOs() {
    return os;
  }
  public void setOs(String os) {
    this.os = os;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPushToken() {
    return pushToken;
  }
  public void setPushToken(String pushToken) {
    this.pushToken = pushToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSignUpModel requestSignUpModel = (RequestSignUpModel) o;
    return (this.email == null ? requestSignUpModel.email == null : this.email.equals(requestSignUpModel.email)) &&
        (this.username == null ? requestSignUpModel.username == null : this.username.equals(requestSignUpModel.username)) &&
        (this.firstName == null ? requestSignUpModel.firstName == null : this.firstName.equals(requestSignUpModel.firstName)) &&
        (this.lastName == null ? requestSignUpModel.lastName == null : this.lastName.equals(requestSignUpModel.lastName)) &&
        (this.password == null ? requestSignUpModel.password == null : this.password.equals(requestSignUpModel.password)) &&
        (this.os == null ? requestSignUpModel.os == null : this.os.equals(requestSignUpModel.os)) &&
        (this.pushToken == null ? requestSignUpModel.pushToken == null : this.pushToken.equals(requestSignUpModel.pushToken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.os == null ? 0: this.os.hashCode());
    result = 31 * result + (this.pushToken == null ? 0: this.pushToken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSignUpModel {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  os: ").append(os).append("\n");
    sb.append("  pushToken: ").append(pushToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
