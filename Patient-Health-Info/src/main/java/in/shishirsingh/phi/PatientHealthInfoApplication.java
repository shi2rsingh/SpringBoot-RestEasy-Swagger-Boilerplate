package in.shishirsingh.phi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
@EnableSwagger2
public class PatientHealthInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientHealthInfoApplication.class, args);
	}
	
	//add for swagger
    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("products")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/test.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring REST Sample with Swagger")
                .description("Spring REST Sample with Swagger")
                .termsOfServiceUrl("https://github.com/liangboyi/swagger-springboot-resteasy")
                .contact("Boyi Liang")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .version("2.0")
                .build();
    }
    //end
}
