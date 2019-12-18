package spring.basic.HelloSpringAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.basic.HelloSpringAnnotation.lang.Language;
import spring.basic.HelloSpringAnnotation.lang.impl.Vietnamese;

@Configuration
@ComponentScan({"spring.basic.HelloSpringAnnotation.bean"})
public class AppConfiguration {

    @Bean(name="language")
    public Language getLanguage() {
        return new Vietnamese();
    }
}
