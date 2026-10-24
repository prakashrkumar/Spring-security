package prakash.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @GetMapping
    public ResponseEntity<String> getStudent() {
        return ResponseEntity.ok("Student fetched successfully");
    }
    @PostMapping
    public ResponseEntity<String> createStudent() {
        return ResponseEntity.ok("Student create successfully");
    }
    @PutMapping
    public ResponseEntity<String> updateStudent() {
        return ResponseEntity.ok("Student update successfully");
    }
    @DeleteMapping
    public ResponseEntity<String> deleteStudent() {
        return ResponseEntity.ok("Student delete successfully");
    }
    @GetMapping("/csrf")
    public CsrfToken getToken(CsrfToken csrfToken){
        return csrfToken;
    }
}
