package home.consul.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@RestController
class Application {

    @RequestMapping("/api/home")
    String home() {
        "SecondServer";
    }

    static void main(String[] args) {
        SpringApplication.run Application, args;
    }
}
