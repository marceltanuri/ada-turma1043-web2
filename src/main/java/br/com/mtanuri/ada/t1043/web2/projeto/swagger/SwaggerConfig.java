package br.com.mtanuri.ada.t1043.web2.projeto.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("PWII API").version("1.0.0"))
                // Components section defines Security Scheme "mySecretHeader"
                .components(new Components()
                        .addSecuritySchemes("Basic Auth", new SecurityScheme()
                                .name("Basic Authentication")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("basic")
                        )
                )
                // AddSecurityItem section applies created scheme globally
                .addSecurityItem(new SecurityRequirement().addList("Basic Auth"));
    }
}