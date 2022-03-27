package nl.utwente.soa.sampleWebapplication.services;

import javax.websocket.EncodeException;
import java.io.IOException;

public interface EchoProxyService {
    void echo(String message) throws IOException, EncodeException, InterruptedException;
}
