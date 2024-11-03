package co.edu.uinquindio.poo.model;
import java.util.ArrayList;


public class Cliente {

    private String nombre;
    private String cedula;
    private ArrayList<Reserva> reservas = new ArrayList<>();

    // Constructor
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Constructor Vacio
    public Cliente() {
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

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}

