package server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import server.servertools.Server;
import server.servertools.ServerReciever;
import server.servertools.ServerSender;

import java.io.IOException;

public class ServerMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        BorderPane root = (BorderPane)loader.load(getClass().getResource("gui/servergui.fxml").openStream());
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(5000, new ServerSender(), new ServerReciever());
        String message = server.sr.in.readUTF();
        System.out.println(message);
        launch(args);
    }
}
