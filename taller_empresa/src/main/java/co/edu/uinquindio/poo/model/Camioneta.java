package co.edu.uinquindio.poo.model;

import java.time.LocalDate;

public class Camioneta extends Vehiculo {

    private float capacidadCarga;

    /*
     * Constructor de la clase Camioneta
     */
    public Camioneta(String placa, String marca, String modelo, LocalDate fechaFabricacion, float capacidadCarga) {
        super(placa, marca, modelo, fechaFabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    /*
     * Getters and Setters
     */
    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /*
     * Metodo para calcular el costo dia
     */
    @Override
    public double calcularCostoDia() {
        
    }
    
}
