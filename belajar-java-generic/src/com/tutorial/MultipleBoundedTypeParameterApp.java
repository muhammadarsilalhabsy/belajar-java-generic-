package com.tutorial;

public class MultipleBoundedTypeParameterApp {

  public static void main(String[] args) {

    // Data<Manager> manager1 = new Data<>(new Manager()); Error karena tidak mengimplement can say hallo
    Data<VicePresident> vp1 = new Data<>(new VicePresident());

    // Data<Human> human = new Data<Human>(new Human());
    // walaupun mengimplement class tetap akan error apabila bukan turunan dari Employee

    // kesimpulannya, semua bounded typenya harus terpenuhi baikitu Class maupun Interfacenya

    System.out.println(vp1.getData());


  }

  // multiple bounded type parameter
  public static class Data<T extends Employee & CanSayHallo>{
    private T data;

    public Data(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }
  }

  public static interface CanSayHallo{
    void sayHallo(String name);
  }
  public static abstract class Employee{}
  public static class Manager extends Employee{}
  public static class VicePresident extends Employee implements CanSayHallo{

    @Override
    public void sayHallo(String name){
      System.out.println("hallo " + name);
    }
  }

  public static class Human implements CanSayHallo{
    @Override
    public void sayHallo(String name) {
      System.out.println(name);
    }
  }

}
