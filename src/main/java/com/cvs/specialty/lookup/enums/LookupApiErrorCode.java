/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupApiErrorCode.java
 */

package com.cvs.specialty.lookup.enums;

import java.util.HashMap;
import java.util.Map;

import com.cvs.specialty.lookup.exception.ErrorCode;

/**
 * This enum class contains different error codes at each layer. Here we can declare the error codes
 * for each layer such assembly , service and dao layers . Assembly layer error codes starts from
 * 1000. Service layer error codes starts from 2000. Dao layer error codes starts from 3000.
 * 
 * @author Cognizant
 *
 */
public enum LookupApiErrorCode implements ErrorCode {

  SUCCESS(200), UNDEFINED_CODE(0), INVALID_REQUEST(400), BAD_SQL_QUERY(3000), DATA_ACCESS_PROBLEM(
      3001), NO_RECORDS_FOUND(3004), RESOURCE_URI_NOT_ACTIVE(404), INTERNAL_SERVER_ERROR(
          500), ZIP_CODE_REQUIRED(2005), ZIP_INVALID(3005);

  private final int code;

  private LookupApiErrorCode(final int code) {
    this.code = code;
  }

  private static final Map<String, LookupApiErrorCode> LOOKUP = new HashMap<>();

  @Override
  public int getCode() {
    return code;
  }

  @Override
  public String getName() {
    return super.name();
  }

  static {
    for (LookupApiErrorCode responseCode : LookupApiErrorCode.values()) {
      LOOKUP.put(responseCode.name(), responseCode);
    }
  }

  public static LookupApiErrorCode getResponseCode(final String name) {
    final LookupApiErrorCode responseCode = LOOKUP.get(name);
    if (responseCode == null) {
      return UNDEFINED_CODE;
    } else {
      return responseCode;
    }
  }

}
