package com.springswagger.config;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Profiles;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${spring.profiles.active}")
    private String env;
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    @Bean
    public Docket docket(){
        boolean flag=env.equals(env);
        System.out.println(env);
        //any()全部扫描
        //none()全不扫描
        //withClassAnnotation()扫描类上注解("RestController.class")
        //withMethodAnnotation()扫描方法上注解("GetMapping.class")
        //path()过滤(PathSelectors.ant("com.springswagger.controller"))
        //enable()是否启用 swagger
        return new Docket(DocumentationType.SWAGGER_2).groupName("test").apiInfo(apiInfo()).enable(flag).select().apis(RequestHandlerSelectors.basePackage("com.springswagger.controller")).paths(PathSelectors.ant("com.springswagger.controller")).build();
    }
    private ApiInfo apiInfo(){
        Contact contact=new Contact("杨某人","www.baidu.com","1003779381@qq.com");
        return new ApiInfo(
                "杨某人的文档1",
                "也许是描述",
                "2.0",
                "www.baidu.com",
                contact,
                "Apache 2.0",
                "http//",
                new ArrayList()
        );
    }
}
