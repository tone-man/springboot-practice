package learn.necasdev.simple_application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Class that deals with security
 */
@Configuration
@EnableWebSecurity 
public class SecurityConfig {

    /**
     * Builder pattern to filter all traffic, in this case it is
     * allowying all traffic.
     * 
     * @param http
     * @return
     * @throws Exception
     */
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(expressionInterceptUrlRegistry -> expressionInterceptUrlRegistry
                .anyRequest()
                .permitAll()).csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }
}