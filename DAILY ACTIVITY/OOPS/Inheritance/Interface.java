interface Area {
    void para(int a, int b);
    void para1(int r);
}
class Rectangle implements Area {
    public void para(int a, int b){
        System.out.println("\nThe area of a rectangle is " + (a*b));
    }
    // we have to override un-implemented method
    @Override
    public void para1(int r){ System.out.println("You are using overrided method..."); }
}
class Circle implements Area {
    public void para1(int r){
        System.out.println("\nThe area of a circle is " + (3.14*r*r));
    }
    // we have to override un-implemented method
    @Override 
    public void para(int a, int b){ System.out.println("You are using overrided method..."); }
}
public class Interface {
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.para(10,2);
        r.para1(2);
        Circle c = new Circle();
        c.para1(2);
        c.para(10, 2);
    }
}
