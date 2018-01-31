/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupResponseMapper.java
 */
package com.cvs.specialty.lookup.mapper;

import org.springframework.stereotype.Component;

import com.cvs.specialty.lookup.entity.ZipCodeEO;
import com.cvs.specialty.lookup.model.PartyAddress;

/**
 * Maps the response from the data layer to the value (POJO) object.
 * 
 * @author U006407
 */

@Component
public class LookupResponseMapper {

  private LookupResponseMapper() {}
  
  /**
   * This method is being used by the zip code lookup.
   * 
   * @param zipCodeEO
   * @return
   */
  public PartyAddress mapZipCodeEOToModel(ZipCodeEO zipCodeEO) {
    PartyAddress address = null;

    if (null != zipCodeEO) {
      address = new PartyAddress();
      address.setZipCode(zipCodeEO.getZipCode().toString());
      address.setCityText(zipCodeEO.getCity());
      address.setStateCode(zipCodeEO.getState());
      address.setCountyText(zipCodeEO.getCounty());
    }
    return address;
  }

}
