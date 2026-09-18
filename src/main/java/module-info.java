module com.crazybars.crazybars {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.crazybars.crazybars to javafx.fxml;
    exports com.crazybars.crazybars;
}