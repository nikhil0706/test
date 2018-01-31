/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupApiGetRequest.java
 */
package com.cvs.specialty.lookup.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZipCpdeLookupGetRequest {

  @JsonProperty("zipCode")
  private String zipCode;

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipCpdeLookupGetRequest {\n");
    sb.append("    zipCode: ").append((zipCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

}
