import java.util.Scanner;

public class conditions02 {
    public static void main(String agrs[]){
        //if-else
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
