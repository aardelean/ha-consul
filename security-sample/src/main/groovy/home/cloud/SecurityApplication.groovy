package home.cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Configuration
@EnableAutoConfiguration
@EnableOAuth2Sso
@RestController
class SecurityApplication extends WebSecurityConfigurerAdapter {

    static void main(String ... args){
        SpringApplication.run SecurityApplication, args
    }

    @RequestMapping(path = "/security")
    String secure(){
        "congratz!"
    }

    @RequestMapping(path = "/configurationTest")
    String configuration() {
        "unsecured"
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http)
        http.csrf().disable()
//                .httpBasic().disable()
//                .formLogin().disable()
                .authorizeRequests()
                .antMatchers("/configurationTest").permitAll()
                .anyRequest().authenticated()
        .and()
            .formLogin()
    }
}
