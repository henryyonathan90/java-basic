package my.java.basic.exceptionHandling.practice;

/**
 * Created by henry.jonathan on 11/22/2017
 */
public class Practice {
  public static void main(String[] args) throws CheckedException {
    //Create two type of exception, checked and unchecked
    //Create 2 static method in this class, one will throw checked exception
    // , one will throw unchecked exception
    //Modify the main method so it will not have compile error
    //Catch the unchecked exception in main method, and print the object
    try {
      throwUncheckedException();
    } catch (UncheckedException ex) {
      System.out.println(ex);
    }

    throwCheckedException();
  }

  public static void throwUncheckedException() {
    throw new UncheckedException();
  }

  public static void throwCheckedException() throws CheckedException {
    throw new CheckedException();
  }
}
