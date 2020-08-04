package server.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import server.servertools.Server;
import server.servertools.ServerReciever;
import server.servertools.ServerSender;

import java.io.IOException;

public class ServerGUIController {

    @FXML
    public void initialize(){
        Server server = new Server(5000, new ServerSender(), new ServerReciever());
        String message = null;
        try {
            message = server.sr.in.readUTF();
            while(!message.equals("quit")){
                System.out.println(message);
                message = server.sr.in.readUTF();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    Button testButton;

    public void handleTestButton(){
        System.out.println("Button Working!");
    }



}
