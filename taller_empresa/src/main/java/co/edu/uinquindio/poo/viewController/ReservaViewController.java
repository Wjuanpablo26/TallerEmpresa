package co.edu.uinquindio.poo.viewController;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import co.edu.uinquindio.poo.model.Cliente;
import co.edu.uinquindio.poo.model.Reserva;
import co.edu.uinquindio.poo.model.Vehiculo;
import co.edu.uinquindio.poo.controller.ReservaController;
import co.edu.uinquindio.poo.app.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ReservaViewController {

    App app;
    ReservaController reservaController;
    ObservableList<Reserva> listaReservas = FXCollections.observableArrayList();
    Reserva reserva;
    Vehiculo vehiculo;
    Cliente cliente;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAddReserva"
    private Button btnAddReserva; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresarVehiculo"
    private Button btnRegresarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveReserva"
    private Button btnRemoveReserva; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdateReserva"
    private Button btnUpdateReserva; // Value injected by FXMLLoader

    @FXML // fx:id="columnCantidadDias"
    private TableColumn<Reserva, Integer> columnCantidadDias; // Value injected by FXMLLoader

    @FXML // fx:id="columnPlacaVehiculo"
    private TableColumn<Reserva, String> columnPlacaVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="tblReserva"
    private TableView<Reserva> tblReserva; // Value injected by FXMLLoader

    @FXML // fx:id="txtcantidaddias"
    private TextField txtcantidaddias; // Value injected by FXMLLoader

    @FXML // fx:id="txtplacavehiculo"
    private TextField txtplacavehiculo; // Value injected by FXMLLoader

    @FXML
    void AddReserva(ActionEvent event) {
        String dias = txtcantidaddias.getText();
        String placa = txtplacavehiculo.getText();
        Reserva reserva = new Reserva(Integer.parseInt(dias), placa);
        boolean validar = validarDatos(dias, placa);
        if (validar) {
            reservaController.Agregarreserva(reserva);
            listaReservas.add(reserva);
            tblReserva.setItems(listaReservas);
            if(reservaController.Agregarreserva(reserva) == 1){
                limpiarseleccion();
                System.out.println("Reserva agregada");

            }else{
                System.out.println("Reserva no agregada");
            }
        }
    }

    @FXML
    void RemoveReserva(ActionEvent event) {
        if (reserva != null) {
            reservaController.Eliminarreserva(reserva);
            listaReservas.remove(reserva);
            tblReserva.setItems(listaReservas);
            limpiarseleccion();
        }
    }

    @FXML
    void UpdateReserva(ActionEvent event) {
        String dias = txtcantidaddias.getText();
        String placa = txtplacavehiculo.getText();
        Reserva reserva = new Reserva(Integer.parseInt(dias), placa);
        boolean validar = validarDatos(dias, placa);
        if (validar) {
            reservaController.Actualizarreserva(reserva, placa);
            listaReservas.add(reserva);
            tblReserva.setItems(listaReservas);
            if(reservaController.Actualizarreserva(reserva, placa) == 1){
                limpiarseleccion();
                System.out.println("Reserva actualizada");

            }else{
                System.out.println("Reserva no actualizada");
            }
        }
    }

    @FXML
    void regresar(ActionEvent event) {
        app.openVehiculo();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAddReserva != null : "fx:id=\"btnAddReserva\" was not injected: check your FXML file 'Reserva.fxml'.";
        assert btnRegresarVehiculo != null : "fx:id=\"btnRegresarVehiculo\" was not injected: check your FXML file 'Reserva.fxml'.";
        assert btnRemoveReserva != null : "fx:id=\"btnRemoveReserva\" was not injected: check your FXML file 'Reserva.fxml'.";
        assert btnUpdateReserva != null : "fx:id=\"btnUpdateReserva\" was not injected: check your FXML file 'Reserva.fxml'.";
        assert tblReserva != null : "fx:id=\"tblReserva\" was not injected: check your FXML file 'Reserva.fxml'.";
        assert txtcantidaddias != null : "fx:id=\"txtcantidaddias\" was not injected: check your FXML file 'Reserva.fxml'.";
        assert txtplacavehiculo != null : "fx:id=\"txtplacavehiculo\" was not injected: check your FXML file 'Reserva.fxml'.";

    }

    public void setApp(App app) {
        this.app = app;
        reservaController = new ReservaController(app.getEmpresa());
        initView();
    }

    private void initView() {
        initDataBinding();
        obtenerReservas();
        tblReserva.getItems().clear();
        tblReserva.setItems(listaReservas);
        listenerSelection();
    }

    private void initDataBinding() {
        columnCantidadDias.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getCantidadDias()).asObject());
        columnPlacaVehiculo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlacaVehiculo()));
        tblReserva.setItems(listaReservas);
    }

    private void obtenerReservas() {
        listaReservas.addAll(reservaController.obtenerReservas());
    }

    private void listenerSelection() {
        tblReserva.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            reserva = newSelection;
            mostrarInformacionReserva(reserva);
        });
    }

    private void mostrarInformacionReserva(Reserva reserva) {
        if (reserva != null) {
            txtcantidaddias.setText(String.valueOf(reserva.getCantidadDias()));
            txtplacavehiculo.setText(reserva.getPlacaVehiculo());
        }
    }

    private void limpiarseleccion() {
        txtcantidaddias.setText("");
        txtplacavehiculo.setText("");
    }

    private boolean validarDatos(String dias, String placa) {
        if (dias.isEmpty() || placa.isEmpty()) {
            return false;
        }
        return true;
    }

    
    

    
}
