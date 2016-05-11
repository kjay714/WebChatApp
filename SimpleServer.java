package tiy;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by kjpro on 4/27/2016.
 */
public class SimpleServer {
    ArrayList<Message> messageArrayList = new ArrayList<Message>();
    public static void main(String[] args) throws Exception {
        new SimpleServer().startServer();
    }

    public void startServer() throws Exception {

        ServerSocket serverListener = new ServerSocket(8005);
        System.out.println("About to start listening to connections ...");
        while (true) {
            try {
                Socket clientSocket = serverListener.accept();
                System.out.println("Accepted a connection from " + clientSocket.getInetAddress().getHostName());
                ServerThread localThread = new ServerThread(clientSocket,this);
                Thread myThread = new Thread(localThread);
                myThread.start();


            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

    }






}
