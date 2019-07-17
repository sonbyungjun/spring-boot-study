package me.byungjun.springbootmongodb;

import me.byungjun.springbootmongodb.account.Account;
import me.byungjun.springbootmongodb.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringbootmongodbApplication {

  @Autowired
  AccountRepository accountRepository;

  public static void main(String[] args) {
    SpringApplication.run(SpringbootmongodbApplication.class, args);
  }

  @Bean
  public ApplicationRunner applicationRunner() {
    return args -> {
      Account account = new Account();
      account.setEmail("saint2030@naver.com");
      account.setUsername("byungjun");
      accountRepository.insert(account);

      System.out.println("finished");
    };
  }

}
