package co.edu.uinquindio.poo.model;

import java.time.LocalDate;

public class Auto extends Vehiculo {

    private int puertas;

    /*
     * Constructor
     */
    public Auto(String placa,String marca, String modelo, LocalDate fechaFabricacion, int puertas) {
        super(placa,marca, modelo,fechaFabricacion);
        this.puertas = puertas;
    }

    /*
     * Getters and Setters
     */
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /*
     * Metodo para calcular el costo dia
     */
    @Override
    public double calcularCostoDia() {
        

        
    }
}
