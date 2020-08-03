package servertools;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class ServerReciever extends Thread{
    public DataInputStream in;
    Queue<String> receivedMessages;

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
