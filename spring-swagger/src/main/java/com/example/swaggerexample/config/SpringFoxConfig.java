package com.example.swaggerexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SpringFoxConfig {

	@Bean
	Docket docket() {
		return new Docket(DocumentationType.OAS_30)
		    .apiInfo(apiInfo())
		    .select()
		    .apis(RequestHandlerSelectors.any())
		    .paths(PathSelectors.any())
		    .build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
		    .title("Swagger with Spring Boot")
		    .description("A Spring Boot Swagger Example")
		    .version("0.0.1")
		    .license("MIT")
		    .licenseUrl("https://opensource.org/licenses/MIT")
		    .termsOfServiceUrl("https://example.com")
		    .build();
	}
}
