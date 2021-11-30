import java.util.Scanner;

public class conditons03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }else{
            if(a > b){
                System.out.println("A is greater");
            }else{
                System.out.println("A is lesser");
            }
        }
    }
}
