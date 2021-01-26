package leo.pi.githubwebhooks.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    @Bean
    public Random random(){
        return new Random();
    }
}
