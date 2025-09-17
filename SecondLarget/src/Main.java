public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 35, 1, 10, 34, 1};
        int largest=-1,sLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];

            }
        }
        System.out.println(sLargest);
    }
}