public class recursion14 {
    public static void subsequences(String str, int idx, String newstString){
        if(idx == str.length()){
            System.out.println(newstString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be
        subsequences(str, idx+1, newstString+currChar);

        //or not to be
        subsequences(str, idx+1, newstString);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str, 0, "");
    }
}
