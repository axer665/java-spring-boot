package ru.netology.demo.cotrollers;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.demo.SystemProfile;

@RestController
public class ProfileController {
    private SystemProfile profile;


    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("/profile")
    public String getProfile() {
        return profile.getProfile();
    }
}