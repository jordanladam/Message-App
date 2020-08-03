package servertools;

import java.io.DataOutputStream;
import java.io.OutputStream;

public class ServerSender extends Thread{

    DataOutputStream out;

    public void open(OutputStream out) {
        this.out = new DataOutputStream(out);
    }
}
