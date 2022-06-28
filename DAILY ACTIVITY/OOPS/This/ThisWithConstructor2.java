// Write a program to test this keyword with constructor

public class ThisWithConstructor2 {

    int rollno;
    String name;
    int age;

    ThisWithConstructor2(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    ThisWithConstructor2(int rollno, String name, int age){
        this(rollno, name);
        this.age = age;
    }

    void display(){ 
        System.out.println("\nRoll no.: " + rollno + "\nName: " + name + "\nAge: " + age); 
    }

    public static void main(String[] args){

        ThisWithConstructor2 t1 = new ThisWithConstructor2(1, "Pooja");
        ThisWithConstructor2 t2 = new ThisWithConstructor2(1, "Priya", 20);
        t1.display();
        t2.display();
    }
}
