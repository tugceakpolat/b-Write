module com.example.bwrite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bwrite to javafx.fxml;
    exports com.example.bwrite;
}