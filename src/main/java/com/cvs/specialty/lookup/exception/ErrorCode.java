/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: ErrorCode.java
 */
package com.cvs.specialty.lookup.exception;

/**
 * This interface class is used to get the error code of the error.
 * 
 * @author Cognizant
 *
 */
public interface ErrorCode {

  /**
   * This method returns the error code of the error.
   * 
   * @return
   */
  int getCode();

  /**
   * This method returns the name of the ErrorCode enum.
   * 
   * @return
   */
  String getName();
}
