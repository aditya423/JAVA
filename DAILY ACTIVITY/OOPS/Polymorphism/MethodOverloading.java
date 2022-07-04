// Write a program to implement Compile Time Polymorphism

class Testpoly {

    void showOutput(int a){
        System.out.println("Value of a is " + a);
    }

    void showOutput(int a, int b){
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
}

public class MethodOverloading {

    public static void main(String[] args){

        Testpoly t = new Testpoly();
        t.showOutput(10);
        System.out.println("/////////////////////");
        t.showOutput(10,20);
    }
}
