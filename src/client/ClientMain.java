package client;

import client.clienttools.Client;
import client.clienttools.ClientReceiver;
import client.clienttools.ClientSender;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        BorderPane root = (BorderPane)loader.load(getClass().getResource("gui/clientgui.fxml").openStream());
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        Client client = new Client(new ClientSender(), new ClientReceiver());
        client.connectToServer("127.0.0.1", 5000);
        client.cs.sendMessage("Hi");
        launch(args);
    }
}
