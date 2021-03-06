package ec.gob.sri.cel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2015-02-16T20:42:36.702-05:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://ec.gob.sri.ws.recepcion", name = "RecepcionComprobantes")
@XmlSeeAlso({ObjectFactory.class})
public interface RecepcionComprobantes {

    @WebMethod
    @RequestWrapper(localName = "validarComprobante", targetNamespace = "http://ec.gob.sri.ws.recepcion", className = "ec.gob.sri.cel.ValidarComprobante")
    @ResponseWrapper(localName = "validarComprobanteResponse", targetNamespace = "http://ec.gob.sri.ws.recepcion", className = "ec.gob.sri.cel.ValidarComprobanteResponse")
    @WebResult(name = "RespuestaRecepcionComprobante", targetNamespace = "")
    public ec.gob.sri.cel.RespuestaSolicitud validarComprobante(
        @WebParam(name = "xml", targetNamespace = "")
        byte[] xml
    );
}
