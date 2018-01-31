/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: ServiceRequest.java
 */
package com.cvs.specialty.lookup.model;

public class ServiceRequest<T> {
	
	String serviceId;
	String messageId;	
	String userId;
	T body;
	
	/**
	 * @return the serviceId
	 */
	public String getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the messageId
	 */
	public String getMessageId() {
		return messageId;
	}
	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	/**
	 * @return the body
	 */
	public T getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(T body) {
		this.body = body;
	}
	
  public String getUserId() {
    return userId;
  }
  
  public void setUserId(String userId) {
    this.userId = userId;
  }
		
		
}
