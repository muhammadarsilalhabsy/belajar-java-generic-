package com.tutorial;

import com.tutorial.util.Animal;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
  public static void main(String[] args) {

    Animal[] animals = {
            new Animal("chicken",4),
            new Animal("cow",4),
            new Animal("cobra",0),
            new Animal("cat",4),
    };

    Comparator<Animal> animalComparator = new Comparator<Animal>() {
      @Override
      public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
      }
    };

    Arrays.sort(animals, animalComparator);
    System.out.println(Arrays.toString(animals));
  }
}
