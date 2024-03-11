package com.danielnunesro.pets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Historico de Peso para Pets").version("v1")
				.description("Gerenciar o histórico de peso de animais de estimação. Ele fornece funcionalidades para criar, atualizar, listar e excluir registros de histórico de peso para cada animal registrado no sistema. Os usuários podem adicionar novos registros de peso, atualizar informações existentes, visualizar o histórico de peso de cada animal e excluir registros de peso antigos. Além disso, o sistema utiliza DTOs (Data Transfer Objects) para manipular os dados de entrada e saída de forma eficiente, enquanto o MapStruct é empregado para mapear objetos de entidade para DTOs e vice-versa. Isso ajuda a separar as camadas de serviço e controle, proporcionando uma estrutura limpa e organizada para o sistema.")
				.termsOfService("").license(new License().name("Apache 2.0").url("https://github.com/danielNunesRo")));
	}

}
