package home.consul.server

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@EnableHystrix
@RestController
class Application {

    @Value('${name}')
    String name

    @RequestMapping("/api/home")
    String home() {
        "First Server says hello: " + name
    }

    static void main(String[] args) {
        SpringApplication.run Application, args;
    }
}
