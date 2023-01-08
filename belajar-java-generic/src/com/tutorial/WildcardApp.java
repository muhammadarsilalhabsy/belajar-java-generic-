package com.tutorial;

import com.tutorial.util.MyData;

public class WildcardApp {
  public static void main(String[] args) {

    printData(new MyData<Integer>(19));
    printData(new MyData<String>("Hallu"));
    printData(new MyData<String>("Hallu"));
    printData(new MyData<MultipleBoundedTypeParameterApp.Manager>(new MultipleBoundedTypeParameterApp.Manager()));


    testBeda(new MyData<Integer>(19));
    testBeda(new MyData<String>("Hallu"));
    testBeda(new MyData<String>("Hallu"));


  }

  private static void testBeda(MyData<? extends Object> o){
    System.out.println(o.getMyData());

  }
  private static void printData(MyData<?> o){
    // Object data = o;
    // String data = (String) o; // jangan coba coba dikonversi ke tipe data lain, karena bahaya

    System.out.println(o.getMyData());
  }
}
