/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: ResponseCode.java
 */

package com.cvs.specialty.lookup.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * This enum class contains different error codes at each layer. Here we can declare the error codes
 * for each layer such assembly , service and dao layers . Assembly layer error codes starts from
 * 1000. Service layer error codes starts from 2000. Dao layer error codes starts from 3000.
 * 
 * @author Cognizant
 *
 */
public enum ResponseCode {

  SUCCESS(200), UNDEFINED_CODE(0), INVALID_REQUEST(400),

  BAD_SQL_QUERY(3000), DATA_ACCESS_PROBLEM(3001), DATABASE_PUT_OPERATION_FAILED(
      3002), DATABASE_DELETE_OPERATION_FAILED(3003), NO_RECORDS_FOUND(3004), 
        ZIP_INVALID(3005), RESOURCE_URI_NOT_ACTIVE(404);

  private final int code;

  private static final Map<String, ResponseCode> LOOKUP = new HashMap<>();

  private ResponseCode(final int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  static {
    for (ResponseCode responseCode : ResponseCode.values()) {
      LOOKUP.put(responseCode.name(), responseCode);
    }
  }

  public static ResponseCode getResponseCode(final String name) {
    final ResponseCode responseCode = LOOKUP.get(name);
    if (responseCode == null) {
      return UNDEFINED_CODE;
    } else {
      return responseCode;
    }
  }

}
