package com.eclab.sso.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author yd
 * @create 2019-02-24 09:51
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SsoClient2Application.class, args);
    }

    @GetMapping("/user")
    public Authentication user(Authentication user){
        return user;
    }

}
