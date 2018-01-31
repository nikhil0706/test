/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: LookupApiException.java
 */

package com.cvs.specialty.lookup.exception;

import java.util.ArrayList;
import java.util.List;

import com.cvs.specialty.lookup.enums.LookupApiErrorCode;
import com.cvs.specialty.lookup.model.Error;
import com.cvs.specialty.lookup.util.MessageLookUpUtil;

/**
 * 
 * @author U006407
 *
 */
public class LookupApiException extends Exception implements BaseException {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private transient List<Error> errorMessageList;
  String stackTrace;
  transient Object callingClass;
  String methodName;

  public LookupApiException(String errorCode) {
    List<Error> errorList = new ArrayList<>();
    Error error = new Error();
    final LookupApiErrorCode responseCode = LookupApiErrorCode
      .getResponseCode(errorCode);
    error.setCode(String.valueOf(responseCode.getCode()));
    error.setMessage(MessageLookUpUtil.getMressageByKey(responseCode));
    errorList.add(error);
    this.errorMessageList = errorList;
  }

  public LookupApiException(LookupApiErrorCode resourceUriNotActive) {
    List<Error> errorList = new ArrayList<>();
    Error error = new Error();
    error.setCode(String.valueOf(resourceUriNotActive.getCode()));
    error.setMessage(MessageLookUpUtil.getMressageByKey(resourceUriNotActive));
    errorList.add(error);
    this.errorMessageList = errorList;
  }

  /**
   * @return the errorMessageList
   */
  public List<Error> getErrorMessageList() {
    return errorMessageList;
  }

  /**
   * @param errorMessageList
   *          the errorMessageList to set
   */
  public void setErrorMessageList(List<Error> errorMessageList) {
    this.errorMessageList = errorMessageList;
  }

  private transient ErrorCode errorCode;

  public LookupApiException(final Throwable cause) {
    super(cause);
    this.errorCode = null;
  }

  public LookupApiException(final String message, final Throwable cause) {
    super(message, cause);
    this.errorCode = null;
  }

  public LookupApiException(final ErrorCode errorCode) {
    super();
    this.errorCode = errorCode;
  }

  public LookupApiException(final Throwable cause, final ErrorCode errorCode) {
    super(cause);
    this.errorCode = errorCode;
  }

  public LookupApiException(final String message, final ErrorCode errorCode) {
    super(message);
    this.errorCode = errorCode;
  }

  public LookupApiException(
    final Throwable cause,
    final ErrorCode errorCode,
    Object callingClass,
    String callingMethodName) {
    super(cause);
    this.errorCode = errorCode;
    this.stackTrace = null;
    this.callingClass = callingClass;
    this.methodName = callingMethodName;
    createStackTrace(cause);
  }

  public LookupApiException(
    final String message,
    final Throwable cause,
    final ErrorCode errorCode) {
    super(message, cause);
    this.errorCode = errorCode;
  }

  @Override
  public ErrorCode getErrorCode() {
    return errorCode;
  }

  @Override
  public void handleException() {
    // do nothing
  }

  @Override
  public String toString() {
    if (errorCode == null) {
      return super.toString();
    } else {
      return super.toString() + "[ Application error code =" + errorCode + "error number = "
          + errorCode.getCode() + "]";
    }
  }

  public void createStackTrace(Throwable ex) {
    if (ex != null) {
      StringBuilder sb = new StringBuilder(getStackTrace(ex));
      this.stackTrace = sb.toString();
      ex.printStackTrace();
    }
  }

  private static String getStackTrace(Throwable ex) {
    StringBuilder sb = new StringBuilder(ex.toString());
    StackTraceElement[] elems = ex.getStackTrace();
    for (int i = 0; i < elems.length; i++) {
      sb.append("\n\tat ");
      sb.append(elems[i].toString());
    }
    sb.append("\n");
    return sb.toString();
  }


}
