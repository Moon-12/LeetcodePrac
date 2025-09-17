public class Main {
    public static void main(String[] args) {


        int[] arr = new int[]{19, -10, 20, 14, 2, 16, 10};
        int large=Integer.MIN_VALUE,sLarge=Integer.MIN_VALUE,tLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                tLarge=sLarge;
                sLarge=large;
                large=arr[i];
            }else if(arr[i]>sLarge){
                tLarge=sLarge;
                sLarge=arr[i];
            }
            else if(arr[i]>tLarge){
                tLarge=arr[i];
            }
        }
        System.out.println(tLarge);
    }
}