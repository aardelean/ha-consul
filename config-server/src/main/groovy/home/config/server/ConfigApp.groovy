package home.config.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.context.annotation.Configuration

@EnableAutoConfiguration
@Configuration
@EnableConfigServer
class ConfigApp {

    static void main(String [] args){
        SpringApplication.run ConfigApp, args
    }
}
