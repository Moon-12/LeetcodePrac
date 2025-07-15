import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[] nums={1,2,3,4};

        System.out.println(Main.checkDuplicates(nums));
    }
    public static boolean checkDuplicates(int[] nums){
        Set<Integer> seen=new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}