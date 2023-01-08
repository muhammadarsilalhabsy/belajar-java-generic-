package com.tutorial;

public class BoundedTypeParameterApp {
  public static void main(String[] args) {

    // hanya bisa memakses turunan dari class Number
    DataNumber<Integer> integerDataNumber = new DataNumber<>(12);
    DataNumber<Long> longDataNumber = new DataNumber<>(12L);

    // tidak bisa diturunkan selain dari turunan kelas Number
    // DataNumber<String> stringDataNumber = new DataNumber<String>("saya"); ERROR



  }

  // default dari boundedtype parameter adalah object
  // <T extends Object>
  public static class DataNumber<T extends Number>{
    private T data;

    public DataNumber(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    // kelebihan menggunakan bounded type parameter adalah kita bisa membacasi scope
    // data turunannya
    public void setData(T data) {
      this.data = data;
      // disiini kita bida mengakases method dari number
      // this.data.doubleValue();
    }
  }
}
