package client.clienttools;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class ClientReceiver extends Thread{
    DataInputStream in;
    Queue<String> receivedMessages;

    public void open(InputStream in) {
        this.in = new DataInputStream(in);
    }

    public void close() throws IOException {
        this.in.close();
    }
}
