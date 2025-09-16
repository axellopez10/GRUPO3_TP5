/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp5;

/**
 *
 * @author Adrian
 */
public class Contacto {
    private double DNI;
    private String nombre;
    private String apellido;
    private String Ciudad ;
    private String dirección;

    public Contacto(double DNI, String nombre, String apellido, String Ciudad, String dirección) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Ciudad = Ciudad;
        this.dirección = dirección;
    }

    public double getDNI() {
        return DNI;
    }

    public void setDNI(double DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    
}
