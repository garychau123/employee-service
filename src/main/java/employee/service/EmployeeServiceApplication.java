package employee.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class EmployeeServiceApplication {
    @RequestMapping("/")
    String home(){
        return "hi";
    }

    @GetMapping("/employees/{firstName}")
    public List<Employee> getFirstName(@PathVariable String firstName){
        Employee[] employees = {
                new Employee("1100", "James", "Smith", "1970-01-05",
                        "8 Mile End Road, Carnegie, VIC 3163", "Star Office, Level 3, Desk 10",
                        "03 9476-4512", "Business Manager", 123000,
                        "0628329"),

                new Employee("2150", "James", "Vesto", "1985-11-23",
                    "8 Mile End Road, Carnegie, VIC 3163", "Freedom Office, Level 11, Desk 25",
                    "03 9476-8356", "Programmer", 87000,
                    "2963492")
        };
        List <Employee> matchFoundArray= new ArrayList<>();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstName().equalsIgnoreCase(firstName)) {
                matchFoundArray.add(employees[i]);
            }
        }
        return matchFoundArray;
    }


    public static void main(String[] args) {
        SpringApplication.run(EmployeeServiceApplication.class, args);
    }
}
