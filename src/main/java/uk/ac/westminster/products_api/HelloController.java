package uk.ac.westminster.products_api;
import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
    @GetMapping("/status")
    public String status() {
        return "API running - " + LocalDate.now().toString();
    }
    @GetMapping("/goodbye")
    public String goodbye() {
        return "goodbye!";
    }
    
}
