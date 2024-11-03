package co.edu.uinquindio.poo.model;
import java.time.LocalDate;

public class Moto extends Vehiculo {
    public CajaCambios cajaCambios;

    
    //Constructor
    public Moto(String placa, String marca, String modelo, LocalDate fechaFabricacion, double costo, CajaCambios cajaCambios) {
        super(placa, marca, modelo, fechaFabricacion, costo);
        this.cajaCambios = cajaCambios;
    }

    //Constructor vacio
    public Moto() {
    }

    //Getters y Setters
    public CajaCambios getCajaCambios() {
        return cajaCambios;
    }

    public void setCajaCambios(CajaCambios cajaCambios) {
        this.cajaCambios = cajaCambios;
    }


}
