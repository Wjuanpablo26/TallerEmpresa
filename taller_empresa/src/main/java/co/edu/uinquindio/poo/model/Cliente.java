package co.edu.uinquindio.poo.model;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre,cedula;
    private List<Reserva> reservas = new ArrayList<>();

    /*
     * Constructor de la clase cliente
     */
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        
    }

    /*
     * Getters and Setters
     */
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

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    
}
