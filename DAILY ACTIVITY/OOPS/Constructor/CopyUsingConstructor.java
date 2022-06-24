// WAP to copy the value of one object into another using constructor

public class CopyUsingConstructor{

    int rollno;
    String name;

    CopyUsingConstructor(int r, String n){
        rollno = r;
        name = n;
    }

    CopyUsingConstructor(CopyUsingConstructor c){
        rollno = c.rollno;
        name = c.name;
    }

    void disp(){
        System.out.println("\nRoll no.: " + rollno + "\nName: " + name);
    }

    public static void main(String[] args){
        
        CopyUsingConstructor c = new CopyUsingConstructor(39, "Aditya");
        c.disp();
        CopyUsingConstructor c1 = new CopyUsingConstructor(c);
        c1.disp();
    }
}