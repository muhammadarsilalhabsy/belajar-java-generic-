package com.tutorial;

import com.tutorial.util.Person;

import java.util.Arrays;

public class ComparableApp {
  public static void main(String[] args) {

    Person[] people = {
            new Person("Arsil","Indonesia"),
            new Person("Abilal","Indonesia"),
            new Person("Apon","Indonesia"),
            new Person("Ajib","Indonesia")
    };

    Arrays.sort(people); // array bisa di short dengan syarat harus Person harus mengimplement interface comparable

    System.out.println(Arrays.toString(people));
  }
}
