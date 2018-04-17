
package com.soap.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.endpoint package. 
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

    private final static QName _AddResponse_QNAME = new QName("http://endpoint.soap.com/", "addResponse");
    private final static QName _Add_QNAME = new QName("http://endpoint.soap.com/", "add");
    private final static QName _Respond_QNAME = new QName("http://endpoint.soap.com/", "respond");
    private final static QName _RespondResponse_QNAME = new QName("http://endpoint.soap.com/", "respondResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link RespondResponse }
     * 
     */
    public RespondResponse createRespondResponse() {
        return new RespondResponse();
    }

    /**
     * Create an instance of {@link Respond }
     * 
     */
    public Respond createRespond() {
        return new Respond();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Respond }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.com/", name = "respond")
    public JAXBElement<Respond> createRespond(Respond value) {
        return new JAXBElement<Respond>(_Respond_QNAME, Respond.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespondResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.com/", name = "respondResponse")
    public JAXBElement<RespondResponse> createRespondResponse(RespondResponse value) {
        return new JAXBElement<RespondResponse>(_RespondResponse_QNAME, RespondResponse.class, null, value);
    }

}
