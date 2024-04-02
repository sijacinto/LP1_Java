module rh.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens rh.example to javafx.fxml;
    exports rh.example;
}
