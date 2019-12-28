package Inherit;

public class Person {
   private String name;
   private int age;
   private String sex;
   public void move() {
      System.out.println("父类中的move方法");
   }
   class Test extends Person {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}

