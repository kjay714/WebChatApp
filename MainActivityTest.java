package mobile.tiy.webchatapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import static org.junit.Assert.*;

/**
 * Created by kjpro on 5/11/2016.
 */
public class MainActivityTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testOnCreate() throws Exception {

    }

    @Test
    public void testSendMessage() throws Exception {
        ChatClient chatClient = new ChatClient();
        String messageToSend = "asdhkjfdhklaf hasdkf asjh falkhjd fkasdhfkhasdfkhj adsfkhjads fkhjasd fakhjdhf asdkh ";
        String expectedResponse = "echo::" + messageToSend;
        String serverResponse = chatClient.sendMessage(messageToSend);
        assertNotNull(serverResponse);
        assertEquals(expectedResponse, serverResponse);
    }

    @Test
    public void testOnClick() throws Exception {

    }

    @Test
    public void testOnItemLongClick() throws Exception {

    }
}