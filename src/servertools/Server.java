package servertools;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSender ss;
    ServerReciever sr;
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

    public static void main(String[] args) throws IOException {
        Server server = new Server(5000, new ServerSender(), new ServerReciever());
        String message = server.sr.in.readUTF();
        System.out.println(message);
    }


}
