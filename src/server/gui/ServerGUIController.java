package server.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ServerGUIController {

    @FXML
    public void initialize(){

    }

    @FXML
    Button testButton;

    public void handleTestButton(){
        System.out.println("Button Working!");
    }



}
