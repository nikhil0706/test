/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: PatientPreferencesDao.java
 */

package com.cvs.specialty.lookup.dao;

import com.cvs.specialty.lookup.entity.ZipCodeEO;
import com.cvs.specialty.lookup.exception.LookupApiException;

/**
 * Lookup Api DAO interface class
 * 
 * @author U006407
 */
public interface LookupApiDao {

  ZipCodeEO getZipCodeLookup(long zipCode) throws LookupApiException;

}
