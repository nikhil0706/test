/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: BaseException.java
 */
package com.cvs.specialty.lookup.exception;

/**
 * This exception API is an interface which returns the error codes and also handles exception. This
 * interface is implemented by the other specific exception classes.
 * 
 * @author Cognizant
 *
 */
public interface BaseException {

  /**
   * This method returns the errorCode of the error.
   * 
   * @return
   */
  ErrorCode getErrorCode();

  /**
   * This method is to specify how to handle the specific exception.
   */
  void handleException();
}
