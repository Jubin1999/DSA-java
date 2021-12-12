import java.util.HashSet;

public class recursion15 {
    public static void subsequences(String str, int idx, String newstString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstString)){
                return;
            }else{
                System.out.println(newstString);
                set.add(newstString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be
        subsequences(str, idx+1, newstString+currChar, set);

        //or not to be
        subsequences(str, idx+1, newstString, set);
    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
