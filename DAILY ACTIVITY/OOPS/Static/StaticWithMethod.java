// Write a program to apply static with method

public class StaticWithMethod {

    int rollno;
    String studentname;
    static String collegename = "MIT";

    StaticWithMethod(int r, String s){
        rollno = r;
        studentname = s;
    }
    
    static void change(){
        collegename = "PREC";   // same variable for every object (STATIC)
    }

    void display(){
        System.out.println("\nRoll no.: " + rollno + "\nStudent Name: " + studentname + "\nCollege Name: " + collegename);
    }

    public static void main(String[] args){

        StaticWithMethod s1 = new StaticWithMethod(1, "Pooja");
        StaticWithMethod s2 = new StaticWithMethod(2, "Priya");
        StaticWithMethod.change();
        s1.display();
        s2.display();
    }  
}
