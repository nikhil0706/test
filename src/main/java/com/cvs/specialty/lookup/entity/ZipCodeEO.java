/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: ZipCodeEO.java
 */

package com.cvs.specialty.lookup.entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the ZIP_CODES Sparcs database table.
 * 
 * @author U006407
 */
@Entity
@Table(name = "ZIP_CODES")
public class ZipCodeEO implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ZIP_CODE_ID")
  private long zipCodeId;

  @Column(name = "ZIP_CODE")
  private long zipCode;

  @Column(name = "ZIP_CODE_PLUS4")
  private long zipCodeExt;

  @Column(name = "CITY")
  private String city;

  @Column(name = "STATE")
  private String state;

  @Column(name = "COUNTY")
  private String county;

  
  public Long getZipCodeId() {
    return zipCodeId;
  }

  public void setZipCodeId(Long zipCodeId) {
    this.zipCodeId = zipCodeId;
  }

  public Long getZipCode() {
    return zipCode;
  }

  public void setZipCode(Long zipCode) {
    this.zipCode = zipCode;
  }

  public Long getZipCodeExt() {
    return zipCodeExt;
  }

  public void setZipCodeExt(Long zipCodeExt) {
    this.zipCodeExt = zipCodeExt;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

}
