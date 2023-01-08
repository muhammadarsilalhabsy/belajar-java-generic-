package com.tutorial.application;

import com.tutorial.util.MyData;

public class GenericClassApp {

  public static void main(String[] args) {
    MyData<String> stringMyData = new MyData<>("Arsil");
    MyData<Integer> integerMyData = new MyData<>(21);

    String name = stringMyData.getMyData();
    Integer age = integerMyData.getMyData();

    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
  }
}
