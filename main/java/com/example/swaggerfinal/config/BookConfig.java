package com.example.swaggerfinal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class BookConfig {

    @Bean
    public Docket docket(){

        try {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.example.swaggerfinal.controller"))
                    .paths(PathSelectors.any())
                    .build();
        }catch(Exception e){
         System.out.println(e);
        }
        return null;
    }


}

/*
@Configuration
@EnableSwagger2
public class SwaggerConfig {

//In this example, the api() method creates a new Docket instance and specifies that
  it should scan the com.example.myapp.controller package for API controllers
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.myapp.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }

//The apiInfo() method creates an ApiInfo instance that specifies the API
title, description, version, contact information, and licensing information.
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("My API")
            .description("API documentation for My App")
            .version("1.0.0")
            .contact(new Contact("John Doe", "https://www.example.com", "john.doe@example.com"))
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .build();
    }
}

 */