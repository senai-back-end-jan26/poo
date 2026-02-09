package br.com.senai.backend.biblioteca.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API - Déby",
        version = "1.0.0",
        description = "API da Déby"
    )
)
public class Swagger {

}
