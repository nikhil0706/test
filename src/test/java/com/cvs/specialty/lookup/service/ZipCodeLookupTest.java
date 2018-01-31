
package com.cvs.specialty.lookup.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.text.ParseException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.cvs.specialty.lookup.dao.LookupApiDao;
import com.cvs.specialty.lookup.entity.ZipCodeEO;
import com.cvs.specialty.lookup.exception.LookupApiException;
import com.cvs.specialty.lookup.mapper.LookupResponseMapper;
import com.cvs.specialty.lookup.model.PartyAddress;
import com.cvs.specialty.lookup.service.impl.LookupApiServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ZipCodeLookupTest {

  MockEnvironment mockEnvironment = null;
  LookupApiServiceImpl service = null;
  LookupApiDao dao = null;
  LookupResponseMapper mapper = null;

  @Before
  public void setup() {
    mockEnvironment = new MockEnvironment();
    service = new LookupApiServiceImpl();
    dao = mock(LookupApiDao.class);
    mapper = mock(LookupResponseMapper.class);
    service.setLookupDao(dao);
    service.setMapper(mapper);
  }

  @Test
  public void getZipCodeLookup() throws BindException, ParseException, LookupApiException {

    when(dao.getZipCodeLookup(15146)).thenReturn(getMockedZipCodeDtl());
    when(mapper.mapZipCodeEOToModel(any(ZipCodeEO.class))).thenReturn(getMockedPartyAddress());
    PartyAddress address = service.getZipCodeLookup(15146);

    Assert.assertNotNull("Zip Code Details", address);
  }

  @Test
  public void getZipCodeLookupNoRecordsFound()
      throws BindException, ParseException, LookupApiException {

    try {

      when(dao.getZipCodeLookup(60123)).thenReturn(null);
      service.getZipCodeLookup(15146);

    } catch (LookupApiException ex) {
      Assert.assertEquals("3004", ex.getErrorMessageList().get(0).getCode());
      assertTrue(
        "No record(s) found",
        ex.getErrorMessageList().get(0).getMessage().contains("No record(s) found"));
    }
  }

  @Test(expected = Exception.class)
  public void testGetZipCodeDetailWithError() throws LookupApiException {
    when(dao.getZipCodeLookup(12345)).thenThrow(new Exception("Exception"));
  }

  @Test
  public void testGetURI() {

    MockHttpServletRequest request = new MockHttpServletRequest();
    UriComponents ucb = ServletUriComponentsBuilder
      .fromContextPath(request)
      .path("lookup/zipcode")
      .build();
    URI uri = ucb.toUri();
    
    Assert.assertEquals("http://localhost/lookup/zipcode", uri.toString());
  }

  private PartyAddress getMockedPartyAddress() {
    PartyAddress address = new PartyAddress();
    ZipCodeEO eo = getMockedZipCodeDtl();
    address.setCityText(eo.getCity());
    address.setStateCode(eo.getState());
    address.setCountyText(eo.getCounty());

    return address;
  }

  private ZipCodeEO getMockedZipCodeDtl() {
    ZipCodeEO eo = new ZipCodeEO();
    eo.setCity("Monroeville");
    eo.setState("PA");
    eo.setCounty("Allegheny");
    return eo;
  }

}
