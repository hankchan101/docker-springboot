package cn.hankchan.example.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class DockerSpringbootApplication {

	@GetMapping(value = "/health", produces = "application/json;charset=UTF-8")
	public String health() {
		return "timestamp:" + new Date().getTime();
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootApplication.class, args);
	}
}
