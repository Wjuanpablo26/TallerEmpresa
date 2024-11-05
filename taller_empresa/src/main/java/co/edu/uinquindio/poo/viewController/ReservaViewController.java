package co.edu.uinquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class ReservaViewController {

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

    @FXML // fx:id="tblReserva"
    private TableColumn<?, ?> tblReserva; // Value injected by FXMLLoader

    @FXML // fx:id="txtcantidaddias"
    private TextField txtcantidaddias; // Value injected by FXMLLoader

    @FXML // fx:id="txtplacavehiculo"
    private TextField txtplacavehiculo; // Value injected by FXMLLoader

    @FXML
    void AddReserva(ActionEvent event) {

    }

    @FXML
    void RemoveReserva(ActionEvent event) {

    }

    @FXML
    void UpdateReserva(ActionEvent event) {

    }

    @FXML
    void regresar(ActionEvent event) {

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

    
}
