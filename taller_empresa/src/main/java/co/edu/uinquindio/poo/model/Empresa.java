package co.edu.uinquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private List<Vehiculo> listaVehiculos=new ArrayList<>();
    private List<Cliente> listaClientes=new ArrayList<>();
    private List<Reserva> listaReservas=new ArrayList<>();

    /*
     * Constructor de la clase Empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre;

    }

    /*
     * Getters and Setters
     */
    public String getNombre() {
        return nombre;
    }   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    /*
     * Metodos CRUD 
     */

    public void agregarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }

    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void agregarReserva(Reserva reserva){
        listaReservas.add(reserva);
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        listaVehiculos.remove(vehiculo);
    }

    public void eliminarCliente(Cliente cliente){
        listaClientes.remove(cliente);
    }

    public void eliminarReserva(Reserva reserva){
        listaReservas.remove(reserva);
    }

    public Vehiculo buscarVehiculo(String placa){
        for (Vehiculo vehiculo : listaVehiculos) {
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String cedula){
        for (Cliente cliente : listaClientes) {
            if(cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }

    public Reserva buscarReserva(String placa){
        for (Reserva reserva : listaReservas) {
            if(reserva.getTipoVehiculo().getPlaca().equals(placa)){
                return reserva;
            }
        }
        return null;
    }

    




    
}
