package client.clienttools;

import java.io.IOException;
import java.net.Socket;

public class Client {
    ClientSender cs;
    ClientReceiver cr;
    Socket socket;

    public Client(ClientSender cs, ClientReceiver cr){
        this.cs = cs;
        this.cr = cr;
    }

    private void connectToServer(String address, int port){
        try {
            this.socket = new Socket(address, port);
            this.cs.open(socket.getOutputStream());
            this.cr.open(System.in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void disconnectFromServer() throws IOException {
        try{
            this.cs.close();
            this.cr.close();
            this.socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
