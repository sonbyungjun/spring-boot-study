package me.byungjun.demospringhateoas;

public class Hello {

  private String prefix;
  private String name;

  @Override
  public String toString() {
    return prefix + " " + name;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
