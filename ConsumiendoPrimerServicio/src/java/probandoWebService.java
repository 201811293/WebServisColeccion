
import wsdad.Exception_Exception;
import java.util.ArrayList;
import javax.swing.*;




public class probandoWebService  {
    public static void main(String[] args) throws Exception_Exception {
        
        probandoWebService prob = new probandoWebService();
        
        for (int i = 0; i < prob.getEgresados().size(); i++) {
            System.out.println(prob.getEgresados().get(i).getOAlumnoNombre());  
            System.out.println(prob.getEgresados().get(i).getOAlumnoApellidoPaterno()); 
            System.out.println(prob.getEgresados().get(i).getOAlumnoApellidoMaterno());
            System.out.println(prob.getEgresados().get(i).getOAlumnoCodigo());  
            System.out.println(prob.getEgresados().get(i).getOAlumnoDireccion());  
            
        }
        System.out.println(prob.getEgresados().size());  
    }

    private static java.util.List<wsdad.Alumno> getEgresados() throws Exception_Exception {
        wsdad.SaludoWS_Service service = new wsdad.SaludoWS_Service();
        wsdad.SaludoWS port = service.getSaludoWSPort();
        return port.getEgresados();
    }

       
    public class PANEL{
        
    }
    
}
    

