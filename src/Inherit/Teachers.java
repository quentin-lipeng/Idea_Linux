package Inherit;

public class Teachers extends Person {
  double sal;

  public static void main(String[] args) {
    Teachers t = new Teachers("Li",21,"male");
    System.out.println(t.getName());


  }
  public Teachers (String name, int age, String sex) {
    super();
    int age1 = super.getAge();
    System.out.println(age1);
    this.getName();
    this.getName();
  }

}
