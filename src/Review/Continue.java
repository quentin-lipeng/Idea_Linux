package Review;

public class Continue {

  public static void main(String[] args) {
    for (int i=0;i<10;i++) {
      System.out.println("i"+"\t"+ i);
      if (i ==3) {
        continue;//跳过此次循环
      }
      System.out.println("con后");
    }
  }

}
