package employee.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EmployeeServiceApplication {

    @RequestMapping("/")
    String home(){
        return "hi";
    }

    @GetMapping("/employees/{firstName}")
    public String getFirstName(@PathVariable String firstName){
        return "Name is: " + firstName;
    }


    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }
}
