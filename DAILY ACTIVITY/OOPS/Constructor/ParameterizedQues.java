public class ParameterizedQues {
    
    int rollno;
    String name;

    // Parameterized Constructor
    ParameterizedQues(int r, String n){
        rollno = r;
        name = n;
    }

    void disp(){
        System.out.println("Roll no.: " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args){

        ParameterizedQues p = new ParameterizedQues(39, "Aditya");
        p.disp();
    }

}
