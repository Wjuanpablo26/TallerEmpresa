package co.edu.uinquindio.poo.model;

import java.time.LocalDate;

public class Camioneta extends Vehiculo {
    private float capacidadCarga;

    //Constructor
    public Camioneta(String placa, String marca, String modelo, LocalDate fechaFabricacion, double costo, float capacidadCarga) {
        super(placa, marca, modelo, fechaFabricacion, costo);
        this.capacidadCarga = capacidadCarga;
    }

    //Constructor vacio
    public Camioneta() {
    }

    //Getters y Setters
    public Camioneta(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public float getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
