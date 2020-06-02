
package wsdad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdad package. 
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

    private final static QName _Exception_QNAME = new QName("http://wsdad/", "Exception");
    private final static QName _GetEgresados_QNAME = new QName("http://wsdad/", "getEgresados");
    private final static QName _GetEgresadosResponse_QNAME = new QName("http://wsdad/", "getEgresadosResponse");
    private final static QName _Hello_QNAME = new QName("http://wsdad/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://wsdad/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetEgresados }
     * 
     */
    public GetEgresados createGetEgresados() {
        return new GetEgresados();
    }

    /**
     * Create an instance of {@link GetEgresadosResponse }
     * 
     */
    public GetEgresadosResponse createGetEgresadosResponse() {
        return new GetEgresadosResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdad/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEgresados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdad/", name = "getEgresados")
    public JAXBElement<GetEgresados> createGetEgresados(GetEgresados value) {
        return new JAXBElement<GetEgresados>(_GetEgresados_QNAME, GetEgresados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEgresadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdad/", name = "getEgresadosResponse")
    public JAXBElement<GetEgresadosResponse> createGetEgresadosResponse(GetEgresadosResponse value) {
        return new JAXBElement<GetEgresadosResponse>(_GetEgresadosResponse_QNAME, GetEgresadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdad/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdad/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
