
package com.cvs.specialty.lookup.service;

import com.cvs.specialty.lookup.exception.LookupApiException;
import com.cvs.specialty.lookup.model.CgRefCodeResponse;
import com.cvs.specialty.lookup.model.ServiceRequest;

public interface CgRefCodeDetailsService {

  public CgRefCodeResponse getCgRefCodeDetails(ServiceRequest serviceRequest)
      throws LookupApiException;

}
