package Inherit;

public class Students extends Person {
  private String name;
  private double score;
  public Students(String name) {
    this.name = name;
    super.getName();
  }
  public void move() {
    System.out.println("子类的move方法");
  }
  public void test() {}


}
