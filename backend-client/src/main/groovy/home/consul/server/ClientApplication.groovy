package home.consul.server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@RestController
@EnableDiscoveryClient
@EnableFeignClients
class ClientApplication {

    @Autowired
    HelloClient client;

    @Autowired
    DiscoveryClient discoveryClient

    @RequestMapping("/api/home")
    String home() {
        client.home();
    }

    static void main(String[] args) {
        SpringApplication.run ClientApplication, args;
    }
}
