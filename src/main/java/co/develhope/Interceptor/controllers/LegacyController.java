package co.develhope.Interceptor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegacyController {

    @GetMapping("/legacy")
    public String loadLegacyMessage() {
        return "This is just old code";
    }
}