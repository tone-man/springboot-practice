package learn.necasdev.conditionals;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Test Bean Exists Conditional
 */
@SpringBootTest(classes = {ConditionalOnBeanConfig.class, RequiredBeanConfig.class})
class BeanExistsConditional {

    // This is not guarenteed to exist, hence why we disable the requirement
    @Autowired(required = false)
    private String stringExistsIfBeanExists;

    @Test
    void givenBeanExists_thenConfigBeanExists() {
        assertNotNull(stringExistsIfBeanExists, 
            "Bean should have been loaded.");
    }
}

/*
 * Test Bean Exists, shows correct behavior 
 * when bean ommitted
 */
@SpringBootTest(classes = {ConditionalOnBeanConfig.class})
class BeanExistsConditionalWithoutBean {

    // This is not guarenteed to exist, hence why we disable the requirement
    @Autowired(required = false)
    private String stringExistsIfBeanExists;

    @Test
    void givenBeanNotExists_thenConfigBeanNotExists() {
        assertNull(stringExistsIfBeanExists, 
            "Bean should not have been loaded.");
    }
}
