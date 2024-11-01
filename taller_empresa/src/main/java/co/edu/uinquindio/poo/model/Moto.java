package co.edu.uinquindio.poo.model;
import java.time.LocalDate;

public class Moto extends Vehiculo {

    private CajaCambios cajaCambios;

    /*
     * Constructor de la clase Moto
     */
    public Moto(String placa, String marca, String modelo, LocalDate fechaFabricacion, CajaCambios cajaCambios) {
        super(placa, marca, modelo, fechaFabricacion);
        this.cajaCambios = cajaCambios;
    }

    /*
     * Getters and Setters
     */
    public CajaCambios getCajaCambios() {
        return cajaCambios;
    }

    public void setCajaCambios(CajaCambios cajaCambios) {
        this.cajaCambios = cajaCambios;
    }

    /*
     * Metodo para calcular el costo dia
     */
    @Override
    public double calcularCostoDia() {
        
    }


    
}
