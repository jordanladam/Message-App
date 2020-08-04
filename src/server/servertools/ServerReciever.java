package server.servertools;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class ServerReciever extends Thread{
    public DataInputStream in;
    Queue<String> receivedMessages;

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
        this.in = new DataInputStream(new BufferedInputStream(in));
    }

    public void close() throws IOException {
        this.in.close();
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
