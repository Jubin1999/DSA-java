import java.util.Scanner;

public class functionsex03 {
    public static int greaterOne(int a, int b){
        if(a<b){
            return b;
        }
        else{
            return a;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.err.println(greaterOne(a, b));
    }
}
