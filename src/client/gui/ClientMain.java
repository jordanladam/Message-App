package client.gui;

import client.clienttools.Client;
import client.clienttools.ClientReceiver;
import client.clienttools.ClientSender;
import client.gui.ClientGUIController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientMain extends Application {

    @FXML
    ClientGUIController clientGUI;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        BorderPane root = (BorderPane)loader.load(getClass().getResource("clientgui.fxml").openStream());
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        launch(args);
    }
}
