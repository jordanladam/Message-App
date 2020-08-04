package server.servertools;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ServerSender extends Thread{

    DataOutputStream out;

    public void open(OutputStream out) {
        this.out = new DataOutputStream(out);
    }

    public void sendMessage(String message) throws IOException {
        System.out.println("Sending message");
        out.writeUTF(message);
    }
}
