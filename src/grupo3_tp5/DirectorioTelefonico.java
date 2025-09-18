/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo3_tp5;

import java.util.*;
import sun.security.rsa.RSAUtil.KeyType;

/**
 *
 * @author kamil
 */
public class DirectorioTelefonico {

    private TreeMap<Long, Contacto> Directorio = new TreeMap<>();

    public DirectorioTelefonico() {
        this.Directorio = new TreeMap<>();
    }

    public TreeMap<Long, Contacto> getDirectorio() {
        return Directorio;
    }

    public void agregarContacto(Long telefono, Contacto contacto) {
        if (!Directorio.containsKey(telefono)) {
            Directorio.put(telefono, contacto);
            System.out.println("Contacto agregado: " + contacto);
        } else {
            System.out.println("El teléfono ya existe en el directorio.");
        }
    }

    public Contacto buscarContacto(Long telefono) {
        return Directorio.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : Directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> lista = new ArrayList<>();
        for (Contacto c : Directorio.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                lista.add(c);
            }
        }
        return lista;
    }

    public void borrarContacto(Long telefono) {
        if (Directorio.containsKey(telefono)) {
            Contacto eliminado = Directorio.remove(telefono);
            System.out.println("Contacto eliminado: " + eliminado);
        } else {
            System.out.println("No se encontro este telefono.");
        }
    }

    //debug de onda
    public void mostrarTodos() {
        for (Map.Entry<Long, Contacto> entry : Directorio.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
