package Target;

public class Construct {
  int x;
  int y;
  public Construct(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public Construct(int x) {
    this(x,x);
  }
  public double distance(Construct other) {
    return 0;
  }

}
