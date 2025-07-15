import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Main.twoSum(new int[]{5,5},10)));
    }
    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indices=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(indices.containsKey(target-nums[i])){
                return new int[]{indices.get(target-nums[i]),i};
            }
            else{
                indices.put(nums[i],i);
            }
        }
        return  new int[]{};
    }
}