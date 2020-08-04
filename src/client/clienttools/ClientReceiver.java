package client.clienttools;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class ClientReceiver extends Thread{
    DataInputStream in;
    Queue<String> receivedMessages;
    Client client;

    public ClientReceiver(Client client){
        this.client = client;
    }

    public void run(){
        System.out.println("Starting cr thread!");
        String message = null;
        try {
            message = in.readUTF();
            System.out.println("Being rannn!");
            while(true){
                System.out.println(message);
                message = in.readUTF();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void open(InputStream in) {
        this.in = new DataInputStream(in);
    }

    public void close() throws IOException {
        this.in.close();
    }
}
