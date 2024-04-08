module rh.example {
    requires javafx.controls;
    requires javafx.fxml;
    //requires javafx.graphics;
    
    opens rh.example to javafx.fxml;
    exports rh.example;
}
