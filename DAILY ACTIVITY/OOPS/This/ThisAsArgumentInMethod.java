// Write a program to pass this as argument of method

public class ThisAsArgumentInMethod {

    void disp(ThisAsArgumentInMethod o){
        System.out.println("this as object...");
    }

    void show(){
        disp(this);
    }
    
    public static void main(String[] args){

        ThisAsArgumentInMethod t = new ThisAsArgumentInMethod();
        t.show();
    }
}

// used to reuse one object in multiple methods