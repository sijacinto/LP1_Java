module org.example.feira {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.feira to javafx.fxml;
    exports org.example.feira;
}