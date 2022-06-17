import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.Vector;

public class Server {

    private Vector<ClientHandler> clientHandlers;

    Server() {

    }


    public void init() {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket hostSocket = serverSocket.accept();

            Scanner scanner = new Scanner(hostSocket.getInputStream());
            PrintWriter printWriter = new PrintWriter(hostSocket.getOutputStream());

            String line = "";

            while (line.equals("")) {
                try {
                    line = scanner.nextLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
