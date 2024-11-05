module co.edu.uinquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens co.edu.uinquindio.poo to javafx.fxml;
    opens co.edu.uinquindio.poo.viewController to javafx.fxml;
}


