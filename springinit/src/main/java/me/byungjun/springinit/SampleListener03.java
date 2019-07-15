package me.byungjun.springinit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleListener03{

  public SampleListener03(ApplicationArguments arguments) {
    System.out.println("bar: " + arguments.containsOption("bar"));
    System.out.println("foo: " + arguments.containsOption("foo"));
  }

}
