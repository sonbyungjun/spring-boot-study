package me.byungjun.springinit;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

//@Component
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {

  @Override
  public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
    System.out.println("=======================");
    System.out.println("Application is starting");
    System.out.println("=======================");
  }

}
