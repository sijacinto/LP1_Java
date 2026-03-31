module org.example.feira {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires org.junit.jupiter.api;


    opens org.example.feira to javafx.fxml;
    exports org.example.feira;
}