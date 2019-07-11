package me.whiteship.springbootgettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGettingStartedApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(SpringBootGettingStartedApplication.class);
    application.run(args);
  }

}
