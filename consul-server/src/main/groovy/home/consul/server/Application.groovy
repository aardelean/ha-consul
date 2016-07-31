package home.consul.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@EnableCons
@RestController
class Application {

    @RequestMapping("/")
    String home() {
        "Hello World";
    }

    static void main(String[] args) {
        SpringApplication.run Application, args;
    }

}
