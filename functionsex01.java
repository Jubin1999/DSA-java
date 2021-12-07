import java.util.Scanner;

public class functionsex01 {
    public static double printAverage(Double a, Double b, Double c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(printAverage(a, b, c));
    }
}
