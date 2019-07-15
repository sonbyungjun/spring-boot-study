package me.byungjun.springinit2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

//  @Value("${byungjun.fullName}")
//  private String name;
//
//  @Value("${byungjun.age}")
//  private int age;

  private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

  @Autowired
  ByungjunProperties byungjunProperties;

  @Autowired
  private String hello;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    logger.debug("============================");
    logger.debug(byungjunProperties.getName());
//    System.out.println(byungjunProperties.getAge());
//    System.out.println(byungjunProperties.getSessionTimeout());
    logger.debug(hello);
    logger.debug(byungjunProperties.getFullName());
    logger.debug("============================");
  }
}
