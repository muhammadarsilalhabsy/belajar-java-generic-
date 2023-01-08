package com.tutorial.util;

public class Person implements Comparable<Person>{
  private String name;
  private String address;

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
  }

  @Override
  public int compareTo(Person name){
    return this.name.compareTo(name.getName());
  }

  public Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
