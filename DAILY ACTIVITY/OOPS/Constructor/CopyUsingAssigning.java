// WAP to copy the value of one object into another without constructor

public class CopyUsingAssigning {
    
    int rollno;
    String name;

    CopyUsingAssigning(int r, String n){
        rollno = r;
        name = n;
    }

    CopyUsingAssigning(){}

    void disp(){
        System.out.println("\nRoll no.: " + rollno + "\nName: " + name);
    }

    public static void main(String[] args){
        
        CopyUsingAssigning c = new CopyUsingAssigning(39, "Aditya");
        c.disp();
        CopyUsingAssigning c1 = new CopyUsingAssigning();
        c1.rollno = c.rollno;
        c1.name = c.name;
        c1.disp();
    }
}
