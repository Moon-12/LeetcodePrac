import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"}));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> grouping=new HashMap<>();
        for(String str:strs){
            int[]count=new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            String key=Arrays.toString(count);

            grouping.putIfAbsent(key,new ArrayList<>());
            grouping.get(key).add(str);
        }
        return new ArrayList<>(grouping.values());
    }
}