package ai.guiji.resilience4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Resilience4jDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Resilience4jDemoApplication.class, args);
    }

}
