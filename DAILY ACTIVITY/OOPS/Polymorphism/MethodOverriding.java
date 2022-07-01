// Write a program to check method overriding

class Parent {
    void show(){ System.out.println("Parent class..."); }
}

class Child extends Parent {
    // show() from Parent 
    void show(){ 
        super.show();
        System.out.println("Child class..."); 
    }
    
    // Child's void() is overriding Parent's void()
    // To execute Parent's void() we used super keyword
}

public class MethodOverriding {
    
    public static void main(String[] args){

        Child c = new Child();
        c.show();
    }
}
