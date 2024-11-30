/* #3 Longest substring without repeating the characters */
import java.util.*;
public class substringMain {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = longestSubstring(s);
        System.out.println("The longest substring in a string \""+ s + "\" is " + maxLength);

    }
    public static int longestSubstring(String s){
        int start = 0 , end = 0 , max_length = 0;
        ArrayList<Character> list = new ArrayList<>();
        while(end < s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length , list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}
