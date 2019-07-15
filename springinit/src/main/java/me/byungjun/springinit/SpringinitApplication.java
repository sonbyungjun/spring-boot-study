package me.byungjun.springinit;

import java.io.PrintStream;
import org.springframework.boot.Banner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringinitApplication {

  public static void main(String[] args) {
//    SpringApplication app = new SpringApplication(SpringinitApplication.class);
////    app.setBannerMode(Mode.OFF);
//    app.setBanner((Environment environment, Class<?> sourceClass, PrintStream out) -> {
//        out.println("===========================");
//        out.println("byungjun");
//        out.println("===========================");
//    });
//    app.run(args);
//    new SpringApplicationBuilder()
//        .sources(SpringinitApplication.class)
//        .run(args);

    SpringApplication app = new SpringApplication(SpringinitApplication.class);
//    app.addListeners(new SampleListener());
    app.setWebApplicationType(WebApplicationType.NONE);
    app.run(args);

  }

}
