package com.crazybars.crazybars;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Wassup guys--Welcome to Crazy Bars!");
    }
}
