/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: GetZipCodeLookupValidator.java
 */

package com.cvs.specialty.lookup.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cvs.specialty.lookup.model.ZipCpdeLookupGetRequest;

/**
 * 
 * @author U006407
 *
 */

@Component
public class GetZipCodeLookupValidator implements Validator {
  @Override
  public boolean supports(Class<?> clazz) {
    return ZipCpdeLookupGetRequest.class.equals(clazz);
  }

  @Override
  public void validate(final Object target, final Errors errors) {

    ZipCpdeLookupGetRequest request = (ZipCpdeLookupGetRequest) target;
    ValidationUtil.validateZipCode(request, errors);
  }

}
