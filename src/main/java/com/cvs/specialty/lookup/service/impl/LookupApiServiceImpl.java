/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupApiServiceImpl.java
 */

package com.cvs.specialty.lookup.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvs.specialty.lookup.dao.LookupApiDao;
import com.cvs.specialty.lookup.entity.ZipCodeEO;
import com.cvs.specialty.lookup.enums.LookupApiErrorCode;
import com.cvs.specialty.lookup.exception.LookupApiException;
import com.cvs.specialty.lookup.mapper.LookupResponseMapper;
import com.cvs.specialty.lookup.model.PartyAddress;
import com.cvs.specialty.lookup.service.LookupApiService;

/**
 * Main class for service implementation layer, houses the business logic tied to the Lookup Api
 * operations.
 * 
 * @author U006407
 */
@Service
public class LookupApiServiceImpl implements LookupApiService {

  private static final Logger LOG = LoggerFactory.getLogger(LookupApiServiceImpl.class);

  @Autowired
  LookupApiDao lookupDao;

  @Autowired
  LookupResponseMapper mapper;

  public LookupApiDao getLookupDao() {
    return lookupDao;
  }

  public void setLookupDao(LookupApiDao lookupDao) {
    this.lookupDao = lookupDao;
  }

  public LookupResponseMapper getMapper() {
    return mapper;
  }

  public void setMapper(LookupResponseMapper mapper) {
    this.mapper = mapper;
  }

  @Override
  public PartyAddress getZipCodeLookup(long zipCode) throws LookupApiException {

    LOG.info("LookupApiServiceImpl.getZipCodeLookup start");

    PartyAddress addressResponse = null;
    ZipCodeEO zipCodeEO = null;

    zipCodeEO = lookupDao.getZipCodeLookup(zipCode);

    if (null != zipCodeEO) {
      // map the retrieved data to POJO
      addressResponse = mapper.mapZipCodeEOToModel(zipCodeEO);
    } 
    
    return addressResponse;
  }

}
