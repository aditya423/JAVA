// Write a program to implement Abstraction

// class contains abstract method hence class is also abstract
abstract class Parent {

    // method without implementation - abstract method
    abstract public void greet();

    void show(){
        System.out.println("Implementing Abstraction...");
    }
}

class Child extends Parent {
    
    // implemented abstract method
    public void greet(){
        System.out.println("Override Method...");
    }

    // show()
}

public class Abstraction {
    public static void main(String[] args){
        
        // abstract class ka object nahi bana sakte
        // Parent p = new Parent; ----------------- ERROR!

        Child c = new Child();
        c.greet();
        c.show();
    }
}
