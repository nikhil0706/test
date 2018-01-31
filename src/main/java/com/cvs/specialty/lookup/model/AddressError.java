package com.cvs.specialty.lookup.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddressError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class AddressError   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("helpContext")
  private String helpContext = null;

  @JsonProperty("helpFile")
  private String helpFile = null;

  @JsonProperty("number")
  private BigDecimal number = null;

  @JsonProperty("source")
  private String source = null;

  public AddressError description(String description) {
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

  public AddressError helpContext(String helpContext) {
    this.helpContext = helpContext;
    return this;
  }

   /**
   * Get helpContext
   * @return helpContext
  **/
  @ApiModelProperty(value = "")


  public String getHelpContext() {
    return helpContext;
  }

  public void setHelpContext(String helpContext) {
    this.helpContext = helpContext;
  }

  public AddressError helpFile(String helpFile) {
    this.helpFile = helpFile;
    return this;
  }

   /**
   * Get helpFile
   * @return helpFile
  **/
  @ApiModelProperty(value = "")


  public String getHelpFile() {
    return helpFile;
  }

  public void setHelpFile(String helpFile) {
    this.helpFile = helpFile;
  }

  public AddressError number(BigDecimal number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public AddressError source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressError addressError = (AddressError) o;
    return Objects.equals(this.description, addressError.description) &&
        Objects.equals(this.helpContext, addressError.helpContext) &&
        Objects.equals(this.helpFile, addressError.helpFile) &&
        Objects.equals(this.number, addressError.number) &&
        Objects.equals(this.source, addressError.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, helpContext, helpFile, number, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressError {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    helpContext: ").append(toIndentedString(helpContext)).append("\n");
    sb.append("    helpFile: ").append(toIndentedString(helpFile)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

