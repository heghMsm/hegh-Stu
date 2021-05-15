package com.hgh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author hegh
 * @date 2021-05-15
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

   @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    /**
     * name:开发者姓名
     * url:开发者网址
     * email:开发者邮箱
     * @return
     */
    private ApiInfo apiInfo() {
        Contact contact = new Contact("hhh", "http://www.baidu.com", "");
        return new ApiInfoBuilder()
                //标题
                .title("测试API接口")
                //文档接口的描述
                .description("API接口的描述")
                .contact(contact)
                //版本号
                .version("1.1.0")
                .build();
    }
}
