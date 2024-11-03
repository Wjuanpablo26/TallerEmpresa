package co.edu.uinquindio.poo.model;

import java.time.LocalDate;

public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private LocalDate fechaFabricacion;
    private double costo;

    //Constructor vacio
    public Vehiculo() {}

    //Constructor
    public Vehiculo(String placa, String marca, String modelo, LocalDate fechaFabricacion, double costo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.costo = costo;
    }

    //Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


}
