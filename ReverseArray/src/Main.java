import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      int[] arr=new int[]{1,2,3,4,5};
      int left=0, right=arr.length-1,temp;
      while(left<right){
          temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
          left++;
          right--;
      }
        System.out.println(Arrays.toString(arr));
    }
}