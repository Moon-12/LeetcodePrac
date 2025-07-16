import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Main.topKFrequent(new int[]{7,7,9,9,9,8},2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>eleCountMap=new HashMap<>();
        List<Integer> []freq=new List[nums.length+1];
        for(int num:nums){
            eleCountMap.put(num,eleCountMap.getOrDefault(num,0)+1);
        }
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer>entry:eleCountMap.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result=new int[k];
        int index=0;
       for(int i=freq.length-1;i>0 && index<k;i--){
           for(int num:freq[i]){
               result[index++]=num;
               if(index==k){
                   return  result;
               }
           }

       }
       return result;

    }
}