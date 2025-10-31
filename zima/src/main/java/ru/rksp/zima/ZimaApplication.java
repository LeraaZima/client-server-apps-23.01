package ru.rksp.zima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "ru.rksp.zima")
public class ZimaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZimaApplication.class, args);
	}

}
