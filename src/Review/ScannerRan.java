package Review;
import java.util.Scanner;

public class ScannerRan {

  public static void main(String[] args) {
    Dowhile();
  }

  static void Dowhile() {
    int num = (int)(Math.random()*100);
    int n = 0;
    int guess =-1;
    Scanner sca = new Scanner(System.in);
    do{
      System.out.println("你有"+(10-n)+"次"+"输入0-100之间的数");
      guess = sca.nextInt();
      if(guess>num){
        System.out.println("大了");
      }else if (guess<num) {
        System.out.println("小了");
      }else {
        System.out.println("猜对了");
        break;
      }
      n++;
    }while(n<10);
    if(n==10) {
      System.out.println("机会用完了");
    }


  }

}
