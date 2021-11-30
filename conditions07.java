import java.util.Scanner;

public class conditions07 {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op = sc.next().charAt(0);

        switch (op) {
            case '+':
              System.out.println(a + b);
              break;
            case '-':
              System.out.println(a - b);
              break;
            case '*':
              System.out.println(a*b);
              break;
            case '/':
              System.out.println(a/b);
              break;
            // operator doesn't match any case constant
            default:
              System.out.println("Error! operator is not correct");
          }
        
    }
}
