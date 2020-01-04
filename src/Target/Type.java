package Target;

public class Type {
  public String name;
  private int age;
  int num;
  static int p;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void main(String[] args) {
    int i;
    Type p = new Type();

    p.name="Type";
    p.setAge(12);
    i= p.getAge();
    p.num = 19;
    p.p=1;

//    System.out.println("p.name = " + p.name);
//    System.out.println("i = " + i);
//    System.out.println("p.num = " + p.num);
//    System.out.println("p.p = " + p.p);

    p.Method();

  }

  public void Method(){
    int sta;
    Type t = new Type();
    t.p = 23;
    System.out.println(t.p);
  }

}



class Type1 extends Type{
  public String name1;
  private int age1;
    }
