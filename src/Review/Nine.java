package Review;

public class Nine {

  public static void main(String[] args) {
    nine();

  }
  static void nine(){
    for (int i=1;i<=9;i++) {
      for (int j=1;j<=i;j++) {
        System.out.print(j+"*"+i+"="+(i*j)+"\t");
      }
      newLine();
    }
  }
  static void newLine(){
    System.out.println();
  }

}
