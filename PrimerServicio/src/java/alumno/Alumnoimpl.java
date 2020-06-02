/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import conexion.Conexion;
import java.sql.*;
import java.util.*;
import com.mysql.jdbc.MysqlIO;
/**
 *
 * @author Usuario
 */
public class Alumnoimpl {
    Conexion x = new Conexion();
    String sql="";
    ArrayList<Alumno> listaAlumnosEgresados= new ArrayList<Alumno>();
    
    public ArrayList<Alumno> listaEgresados(String s_anhio_egreso) throws Exception{
        try {
            Connection conn = x.connectDatabase();
            sql="select * from alumno where alumno_codigo like'"+s_anhio_egreso+"%'";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno datos= new Alumno();
                datos.setO_alumno_id(rs.getString("alumno_id"));
                datos.setO_alumno_codigo(rs.getString("alumno_codigo"));
                datos.setO_alumno_nombre(rs.getString("alumno_nombre"));
                datos.setO_alumno_apellido_paterno(rs.getString("alumno_apellido_paterno"));
                datos.setO_alumno_apellido_materno(rs.getString("alumno_apellido_materno"));
                datos.setO_alumno_direccion(rs.getString("alumno_direccion"));
                
                listaAlumnosEgresados.add(datos);
            }
        } catch (SQLException ex) { System.out.println("ERRRROOR"+ex.getMessage());}
        return listaAlumnosEgresados;       
    }
    public static void main (String[] args) throws Exception{
        Alumnoimpl an=new Alumnoimpl();
        for(Alumno ad: an.listaEgresados("2004")){
            System.out.println("en el foor loop");
            System.out.println(ad.getO_alumno_codigo());
            System.out.println(ad.getO_alumno_apellido_paterno());
            System.out.println(ad.getO_alumno_nombre());
        }
    }
}
