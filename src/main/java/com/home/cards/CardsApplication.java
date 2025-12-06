package com.home.cards;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Cards microservice", description = "Cards microservice REST APIs", version = "1.0"))
public class CardsApplication implements CommandLineRunner {

    @Value("${build.version:NotFound}")
    private String buildVersion;

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }


    @Override
    public void run(String... args) {
        started();
    }

    void started() {
        System.out.println("Application started with version: " + buildVersion);
    }
}
