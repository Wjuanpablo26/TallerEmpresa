package co.edu.uinquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
public class LoginVehiculosViewController {
    

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAddCamioneta"
    private Button btnAddCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddMoto"
    private Button btnAddMoto; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddPlaca"
    private Button btnAddPlaca; // Value injected by FXMLLoader

    @FXML // fx:id="btnNextReserva"
    private Button btnNextReserva; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveAuto"
    private Button btnRemoveAuto; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveCamioneta"
    private Button btnRemoveCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveMoto"
    private Button btnRemoveMoto; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdateAuto"
    private Button btnUpdateAuto; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdateCamioneta"
    private Button btnUpdateCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdateMoto"
    private Button btnUpdateMoto; // Value injected by FXMLLoader

    @FXML // fx:id="comboxCajaCambios"
    private ComboBox<?> comboxCajaCambios; // Value injected by FXMLLoader

    @FXML // fx:id="tblAuto"
    private TableView<?> tblAuto; // Value injected by FXMLLoader

    @FXML // fx:id="tblCamioneta"
    private TableView<?> tblCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="tblMoto"
    private TableView<?> tblMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapacidadCargaCamioneta"
    private TextField txtCapacidadCargaCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarcaAuto"
    private TextField txtMarcaAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarcaCamioneta"
    private TextField txtMarcaCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarcaMoto"
    private TextField txtMarcaMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtModeloAuto"
    private TextField txtModeloAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtModeloCamioneta"
    private TextField txtModeloCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtModeloMoto"
    private TextField txtModeloMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombreMoto"
    private TextField txtNombreMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroPuertasAuto"
    private TextField txtNumeroPuertasAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlacaAuto"
    private TextField txtPlacaAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlacaCamioneta"
    private TextField txtPlacaCamioneta; // Value injected by FXMLLoader

    @FXML
    void AddAuto(ActionEvent event) {
        

    }

    @FXML
    void AddCamioneta(ActionEvent event) {

    }

    @FXML
    void AddMoto(ActionEvent event) {

    }

    @FXML
    void RemoveAuto(ActionEvent event) {

    }

    @FXML
    void RemoveCamioneta(ActionEvent event) {

    }

    @FXML
    void RemoveMoto(ActionEvent event) {

    }

    @FXML
    void UpdateAuto(ActionEvent event) {

    }

    @FXML
    void UpdateCamioneta(ActionEvent event) {

    }

    @FXML
    void UpdateMoto(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAddCamioneta != null : "fx:id=\"btnAddCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnAddMoto != null : "fx:id=\"btnAddMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnAddPlaca != null : "fx:id=\"btnAddPlaca\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnNextReserva != null : "fx:id=\"btnNextReserva\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnRemoveAuto != null : "fx:id=\"btnRemoveAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnRemoveCamioneta != null : "fx:id=\"btnRemoveCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnRemoveMoto != null : "fx:id=\"btnRemoveMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnUpdateAuto != null : "fx:id=\"btnUpdateAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnUpdateCamioneta != null : "fx:id=\"btnUpdateCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnUpdateMoto != null : "fx:id=\"btnUpdateMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert comboxCajaCambios != null : "fx:id=\"comboxCajaCambios\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert tblAuto != null : "fx:id=\"tblAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert tblCamioneta != null : "fx:id=\"tblCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert tblMoto != null : "fx:id=\"tblMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtCapacidadCargaCamioneta != null : "fx:id=\"txtCapacidadCargaCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtMarcaAuto != null : "fx:id=\"txtMarcaAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtMarcaCamioneta != null : "fx:id=\"txtMarcaCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtMarcaMoto != null : "fx:id=\"txtMarcaMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtModeloAuto != null : "fx:id=\"txtModeloAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtModeloCamioneta != null : "fx:id=\"txtModeloCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtModeloMoto != null : "fx:id=\"txtModeloMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtNombreMoto != null : "fx:id=\"txtNombreMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtNumeroPuertasAuto != null : "fx:id=\"txtNumeroPuertasAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtPlacaAuto != null : "fx:id=\"txtPlacaAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtPlacaCamioneta != null : "fx:id=\"txtPlacaCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";

    }

}
