package com.cvs.specialty.lookup.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddressValidationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

public class AddressValidationRequest   {
  @JsonProperty("address")
  private List<PartyAddress> address = null;

  public AddressValidationRequest address(List<PartyAddress> address) {
    this.address = address;
    return this;
  }

  public AddressValidationRequest addAddressItem(PartyAddress addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<PartyAddress>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PartyAddress> getAddress() {
    return address;
  }

  public void setAddress(List<PartyAddress> address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressValidationRequest addressValidationRequest = (AddressValidationRequest) o;
    return Objects.equals(this.address, addressValidationRequest.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressValidationRequest {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

