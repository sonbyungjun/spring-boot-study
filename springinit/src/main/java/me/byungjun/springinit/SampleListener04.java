package me.byungjun.springinit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SampleListener04 implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("bar: " + args.containsOption("bar"));
    System.out.println("foo: " + args.containsOption("foo"));
  }

}
