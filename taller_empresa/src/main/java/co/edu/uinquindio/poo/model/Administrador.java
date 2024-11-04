package co.edu.uinquindio.poo.model;

public class Administrador {

    private String nombre,password;

    // Constructor
    public Administrador(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setCedula(String password) {
        this.password = password;
    }

}
