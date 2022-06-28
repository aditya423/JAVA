// Write a program to apply static with variable

public class StaticWithVariable {
    
    int a=1;
    static int b=10;

    StaticWithVariable(){
        a++;
        System.out.println(a);
        b++;
        System.out.println(b);
    }

    public static void main(String[] args){

        StaticWithVariable s1 = new StaticWithVariable();
        StaticWithVariable s2 = new StaticWithVariable();
        StaticWithVariable s3 = new StaticWithVariable();
    }
}
