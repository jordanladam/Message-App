package servertools;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSender ss;
    ServerReciever sr;
    ServerSocket server;
    Socket socket;

    public Server(int port){
        this.ss = ss;
        this.sr = sr;
        try {
            this.server = new ServerSocket(port);
            socket = server.accept();
            this.sr.open(socket.getInputStream());
            this.ss.open(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
