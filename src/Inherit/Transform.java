package Inherit;

public class Transform {

  public static void main(String[] args) {
    down();
  }

  public static void down() {
    Students s = new Students("Trans down");
    Person p = (Person)s;
  }
  public void up() {
   Person s = new Students("Trans up");
   Students p =(Students)s;
  }

}
