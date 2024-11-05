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

    public int agregarAuto(Vehiculo auto){
        if(empresa.addVehiculo(auto) == 1){
            return 1;
        }
        return 0;
    }

    public int agregarMoto(Vehiculo moto){
        if(empresa.addVehiculo(moto) == 2){
            return 2;
        }
        return 0;
    }

    public int agregarCamioneta(Vehiculo camioneta){
        if(empresa.addVehiculo(camioneta) == 3){
            return 3;
        }
        return 0;
    }

    public int eliminarVehiculo(Vehiculo vehiculo){
        return empresa.RemoveVehiculo(vehiculo);
    }

    public int eliminarAuto(Vehiculo auto){
        return empresa.RemoveVehiculo(auto);
    }

    public int eliminarMoto(Vehiculo moto){
        return empresa.RemoveVehiculo(moto);
    }

    public int eliminarCamioneta(Vehiculo camioneta){
        return empresa.RemoveVehiculo(camioneta);
    }

    public int actualizarAuto(Vehiculo auto, String placa){
        return empresa.updateVehiculo(auto,placa);
    }

    public int actualizarMoto(Vehiculo moto, String placa){
        return empresa.updateVehiculo(moto,placa);
    }

    public int actualizarCamioneta(Vehiculo camioneta, String placa){
        return empresa.updateVehiculo(camioneta,placa);
    }

    public int actualizarVehiculo(Vehiculo vehiculo, String placa){
        return empresa.updateVehiculo(vehiculo,placa);
    }

    private App app;

    public void setApp(App app) {

        this.app = app;

    }

}
