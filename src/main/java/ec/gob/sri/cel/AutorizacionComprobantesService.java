package ec.gob.sri.cel;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2015-02-16T20:42:41.104-05:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "AutorizacionComprobantesService", 
                  wsdlLocation = "https://cel.sri.gob.ec/comprobantes-electronicos-ws/AutorizacionComprobantes?wsdl",
                  targetNamespace = "http://ec.gob.sri.ws.autorizacion") 
public class AutorizacionComprobantesService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ec.gob.sri.ws.autorizacion", "AutorizacionComprobantesService");
    public final static QName AutorizacionComprobantesPort = new QName("http://ec.gob.sri.ws.autorizacion", "AutorizacionComprobantesPort");
    static {
        URL url = null;
        try {
            url = new URL("https://cel.sri.gob.ec/comprobantes-electronicos-ws/AutorizacionComprobantes?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AutorizacionComprobantesService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://cel.sri.gob.ec/comprobantes-electronicos-ws/AutorizacionComprobantes?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AutorizacionComprobantesService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AutorizacionComprobantesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AutorizacionComprobantesService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AutorizacionComprobantesService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AutorizacionComprobantesService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AutorizacionComprobantesService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AutorizacionComprobantes
     */
    @WebEndpoint(name = "AutorizacionComprobantesPort")
    public AutorizacionComprobantes getAutorizacionComprobantesPort() {
        return super.getPort(AutorizacionComprobantesPort, AutorizacionComprobantes.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AutorizacionComprobantes
     */
    @WebEndpoint(name = "AutorizacionComprobantesPort")
    public AutorizacionComprobantes getAutorizacionComprobantesPort(WebServiceFeature... features) {
        return super.getPort(AutorizacionComprobantesPort, AutorizacionComprobantes.class, features);
    }

}