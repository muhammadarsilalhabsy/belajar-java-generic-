package com.tutorial.util;

public class MyData<T> {
  private T myData;

  public MyData(T myData) {
    this.myData = myData;
  }

  public T getMyData() {
    return myData;
  }

  public void setMyData(T myData) {
    this.myData = myData;
  }
}
