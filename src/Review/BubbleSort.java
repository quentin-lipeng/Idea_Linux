package Review;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    //int[] arr = new int[3];
    int[] arr = {2,3,5,1};
   bubble(arr);

  }
  static void bubble(int[] arr){
    int temp;
    for (int i=0;i<arr.length;++i) {
      for (int j=0; j<arr.length-i-1;++j){
        if (arr[j]>arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

        }

      }
    }
    System.out.println(Arrays.toString(arr));
  }

}
