package learn.necasdev.conditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(name = "requiredBean")
public class ConditionalOnBeanConfig {
    
    @Bean
    String beanDependent() {
        return "Dependent on required Bean.";
    }
}
