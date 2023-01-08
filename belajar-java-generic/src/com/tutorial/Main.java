package com.tutorial;

public class Main {

  public static void main(String[] args) {


    // perbedaan generic class dengan object

    // menggunakan generic

    // integer
    Key<Integer> key = new Key<>();
    key.setKey(123);
    boolean checkType = key.getKey() instanceof Integer;
    int ambilKeyInt = key.getKey();
    System.out.println(checkType);

    // string
    Key<String> keyStr = new Key<>();
    keyStr.setKey("Saya");
    checkType = keyStr.getKey() instanceof String;
    String ambilKeyStr = keyStr.getKey();
    System.out.println(checkType);




    // tanpa generic
    Data data = new Data("Ucup");

    System.out.println(data.getData());
    String ambilStr = (String) data.getData(); // harus di konversi

    boolean check = data.getData() instanceof String;
    System.out.println(check);

    data.setData(123);
    Integer ambilInt = (Integer) data.getData(); // harus di konversi
    System.out.println(data.getData());
    check = data.getData() instanceof Integer;
    System.out.println(check);






  }

  // menggunakan generic
  public static class Key<T>{
    private T key;

    public T getKey() {
      return key;
    }

    public void setKey(T key) {
      this.key = key;
    }
  }

  // biasa
  public static class Data{
    private Object data;

    public Data(Object data) {
      this.data = data;
    }

    public Object getData() {
      return data;
    }

    public void setData(Object data) {
      this.data = data;
    }
  }
}
