
package wsdad;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SaludoWS", targetNamespace = "http://wsdad/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SaludoWS {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://wsdad/", className = "wsdad.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://wsdad/", className = "wsdad.HelloResponse")
    @Action(input = "http://wsdad/SaludoWS/helloRequest", output = "http://wsdad/SaludoWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.util.List<wsdad.Alumno>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEgresados", targetNamespace = "http://wsdad/", className = "wsdad.GetEgresados")
    @ResponseWrapper(localName = "getEgresadosResponse", targetNamespace = "http://wsdad/", className = "wsdad.GetEgresadosResponse")
    @Action(input = "http://wsdad/SaludoWS/getEgresadosRequest", output = "http://wsdad/SaludoWS/getEgresadosResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://wsdad/SaludoWS/getEgresados/Fault/Exception")
    })
    public List<Alumno> getEgresados()
        throws Exception_Exception
    ;

}
