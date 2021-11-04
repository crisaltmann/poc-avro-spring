package br.com.crisaltmann.springpocavro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }

}
