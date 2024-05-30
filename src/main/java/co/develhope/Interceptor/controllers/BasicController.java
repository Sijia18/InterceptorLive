package co.develhope.Interceptor.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String loadCurrentTime() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/reverse")
    public ResponseEntity<String> reverseString(@RequestParam String string) {
        if (string.startsWith("0")) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(string);
    }
}