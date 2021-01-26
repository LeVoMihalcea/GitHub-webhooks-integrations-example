package leo.pi.githubwebhooks.rest;

import leo.pi.githubwebhooks.model.Health;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;

@RestController
@RequestMapping(path = "v1/health")
public class HealthController {

    @Autowired
    private Random random;

    @GetMapping
    public Health getHealthCheck(){
        return new Health(random.nextInt(100) + 50, LocalDateTime.now());
    }
}
