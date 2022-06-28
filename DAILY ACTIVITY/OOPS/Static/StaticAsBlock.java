// Write a program to apply static as block

public class StaticAsBlock {

    // static block will get executed before main 
    // but cannot get executed without main
    // because it is stored in the memory at the time of class loading and before the object creation
    static {
        System.out.println("Executes Static...");   
    }
    
    public static void main(String[] args){

        System.out.println("Executes Main...");
    }
}

// till JDK 1.6
