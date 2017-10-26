
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _GetRelatorioPadraoResponse_QNAME = new QName("http://services/", "getRelatorioPadraoResponse");
    private final static QName _GetRelatorioEmergencia_QNAME = new QName("http://services/", "getRelatorioEmergencia");
    private final static QName _GetRelatorioEmergenciaResponse_QNAME = new QName("http://services/", "getRelatorioEmergenciaResponse");
    private final static QName _GetRelatorioPadrao_QNAME = new QName("http://services/", "getRelatorioPadrao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRelatorioEmergenciaResponse }
     * 
     */
    public GetRelatorioEmergenciaResponse createGetRelatorioEmergenciaResponse() {
        return new GetRelatorioEmergenciaResponse();
    }

    /**
     * Create an instance of {@link GetRelatorioPadrao }
     * 
     */
    public GetRelatorioPadrao createGetRelatorioPadrao() {
        return new GetRelatorioPadrao();
    }

    /**
     * Create an instance of {@link GetRelatorioPadraoResponse }
     * 
     */
    public GetRelatorioPadraoResponse createGetRelatorioPadraoResponse() {
        return new GetRelatorioPadraoResponse();
    }

    /**
     * Create an instance of {@link GetRelatorioEmergencia }
     * 
     */
    public GetRelatorioEmergencia createGetRelatorioEmergencia() {
        return new GetRelatorioEmergencia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatorioPadraoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getRelatorioPadraoResponse")
    public JAXBElement<GetRelatorioPadraoResponse> createGetRelatorioPadraoResponse(GetRelatorioPadraoResponse value) {
        return new JAXBElement<GetRelatorioPadraoResponse>(_GetRelatorioPadraoResponse_QNAME, GetRelatorioPadraoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatorioEmergencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getRelatorioEmergencia")
    public JAXBElement<GetRelatorioEmergencia> createGetRelatorioEmergencia(GetRelatorioEmergencia value) {
        return new JAXBElement<GetRelatorioEmergencia>(_GetRelatorioEmergencia_QNAME, GetRelatorioEmergencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatorioEmergenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getRelatorioEmergenciaResponse")
    public JAXBElement<GetRelatorioEmergenciaResponse> createGetRelatorioEmergenciaResponse(GetRelatorioEmergenciaResponse value) {
        return new JAXBElement<GetRelatorioEmergenciaResponse>(_GetRelatorioEmergenciaResponse_QNAME, GetRelatorioEmergenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatorioPadrao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getRelatorioPadrao")
    public JAXBElement<GetRelatorioPadrao> createGetRelatorioPadrao(GetRelatorioPadrao value) {
        return new JAXBElement<GetRelatorioPadrao>(_GetRelatorioPadrao_QNAME, GetRelatorioPadrao.class, null, value);
    }

}
