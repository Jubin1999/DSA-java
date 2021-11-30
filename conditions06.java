// import java.util.Scanner;

// public class conditions06 {
//     public static void main(String agrs[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int op = sc.nextInt();

//         switch (op) {
//             case '+':
//               System.out.println(a + b);
//               break;
//             case '-':
//               System.out.println(a - b);
//               break;
//             case '*':
//               System.out.println(a*b);
//               break;
//             case '/':
//               System.out.println(a/b);
//               break;
//             // operator doesn't match any case constant
//             default:
//               System.out.println("Error! operator is not correct");
//           }
        
//     }
// }
import java.util.Scanner;

public class conditions06{
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
