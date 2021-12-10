class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class oops03 {
    public static void main(String args[]){
        student s1 = new student("Jubin", 24);

        s1.printInfo();
    }
}

