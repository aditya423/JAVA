// Write a program to implement Multiple Inheritance using Interface

interface First {
    void show();
}

interface Second {
    void show();
}

public class MultipleInheritanceUsingInterface implements First,Second {

    public void show(){
        System.out.println("implement");
    }

    public static void main(String[] args){

        MultipleInheritanceUsingInterface multiple = new MultipleInheritanceUsingInterface();
        multiple.show();
    }
}
