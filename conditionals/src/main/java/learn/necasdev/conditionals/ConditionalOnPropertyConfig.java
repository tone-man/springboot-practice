package learn.necasdev.conditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "feature.enabled",havingValue="true")
public class ConditionalOnPropertyConfig {
    
    @Bean
    String popertyDependent() {
        return "Feature is enabled";
    } 
}
