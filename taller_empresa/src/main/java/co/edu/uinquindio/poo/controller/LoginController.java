package co.edu.uinquindio.poo.controller;
import java.util.ArrayList;
import java.util.Collection;

import co.edu.uinquindio.poo.app.App;
import co.edu.uinquindio.poo.model.Cliente;
import co.edu.uinquindio.poo.model.Empresa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

public class LoginController {


    Empresa empresa;

    public LoginController(Empresa empresa){
        this.empresa = empresa;
    }
    public int AgregarCliente(Cliente cliente){
        return empresa.addCliente(cliente);
    }
    public ArrayList<Cliente> obtenerlistaClientes(){
        return empresa.getClientes();
    }
    public int EliminarCliente(Cliente cliente){
        return empresa.removeCliente(cliente);
    }
    public int ActualizarCliente(Cliente cliente, String password){
        return empresa.updateCliente(cliente, password);
    }

    private App app;

    public void setApp(App app) {

        this.app = app;

    }

    
    public LoginController() {

        // Initialize any required fields here

    }
}
    

