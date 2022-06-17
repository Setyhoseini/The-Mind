import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{

    private void init() throws IOException {
        Socket socket = new Socket("localhost", 8080);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        Scanner scanner = new Scanner(socket.getInputStream());


    }




    @Override
    public void run() {

    }
}
