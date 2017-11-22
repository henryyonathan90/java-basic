package my.java.basic.generics;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class GenericDemo {
  public static void main(String[] args) {
    NonGenericBox nonGenericBox = new NonGenericBox();
    nonGenericBox.content = new Apple();
    nonGenericBox.content.doSomethingToApple();

//    nonGenericBox.content = new Orange();
//    nonGenericBox.content.doSomethingToOrange();
//
//    UnknownBox unknownBox = new UnknownBox();
//    unknownBox.content = new Orange();
//    unknownBox.content.doSomethingToOrange();
//    ((Orange) unknownBox.content).doSomethingToOrange();

//    GenericBox<Orange> genericBox = new GenericBox<>();
//    genericBox.content = new Orange();
//    genericBox.content.doSomethingToOrange();
//
//    GenericBox<Apple> genericBox2 = new GenericBox<>();
//    genericBox2.content = new Apple();
//    genericBox2.content.doSomethingToApple();
  }
}
