package Target;

import java.lang.annotation.Target;

public class Ja {
  private double a;
  private double b;

  public static void main(String[] args) {
    Ja p = new Ja();
    p.add(1,2);

  }
  public double add(int a,int b) {
    this.a= a;
    this.b=b;
    return a+b;
  }

  public double add (double a,double b) {
    this.a = a;
    this.b = b;
    return a+b;
  }
}


