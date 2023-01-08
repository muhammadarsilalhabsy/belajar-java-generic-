package com.tutorial;

import com.tutorial.util.MyData;

public class CovarinatApp {
  public static void main(String[] args) {

    MyData<String> myData = new MyData<>("Arsil");
    process(myData);

    MyData<? extends Object> objMyData = myData;
    System.out.println(objMyData.getMyData());





  }
  public static void process(MyData<? extends Object> o){
    // read only
    System.out.println(o.getMyData());

    // tidak bisa set data
    // o.setMyData(1);
  }
}
