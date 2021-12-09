public class strings02 {
    public static void main(String args[]){
        String firstName = "Jubin";
        String lastName = "Deori";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
          
        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
