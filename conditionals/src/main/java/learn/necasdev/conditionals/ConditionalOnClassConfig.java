package learn.necasdev.conditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "learn.necasdev.conditionals.RequiredClass")
public class ConditionalOnClassConfig {
    
    @Bean
    @SuppressWarnings("unused")
    String conditionalClassBean() {
        return "Class Conditional Bean Configured!";
    }
}
