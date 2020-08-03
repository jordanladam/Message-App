package client.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    public void initialize(){

    }

    @FXML
    Button testButton;

    public void handleTestButton(){
        System.out.println("Button Working!");
    }



}
