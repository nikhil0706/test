package com.cvs.specialty.lookup.model;

import java.util.Objects;

import javax.validation.Valid;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Audit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class Audit   {
  @JsonProperty("typeOfAudit")
  private String typeOfAudit = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("createDate")
  private DateTime createDate = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  @JsonProperty("updateDate")
  private DateTime updateDate = null;

  public Audit typeOfAudit(String typeOfAudit) {
    this.typeOfAudit = typeOfAudit;
    return this;
  }

   /**
   * Get typeOfAudit
   * @return typeOfAudit
  **/
  @ApiModelProperty(value = "")


  public String getTypeOfAudit() {
    return typeOfAudit;
  }

  public void setTypeOfAudit(String typeOfAudit) {
    this.typeOfAudit = typeOfAudit;
  }

  public Audit createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Audit createDate(DateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(DateTime createDate) {
    this.createDate = createDate;
  }

  public Audit updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Audit updateDate(DateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(DateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audit audit = (Audit) o;
    return Objects.equals(this.typeOfAudit, audit.typeOfAudit) &&
        Objects.equals(this.createdBy, audit.createdBy) &&
        Objects.equals(this.createDate, audit.createDate) &&
        Objects.equals(this.updatedBy, audit.updatedBy) &&
        Objects.equals(this.updateDate, audit.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfAudit, createdBy, createDate, updatedBy, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audit {\n");
    
    sb.append("    typeOfAudit: ").append(toIndentedString(typeOfAudit)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

