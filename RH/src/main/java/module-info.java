module org.example.rh {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.rh to javafx.fxml;
    exports org.example.rh;
}