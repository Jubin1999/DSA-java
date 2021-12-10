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

    student(student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    student(){
        
    }
}
public class oops04 {
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "Jubin";
        s1.age = 24;
         
        student s2 = new student(s1);
        s1.printInfo();
    }
}
