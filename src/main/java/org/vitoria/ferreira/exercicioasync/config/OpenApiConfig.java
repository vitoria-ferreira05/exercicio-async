package org.vitoria.ferreira.exercicioasync.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI().components(new Components())
                .info(new Info().title("Cadastro Assíncrono de Produtos de Investimento\n")
                        .description("Este projeto oferece um endpoint para cadastrar em lote produtos de investimento a partir de um arquivo (formato xls ou txt). ")
                        .version("1.0.0"));


    }
}
