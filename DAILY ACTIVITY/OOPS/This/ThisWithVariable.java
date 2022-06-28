// Write a program to test this keyword with instance class variable

public class ThisWithVariable {
    
    int rollno;
    String name;

    ThisWithVariable(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    void display(){
        System.out.println("\nRoll no.: " + rollno + "\nName: " + name);
    }

    public static void main(String[] args){

        ThisWithVariable t = new ThisWithVariable(1, "Pooja");
        t.display();
    }
}
