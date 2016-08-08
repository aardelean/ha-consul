package home.consul.server

import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@RefreshScope
@FeignClient(value = '${proxy.to}')
interface HelloClient {
    @RequestMapping(value = "/api/home", method = RequestMethod.GET)
    String home();
}
