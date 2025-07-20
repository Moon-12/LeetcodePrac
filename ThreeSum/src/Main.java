import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.hasTripletSum(new int[]{40, 20, 10, 3, 6, 7},24));

    }
    public static boolean hasTripletSum(int[] arr, int target) {
      Arrays.sort(arr);
      int n=arr.length;
      for(int i=0;i<n-2;i++) {

          int l=i+1,h=n-1;
          int requiredSum=target-arr[i];
          while (l < h) {

              if ( arr[l] + arr[h] == requiredSum) {
                  return true;
              }
              if ( arr[l] + arr[h]< requiredSum) {
                  l++;

              } else {
                  h--;
              }
          }
      }
    return false;
    }
}