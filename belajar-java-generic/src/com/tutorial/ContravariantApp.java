package com.tutorial;

import com.tutorial.util.MyData;

public class ContravariantApp {
  public static void main(String[] args) {

    MyData<Object> myData = new MyData<>("Saya");
    myData.setMyData(120);

    MyData<? super String> strMyData =  myData;

    process(myData);

    System.out.println(strMyData.getMyData());


  }
  private static void process(MyData<? super String> data){
    // String myData = (String) data.getMyData(); // bahaya
    Object myData = data.getMyData(); // aman



    System.out.println("process paramater " + myData);

    data.setMyData("Arsil");

  }
}
