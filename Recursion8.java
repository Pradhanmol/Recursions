//Print all unique subsequences of string?
import java.util.*;
public class Recursion8{
    public static void Subsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        
        //toBe
        Subsequences(str, idx+1, newString+currChar, set); 
        //notTOBe
        Subsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        Subsequences(str,0,"",set);
        
    }
}