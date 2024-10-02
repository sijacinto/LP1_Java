module rh.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    //requires javafx.graphics;
    
    opens rh.example to javafx.fxml;
    exports rh.example;
}
