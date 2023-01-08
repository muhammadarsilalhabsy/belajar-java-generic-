package com.tutorial;

import com.tutorial.util.MyData;

public class InvariantApp {
  public static void main(String[] args) {

    // java generic secara default adalah invairant

    // object biasa
    String data = "saya";
    Object saya = data;

    Object data2 = "kamu";
    String kamu = (String) data2;

    Object intData = 123;
    Integer iniData = (Integer) intData;

    // menggunakan generic
    MyData<String> myData =  new MyData<>("Haha");
    // MyData<Object> objectMyData = myData; //ERROR
    // MyData<Object> myDataObj = new MyData<>(myData); BISA, TAPI NDA TAU BEMANA
//    System.out.println(myDataObj.getMyData());

    // doIt(myData);// ERROR
  }

  // method invariant
  public static void doIt(MyData<Object> o){
    // gas
  }
}
