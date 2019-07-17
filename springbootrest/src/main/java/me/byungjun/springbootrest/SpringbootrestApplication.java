package me.byungjun.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientCodecCustomizer;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient.Builder;

@SpringBootApplication
public class SpringbootrestApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootrestApplication.class, args);
  }

  @Bean
  public WebClientCustomizer webClientCodecCustomizer() {
    return webClientBuilder -> webClientBuilder.baseUrl("http://localhost:8080");
  }

  @Bean
  public RestTemplateCustomizer restTemplateCustomizer() {
    return restTemplate -> restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory())
  }

}
