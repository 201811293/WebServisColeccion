
package wsdad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alumno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="o_alumno_apellido_materno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="o_alumno_apellido_paterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="o_alumno_codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="o_alumno_direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="o_alumno_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="o_alumno_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alumno", propOrder = {
    "oAlumnoApellidoMaterno",
    "oAlumnoApellidoPaterno",
    "oAlumnoCodigo",
    "oAlumnoDireccion",
    "oAlumnoId",
    "oAlumnoNombre"
})
public class Alumno {

    @XmlElement(name = "o_alumno_apellido_materno")
    protected String oAlumnoApellidoMaterno;
    @XmlElement(name = "o_alumno_apellido_paterno")
    protected String oAlumnoApellidoPaterno;
    @XmlElement(name = "o_alumno_codigo")
    protected String oAlumnoCodigo;
    @XmlElement(name = "o_alumno_direccion")
    protected String oAlumnoDireccion;
    @XmlElement(name = "o_alumno_id")
    protected String oAlumnoId;
    @XmlElement(name = "o_alumno_nombre")
    protected String oAlumnoNombre;

    /**
     * Obtiene el valor de la propiedad oAlumnoApellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAlumnoApellidoMaterno() {
        return oAlumnoApellidoMaterno;
    }

    /**
     * Define el valor de la propiedad oAlumnoApellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAlumnoApellidoMaterno(String value) {
        this.oAlumnoApellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad oAlumnoApellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAlumnoApellidoPaterno() {
        return oAlumnoApellidoPaterno;
    }

    /**
     * Define el valor de la propiedad oAlumnoApellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAlumnoApellidoPaterno(String value) {
        this.oAlumnoApellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad oAlumnoCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAlumnoCodigo() {
        return oAlumnoCodigo;
    }

    /**
     * Define el valor de la propiedad oAlumnoCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAlumnoCodigo(String value) {
        this.oAlumnoCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad oAlumnoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAlumnoDireccion() {
        return oAlumnoDireccion;
    }

    /**
     * Define el valor de la propiedad oAlumnoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAlumnoDireccion(String value) {
        this.oAlumnoDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad oAlumnoId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAlumnoId() {
        return oAlumnoId;
    }

    /**
     * Define el valor de la propiedad oAlumnoId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAlumnoId(String value) {
        this.oAlumnoId = value;
    }

    /**
     * Obtiene el valor de la propiedad oAlumnoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAlumnoNombre() {
        return oAlumnoNombre;
    }

    /**
     * Define el valor de la propiedad oAlumnoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAlumnoNombre(String value) {
        this.oAlumnoNombre = value;
    }

}
