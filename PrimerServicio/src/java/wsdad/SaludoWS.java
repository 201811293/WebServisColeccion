/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsdad;

import alumno.Alumno;
import alumno.Alumnoimpl;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "SaludoWS")
public class SaludoWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getEgresados")
    public ArrayList<Alumno> getEgresados() throws Exception{
        alumno.Alumnoimpl am=new Alumnoimpl();
        return am.listaEgresados("2004");
    }

    
}
