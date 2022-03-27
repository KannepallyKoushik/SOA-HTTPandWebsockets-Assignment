package nl.utwente.soa.sampleWebapplication.services;

import org.springframework.stereotype.Component;

import javax.websocket.EncodeException;
import java.io.IOException;

@Component("rest")
public class WebsocketEchoProxyService implements EchoProxyService {

    @Override
    public void echo(String message) throws IOException, InterruptedException {
        WebsocketHandler handler = new WebsocketHandler();
        handler.sendMessageToClient(message);
    }
}
