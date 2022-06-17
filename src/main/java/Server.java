import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
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

            ClientHandler host = new ClientHandler(hostSocket);
            clientHandlers.add(host);

            int n = host.getPrintWriter().println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
