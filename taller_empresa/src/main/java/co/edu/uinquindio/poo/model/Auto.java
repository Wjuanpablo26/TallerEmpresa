package co.edu.uinquindio.poo.model;

import java.time.LocalDate;

public class Auto extends Vehiculo {
    private int numeroPuertas;

    //Constructor
    public Auto(String placa, String marca, String modelo, LocalDate fechaFabricacion, double costo, int numeroPuertas) {
        super(placa, marca, modelo, fechaFabricacion, costo);
        this.numeroPuertas = numeroPuertas;
    }

    //Constructor vacio
    public Auto() {
    }

    //Getters y Setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

}
