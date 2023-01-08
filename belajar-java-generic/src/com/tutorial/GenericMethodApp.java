package com.tutorial;

import com.tutorial.util.ArrayHelper;

public class GenericMethodApp {
  public static void main(String[] args) {

    String[] arrayString = {"Muhammad","Arsil","Alhabsy"};
    Integer[] arrayInteger = {2,9,1,19,21};

    System.out.println(ArrayHelper.count(arrayString));
    System.out.println(ArrayHelper.count(arrayInteger));
    Integer data = ArrayHelper.count(arrayInteger);

    System.out.println(ArrayHelper.countArray(arrayString));
    System.out.println(ArrayHelper.countArray(arrayInteger));


  }
}
