import java.util.Scanner;

public class conditionsex {
    public static void main(String args[]){
        //if-else
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
