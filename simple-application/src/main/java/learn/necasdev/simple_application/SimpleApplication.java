package learn.necasdev.simple_application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}

    @Controller
    private class SimpleController {

        @Value("${spring.application.name}")
        String appName;

        @GetMapping("/")
        public String getHomePage(Model model) {
            model.addAttribute("appName", appName);

            return "home";
        }
    }

}
