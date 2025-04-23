import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Server says: " + input.readLine());
        output.println("Hello server!");

        socket.close();
    }
}
