public class Recursion7{
    public static void Subsequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        
        //toBe
        Subsequences(str, idx+1, newString+currChar); 
        //notTOBe
        Subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "dcba";
        Subsequences(str,0,"");
        
    }
}