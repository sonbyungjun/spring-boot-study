package me.byungjun.demospringhateoas;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

  @GetMapping("/hello")
  public Resource<Hello> hello() {
    Hello hello = new Hello();
    hello.setPrefix("Hey,");
    hello.setName("byungjun");

    Resource<Hello> helloResource = new Resource<>(hello);
    helloResource.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());

    return helloResource;
  }


}
