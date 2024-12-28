package learn.necasdev.simple_application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Basic Controller that deals with sending web pages
 */
@Controller 
public class SimpleController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("appName", appName);

        return "home";
    }
}