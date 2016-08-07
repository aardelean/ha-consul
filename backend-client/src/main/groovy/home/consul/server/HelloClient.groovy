package home.consul.server

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(value = "backend-server")
interface HelloClient {
    @RequestMapping(value = "/api/home", method = RequestMethod.GET)
    String home();
}
