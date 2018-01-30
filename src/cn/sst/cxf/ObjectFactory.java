
package cn.sst.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.sst.cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomerListAll_QNAME = new QName("http://service.cxf.sst.com/", "customerListAll");
    private final static QName _CustomerListAllResponse_QNAME = new QName("http://service.cxf.sst.com/", "customerListAllResponse");
    private final static QName _CustomerListByDecidedZoneId_QNAME = new QName("http://service.cxf.sst.com/", "customerListByDecidedZoneId");
    private final static QName _CustomerListByDecidedZoneIdResponse_QNAME = new QName("http://service.cxf.sst.com/", "customerListByDecidedZoneIdResponse");
    private final static QName _CustomerListNotDecidedZone_QNAME = new QName("http://service.cxf.sst.com/", "customerListNotDecidedZone");
    private final static QName _CustomerListNotDecidedZoneResponse_QNAME = new QName("http://service.cxf.sst.com/", "customerListNotDecidedZoneResponse");
    private final static QName _FindCustomerByTelephone_QNAME = new QName("http://service.cxf.sst.com/", "findCustomerByTelephone");
    private final static QName _FindCustomerByTelephoneResponse_QNAME = new QName("http://service.cxf.sst.com/", "findCustomerByTelephoneResponse");
    private final static QName _FindDecidedZoneByaddress_QNAME = new QName("http://service.cxf.sst.com/", "findDecidedZoneByaddress");
    private final static QName _FindDecidedZoneByaddressResponse_QNAME = new QName("http://service.cxf.sst.com/", "findDecidedZoneByaddressResponse");
    private final static QName _UpdateDecidedZoneId_QNAME = new QName("http://service.cxf.sst.com/", "updateDecidedZoneId");
    private final static QName _UpdateDecidedZoneIdResponse_QNAME = new QName("http://service.cxf.sst.com/", "updateDecidedZoneIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.sst.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerListAll }
     * 
     */
    public CustomerListAll createCustomerListAll() {
        return new CustomerListAll();
    }

    /**
     * Create an instance of {@link CustomerListAllResponse }
     * 
     */
    public CustomerListAllResponse createCustomerListAllResponse() {
        return new CustomerListAllResponse();
    }

    /**
     * Create an instance of {@link CustomerListByDecidedZoneId }
     * 
     */
    public CustomerListByDecidedZoneId createCustomerListByDecidedZoneId() {
        return new CustomerListByDecidedZoneId();
    }

    /**
     * Create an instance of {@link CustomerListByDecidedZoneIdResponse }
     * 
     */
    public CustomerListByDecidedZoneIdResponse createCustomerListByDecidedZoneIdResponse() {
        return new CustomerListByDecidedZoneIdResponse();
    }

    /**
     * Create an instance of {@link CustomerListNotDecidedZone }
     * 
     */
    public CustomerListNotDecidedZone createCustomerListNotDecidedZone() {
        return new CustomerListNotDecidedZone();
    }

    /**
     * Create an instance of {@link CustomerListNotDecidedZoneResponse }
     * 
     */
    public CustomerListNotDecidedZoneResponse createCustomerListNotDecidedZoneResponse() {
        return new CustomerListNotDecidedZoneResponse();
    }

    /**
     * Create an instance of {@link FindCustomerByTelephone }
     * 
     */
    public FindCustomerByTelephone createFindCustomerByTelephone() {
        return new FindCustomerByTelephone();
    }

    /**
     * Create an instance of {@link FindCustomerByTelephoneResponse }
     * 
     */
    public FindCustomerByTelephoneResponse createFindCustomerByTelephoneResponse() {
        return new FindCustomerByTelephoneResponse();
    }

    /**
     * Create an instance of {@link FindDecidedZoneByaddress }
     * 
     */
    public FindDecidedZoneByaddress createFindDecidedZoneByaddress() {
        return new FindDecidedZoneByaddress();
    }

    /**
     * Create an instance of {@link FindDecidedZoneByaddressResponse }
     * 
     */
    public FindDecidedZoneByaddressResponse createFindDecidedZoneByaddressResponse() {
        return new FindDecidedZoneByaddressResponse();
    }

    /**
     * Create an instance of {@link UpdateDecidedZoneId }
     * 
     */
    public UpdateDecidedZoneId createUpdateDecidedZoneId() {
        return new UpdateDecidedZoneId();
    }

    /**
     * Create an instance of {@link UpdateDecidedZoneIdResponse }
     * 
     */
    public UpdateDecidedZoneIdResponse createUpdateDecidedZoneIdResponse() {
        return new UpdateDecidedZoneIdResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "customerListAll")
    public JAXBElement<CustomerListAll> createCustomerListAll(CustomerListAll value) {
        return new JAXBElement<CustomerListAll>(_CustomerListAll_QNAME, CustomerListAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "customerListAllResponse")
    public JAXBElement<CustomerListAllResponse> createCustomerListAllResponse(CustomerListAllResponse value) {
        return new JAXBElement<CustomerListAllResponse>(_CustomerListAllResponse_QNAME, CustomerListAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListByDecidedZoneId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "customerListByDecidedZoneId")
    public JAXBElement<CustomerListByDecidedZoneId> createCustomerListByDecidedZoneId(CustomerListByDecidedZoneId value) {
        return new JAXBElement<CustomerListByDecidedZoneId>(_CustomerListByDecidedZoneId_QNAME, CustomerListByDecidedZoneId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListByDecidedZoneIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "customerListByDecidedZoneIdResponse")
    public JAXBElement<CustomerListByDecidedZoneIdResponse> createCustomerListByDecidedZoneIdResponse(CustomerListByDecidedZoneIdResponse value) {
        return new JAXBElement<CustomerListByDecidedZoneIdResponse>(_CustomerListByDecidedZoneIdResponse_QNAME, CustomerListByDecidedZoneIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListNotDecidedZone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "customerListNotDecidedZone")
    public JAXBElement<CustomerListNotDecidedZone> createCustomerListNotDecidedZone(CustomerListNotDecidedZone value) {
        return new JAXBElement<CustomerListNotDecidedZone>(_CustomerListNotDecidedZone_QNAME, CustomerListNotDecidedZone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerListNotDecidedZoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "customerListNotDecidedZoneResponse")
    public JAXBElement<CustomerListNotDecidedZoneResponse> createCustomerListNotDecidedZoneResponse(CustomerListNotDecidedZoneResponse value) {
        return new JAXBElement<CustomerListNotDecidedZoneResponse>(_CustomerListNotDecidedZoneResponse_QNAME, CustomerListNotDecidedZoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerByTelephone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "findCustomerByTelephone")
    public JAXBElement<FindCustomerByTelephone> createFindCustomerByTelephone(FindCustomerByTelephone value) {
        return new JAXBElement<FindCustomerByTelephone>(_FindCustomerByTelephone_QNAME, FindCustomerByTelephone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerByTelephoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "findCustomerByTelephoneResponse")
    public JAXBElement<FindCustomerByTelephoneResponse> createFindCustomerByTelephoneResponse(FindCustomerByTelephoneResponse value) {
        return new JAXBElement<FindCustomerByTelephoneResponse>(_FindCustomerByTelephoneResponse_QNAME, FindCustomerByTelephoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDecidedZoneByaddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "findDecidedZoneByaddress")
    public JAXBElement<FindDecidedZoneByaddress> createFindDecidedZoneByaddress(FindDecidedZoneByaddress value) {
        return new JAXBElement<FindDecidedZoneByaddress>(_FindDecidedZoneByaddress_QNAME, FindDecidedZoneByaddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDecidedZoneByaddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "findDecidedZoneByaddressResponse")
    public JAXBElement<FindDecidedZoneByaddressResponse> createFindDecidedZoneByaddressResponse(FindDecidedZoneByaddressResponse value) {
        return new JAXBElement<FindDecidedZoneByaddressResponse>(_FindDecidedZoneByaddressResponse_QNAME, FindDecidedZoneByaddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDecidedZoneId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "updateDecidedZoneId")
    public JAXBElement<UpdateDecidedZoneId> createUpdateDecidedZoneId(UpdateDecidedZoneId value) {
        return new JAXBElement<UpdateDecidedZoneId>(_UpdateDecidedZoneId_QNAME, UpdateDecidedZoneId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDecidedZoneIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxf.sst.com/", name = "updateDecidedZoneIdResponse")
    public JAXBElement<UpdateDecidedZoneIdResponse> createUpdateDecidedZoneIdResponse(UpdateDecidedZoneIdResponse value) {
        return new JAXBElement<UpdateDecidedZoneIdResponse>(_UpdateDecidedZoneIdResponse_QNAME, UpdateDecidedZoneIdResponse.class, null, value);
    }

}
