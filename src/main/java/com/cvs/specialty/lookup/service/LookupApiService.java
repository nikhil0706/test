/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupApiService.java
 */

package com.cvs.specialty.lookup.service;

import java.text.ParseException;

import com.cvs.specialty.lookup.exception.LookupApiException;
import com.cvs.specialty.lookup.model.PartyAddress;

/**
 * Service Layer Interface which list down all the method signature related to Lookup Api
 * 
 * @author U006407
 */
public interface LookupApiService {

  /**
   * Service layer responsible for processing the zip code lookup request.
   * 
   * @param request
   * @return
   * @throws LookupApiException
   * @throws ParseException
   */
  PartyAddress getZipCodeLookup(long zipCode) throws LookupApiException;

}
