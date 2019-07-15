package me.byungjun.springtestdemo.sample;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//@JsonTest
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

  @Rule
  public OutputCapture outputCapture = new OutputCapture();

  @Autowired
  MockMvc mockMvc;

//  @Autowired
//  TestRestTemplate testRestTemplate;

//  @Autowired
//  WebTestClient webTestClient;
//
//  @MockBean
//  SampleService mockSampleService;

//  @Autowired
//  JacksonTester<SampleController> jacksonTester;

  @MockBean
  SampleService mockSampleService;


  @Test
  public void hello() throws Exception{
//    mockMvc.perform(get("/hello"))
//        .andExpect(status().isOk())
//        .andExpect(content().string("hello byungjun"))
//        .andDo(print());
    when(mockSampleService.getName()).thenReturn("byungjun");
//    String result = testRestTemplate.getForObject("/hello", String.class);
//    assertThat(result).isEqualTo("hello byungjun");

//    webTestClient.get().uri("/hello").exchange().expectStatus().isOk()
//        .expectBody(String.class).isEqualTo("hello byungjun");

    mockMvc.perform(get("/hello"))
        .andExpect(content().string("hello byungjun"));

    assertThat(outputCapture.toString()).contains("holoman").contains("skip");
  }
}