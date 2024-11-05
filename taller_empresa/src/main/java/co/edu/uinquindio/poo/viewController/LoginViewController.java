package co.edu.uinquindio.poo.viewController;

/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

import co.edu.uinquindio.poo.controller.LoginController;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import co.edu.uinquindio.poo.model.Cliente; // Adjust the package name as necessary
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import co.edu.uinquindio.poo.app.App;


public class LoginViewController {

    private LoginController loginController;
    ObservableList <Cliente> listaClientes = FXCollections.observableArrayList(); 
    private App app;
    

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="TxtNombre"
    private TextField TxtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="TxtPassword"
    private TextField TxtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="btnLogin"
    private Button btnLogin; // Value injected by FXMLLoader

    @FXML // fx:id="btnNextVehiculo"
    private Button btnNextVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemove"
    private Button btnRemove; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdate"
    private Button btnUpdate; // Value injected by FXMLLoader

    @FXML // fx:id="tblCliente"
    private TableView<?> tblCliente; // Value injected by FXMLLoader

    @FXML // fx:id="txtLogin"
    private Label txtLogin; // Value injected by FXMLLoader

    @FXML
    void addCliente(ActionEvent event) {
        String nombre = TxtNombre.getText();
        String password = TxtPassword.getText();

        boolean validar = validarDatos(nombre, password);
        if (validar) {
            Cliente cliente = new Cliente(nombre, password);
            int respuesta = loginController.AgregarCliente(cliente);
            mostrarMensaje("Agregar Cliente", "Cliente Agregado", "El cliente ha sido agregado", AlertType.INFORMATION);
            if (respuesta == 1) {
                txtLogin.setText("Cliente Agregado");
                listaClientes.add(cliente);
                limpiarseleccion();
            } else {
                txtLogin.setText("Error al agregar el cliente");
            }
        }
    }

    @FXML
    void removeCliente(ActionEvent event) {
        Cliente cliente = (Cliente) tblCliente.getSelectionModel().getSelectedItem();
        if (cliente != null) {
            int respuesta = loginController.EliminarCliente(cliente);
            mostrarMensaje("Eliminar Cliente", "Cliente Eliminado", "El cliente ha sido eliminado", AlertType.INFORMATION);
            if (respuesta == 1) {
                txtLogin.setText("Cliente Eliminado");
                listaClientes.remove(cliente);
                limpiarseleccion();
            } else {
                txtLogin.setText("Error al eliminar el cliente");
            }
        } else {
            mostrarMensaje("Eliminar Cliente", "Error al eliminar", "Debe seleccionar un cliente", AlertType.ERROR);
        }
    }

    @FXML
    void updateCliente(ActionEvent event) {
        String nombre = TxtNombre.getText();
        String password = TxtPassword.getText();
        Cliente cliente = (Cliente) tblCliente.getSelectionModel().getSelectedItem();
        if (cliente != null) {
            boolean validar = validarDatos(nombre, password);
            if (validar) {
                cliente.setNombre(nombre);
                cliente.setPassword(password);
                int respuesta = loginController.ActualizarCliente(cliente, password);
                mostrarMensaje("Actualizar Cliente", "Cliente Actualizado", "El cliente ha sido actualizado", AlertType.INFORMATION);
                if (respuesta == 1) {
                    txtLogin.setText("Cliente Actualizado");
                    listaClientes.set(listaClientes.indexOf(cliente), cliente);
                    limpiarseleccion();
                } else {
                    txtLogin.setText("Error al actualizar el cliente");
                }
            }
        } else {
            mostrarMensaje("Actualizar Cliente", "Error al actualizar", "Debe seleccionar un cliente", AlertType.ERROR);
        }
    }

    @FXML
    void NextAction(ActionEvent event) {
        app.openVehiculo();
    }

    public void setApp(App app) {
        this.app = app;
        loginController = new LoginController(app.getEmpresa());
        initView();
    }

    private void initView(){

    }

    private void initDataBinding() {
        columnnombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        columncedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        columntelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
        columncorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        columnreservas.setCellValueFactory(cellData -> {if (cellData.getValue().getListareservas().isEmpty()) {
            return new SimpleStringProperty("No tiene reservas");
        }else{
            return new SimpleStringProperty(cellData.getValue().getListareservas().toString());
        }});
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }
    private void obtenerClientes(){
        listclientes.addAll(clientecontroller.obtenerlistaClientes());
    }
    
    private void listenerSelection() {
        tblcliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            Selectedcliente = newSelection;
            mostrarInformacionCliente(Selectedcliente);
        });
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert TxtNombre != null : "fx:id=\"TxtNombre\" was not injected: check your FXML file 'Login.fxml'.";
        assert TxtPassword != null : "fx:id=\"TxtPassword\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnLogin != null : "fx:id=\"btnLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnNextVehiculo != null
                : "fx:id=\"btnNextVehiculo\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnRemove != null : "fx:id=\"btnRemove\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnUpdate != null : "fx:id=\"btnUpdate\" was not injected: check your FXML file 'Login.fxml'.";
        assert tblCliente != null : "fx:id=\"tblCliente\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtLogin != null : "fx:id=\"txtLogin\" was not injected: check your FXML file 'Login.fxml'.";

    }

    public void mostrarMensaje(String titulo,String header, String contenido, AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    public boolean validarDatos(String nombre, String password) {
        if (nombre.isEmpty() || password.isEmpty()) {
            txtLogin.setText("Debe llenar todos los campos");
            return false;
        }
        return true;
    }

    private void limpiarseleccion(){
        tblCliente.getSelectionModel().clearSelection();
        Vaciarcampos();
    }

    private void Vaciarcampos(){
        TxtNombre.clear();
        TxtPassword.clear();        
    }

}
