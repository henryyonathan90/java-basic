package my.java.basic.annotations;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class AnnotationDemo {
  public static void main(String[] args) {
    MyAnnotation myAnnotation = (MyAnnotation) AnnotatedObject.class.getAnnotations()[0];
    System.out.println(myAnnotation.field1());
    System.out.println(myAnnotation.field2());
  }
}
