import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.Principal;
import java.util.Scanner;

public class ClientHandler implements Runnable{

    private Socket socket;
    private Scanner scanner;
    private PrintWriter printWriter;

    ClientHandler(Socket socket) throws IOException {
        this.socket = socket;
        this.scanner = new Scanner(socket.getInputStream());
        this.printWriter = new PrintWriter(socket.getOutputStream());
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    @Override
    public void run() {

    }
}
