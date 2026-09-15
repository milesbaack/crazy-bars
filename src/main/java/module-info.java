module com.crazybars.crazybars {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.crazybars.crazybars to javafx.fxml;
    exports com.crazybars.crazybars;
}