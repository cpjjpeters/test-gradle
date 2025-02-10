package ipeters.gradle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ipeters.gradle")
public class ReviewServiceApplication {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}