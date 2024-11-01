package co.edu.uinquindio.poo.model;

import java.time.LocalDate;

public abstract class Vehiculo {

    protected String placa, marca, modelo;
    protected LocalDate fechaFabricacion;

    /*
     * Constructor
     */
    public Vehiculo(String placa, String marca, String modelo, LocalDate fechaFabricacion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
    }

    /*
     * Getters and Setters
     */
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    /*
     * Metodo abstracto para calcular el costo dia
     */
    public abstract double calcularCostoDia();
    
}
