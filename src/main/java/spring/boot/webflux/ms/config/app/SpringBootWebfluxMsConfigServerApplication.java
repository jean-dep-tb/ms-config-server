package spring.boot.webflux.ms.config.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBootWebfluxMsConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxMsConfigServerApplication.class, args);
	}
}
