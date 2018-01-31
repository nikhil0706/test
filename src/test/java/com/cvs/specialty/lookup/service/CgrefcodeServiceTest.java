
package com.cvs.specialty.lookup.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cvs.specialty.lookup.cgrefcodes.entity.CgRefCodeEO;
import com.cvs.specialty.lookup.cgrefcodes.repo.CgRefCodeRepo;
import com.cvs.specialty.lookup.cgrefcodes.service.Impl.CgRefCodeDetailsServiceImpl;
import com.cvs.specialty.lookup.exception.LookupApiException;
import com.cvs.specialty.lookup.model.CGRefCodesRequest;
import com.cvs.specialty.lookup.model.CgRefCodeResponse;
import com.cvs.specialty.lookup.model.ServiceRequest;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class CgrefcodeServiceTest {

  @MockBean
  private CgRefCodeRepo cgRefCodeRepo;

  private CgRefCodeDetailsServiceImpl cgService;

  
  
  @Test
  public void contextLoads() {

  }

  @Before
  public void setupMocks() {
    cgService = new CgRefCodeDetailsServiceImpl(cgRefCodeRepo);
  }

  public ServiceRequest fillData1() {
    ServiceRequest sreq = new ServiceRequest();
    CGRefCodesRequest req = new CGRefCodesRequest();
    List<String> domainList = Arrays.asList("test1", "test2");
    List<String> lowValueList = Arrays.asList("test", "test");
    req.setCodeDomainName(domainList);
    req.setCodeLowValueText(lowValueList);
    sreq.setBody(req);
    return sreq;

  }

  public ServiceRequest fillNull() {
    ServiceRequest sreq = new ServiceRequest();
    CGRefCodesRequest req = new CGRefCodesRequest();
    List<String> domainList = new ArrayList<>();
    List<String> lowValueList = null;
    req.setCodeDomainName(domainList);
    req.setCodeLowValueText(lowValueList);
    sreq.setBody(req);
    return sreq;

  }

  @Test(expected = Exception.class)
  public void getCgRefCodeDetailsTestError() throws LookupApiException {
    List<String> domainList = Arrays.asList("test1", "test2");
    List<String> lowValueList = Arrays.asList("test", "test");
    Mockito
      .when(
        cgRefCodeRepo
          .findByRvDomainInAndRvLowValueInAndActiveIndicator(domainList, lowValueList, "Y"))
      .thenThrow(new Exception("EXCEPTION"));
    cgService.getCgRefCodeDetails(fillData1());

  }

  @Test(expected = LookupApiException.class)
  public void getCgRefCodeDetailsTestException2() throws LookupApiException {

    cgService.getCgRefCodeDetails(fillNull());

  }

  @Test
  public void getCgRefCodeDetailsTestSuccess() throws LookupApiException {

    CgRefCodeEO eo1 = new CgRefCodeEO();
    eo1.setRvDomain("test");
    eo1.setRvLowValue("test2");
    CgRefCodeEO eo2 = new CgRefCodeEO();
    eo2.setRvDomain("test");
    eo2.setRvLowValue("test2");
    List<String> domainList = Arrays.asList("test1", "test2");
    List<String> lowValueList = Arrays.asList("test", "test");

    List<CgRefCodeEO> eoList = Arrays.asList(eo1, eo2);
    Mockito
      .when(
        cgRefCodeRepo
          .findByRvDomainInAndRvLowValueInAndActiveIndicator(domainList, lowValueList, "Y"))
      .thenReturn(eoList);
    CgRefCodeResponse response = cgService.getCgRefCodeDetails(fillData1());
    assertNotNull(response);

  }

  @Test
  public void getCgRefCodeDetailsTestSuccess2() throws LookupApiException {


    List<String> domainList = Arrays.asList("NOTE_TYPE");
    List<String> lowValueList = Arrays.asList("test", "test");

    List<CgRefCodeEO> eoList = CgrefcodeServiceTest.getEoList();
    Mockito
      .when(
        cgRefCodeRepo
          .findByRvDomainInAndRvLowValueInAndActiveIndicator(domainList, lowValueList, "Y"))
      .thenReturn(eoList);
    CgRefCodeResponse response = cgService.getCgRefCodeDetails(fillData1());
    assertNotNull(response);

  }
  
  @Test
  public void getCgRefCodeDetailsTestSuccessEmpty() throws LookupApiException {

    List<String> domainList = Arrays.asList("NOTE_TYPE");
    List<String> lowValueList = Arrays.asList("test", "test");

    List<CgRefCodeEO> eoList = new ArrayList<>();
    Mockito
      .when(
        cgRefCodeRepo
          .findByRvDomainInAndRvLowValueInAndActiveIndicator(domainList, lowValueList, "Y"))
      .thenReturn(eoList);
    CgRefCodeResponse response = cgService.getCgRefCodeDetails(fillData1());
    assertNotNull(response);

  }
  
  private static List<CgRefCodeEO> getEoList(){

    CgRefCodeEO eo1 = new CgRefCodeEO();
    eo1.setRvDomain("test");
    eo1.setRvLowValue("test2");
    CgRefCodeEO eo2 = new CgRefCodeEO();
    eo2.setRvDomain("test");
    eo2.setRvLowValue("test2");
    List<String> domainList = Arrays.asList("NOTE_TYPE");
    List<String> lowValueList = Arrays.asList("test", "test");

    return  Arrays.asList(eo1, eo2);
  }
}
