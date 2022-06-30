// Write a program to test Multi-level Inheritance

class Parent {
    void show(){ System.out.println("\nParent class executed..."); }
}

class Child extends Parent {
    // show()
    void disp(){ System.out.println("Child class executed..."); }
}

class GrandChild extends Child {
    // show()
    // disp()
    void out(){ System.out.println("GrandChild class executed..."); }
}

public class MultilevelInheritance {
    
    public static void main(String[] args){

        GrandChild g = new GrandChild();
        g.show();
        g.disp();
        g.out();
    }
}
