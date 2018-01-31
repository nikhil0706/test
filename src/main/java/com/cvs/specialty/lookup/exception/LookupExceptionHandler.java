/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupExceptionHandler.java
 */

package com.cvs.specialty.lookup.exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.cvs.specialty.lookup.enums.LookupApiErrorCode;
import com.cvs.specialty.lookup.model.Error;
import com.cvs.specialty.lookup.model.ErrorResponse;
import com.cvs.specialty.lookup.util.MessageLookUpUtil;

/**
 * 
 * @author U006407
 *
 */

@RestControllerAdvice
public class LookupExceptionHandler {
  @ExceptionHandler(LookupApiException.class)
  public ResponseEntity<ErrorResponse> exceptionHandler(LookupApiException ex) {

    ErrorResponse error = new ErrorResponse();
    error.errors(ex.getErrorMessageList());

    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(BindException.class)
  public @ResponseBody ResponseEntity<ErrorResponse> http400(BindException ex) {
    ErrorResponse validationErrors = new ErrorResponse();

    List<Error> errorMessages = getErrorMessages(ex.getBindingResult());

    validationErrors.setErrors(errorMessages);
    return new ResponseEntity<>(validationErrors, HttpStatus.PRECONDITION_FAILED);
  }

  private List<Error> getErrorMessages(BindingResult bindingResult) {
    List<Error> validationErrors = new ArrayList<Error>();
    for (ObjectError error : bindingResult.getAllErrors()) {

      Error errorObj = new Error();
      final LookupApiErrorCode responseCode = LookupApiErrorCode.valueOf(error.getCode());
      errorObj.setCode(String.valueOf(responseCode.getCode()));
      errorObj.setMessage(MessageLookUpUtil.getMressageByKey(responseCode));
      errorObj.setParamName(StringUtils.substringBetween(error.toString(), "on field '", "':"));
      validationErrors.add(errorObj);
    }

    return validationErrors;
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

    ErrorResponse ErrorResponse = new ErrorResponse();
    List<Error> errors = new ArrayList<>();
    Error error = new Error();
    error.setCode(String.valueOf(LookupApiErrorCode.INTERNAL_SERVER_ERROR.getCode()));
    error.setMessage(ex.getMessage());

    errors.add(error);
    ErrorResponse.setErrors(errors);
    return new ResponseEntity<>(ErrorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public @ResponseBody ResponseEntity<ErrorResponse> onValidationException(
      HttpMessageNotReadableException e,
      HttpServletResponse response) throws IOException {
    ErrorResponse Error = new ErrorResponse();
    List<Error> errors = new ArrayList<>();
    Error error = new Error();
    error.setCode(String.valueOf(LookupApiErrorCode.INVALID_REQUEST.getCode()));
    error.setMessage(MessageLookUpUtil.getMressageByKey(LookupApiErrorCode.INVALID_REQUEST));
    errors.add(error);
    Error.setErrors(errors);
    return new ResponseEntity<>(Error, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public @ResponseBody
      ResponseEntity<ErrorResponse>
      onValidationMethodArgumentTypeMismatchException(
          MethodArgumentTypeMismatchException e,
          HttpServletResponse response) throws IOException {
    ErrorResponse Error = new ErrorResponse();
    List<Error> errors = new ArrayList<>();
    Error error = new Error();
    error.setCode(String.valueOf(LookupApiErrorCode.INVALID_REQUEST.getCode()));
    error.setMessage(MessageLookUpUtil.getMressageByKey(LookupApiErrorCode.INVALID_REQUEST));
    errors.add(error);
    Error.setErrors(errors);
    return new ResponseEntity<>(Error, HttpStatus.BAD_REQUEST);
  }

}
