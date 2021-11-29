import java.util.Scanner;

public class variables05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fisrt number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of two numbers : ");
        System.out.print(sum);
    }
}
