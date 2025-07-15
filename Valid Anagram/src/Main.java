import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println( Main.isAnagram("eat","taa"));
    }
    public static  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>tCount=new HashMap<>();
        HashMap<Character,Integer>sCount=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            sCount.put(sChar,sCount.getOrDefault(sChar,0)+1);
            tCount.put(tChar,tCount.getOrDefault(tChar,0)+1);
        }
        System.out.println(sCount);
        System.out.println(tCount);

        return tCount.equals(sCount);

    }
}