package co.edu.uinquindio.poo.model;

public class Administrador {

    private String nombre,cedula;

    // Constructor
    public Administrador(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Constructor Vacio
    public Administrador() {
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
