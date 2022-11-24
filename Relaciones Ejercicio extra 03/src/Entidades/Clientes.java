package Entidades;

import java.util.ArrayList;

public class Clientes {

    private String nombre, apellido, mail, domicilio;
    private Integer telefono, documento;
    private ArrayList<Vehiculos> vehiculos;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String mail, String domicilio, Integer telefono, Integer documento, ArrayList<Vehiculos> vehiculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.documento = documento;
        this.vehiculos = vehiculos;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
    
}
