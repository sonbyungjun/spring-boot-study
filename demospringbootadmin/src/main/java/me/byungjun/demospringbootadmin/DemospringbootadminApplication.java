package me.byungjun.demospringbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DemospringbootadminApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemospringbootadminApplication.class, args);
  }

}
