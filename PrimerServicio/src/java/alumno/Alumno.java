/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Alumno implements Serializable{
    
    private String o_alumno_id;
    private String o_alumno_codigo;
    private String o_alumno_nombre;
    private String o_alumno_apellido_paterno;
    private String o_alumno_apellido_materno;
    private String o_alumno_direccion;

    public String getO_alumno_id() {
        return o_alumno_id;
    }

    public String getO_alumno_codigo() {
        return o_alumno_codigo;
    }

    public String getO_alumno_nombre() {
        return o_alumno_nombre;
    }

    public String getO_alumno_apellido_paterno() {
        return o_alumno_apellido_paterno;
    }

    public String getO_alumno_apellido_materno() {
        return o_alumno_apellido_materno;
    }

    public String getO_alumno_direccion() {
        return o_alumno_direccion;
    }

    public void setO_alumno_id(String o_alumno_id) {
        this.o_alumno_id = o_alumno_id;
    }

    public void setO_alumno_codigo(String o_alumno_codigo) {
        this.o_alumno_codigo = o_alumno_codigo;
    }

    public void setO_alumno_nombre(String o_alumno_nombre) {
        this.o_alumno_nombre = o_alumno_nombre;
    }

    public void setO_alumno_apellido_paterno(String o_alumno_apellido_paterno) {
        this.o_alumno_apellido_paterno = o_alumno_apellido_paterno;
    }

    public void setO_alumno_apellido_materno(String o_alumno_apellido_materno) {
        this.o_alumno_apellido_materno = o_alumno_apellido_materno;
    }

    public void setO_alumno_direccion(String o_alumno_direccion) {
        this.o_alumno_direccion = o_alumno_direccion;
    }

    
    
   
    
   public Alumno(String o_alumno_id, String o_alumno_codigo, String o_alumno_nombre, String o_alumno_apellido_paterno, String o_alumno_apellido_materno, String o_alumno_direccion) {
        this.o_alumno_id = o_alumno_id;
        this.o_alumno_codigo = o_alumno_codigo;
        this.o_alumno_nombre = o_alumno_nombre;
        this.o_alumno_apellido_paterno = o_alumno_apellido_paterno;
        this.o_alumno_apellido_materno = o_alumno_apellido_materno;
        this.o_alumno_direccion = o_alumno_direccion;
    } 
   public Alumno(){         }
   
   
}
