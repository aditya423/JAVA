// Write a program to pass this as argument in the constructor

class test {
    
    int a=10;

    test(){
        ThisAsArgumentInConstructor t1 = new ThisAsArgumentInConstructor(this);
        t1.disp();
    }

    public static void main(String[] args){
        test t = new test();
    }
}

public class ThisAsArgumentInConstructor {

    test obj;
    ThisAsArgumentInConstructor(test obj){
        this.obj = obj;
    }

    void disp(){
        System.out.println(obj.a);
    }
}


