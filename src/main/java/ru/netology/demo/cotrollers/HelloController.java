package ru.netology.demo.cotrollers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties("adresat.name")
public class HelloController {
    private String firstName;
    private String lastName;

    public void setFirst(String name) {
        this.firstName = name;
    }

    public void setLast(String name) {
        this.lastName = name;
    }

    @GetMapping("/")
    private String adresat () {
        StringBuilder name = new StringBuilder();
        name.append(this.firstName).append(" ").append(this.lastName);
        return String.format("hello, %s!", name);
    }
}
