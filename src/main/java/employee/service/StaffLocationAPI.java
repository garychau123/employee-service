package employee.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StaffLocationAPI {
    @GetMapping("/staff-details/{firstName}")
    public ResponseEntity<List<StaffDetails>> getStaffDetails(@PathVariable String firstName) {
        String url = "http://localhost:8080/staff-details/" + firstName;
        return ResponseEntity.ok(new ArrayList<>());
    }
}

