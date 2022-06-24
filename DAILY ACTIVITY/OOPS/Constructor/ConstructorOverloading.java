public class ConstructorOverloading {
    
    int rollno;
    String name;

    ConstructorOverloading(){}

    ConstructorOverloading(int r){
        rollno = r;
    }
    
    ConstructorOverloading(int r, String n){
        rollno = r;
        name = n;
    }

    void disp(){
        System.out.println("\nRoll no.: " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args){

        ConstructorOverloading p1 = new ConstructorOverloading();
        p1.disp();
        ConstructorOverloading p2 = new ConstructorOverloading(39);
        p2.disp();
        ConstructorOverloading p3 = new ConstructorOverloading(39, "Aditya");
        p3.disp();
    }
}
