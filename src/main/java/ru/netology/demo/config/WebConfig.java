package ru.netology.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.demo.DevProfile;
import ru.netology.demo.SystemProfile;
import ru.netology.demo.ProductionProfile;

@Configuration
public class WebConfig {

    @Bean
    @ConditionalOnProperty(
            prefix="netology.profile",
            name="dev",
            havingValue="true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(
            prefix="netology.profile",
            name="dev",
            havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
