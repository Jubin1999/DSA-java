public class Main1 {
    public static void printJava(){
        System.out.println("Hello java");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] arge){
        //break and continue
        /* int i=0; 
        while(true){
            if(i == 3){
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if(i > 5){
                break;
            }
        } */
        //Exception handling
        /* int[] marks = {97, 98, 95};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            //do thing after catching

        }
        System.out.println("The name is Aman"); */
        //Methods/functions
        /* System.out.println("Hello java");
        System.out.println("Hello java");
        System.out.println("Hello java"); */
        printName("Jubin");
        printName("Nihal");
        printJava();
        printSum(1, 6);
    }
}
