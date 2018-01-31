/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: MessageLookUpUtil.java
 */

package com.cvs.specialty.lookup.util;

import java.util.Locale;
import java.util.ResourceBundle;

import com.cvs.specialty.lookup.enums.LookupApiErrorCode;
import com.cvs.specialty.lookup.enums.ResponseCode;

/**
 * @author Z231366
 *
 */
public class MessageLookUpUtil {

  private static final String RESPONSE_CODE_MESSAGES_RESOURCE_NAME = "lookup_api_response_codes";

  private MessageLookUpUtil() {}
  
  public static String getMressageByKey(final LookupApiErrorCode responseCode) {

    if (responseCode == null) {
      return "";
    }
    final Locale defaultLoacale = Locale.getDefault();
    final ResourceBundle bundle = ResourceBundle
      .getBundle(RESPONSE_CODE_MESSAGES_RESOURCE_NAME, defaultLoacale);
    return bundle.getString(responseCode.toString());

  }

  public static String getMressageByKey(final ResponseCode responseCode) {

    if (responseCode == null) {
      return "";
    }
    final Locale defaultLoacale = Locale.getDefault();
    final ResourceBundle bundle = ResourceBundle
      .getBundle(RESPONSE_CODE_MESSAGES_RESOURCE_NAME, defaultLoacale);
    return bundle.getString(responseCode.toString());

  }

}
