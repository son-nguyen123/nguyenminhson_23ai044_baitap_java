import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server is waiting for client...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        output.println("Hello from server!");
        String clientMessage = input.readLine();
        System.out.println("Client says: " + clientMessage);

        socket.close();
        serverSocket.close();
    }
}
