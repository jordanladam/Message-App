package server.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import server.servertools.Server;
import server.servertools.ServerReciever;
import server.servertools.ServerSender;

import java.io.IOException;

public class ServerGUIController {

    Server server;

    @FXML
    public void initialize() throws IOException {
        server = new Server(5000, new ServerSender(), new ServerReciever());
        server.sr.start();
    }

    @FXML
    Button testButton;

    public void handleTestButton(){
        String message = this.messageTextField.getText();
        System.out.println(this.messageTextField.getText());
        try {
            this.server.ss.sendMessage(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    TextField messageTextField;



}
