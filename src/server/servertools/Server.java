package server.servertools;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public ServerSender ss;
    public ServerReciever sr;
    ServerSocket server;
    Socket socket;

    public Server(int port, ServerSender ss, ServerReciever sr){
        this.ss = ss;
        this.sr = sr;
        try {
            this.server = new ServerSocket(port);
            System.out.println("Server Created");
            socket = server.accept();
            System.out.println("Client Connected");
            this.sr.open(socket.getInputStream());
            this.ss.open(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
