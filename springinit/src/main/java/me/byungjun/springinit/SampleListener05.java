package me.byungjun.springinit;

import java.util.Arrays;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SampleListener05 implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    Arrays.stream(args).forEach(System.out::println);
  }

}
