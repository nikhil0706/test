package com.cvs.specialty.lookup.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PartyAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class PartyAddress   {
  @JsonProperty("partyAddressIdentifier")
  private Long partyAddressIdentifier = null;

  @JsonProperty("partyIdentifier")
  private Long partyIdentifier = null;

  @JsonProperty("addressCategoryCode")
  private String addressCategoryCode = null;

  @JsonProperty("addressType")
  private String addressType = null;

  @JsonProperty("addressLine1Text")
  private String addressLine1Text = null;

  @JsonProperty("addressLine2Text")
  private String addressLine2Text = null;

  @JsonProperty("addressLine3Text")
  private String addressLine3Text = null;

  @JsonProperty("cityText")
  private String cityText = null;

  @JsonProperty("stateCode")
  private String stateCode = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("zipExtensionCode")
  private String zipExtensionCode = null;

  @JsonProperty("countryText")
  private String countryText = null;

  @JsonProperty("countyText")
  private String countyText = null;

  @JsonProperty("audit")
  private Audit audit = null;

  public PartyAddress partyAddressIdentifier(Long partyAddressIdentifier) {
    this.partyAddressIdentifier = partyAddressIdentifier;
    return this;
  }

   /**
   * Get partyAddressIdentifier
   * @return partyAddressIdentifier
  **/
  @ApiModelProperty(value = "")


  public Long getPartyAddressIdentifier() {
    return partyAddressIdentifier;
  }

  public void setPartyAddressIdentifier(Long partyAddressIdentifier) {
    this.partyAddressIdentifier = partyAddressIdentifier;
  }

  public PartyAddress partyIdentifier(Long partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
    return this;
  }

   /**
   * Get partyIdentifier
   * @return partyIdentifier
  **/
  @ApiModelProperty(value = "")


  public Long getPartyIdentifier() {
    return partyIdentifier;
  }

  public void setPartyIdentifier(Long partyIdentifier) {
    this.partyIdentifier = partyIdentifier;
  }

  public PartyAddress addressCategoryCode(String addressCategoryCode) {
    this.addressCategoryCode = addressCategoryCode;
    return this;
  }

   /**
   * Get addressCategoryCode
   * @return addressCategoryCode
  **/
  @ApiModelProperty(value = "")


  public String getAddressCategoryCode() {
    return addressCategoryCode;
  }

  public void setAddressCategoryCode(String addressCategoryCode) {
    this.addressCategoryCode = addressCategoryCode;
  }

  public PartyAddress addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")


  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public PartyAddress addressLine1Text(String addressLine1Text) {
    this.addressLine1Text = addressLine1Text;
    return this;
  }

   /**
   * Get addressLine1Text
   * @return addressLine1Text
  **/
  @ApiModelProperty(value = "")


  public String getAddressLine1Text() {
    return addressLine1Text;
  }

  public void setAddressLine1Text(String addressLine1Text) {
    this.addressLine1Text = addressLine1Text;
  }

  public PartyAddress addressLine2Text(String addressLine2Text) {
    this.addressLine2Text = addressLine2Text;
    return this;
  }

   /**
   * Get addressLine2Text
   * @return addressLine2Text
  **/
  @ApiModelProperty(value = "")


  public String getAddressLine2Text() {
    return addressLine2Text;
  }

  public void setAddressLine2Text(String addressLine2Text) {
    this.addressLine2Text = addressLine2Text;
  }

  public PartyAddress addressLine3Text(String addressLine3Text) {
    this.addressLine3Text = addressLine3Text;
    return this;
  }

   /**
   * Get addressLine3Text
   * @return addressLine3Text
  **/
  @ApiModelProperty(value = "")


  public String getAddressLine3Text() {
    return addressLine3Text;
  }

  public void setAddressLine3Text(String addressLine3Text) {
    this.addressLine3Text = addressLine3Text;
  }

  public PartyAddress cityText(String cityText) {
    this.cityText = cityText;
    return this;
  }

   /**
   * Get cityText
   * @return cityText
  **/
  @ApiModelProperty(value = "")


  public String getCityText() {
    return cityText;
  }

  public void setCityText(String cityText) {
    this.cityText = cityText;
  }

  public PartyAddress stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @ApiModelProperty(value = "")


  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public PartyAddress zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public PartyAddress zipExtensionCode(String zipExtensionCode) {
    this.zipExtensionCode = zipExtensionCode;
    return this;
  }

   /**
   * Get zipExtensionCode
   * @return zipExtensionCode
  **/
  @ApiModelProperty(value = "")


  public String getZipExtensionCode() {
    return zipExtensionCode;
  }

  public void setZipExtensionCode(String zipExtensionCode) {
    this.zipExtensionCode = zipExtensionCode;
  }

  public PartyAddress countryText(String countryText) {
    this.countryText = countryText;
    return this;
  }

   /**
   * Get countryText
   * @return countryText
  **/
  @ApiModelProperty(value = "")


  public String getCountryText() {
    return countryText;
  }

  public void setCountryText(String countryText) {
    this.countryText = countryText;
  }

  public PartyAddress countyText(String countyText) {
    this.countyText = countyText;
    return this;
  }

   /**
   * Get countyText
   * @return countyText
  **/
  @ApiModelProperty(value = "")


  public String getCountyText() {
    return countyText;
  }

  public void setCountyText(String countyText) {
    this.countyText = countyText;
  }

  public PartyAddress audit(Audit audit) {
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
    PartyAddress partyAddress = (PartyAddress) o;
    return Objects.equals(this.partyAddressIdentifier, partyAddress.partyAddressIdentifier) &&
        Objects.equals(this.partyIdentifier, partyAddress.partyIdentifier) &&
        Objects.equals(this.addressCategoryCode, partyAddress.addressCategoryCode) &&
        Objects.equals(this.addressType, partyAddress.addressType) &&
        Objects.equals(this.addressLine1Text, partyAddress.addressLine1Text) &&
        Objects.equals(this.addressLine2Text, partyAddress.addressLine2Text) &&
        Objects.equals(this.addressLine3Text, partyAddress.addressLine3Text) &&
        Objects.equals(this.cityText, partyAddress.cityText) &&
        Objects.equals(this.stateCode, partyAddress.stateCode) &&
        Objects.equals(this.zipCode, partyAddress.zipCode) &&
        Objects.equals(this.zipExtensionCode, partyAddress.zipExtensionCode) &&
        Objects.equals(this.countryText, partyAddress.countryText) &&
        Objects.equals(this.countyText, partyAddress.countyText) &&
        Objects.equals(this.audit, partyAddress.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyAddressIdentifier, partyIdentifier, addressCategoryCode, addressType, addressLine1Text, addressLine2Text, addressLine3Text, cityText, stateCode, zipCode, zipExtensionCode, countryText, countyText, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyAddress {\n");
    
    sb.append("    partyAddressIdentifier: ").append(toIndentedString(partyAddressIdentifier)).append("\n");
    sb.append("    partyIdentifier: ").append(toIndentedString(partyIdentifier)).append("\n");
    sb.append("    addressCategoryCode: ").append(toIndentedString(addressCategoryCode)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    addressLine1Text: ").append(toIndentedString(addressLine1Text)).append("\n");
    sb.append("    addressLine2Text: ").append(toIndentedString(addressLine2Text)).append("\n");
    sb.append("    addressLine3Text: ").append(toIndentedString(addressLine3Text)).append("\n");
    sb.append("    cityText: ").append(toIndentedString(cityText)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipExtensionCode: ").append(toIndentedString(zipExtensionCode)).append("\n");
    sb.append("    countryText: ").append(toIndentedString(countryText)).append("\n");
    sb.append("    countyText: ").append(toIndentedString(countyText)).append("\n");
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

