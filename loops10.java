import java.util.Scanner;

public class loops10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number : ");
        int n = sc.nextInt();
        System.out.println("This is your table:-");

        for(int i=1; i<11; i++){
            
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
}
