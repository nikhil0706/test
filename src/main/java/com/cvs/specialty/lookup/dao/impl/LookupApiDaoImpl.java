/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupApiDaoImpl.java
 */

package com.cvs.specialty.lookup.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.cvs.specialty.lookup.dao.LookupApiDao;
import com.cvs.specialty.lookup.entity.ZipCodeEO;
import com.cvs.specialty.lookup.enums.LookupApiErrorCode;
import com.cvs.specialty.lookup.exception.LookupApiException;
import com.cvs.specialty.lookup.repository.ZipcodeRepository;

/**
 * This class is responsible for all database operations.
 * 
 * @author U006407
 */
@Repository
public class LookupApiDaoImpl implements LookupApiDao {

  private static final Logger LOG = LoggerFactory.getLogger(LookupApiDaoImpl.class);

  @Autowired
  ZipcodeRepository zipCodeRepo;

  @Override
  public ZipCodeEO getZipCodeLookup(long zipCode) throws LookupApiException {
    ZipCodeEO zipCodeEO = null;

    try {
      zipCodeEO = zipCodeRepo.findByZipCode(zipCode);

    } catch (DataAccessException ex) {
      throw new LookupApiException(
        ex,
        LookupApiErrorCode.DATA_ACCESS_PROBLEM,
        LookupApiDaoImpl.class,
        "getZipCodeLookup");

    } catch (Exception e) {
      LOG.debug(e.getMessage());
      throw new LookupApiException(
        e,
        LookupApiErrorCode.BAD_SQL_QUERY,
        LookupApiDaoImpl.class,
        "getZipCodeLookup");
    }

    return zipCodeEO;
  }

}
