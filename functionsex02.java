import java.util.*;

public class functionsex02 {
	public static void printOddNumber(int n){
        int odd = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 !=0){
                odd = odd + i;
            }
        }
        System.out.println(odd);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printOddNumber(n);
    }
}
// import java.util.*;
 
// public class functionsex02 {
//    public static void printSum(int n) {
//        int sum = 0;
 
//       for(int i=1; i<=n; i++) {
//         if(i % 2 != 0) {
//             sum = sum + i;
//         }
//       }
 
//       System.out.println(sum);
//    }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       printSum(n);
//    }   
// }
