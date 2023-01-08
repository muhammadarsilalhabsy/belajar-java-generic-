package com.tutorial.util;

public class Animal {

  private String name;
  private int legs;

  public Animal(String name, int legs) {
    this.name = name;
    this.legs = legs;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "name='" + name + '\'' +
            ", legs=" + legs +
            '}';
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }
}
