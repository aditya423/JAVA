// Write a program to test Single Inheritance

class Parent {
    void show(){
        System.out.println("Parent class executed...");
    }
}

class Child extends Parent {
    // show()
    void disp(){
        System.out.println("Child class executed...");   
    }
}

public class SingleInheritance {
    public static void main(String[] args){
        Child c = new Child();
        c.show();
        c.disp();
    }
}
