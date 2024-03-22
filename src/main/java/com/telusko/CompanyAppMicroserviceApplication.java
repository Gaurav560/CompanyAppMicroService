package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CompanyAppMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyAppMicroserviceApplication.class, args);
    }

}
