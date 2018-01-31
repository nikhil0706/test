package com.cvs.specialty.lookup.model;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddressResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class AddressResponse extends PartyAddress  {
  @JsonProperty("business")
  private String business = null;

  @JsonProperty("carrierRoute")
  private String carrierRoute = null;

  @JsonProperty("centralDeliveryPoint")
  private String centralDeliveryPoint = null;

  @JsonProperty("dpvcmra")
  private String dpvcmra = null;

  @JsonProperty("dpvConfirmation")
  private String dpvConfirmation = null;

  @JsonProperty("dpvFootnotes")
  private String dpvFootnotes = null;

  @JsonProperty("deliveryPoint")
  private String deliveryPoint = null;

  @JsonProperty("footnotes")
  private String footnotes = null;

  @JsonProperty("vacant")
  private String vacant = null;

  @JsonProperty("returnText")
  private String returnText = null;

  @JsonProperty("error")
  private AddressError error = null;

  public AddressResponse business(String business) {
    this.business = business;
    return this;
  }

   /**
   * Get business
   * @return business
  **/
  @ApiModelProperty(value = "")


  public String getBusiness() {
    return business;
  }

  public void setBusiness(String business) {
    this.business = business;
  }

  public AddressResponse carrierRoute(String carrierRoute) {
    this.carrierRoute = carrierRoute;
    return this;
  }

   /**
   * Get carrierRoute
   * @return carrierRoute
  **/
  @ApiModelProperty(value = "")


  public String getCarrierRoute() {
    return carrierRoute;
  }

  public void setCarrierRoute(String carrierRoute) {
    this.carrierRoute = carrierRoute;
  }

  public AddressResponse centralDeliveryPoint(String centralDeliveryPoint) {
    this.centralDeliveryPoint = centralDeliveryPoint;
    return this;
  }

   /**
   * Get centralDeliveryPoint
   * @return centralDeliveryPoint
  **/
  @ApiModelProperty(value = "")


  public String getCentralDeliveryPoint() {
    return centralDeliveryPoint;
  }

  public void setCentralDeliveryPoint(String centralDeliveryPoint) {
    this.centralDeliveryPoint = centralDeliveryPoint;
  }

  public AddressResponse dpvcmra(String dpvcmra) {
    this.dpvcmra = dpvcmra;
    return this;
  }

   /**
   * Get dpvcmra
   * @return dpvcmra
  **/
  @ApiModelProperty(value = "")


  public String getDpvcmra() {
    return dpvcmra;
  }

  public void setDpvcmra(String dpvcmra) {
    this.dpvcmra = dpvcmra;
  }

  public AddressResponse dpvConfirmation(String dpvConfirmation) {
    this.dpvConfirmation = dpvConfirmation;
    return this;
  }

   /**
   * Get dpvConfirmation
   * @return dpvConfirmation
  **/
  @ApiModelProperty(value = "")


  public String getDpvConfirmation() {
    return dpvConfirmation;
  }

  public void setDpvConfirmation(String dpvConfirmation) {
    this.dpvConfirmation = dpvConfirmation;
  }

  public AddressResponse dpvFootnotes(String dpvFootnotes) {
    this.dpvFootnotes = dpvFootnotes;
    return this;
  }

   /**
   * Get dpvFootnotes
   * @return dpvFootnotes
  **/
  @ApiModelProperty(value = "")


  public String getDpvFootnotes() {
    return dpvFootnotes;
  }

  public void setDpvFootnotes(String dpvFootnotes) {
    this.dpvFootnotes = dpvFootnotes;
  }

  public AddressResponse deliveryPoint(String deliveryPoint) {
    this.deliveryPoint = deliveryPoint;
    return this;
  }

   /**
   * Get deliveryPoint
   * @return deliveryPoint
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryPoint() {
    return deliveryPoint;
  }

  public void setDeliveryPoint(String deliveryPoint) {
    this.deliveryPoint = deliveryPoint;
  }

  public AddressResponse footnotes(String footnotes) {
    this.footnotes = footnotes;
    return this;
  }

   /**
   * Get footnotes
   * @return footnotes
  **/
  @ApiModelProperty(value = "")


  public String getFootnotes() {
    return footnotes;
  }

  public void setFootnotes(String footnotes) {
    this.footnotes = footnotes;
  }

  public AddressResponse vacant(String vacant) {
    this.vacant = vacant;
    return this;
  }

   /**
   * Get vacant
   * @return vacant
  **/
  @ApiModelProperty(value = "")


  public String getVacant() {
    return vacant;
  }

  public void setVacant(String vacant) {
    this.vacant = vacant;
  }

  public AddressResponse returnText(String returnText) {
    this.returnText = returnText;
    return this;
  }

   /**
   * Get returnText
   * @return returnText
  **/
  @ApiModelProperty(value = "")


  public String getReturnText() {
    return returnText;
  }

  public void setReturnText(String returnText) {
    this.returnText = returnText;
  }

  public AddressResponse error(AddressError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AddressError getError() {
    return error;
  }

  public void setError(AddressError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressResponse addressResponse = (AddressResponse) o;
    return Objects.equals(this.business, addressResponse.business) &&
        Objects.equals(this.carrierRoute, addressResponse.carrierRoute) &&
        Objects.equals(this.centralDeliveryPoint, addressResponse.centralDeliveryPoint) &&
        Objects.equals(this.dpvcmra, addressResponse.dpvcmra) &&
        Objects.equals(this.dpvConfirmation, addressResponse.dpvConfirmation) &&
        Objects.equals(this.dpvFootnotes, addressResponse.dpvFootnotes) &&
        Objects.equals(this.deliveryPoint, addressResponse.deliveryPoint) &&
        Objects.equals(this.footnotes, addressResponse.footnotes) &&
        Objects.equals(this.vacant, addressResponse.vacant) &&
        Objects.equals(this.returnText, addressResponse.returnText) &&
        Objects.equals(this.error, addressResponse.error) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(business, carrierRoute, centralDeliveryPoint, dpvcmra, dpvConfirmation, dpvFootnotes, deliveryPoint, footnotes, vacant, returnText, error, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    carrierRoute: ").append(toIndentedString(carrierRoute)).append("\n");
    sb.append("    centralDeliveryPoint: ").append(toIndentedString(centralDeliveryPoint)).append("\n");
    sb.append("    dpvcmra: ").append(toIndentedString(dpvcmra)).append("\n");
    sb.append("    dpvConfirmation: ").append(toIndentedString(dpvConfirmation)).append("\n");
    sb.append("    dpvFootnotes: ").append(toIndentedString(dpvFootnotes)).append("\n");
    sb.append("    deliveryPoint: ").append(toIndentedString(deliveryPoint)).append("\n");
    sb.append("    footnotes: ").append(toIndentedString(footnotes)).append("\n");
    sb.append("    vacant: ").append(toIndentedString(vacant)).append("\n");
    sb.append("    returnText: ").append(toIndentedString(returnText)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

