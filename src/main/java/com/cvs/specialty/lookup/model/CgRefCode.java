package com.cvs.specialty.lookup.model;

import java.util.Objects;

import javax.validation.Valid;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CgRefCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class CgRefCode   {
  @JsonProperty("codeConfigurationIdentifier")
  private Integer codeConfigurationIdentifier = null;

  @JsonProperty("codeShortDescription")
  private String codeShortDescription = null;

  @JsonProperty("codeLongDescription")
  private String codeLongDescription = null;

  @JsonProperty("codeHighValueText")
  private String codeHighValueText = null;

  @JsonProperty("codeLowValueText")
  private String codeLowValueText = null;

  @JsonProperty("codeDomainName")
  private String codeDomainName = null;

  @JsonProperty("activeIndicator")
  private String activeIndicator = null;

  @JsonProperty("effectiveDate")
  private LocalDate effectiveDate = null;

  @JsonProperty("expirationDate")
  private LocalDate expirationDate = null;

  @JsonProperty("audit")
  private Audit audit = null;

  public CgRefCode codeConfigurationIdentifier(Integer codeConfigurationIdentifier) {
    this.codeConfigurationIdentifier = codeConfigurationIdentifier;
    return this;
  }

   /**
   * Get codeConfigurationIdentifier
   * @return codeConfigurationIdentifier
  **/
  @ApiModelProperty(value = "")


  public Integer getCodeConfigurationIdentifier() {
    return codeConfigurationIdentifier;
  }

  public void setCodeConfigurationIdentifier(Integer codeConfigurationIdentifier) {
    this.codeConfigurationIdentifier = codeConfigurationIdentifier;
  }

  public CgRefCode codeShortDescription(String codeShortDescription) {
    this.codeShortDescription = codeShortDescription;
    return this;
  }

   /**
   * Get codeShortDescription
   * @return codeShortDescription
  **/
  @ApiModelProperty(value = "")


  public String getCodeShortDescription() {
    return codeShortDescription;
  }

  public void setCodeShortDescription(String codeShortDescription) {
    this.codeShortDescription = codeShortDescription;
  }

  public CgRefCode codeLongDescription(String codeLongDescription) {
    this.codeLongDescription = codeLongDescription;
    return this;
  }

   /**
   * Get codeLongDescription
   * @return codeLongDescription
  **/
  @ApiModelProperty(value = "")


  public String getCodeLongDescription() {
    return codeLongDescription;
  }

  public void setCodeLongDescription(String codeLongDescription) {
    this.codeLongDescription = codeLongDescription;
  }

  public CgRefCode codeHighValueText(String codeHighValueText) {
    this.codeHighValueText = codeHighValueText;
    return this;
  }

   /**
   * Get codeHighValueText
   * @return codeHighValueText
  **/
  @ApiModelProperty(value = "")


  public String getCodeHighValueText() {
    return codeHighValueText;
  }

  public void setCodeHighValueText(String codeHighValueText) {
    this.codeHighValueText = codeHighValueText;
  }

  public CgRefCode codeLowValueText(String codeLowValueText) {
    this.codeLowValueText = codeLowValueText;
    return this;
  }

   /**
   * Get codeLowValueText
   * @return codeLowValueText
  **/
  @ApiModelProperty(value = "")


  public String getCodeLowValueText() {
    return codeLowValueText;
  }

  public void setCodeLowValueText(String codeLowValueText) {
    this.codeLowValueText = codeLowValueText;
  }

  public CgRefCode codeDomainName(String codeDomainName) {
    this.codeDomainName = codeDomainName;
    return this;
  }

   /**
   * Get codeDomainName
   * @return codeDomainName
  **/
  @ApiModelProperty(value = "")


  public String getCodeDomainName() {
    return codeDomainName;
  }

  public void setCodeDomainName(String codeDomainName) {
    this.codeDomainName = codeDomainName;
  }

  public CgRefCode activeIndicator(String activeIndicator) {
    this.activeIndicator = activeIndicator;
    return this;
  }

   /**
   * Get activeIndicator
   * @return activeIndicator
  **/
  @ApiModelProperty(value = "")


  public String getActiveIndicator() {
    return activeIndicator;
  }

  public void setActiveIndicator(String activeIndicator) {
    this.activeIndicator = activeIndicator;
  }

  public CgRefCode effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Get effectiveDate
   * @return effectiveDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public CgRefCode expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CgRefCode audit(Audit audit) {
    this.audit = audit;
    return this;
  }

   /**
   * Get audit
   * @return audit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Audit getAudit() {
    return audit;
  }

  public void setAudit(Audit audit) {
    this.audit = audit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgRefCode cgRefCode = (CgRefCode) o;
    return Objects.equals(this.codeConfigurationIdentifier, cgRefCode.codeConfigurationIdentifier) &&
        Objects.equals(this.codeShortDescription, cgRefCode.codeShortDescription) &&
        Objects.equals(this.codeLongDescription, cgRefCode.codeLongDescription) &&
        Objects.equals(this.codeHighValueText, cgRefCode.codeHighValueText) &&
        Objects.equals(this.codeLowValueText, cgRefCode.codeLowValueText) &&
        Objects.equals(this.codeDomainName, cgRefCode.codeDomainName) &&
        Objects.equals(this.activeIndicator, cgRefCode.activeIndicator) &&
        Objects.equals(this.effectiveDate, cgRefCode.effectiveDate) &&
        Objects.equals(this.expirationDate, cgRefCode.expirationDate) &&
        Objects.equals(this.audit, cgRefCode.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeConfigurationIdentifier, codeShortDescription, codeLongDescription, codeHighValueText, codeLowValueText, codeDomainName, activeIndicator, effectiveDate, expirationDate, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgRefCode {\n");
    
    sb.append("    codeConfigurationIdentifier: ").append(toIndentedString(codeConfigurationIdentifier)).append("\n");
    sb.append("    codeShortDescription: ").append(toIndentedString(codeShortDescription)).append("\n");
    sb.append("    codeLongDescription: ").append(toIndentedString(codeLongDescription)).append("\n");
    sb.append("    codeHighValueText: ").append(toIndentedString(codeHighValueText)).append("\n");
    sb.append("    codeLowValueText: ").append(toIndentedString(codeLowValueText)).append("\n");
    sb.append("    codeDomainName: ").append(toIndentedString(codeDomainName)).append("\n");
    sb.append("    activeIndicator: ").append(toIndentedString(activeIndicator)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
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

