package com.cvs.specialty.lookup.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddressValidationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class AddressValidationResponse   {
  @JsonProperty("responseAddress")
  private List<AddressResponse> responseAddress = null;

  public AddressValidationResponse responseAddress(List<AddressResponse> responseAddress) {
    this.responseAddress = responseAddress;
    return this;
  }

  public AddressValidationResponse addResponseAddressItem(AddressResponse responseAddressItem) {
    if (this.responseAddress == null) {
      this.responseAddress = new ArrayList<AddressResponse>();
    }
    this.responseAddress.add(responseAddressItem);
    return this;
  }

   /**
   * Get responseAddress
   * @return responseAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AddressResponse> getResponseAddress() {
    return responseAddress;
  }

  public void setResponseAddress(List<AddressResponse> responseAddress) {
    this.responseAddress = responseAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressValidationResponse addressValidationResponse = (AddressValidationResponse) o;
    return Objects.equals(this.responseAddress, addressValidationResponse.responseAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressValidationResponse {\n");
    
    sb.append("    responseAddress: ").append(toIndentedString(responseAddress)).append("\n");
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

