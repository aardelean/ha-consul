package home.consul.server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import javax.ws.rs.QueryParam

@Configuration
@EnableAutoConfiguration
@RestController
@EnableDiscoveryClient
@EnableFeignClients
@RefreshScope
class ClientApplication {

    @Value('${config.name}')
    String configName

    @Autowired
    HelloClient client;

    @Autowired
    DiscoveryClient discoveryClient

    @RequestMapping(path = "/discover", method = RequestMethod.GET)
    String discover(@QueryParam("name") String name){
        discoveryClient.getInstances(name).get(0).uri
    }

    @RequestMapping("/api/home")
    String home() {
        client.home();
    }

    @RequestMapping("/conf")
    String getConf(){
        configName
    }

    static void main(String[] args) {
        SpringApplication.run ClientApplication, args;
    }
}
