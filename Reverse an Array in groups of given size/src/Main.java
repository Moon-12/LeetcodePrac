import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[]{5,6,8,9};
        int n=arr.length,k=5;
        for(int i=0;i<n;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}