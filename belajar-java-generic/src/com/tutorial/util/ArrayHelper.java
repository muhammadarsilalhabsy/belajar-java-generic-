package com.tutorial.util;

public class ArrayHelper {

  // sebelum type return value value bisa ditambahakan generic
  // public static ... retrun value namaMetod (... param){}
  public static <T> int count(T[] array){
    return array.length;
  }

  public static int countArray(Object[] array){
    return array.length;
  }
}
