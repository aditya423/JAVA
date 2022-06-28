// Write a program to test this keyword for the current class method

public class ThisWithMethod {

    void display(){
        System.out.println("Test this for method...");
    }

    void Ouput(){
        this.display();
    }
    
    public static void main(String[] args){

        ThisWithMethod t = new ThisWithMethod();
        t.Ouput();
    }
}
