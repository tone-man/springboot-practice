package learn.necasdev.conditionals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Tests Class Path Conditional
 */
@SpringBootTest(classes = {ConditionalOnClassConfig.class})
class ConditionalOnClassTest {

    // This is not guarenteed to exist, hence why we disable the requirement
    @Autowired(required = false)
    private String stringExistsIfClassExists;

    @Test
    void givenClassImported_thenBeanExists() {
        assertNotNull(stringExistsIfClassExists, 
            "Bean should have been loaded.");
    }
}