package co.edu.uinquindio.poo.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;

import co.edu.uinquindio.poo.model.Empresa;
import co.edu.uinquindio.poo.model.Cliente;
import co.edu.uinquindio.poo.model.Moto;
import co.edu.uinquindio.poo.model.Auto;
import co.edu.uinquindio.poo.model.Camioneta;
import co.edu.uinquindio.poo.model.Reserva;
import co.edu.uinquindio.poo.model.CajaCambios;
import co.edu.uinquindio.poo.controller.LoginVehiculosController;
import co.edu.uinquindio.poo.controller.LoginController;
import co.edu.uinquindio.poo.controller.ReservaController;



/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    Empresa empresa = new Empresa("Alquileres don Luis");
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Página principal");
        inicializarData();
        openViewPrincipal();
    }
    
    public void openViewPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/Login.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            LoginController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    

    public void openVehiculo() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/Vehiculo.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            LoginVehiculosController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openReserva() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/uniquindio/poo/Reserva.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            ReservaController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void inicializarData(){
        Cliente cliente = new Cliente("Paco","1234");
        empresa.addCliente(cliente);
        Moto moto = new Moto("3UJADNWJ", "Honda", "Odyssey", LocalDate.now(),CajaCambios.AUTOMATICA);
        empresa.addVehiculo(moto);
        Reserva reserva = new Reserva(LocalDate.now(),5,"moto","3UJADNWJ",cliente,2.0);
        empresa.addReserva(reserva);
        cliente = new Cliente("Pedro", "54658");
        empresa.addCliente(cliente);
        Auto auto = new Auto("5465AWDA","Renault","Logan",LocalDate.now(),4);
        empresa.addVehiculo(auto);
        Camioneta camioneta = new Camioneta("EKDNAKW54", "Tesla", "Cybertruck", LocalDate.now(), 15);
        empresa.addVehiculo(camioneta);
        reserva = new Reserva(LocalDate.now(),2,"auto","5465AWDA",cliente,3.2);
        empresa.addReserva(reserva);
    }
}


