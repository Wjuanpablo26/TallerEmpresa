module co.edu.uinquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uinquindio.poo to javafx.fxml;
    exports co.edu.uinquindio.poo ;
}
