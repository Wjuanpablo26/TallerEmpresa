package co.edu.uinquindio.poo.model;

import java.time.LocalDate;

public class Reserva {

    private float costo;
    private LocalDate fechaInicio;
    private Vehiculo tipoVehiculo;
    private Cliente cliente;

    /*
     * Constructor de la clase Reserva
     */
    public Reserva(float costo, LocalDate fechaInicio, Vehiculo tipoVehiculo, Cliente cliente) {
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.tipoVehiculo = tipoVehiculo;
        this.cliente = cliente;
    }

    /*
     * Getters and Setters
     */
    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Vehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(Vehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /*
     * Metodo para calcular el costo de la reserva
     */
    public double calcularCostoReserva(){

    }


    
}
