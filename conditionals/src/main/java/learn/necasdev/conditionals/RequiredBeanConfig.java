package learn.necasdev.conditionals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Simple Bean configuration
 */
@Configuration
public class RequiredBeanConfig {
    
    @Bean
    @SuppressWarnings("unused")
    String requiredBean() {
        return "Conditional Bean Exists";
    }
}
