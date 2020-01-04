package Process;

import java.util.Scanner;

public class Scan {

  public static void main(String[] args) {
    int[] a = new int[] {98,99,67,65,89,78,56};
    Scanner sca = new Scanner(System.in);
    System.out.println("输入一个整数");
    int x = sca.nextInt();
    int index = -1;
    for (int i=0; i<a.length; ++i) {
      if (a[i] ==x) {
        index =i;
        break;
      }
    }
    if (-1 ==index) {
      System.out.println("not found");
    }else{
      System.out.println(x + "在数组中序号是"+ index);
    }
  }

}
