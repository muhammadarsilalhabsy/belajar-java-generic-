package com.tutorial.application;

import com.tutorial.util.Pair;

public class PairApp {
  public static void main(String[] args) {

    Pair<String, Integer> pair = new Pair<>("Arsil",21);
    System.out.println(pair.getSecond());
    System.out.println(pair.getFirst());

    Pair<String, String> stringPair = new Pair<>("dia", "kamu");
    System.out.println(stringPair.getFirst());
    System.out.println(stringPair.getSecond());

  }
}
