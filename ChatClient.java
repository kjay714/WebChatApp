package mobile.tiy.webchatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by kjpro on 5/11/2016.
 */
public class ChatClient {
public String textOfTheirMessage;

    public String sendMessage(String textOfTheirMessage) throws IOException {

        // connect to the server on the target port
        Socket clientSocket = new Socket("172.168.4.5", 8005);
        System.out.println("Connected to server!");
        // once we connect to the server, we also have an input and output stream
        PrintWriter pOut = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        // send the server an arbitrary message
        pOut.println(textOfTheirMessage);
        System.out.println("About to read response from server ...");
        String serverResponse = in.readLine();
        System.out.println("Received this response from the server: " +serverResponse);

        clientSocket.close();

        return serverResponse;
    }


}
