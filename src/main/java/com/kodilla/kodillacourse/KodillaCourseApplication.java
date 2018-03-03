package com.kodilla.kodillacourse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
class KalkulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatorApplication.class, args);

		Calculator calculator = new Calculator();
		int sum = calculator.plus(2,2);
		System.out.println(sum);
		int minus = calculator.minus(2,2);
		System.out.println(minus);

	}

}