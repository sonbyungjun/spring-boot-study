package me.byungjun.springbootmvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {

//  @Autowired
//  MockMvc mockMvc;

//  @Test
//  public void hello() throws Exception {
//    // 요청 "/"
//    // 응답
//    // - 모델 name : byungjun
//    // - 뷰 이름 : hello
//
//    mockMvc.perform(get("/hello"))
//        .andExpect(status().isOk())
//        .andDo(print())
//        .andExpect(view().name("hello"))
//        .andExpect(model().attribute("name", is("byungjun")))
//        .andExpect(content().string(containsString("byungjun")));
//  }

  @Autowired
  WebClient webClient;

  @Test
  public void hello() throws Exception {
    HtmlPage page = webClient.getPage("/hello");
    HtmlHeading1 h1 = page.getFirstByXPath("//h1");
    assertThat(h1.getTextContent()).isEqualToIgnoringCase("byungjun");
  }

}