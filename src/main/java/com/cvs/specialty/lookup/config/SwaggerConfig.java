package com.cvs.specialty.lookup.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-13T01:32:53.564Z")

/**
 * 
 * @author Z227947
 * 
 * Configuration Class for the application and enable swagger
 */
@Configuration
@ComponentScan(basePackages = "com.cvs.specialty")
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurerAdapter {

  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("com.cvs.specialty.lookup.api"))
        .paths(regex("/.*")).build().apiInfo(metaData());
  }

  private ApiInfo metaData() {
    ApiInfo apiInfo = new ApiInfo("Lookup REST API's", "Lookup API ", "1.0", "Terms of service",
        new Contact("CVS", "www.cvshealth.com", "www.cvshealth.com"),
        "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
    return apiInfo;
  }

}
