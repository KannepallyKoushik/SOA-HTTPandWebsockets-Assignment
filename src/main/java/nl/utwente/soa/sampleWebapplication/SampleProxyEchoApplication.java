package nl.utwente.soa.sampleWebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
@Configuration
@ServletComponentScan
public class SampleProxyEchoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleProxyEchoApplication.class, args);
	}
}
