
package com.cvs.specialty.lookup.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.*;

import com.cvs.specialty.exceptionloggerservice.service.ExceptionHandlerService;
import com.cvs.specialty.lookup.api.LookupApi;
import com.cvs.specialty.lookup.exception.LookupApiException;
import com.cvs.specialty.lookup.model.*;
import com.cvs.specialty.lookup.service.CgRefCodeDetailsService;
import com.cvs.specialty.lookup.service.LookupApiService;
import com.cvs.specialty.lookup.util.AppUtils;
import com.cvs.specialty.lookup.validation.LookupApiValidator;
import com.cvs.specialty.sprxservices.annotation.SprxSecurity;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

@Controller
public class LookupApiController implements LookupApi {

  private static final Logger LOG = LoggerFactory.getLogger(LookupApiController.class);

  @Autowired
  LookupApiService lookupService;
  @Autowired
  CgRefCodeDetailsService cgRefCodeDetailsService;

  @Autowired
  LookupApiValidator lookupValidator;

  @Autowired
  ExceptionHandlerService exceptionHandler;

  public ResponseEntity<AddressValidationResponse> lookupAddressPost(
      @ApiParam(value = "Unique identifier for this request.", required = true) @RequestHeader(value = "serviceId", required = true) String serviceId,
      @ApiParam(value = "Logged in user Id", required = true) @RequestHeader(value = "userId", required = true) String userId,
      @ApiParam(value = "Unique identifier for this request.", required = true) @RequestHeader(value = "messageId", required = true) String messageId,
      @ApiParam(value = "Address Validation request. Max 5", required = true) @Valid @RequestBody AddressValidationRequest addressValidationRequest) {
    // do some magic!
    return new ResponseEntity<AddressValidationResponse>(HttpStatus.OK);
  }

  public ResponseEntity<List<PatientDiagnosis>> lookupIcdcodesGet(
      @ApiParam(value = "Unique identifier for this request.", required = true) @RequestHeader(value = "serviceId", required = true) String serviceId,
      @ApiParam(value = "Logged in user Id", required = true) @RequestHeader(value = "userId", required = true) String userId,
      @ApiParam(value = "Unique identifier for this request.", required = true) @RequestHeader(value = "messageId", required = true) String messageId,
      @NotNull @ApiParam(value = "Icd Type of the icd code to be found", required = true) @RequestParam(value = "icdType", required = true) String icdType,
      @ApiParam(value = "Icd Code to search for.") @RequestParam(value = "icdCode", required = false) String icdCode,
      @ApiParam(value = "Icd Description to search for.") @RequestParam(value = "icdDescription", required = false) String icdDescription) {
    // do some magic!
    return new ResponseEntity<List<PatientDiagnosis>>(HttpStatus.OK);
  }

  @SuppressWarnings("unchecked")
  @SprxSecurity(rolesIds = "getLookupRoles", authorizationEnabled = true)
  @RequestMapping(value = "lookup/refcodes", method = RequestMethod.GET, produces = "application/json")
  public ResponseEntity<CgRefCodeResponse> lookupRefcodesGet(
      @ApiParam(value = "Unique identifier for this request.", required = true) @RequestHeader(value = "serviceId", required = true) String serviceId,
      @ApiParam(value = "Logged in user Id", required = true) @RequestHeader(value = "userId", required = true) String userId,
      @ApiParam(value = "Unique identifier for this request.", required = true) @RequestHeader(value = "messageId", required = true) String messageId,
      @ApiParam(value = "Access token for this request", required = true) @RequestHeader(value = "access-token", required = true) String accessToken,
      @NotNull @ApiParam(value = "Rv Domain Id of the result to be found", required = true) @RequestParam(value = "codeDomainName", required = true) List<String> codeDomainName,
      @ApiParam(value = "Rv Low value of the result to be found") @RequestParam(value = "codeLowValueText", required = false) List<String> codeLowValueText,
      HttpServletResponse response) throws BindException, LookupApiException {
    try {
      LOG.info("Controller to Get All CgRefCode Details");
      CGRefCodesRequest cgRefCodesRequest = AppUtils
        .mapCRCRequestToObject(codeDomainName, codeLowValueText);
      ServiceRequest<CGRefCodesRequest> serviceRequest = AppUtils
        .mapCommonGetRequestHeaderToServiceRequest(serviceId, userId, cgRefCodesRequest);
      CgRefCodeResponse serviceResponse = cgRefCodeDetailsService
        .getCgRefCodeDetails(serviceRequest);

      return new ResponseEntity<CgRefCodeResponse>(serviceResponse, HttpStatus.OK);
    } catch (LookupApiException e) {
      LOG.error("Exception Occured When Fectching cgRefCodes Details " + e);
      throw e;
    }
  }

  @SprxSecurity(rolesIds = "getLookupRoles", authorizationEnabled = true)
  @RequestMapping(value = "lookup/zipcode", method = RequestMethod.GET, produces = "application/json")
  public ResponseEntity<PartyAddress> lookupZipcodeGet(
      @ApiParam(value = "Unique identifier for this request", required = true) @RequestHeader(value = "serviceId", required = true) String serviceId,
      @ApiParam(value = "Logged in user Id", required = true) @RequestHeader(value = "userId", required = true) String userId,
      @ApiParam(value = "Unique identifier for this request", required = true) @RequestHeader(value = "messageId", required = true) String messageId,
      @ApiParam(value = "Access token for this request", required = true) @RequestHeader(value = "access-token", required = true) String accessToken,
      @NotNull @ApiParam(value = "Five digit zip code", required = true) @RequestParam(value = "zipCode", required = true) String zipCode)
      throws BindException, LookupApiException {

    PartyAddress address = null;
    ServiceRequest<ZipCpdeLookupGetRequest> request = null;
    long lZipCode = -1;

    String uri = AppUtils.getURI();

    try {

      request = AppUtils.mapZipCodeLookupServiceRequest(serviceId, messageId, userId, zipCode);
      lookupValidator.validateZipCodeLookupRequest(request.getBody());
      lZipCode = Long.parseLong(zipCode);
      address = lookupService.getZipCodeLookup(lZipCode);
      
      if(null != address) {
        return new ResponseEntity<PartyAddress>(address, HttpStatus.OK);
      } else {
        return new ResponseEntity<>(address, HttpStatus.NOT_FOUND);
        
      }

    } catch (LookupApiException e) {
      LOG.error(" Exception while fetching Zip code information" + e.getMessage());
      try {
        exceptionHandler
          .logException(uri, false, false, serviceId, request.toString(), messageId, e.toString());
      } catch (Exception e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      throw e;
    }

  }

}
