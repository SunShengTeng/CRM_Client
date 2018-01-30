package cn.sst.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-27T21:13:39.785+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://service.cxf.sst.com/", name = "CustomerSerivice")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerSerivice {

    @WebMethod
    @RequestWrapper(localName = "customerListByDecidedZoneId", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.CustomerListByDecidedZoneId")
    @ResponseWrapper(localName = "customerListByDecidedZoneIdResponse", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.CustomerListByDecidedZoneIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cn.sst.cxf.Customer> customerListByDecidedZoneId(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "customerListNotDecidedZone", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.CustomerListNotDecidedZone")
    @ResponseWrapper(localName = "customerListNotDecidedZoneResponse", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.CustomerListNotDecidedZoneResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cn.sst.cxf.Customer> customerListNotDecidedZone();

    @WebMethod
    @RequestWrapper(localName = "customerListAll", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.CustomerListAll")
    @ResponseWrapper(localName = "customerListAllResponse", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.CustomerListAllResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cn.sst.cxf.Customer> customerListAll();

    @WebMethod
    @RequestWrapper(localName = "findCustomerByTelephone", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.FindCustomerByTelephone")
    @ResponseWrapper(localName = "findCustomerByTelephoneResponse", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.FindCustomerByTelephoneResponse")
    @WebResult(name = "return", targetNamespace = "")
    public cn.sst.cxf.Customer findCustomerByTelephone(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "updateDecidedZoneId", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.UpdateDecidedZoneId")
    @ResponseWrapper(localName = "updateDecidedZoneIdResponse", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.UpdateDecidedZoneIdResponse")
    public void updateDecidedZoneId(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.util.List<java.lang.Integer> arg1
    );

    @WebMethod
    @RequestWrapper(localName = "findDecidedZoneByaddress", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.FindDecidedZoneByaddress")
    @ResponseWrapper(localName = "findDecidedZoneByaddressResponse", targetNamespace = "http://service.cxf.sst.com/", className = "cn.sst.cxf.FindDecidedZoneByaddressResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String findDecidedZoneByaddress(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
