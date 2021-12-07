import java.util.Scanner;

public class functions01 {
    public static void printMyName(String name){
        System.out.print("His name is : ");
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.next();

        printMyName(name);
    }
}
