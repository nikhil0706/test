package com.cvs.specialty.lookup.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PatientDiagnosis
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class PatientDiagnosis   {
  @JsonProperty("patientDiagnosisIdentifier")
  private Long patientDiagnosisIdentifier = null;

  @JsonProperty("patientIdentifier")
  private Long patientIdentifier = null;

  @JsonProperty("diagnosisCode")
  private String diagnosisCode = null;

  @JsonProperty("diagnosisDescription")
  private String diagnosisDescription = null;

  @JsonProperty("diagnosisCodeQualifier")
  private String diagnosisCodeQualifier = null;

  @JsonProperty("diagnosisRank")
  private String diagnosisRank = null;

  @JsonProperty("activeIndicator")
  private String activeIndicator = null;

  @JsonProperty("audit")
  private Audit audit = null;

  public PatientDiagnosis patientDiagnosisIdentifier(Long patientDiagnosisIdentifier) {
    this.patientDiagnosisIdentifier = patientDiagnosisIdentifier;
    return this;
  }

   /**
   * Get patientDiagnosisIdentifier
   * @return patientDiagnosisIdentifier
  **/
  @ApiModelProperty(value = "")


  public Long getPatientDiagnosisIdentifier() {
    return patientDiagnosisIdentifier;
  }

  public void setPatientDiagnosisIdentifier(Long patientDiagnosisIdentifier) {
    this.patientDiagnosisIdentifier = patientDiagnosisIdentifier;
  }

  public PatientDiagnosis patientIdentifier(Long patientIdentifier) {
    this.patientIdentifier = patientIdentifier;
    return this;
  }

   /**
   * Get patientIdentifier
   * @return patientIdentifier
  **/
  @ApiModelProperty(value = "")


  public Long getPatientIdentifier() {
    return patientIdentifier;
  }

  public void setPatientIdentifier(Long patientIdentifier) {
    this.patientIdentifier = patientIdentifier;
  }

  public PatientDiagnosis diagnosisCode(String diagnosisCode) {
    this.diagnosisCode = diagnosisCode;
    return this;
  }

   /**
   * Get diagnosisCode
   * @return diagnosisCode
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisCode() {
    return diagnosisCode;
  }

  public void setDiagnosisCode(String diagnosisCode) {
    this.diagnosisCode = diagnosisCode;
  }

  public PatientDiagnosis diagnosisDescription(String diagnosisDescription) {
    this.diagnosisDescription = diagnosisDescription;
    return this;
  }

   /**
   * Get diagnosisDescription
   * @return diagnosisDescription
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisDescription() {
    return diagnosisDescription;
  }

  public void setDiagnosisDescription(String diagnosisDescription) {
    this.diagnosisDescription = diagnosisDescription;
  }

  public PatientDiagnosis diagnosisCodeQualifier(String diagnosisCodeQualifier) {
    this.diagnosisCodeQualifier = diagnosisCodeQualifier;
    return this;
  }

   /**
   * Get diagnosisCodeQualifier
   * @return diagnosisCodeQualifier
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisCodeQualifier() {
    return diagnosisCodeQualifier;
  }

  public void setDiagnosisCodeQualifier(String diagnosisCodeQualifier) {
    this.diagnosisCodeQualifier = diagnosisCodeQualifier;
  }

  public PatientDiagnosis diagnosisRank(String diagnosisRank) {
    this.diagnosisRank = diagnosisRank;
    return this;
  }

   /**
   * Get diagnosisRank
   * @return diagnosisRank
  **/
  @ApiModelProperty(value = "")


  public String getDiagnosisRank() {
    return diagnosisRank;
  }

  public void setDiagnosisRank(String diagnosisRank) {
    this.diagnosisRank = diagnosisRank;
  }

  public PatientDiagnosis activeIndicator(String activeIndicator) {
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

  public PatientDiagnosis audit(Audit audit) {
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
    PatientDiagnosis patientDiagnosis = (PatientDiagnosis) o;
    return Objects.equals(this.patientDiagnosisIdentifier, patientDiagnosis.patientDiagnosisIdentifier) &&
        Objects.equals(this.patientIdentifier, patientDiagnosis.patientIdentifier) &&
        Objects.equals(this.diagnosisCode, patientDiagnosis.diagnosisCode) &&
        Objects.equals(this.diagnosisDescription, patientDiagnosis.diagnosisDescription) &&
        Objects.equals(this.diagnosisCodeQualifier, patientDiagnosis.diagnosisCodeQualifier) &&
        Objects.equals(this.diagnosisRank, patientDiagnosis.diagnosisRank) &&
        Objects.equals(this.activeIndicator, patientDiagnosis.activeIndicator) &&
        Objects.equals(this.audit, patientDiagnosis.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patientDiagnosisIdentifier, patientIdentifier, diagnosisCode, diagnosisDescription, diagnosisCodeQualifier, diagnosisRank, activeIndicator, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientDiagnosis {\n");
    
    sb.append("    patientDiagnosisIdentifier: ").append(toIndentedString(patientDiagnosisIdentifier)).append("\n");
    sb.append("    patientIdentifier: ").append(toIndentedString(patientIdentifier)).append("\n");
    sb.append("    diagnosisCode: ").append(toIndentedString(diagnosisCode)).append("\n");
    sb.append("    diagnosisDescription: ").append(toIndentedString(diagnosisDescription)).append("\n");
    sb.append("    diagnosisCodeQualifier: ").append(toIndentedString(diagnosisCodeQualifier)).append("\n");
    sb.append("    diagnosisRank: ").append(toIndentedString(diagnosisRank)).append("\n");
    sb.append("    activeIndicator: ").append(toIndentedString(activeIndicator)).append("\n");
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

