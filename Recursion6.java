public class Recursion6{
    public static boolean map[] = new boolean[26];
    public static void removeDuplicateChar(String str, int idx, String newString ) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar =  str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicateChar(str, idx+1, newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicateChar(str,idx+1,newString);
        }
        
    }
    public static void main(String[] args) {
        String str = "aaaabbbccdd";
        removeDuplicateChar(str,0,"");
    }
}