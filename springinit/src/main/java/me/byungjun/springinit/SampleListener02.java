package me.byungjun.springinit;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener02 implements ApplicationListener<ApplicationStartedEvent> {

  @Override
  public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
    System.out.println("=======================");
    System.out.println("started");
    System.out.println("=======================");
  }
}
