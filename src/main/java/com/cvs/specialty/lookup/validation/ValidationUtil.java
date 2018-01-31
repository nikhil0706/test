/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: ValidationUtil.java
 */

package com.cvs.specialty.lookup.validation;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

import com.cvs.specialty.lookup.model.ZipCpdeLookupGetRequest;

/**
 * Utility class responsible for validating the common fields.
 * 
 * @author U006407
 *
 */
@Component
public class ValidationUtil {

  private static final String FIVE_DIGIT_PATTERN = "^(\\d{5})?$";

  private ValidationUtil() {}

  public static void validateZipCode(ZipCpdeLookupGetRequest request, Errors errors) {
    String zipCode = request.getZipCode();

    if (null == zipCode || StringUtils.isEmpty(zipCode)) {
      errors.rejectValue("zipCode", "MISSING_REQUIRED_FIELD");

    } else {
      if (!validateRegexPattern(FIVE_DIGIT_PATTERN, zipCode)) {
        errors.rejectValue("zipCode", "ZIP_INVALID");
      }
    }

  }

  private static boolean validateRegexPattern(String regex, String input) {
    return Pattern.matches(regex, input);
  }

}
