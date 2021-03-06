
package com.soap.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EndImplService", targetNamespace = "http://endpoint.soap.com/", wsdlLocation = "http://localhost:8888/service/endpoint/?wsdl")
public class EndImplService
    extends Service
{

    private final static URL ENDIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ENDIMPLSERVICE_EXCEPTION;
    private final static QName ENDIMPLSERVICE_QNAME = new QName("http://endpoint.soap.com/", "EndImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/service/endpoint/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENDIMPLSERVICE_WSDL_LOCATION = url;
        ENDIMPLSERVICE_EXCEPTION = e;
    }

    public EndImplService() {
        super(__getWsdlLocation(), ENDIMPLSERVICE_QNAME);
    }

    public EndImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ENDIMPLSERVICE_QNAME, features);
    }

    public EndImplService(URL wsdlLocation) {
        super(wsdlLocation, ENDIMPLSERVICE_QNAME);
    }

    public EndImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ENDIMPLSERVICE_QNAME, features);
    }

    public EndImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EndImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns End
     */
    @WebEndpoint(name = "EndImplPort")
    public End getEndImplPort() {
        return super.getPort(new QName("http://endpoint.soap.com/", "EndImplPort"), End.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns End
     */
    @WebEndpoint(name = "EndImplPort")
    public End getEndImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint.soap.com/", "EndImplPort"), End.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENDIMPLSERVICE_EXCEPTION!= null) {
            throw ENDIMPLSERVICE_EXCEPTION;
        }
        return ENDIMPLSERVICE_WSDL_LOCATION;
    }

}
