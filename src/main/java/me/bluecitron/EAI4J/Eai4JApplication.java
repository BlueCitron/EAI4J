package me.bluecitron.EAI4J;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@MapperScan(basePackages = "me.bluecitron.EAI4J.mapper")
@SpringBootApplication
public class Eai4JApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eai4JApplication.class, args);
	}

}
