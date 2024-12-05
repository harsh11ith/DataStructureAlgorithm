import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseVowel {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int l = 0 , r = str.length-1;
        
        while(l < r){
            if(isVowel(str[l]) && isVowel(str[r])){
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
                l++;
                r--;
            }else if(!isVowel(str[l])){
                l++;
            }else{
                r--;
            }
        }
        return new String(str);
    }
    public boolean isVowel(char y){
        List<Character> list = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        return list.contains(y);
    }
    public static void main(String[] args) {
        reverseVowel obj = new reverseVowel();
        String s = "IceCreAm";
        String result = obj.reverseVowels(s);
        System.out.println("The reversed vowels is: "+ result);
        
    }
}
