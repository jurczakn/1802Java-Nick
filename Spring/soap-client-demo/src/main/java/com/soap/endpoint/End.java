
package com.soap.endpoint;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "End", targetNamespace = "http://endpoint.soap.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface End {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "respond", targetNamespace = "http://endpoint.soap.com/", className = "com.soap.endpoint.Respond")
    @ResponseWrapper(localName = "respondResponse", targetNamespace = "http://endpoint.soap.com/", className = "com.soap.endpoint.RespondResponse")
    public String respond(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://endpoint.soap.com/", className = "com.soap.endpoint.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://endpoint.soap.com/", className = "com.soap.endpoint.AddResponse")
    public double add(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Integer> arg0);

}
