module com.example.dam1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.dam1 to javafx.fxml;
    exports com.example.dam1;
}