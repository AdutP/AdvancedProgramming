package ro.info.uaic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GameServer {

    public static final int PORT = 8100;

    public GameServer() throws IOException {

        ServerSocket serverSocket = null;
        try{

            serverSocket = new ServerSocket(PORT);
            serverSocket.setSoTimeout(10_000);
            while (true) {

                System.out.println("Waiting for a client ...");
                try {
                    Socket socket = serverSocket.accept();
                    new ClientThread(socket).start();
                } catch (SocketTimeoutException e) {
                    System.err.println("Timeout exceeded.");
                }

            }

        } catch (IOException e) {
            System.err.println("Oops..." + e);
        } finally {
            serverSocket.close();
        }

    }

}
