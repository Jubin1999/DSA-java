public class bits02 {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitsMask = 1<<pos;

        int newNumber = bitsMask | n;
        System.out.println(newNumber);
    }
}
