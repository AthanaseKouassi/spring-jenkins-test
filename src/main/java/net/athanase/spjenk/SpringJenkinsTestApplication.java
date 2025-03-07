package net.athanase.spjenk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsTestApplication.class, args);
        System.out.println("Hello World!");
    }

}
