package learn.necasdev.conditionals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
  
@SpringBootTest(classes = {ConditionalOnPropertyConfig.class})
@TestPropertySource(properties = "feature.enabled=true")
class ConditionalOnPropertyTest{

    // This is not guarenteed to exist, hence why we disable the requirement
    @Autowired(required = false)
    private String stringExistsIfBeanExists;

    @Test
    void givenPropertyExists_whenCorrectValue_thenConfigBeanExists() {
        assertNotNull(stringExistsIfBeanExists, 
            "Bean should have been loaded.");
    }
}

