package co.edu.uinquindio.poo.controller;

import java.util.Collection;

import co.edu.uinquindio.poo.app.App;
import co.edu.uinquindio.poo.model.Cliente;
import co.edu.uinquindio.poo.model.Empresa;
import co.edu.uinquindio.poo.model.Reserva;
import co.edu.uinquindio.poo.model.Vehiculo;

public class ReservaController {
    Empresa empresa;

    public ReservaController(Empresa empresa){
        this.empresa = empresa;
    }
    public Collection<Reserva> obtenerReservas(){
        return empresa.getReservas();
    }
    public Collection<Vehiculo> obtenerVehiculos(){
        return empresa.getVehiculos();
    }
    public Collection<Cliente> ObtenerClientes(){
        return empresa.getClientes();
    }
    public int Agregarreserva(Reserva reserva){
        return empresa.addReserva(reserva);
    }
    public int Eliminarreserva(Reserva reserva){
        return empresa.removeReserva(reserva);
    }
    public int Actualizarreserva(Reserva reserva,String placa){
        return empresa.updateReserva(reserva,placa);
    }

    private App app;

    public void setApp(App app) {

        this.app = app;

    }

    

}
