package home.consul.zuul

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.netflix.turbine.EnableTurbine
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import javax.ws.rs.QueryParam

@Configuration
@EnableAutoConfiguration
@EnableZuulProxy
@EnableTurbine
@EnableHystrix
@EnableDiscoveryClient
@RestController
@RefreshScope
class ZuulApplication {

    @Autowired
    DiscoveryClient discoveryClient

    @RequestMapping(path = "/discover", method = RequestMethod.GET)
    String discover(@QueryParam("service") String name){
        discoveryClient.getInstances(name).get(0).uri
    }

//    @Bean(name = "configServerRetryInterceptor")
//    static RetryOperationsInterceptor retryOperationsInterceptor(){
//        RetryInterceptorBuilder.stateless().build();
//    }

    static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApplication).web(true).run(args)
    }
}
