/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: PatientApiValidator.java
 */

package com.cvs.specialty.lookup.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.web.bind.WebDataBinder;

import com.cvs.specialty.lookup.model.ZipCpdeLookupGetRequest;

/**
 * @author U006407
 *
 */
@Component
public class LookupApiValidator {

  public void validateZipCodeLookupRequest(final ZipCpdeLookupGetRequest request) throws BindException {

    final WebDataBinder binder = new WebDataBinder(request);
    GetZipCodeLookupValidator getValidator = new GetZipCodeLookupValidator();
    binder.addValidators(getValidator);
    binder.validate();
    if (binder.getBindingResult().hasErrors()) {
      throw new BindException(binder.getBindingResult());
    }

  }

}
