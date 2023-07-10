package com.capitole.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

public class SwaggerConfig {
    
    @Configuration
public class ShopConfig {
 
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Test API")
                        .description("Example for capitole consulting")
                        .contact(new Contact()
                                .name("Guillermo Rodríguez Congosto")
                                .email("grodriguezcongosto@gmail.com")
                                .url("https://www.linkedin.com/in/grodriguezcongosto/"))
                        .version("1.0"));
        }
    }
}
