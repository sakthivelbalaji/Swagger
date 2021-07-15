package com.swag;
import java.lang.annotation.*;
import java.util.Collections;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.google.common.base.Predicate;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableSwagger2
public class SwaggerApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplicationContext.class, args);
    }

    @Bean
    public Docket SwaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.swag")).build().apiInfo(apidetails());

    }
 //Swagger Url :http://localhost:8086/swagger-ui.html
    //postman Url :localhost:8086/v2/api-docs

    public ApiInfo apidetails(){
        return new ApiInfo("SwaggerExample","sampleApi for javaBean","1.0","free to use",new springfox.documentation.service.Contact("sakthi","http://javabeans.io","a@b.com"),"API License","http://javabeans.io", Collections.emptyList());

    }

}
