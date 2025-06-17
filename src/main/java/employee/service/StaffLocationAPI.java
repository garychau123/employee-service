package employee.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StaffLocationAPI {
    @GetMapping("/staff-details/{firstname}")
    public ResponseEntity<List<StaffDetails>> getStaffDetails(@PathVariable String firstname) {
        // Placeholder return to fix the method
        return ResponseEntity.ok(new ArrayList<>());
    }
}

