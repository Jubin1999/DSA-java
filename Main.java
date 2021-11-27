import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //primitive types
        /* byte age = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true; */
        //Non primitive types
        /* String name = "Apu";
        System.out.println(name.length()); */
        //Strings 
        //concatenate
        /* String name1 = "Aman";
        String name2 = "Akku";
        String name3 = name1 + " and " + name2;
        System.out.println(name3); */
        //charAt
        /* String name = "Aman";
        System.out.println(name.charAt(0)); */
        //replace
        /* String name = "Aman";
        String name2 = name.replace('a', 'b');
        System.out.println(name2);
        System.out.println(name); */
        //substring
        /* String name = "Aman and akku";
        System.out.println(name.substring(0, 13)); */
        //ARRAYS
        /* int age = 30;
        int physics = 97;
        int chem = 98;
        int eng = 95;
 */
        /* int [] marks = new int [3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        //System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]); */
        //2D array
        //int[] marks = {97, 98, 95};
        /* int [][] finalMarks = {{97, 98, 95}, {95, 95, 98}};
        System.out.println(finalMarks[0][2]); */
        //casting
        /* double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        int p=100;
        int fp = p + (int)18.0;
        System.out.println(fp); */
        //constants
        /* int age = 30;
        age = 31;
        age = 32;

        final float PI = 3.14F;
        System.out.println(PI); */
        //Operators
       /*  double a = 3;
        double b = 2;
        //double modulo = a % b;
        //System.out.println(modulo);

        int numb = 1;
        System.out.println(numb-- );
        System.out.println(numb); */
        //Maths
        //5, 6
        //System.out.println(Math.min(5, 6));
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Input your age : ");
        float age = sc.nextFloat();
        System.out.println(age); */
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Input your name : ");
        String name = sc.nextLine();
        System.out.println(name); */
        //conditional statement
        /* boolean isSunup = false;
        if(isSunup == true)
        System.out.println("day");
        else
        System.out.println("night");

        int age = 30;
        if(age > 18)
        System.out.println("can vote");
        else
        System.out.println("can't vote"); */
        //logical operators
        /* int a = 60;
        int b = 40;
        if(a < 50 || b < 50)
        System.out.println("Atleast one less than 50"); */
        /* boolean isAdult = false;
        if(!isAdult)
        System.out.println("is adult");
        else
        System.out.println("not adult"); */
        /* Scanner sc = new Scanner(System.in);
        //pen = 10; notebook = 40

        int cash  = sc.nextInt();
        if(cash < 10){
            System.out.println("cannot buy anything");
            System.out.println("get more");
        }
        else if(cash > 10 && cash < 40){
            System.out.println("can get 1 thing");
        }
        else{
            System.out.println("can get both");
        } */
        
        /* //conditional statement
        int day = 3 ;
         
        switch(day) {
            case 1 : 
            System.out.println("monday");
            break;
            case 2 : 
            System.out.println("tuesday");
            break;
            default: 
            System.out.println("wed - sun");
        } */
        //LOOPS
        //System.out.println("1");
        /* System.out.println("2");
        System.out.println("3"); */

        /* for(int i = 100; i>=1; i--){
            System.out.println(i);
        } */
        //while loop
        /* int j = 100;
        while(j >= 1){
            System.out.println(j);
            j = j -1;
        } */
        //do while loop
        /* int k = 100;
        do{
            System.out.println(k);
            k = k - 1;
        }
        while(k >= 1); */
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do{
            System.out.print("input a number : ");
            number = sc.nextInt();
            System.out.print("here is your number : ");
            System.out.println(number);
        }while(number >= 0 );

        System.out.println("The end");
    }
}
