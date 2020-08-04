package client.gui;

import client.clienttools.Client;
import client.clienttools.ClientReceiver;
import client.clienttools.ClientSender;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClientGUIController {

    Client client;
    ClientReceiver cr;
    ClientSender cs;

    @FXML
    public void initialize(){
        this.cr = new ClientReceiver(client);
        this.cs = new ClientSender();
        this.client = new Client(cs, cr);
        this.client.connectToServer("127.0.0.1", 5000);
        this.cr.start();
    }

    @FXML
    Button testButton;

    public void handleTestButton(){
        String message = this.messageTextField.getText();
        System.out.println(this.messageTextField.getText());
        try {
            this.client.cs.sendMessage(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    TextField messageTextField;



}
