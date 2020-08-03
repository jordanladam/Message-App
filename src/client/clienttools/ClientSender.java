package client.clienttools;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Queue;

public class ClientSender extends Thread{
    DataOutputStream out;
    Queue<String> sentMessages;

    public void open(OutputStream out) {
        this.out = (DataOutputStream) out;
    }

    public void sendMessage(String message) throws IOException {
        out.writeUTF(message);
    }

    public void close() throws IOException {
        this.out.close();
    }
}
