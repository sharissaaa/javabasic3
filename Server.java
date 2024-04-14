import java.io.*;
import java.net.*;

class Server {
    public static void main(String args[]) {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        try {
            ss = new ServerSocket(1234);
            System.out.println("Server waiting for client...");
            as = ss.accept(); // This is where you accept the incoming connection
            System.out.println("Client connected.");
            sin = new DataInputStream(as.getInputStream());
            sout = new DataOutputStream(as.getOutputStream());
            sout.writeUTF("Welcome client");
            String str = sin.readUTF();
            System.out.println("Client says: " + str);
            System.in.read();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
