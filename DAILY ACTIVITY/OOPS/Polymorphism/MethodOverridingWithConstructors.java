// Write a program to test method overriding with constructors

class Parent {
    public Parent(){
        // super();
        System.out.println("\nParent class constructor...");
    }
}

class Child extends Parent {
    public Child(){
        // super();
        System.out.println("Child class constructor...");
    }
}

public class MethodOverridingWithConstructors {

    public static void main(String[] args){

        Child c = new Child();
        // super keyword is by default invoked in constructor's body
    }
}
