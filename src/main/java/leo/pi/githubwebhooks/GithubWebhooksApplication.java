package leo.pi.githubwebhooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class GithubWebhooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubWebhooksApplication.class, args);
	}
}
