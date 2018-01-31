/*
 *(C) CVS Health. 2018
 *
 * All rights are reserved. Reproduction or transmission in whole or in part, in any form or by any
 * means, electronic, mechanical or otherwise, is prohibited without the prior written consent of
 * the copyright owner.
 * 
 * File name: AppUtils.java
 */

package com.cvs.specialty.lookup.util;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cvs.specialty.lookup.model.CGRefCodesRequest;
import com.cvs.specialty.lookup.model.Error;
import com.cvs.specialty.lookup.model.ServiceRequest;
import com.cvs.specialty.lookup.model.ZipCpdeLookupGetRequest;

/**
 * This class is used to map various request headers and body to the service request
 * 
 * @author U006497
 */
public class AppUtils {

  private AppUtils() {}
  
  public static ServiceRequest<ZipCpdeLookupGetRequest> mapZipCodeLookupServiceRequest(
      String serviceId,
      String messageId,
      String userId,
      String zipCode) {

    ServiceRequest<ZipCpdeLookupGetRequest> serviceRequest = new ServiceRequest<>();
    ZipCpdeLookupGetRequest searchReq = new ZipCpdeLookupGetRequest();

    searchReq.setZipCode(zipCode);

    serviceRequest.setBody(searchReq);
    serviceRequest.setServiceId(serviceId);
    serviceRequest.setMessageId(messageId);
    serviceRequest.setUserId(userId);

    return serviceRequest;
  }

  public static
      ServiceRequest
      mapCommonGetRequestHeaderToServiceRequest(String serviceReqId, String userId, Object data) {
    ServiceRequest serviceRequest = new ServiceRequest();
    serviceRequest.setServiceId(serviceReqId);
    serviceRequest.setUserId(userId);
    serviceRequest.setBody(data);
    return serviceRequest;
  }

  /**
   * This method is used to map request header to ServiceRequest
   * 
   * @param serviceRequestId
   * @param userId
   * @param lockDomainId
   * @param lockEntityId
   * @param item
   * @return {@link ServiceRequest}
   */

  public static
      CGRefCodesRequest
      mapCRCRequestToObject(List<String> rvDomain, List<String> rvLowValue) {
    CGRefCodesRequest cgRefCodesRequest = new CGRefCodesRequest();
    cgRefCodesRequest.setCodeDomainName(rvDomain);
    cgRefCodesRequest.setCodeLowValueText(rvLowValue);
    return cgRefCodesRequest;
  }

  public static ResponseEntity<Error> createBadRequest(String code, String message, String paramName) {
    Error errorResponse = new Error();
    errorResponse.code(code);
    errorResponse.message(message);
    errorResponse.paramName(paramName);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
  }

  public static String getURI() {
    
    ServletUriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentRequestUri();
    builder.scheme("https");
    return  builder.build().toUri().toString();
    
  }
}
