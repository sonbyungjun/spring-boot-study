package me.byungjun.webservershowcase.springbootwebserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  @GetMapping("/hello")
  public String hello() {
    return "hello Spring";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  // http 요청도 받을수 있다.
  
//  @Bean
//  public ServletWebServerFactory serverFactory() {
//    TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//    tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//    return tomcat;
//  }
//
//  private Connector createStandardConnector() {
//    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//    connector.setPort(8080);
//    return connector;
//  }



}
