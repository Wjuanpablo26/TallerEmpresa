package co.edu.uinquindio.poo.controller;

import java.util.Collection;

import co.edu.uinquindio.poo.app.App;
import co.edu.uinquindio.poo.model.Empresa;
import co.edu.uinquindio.poo.model.Vehiculo;


public class LoginVehiculosController {
    
    Empresa empresa;
    public LoginVehiculosController(Empresa empresa){
        this.empresa = empresa;
    }
    public Collection<Vehiculo> obtenerlistaVehiculos(){
        return empresa.getVehiculos();
    }
    public int agregarVehiculo(Vehiculo vehiculo){
        return empresa.addVehiculo(vehiculo);
    }
    public int eliminarVehiculo(Vehiculo vehiculo){
        return empresa.RemoveVehiculo(vehiculo);
    }
    public int actualizarVehiculo(Vehiculo vehiculo, String placa){
        return empresa.updateVehiculo(vehiculo,placa);
    }

    private App app;

    public void setApp(App app) {

        this.app = app;

    }

}
