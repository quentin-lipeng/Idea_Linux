package Inherit;

import org.omg.CORBA.PERSIST_STORE;

public class Demo1 {

  public static void main(String[] args) {
    Students tom = new Students("li");
    tom.setName("Demo1");
    System.out.println(tom.getName());
    Person p = tom;
    p.setName("p");
    System.out.println(p.getName());
  }

}
