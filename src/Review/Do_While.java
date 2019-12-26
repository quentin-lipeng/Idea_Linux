package Review;

import java.util.Scanner;

public class Do_While {

  public static void main(String[] args) {
    int a = 1;
    Scanner sca = new Scanner(System.in);
    int i = sca.nextInt();
    System.out.println("f");
    do{
      System.out.println("do次");

      a++;
    }while ( a<i);
  }


}
