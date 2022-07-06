interface Calculate {
    void area();
    default void area2(int r){
        System.out.println("Default: The area of circle is " + (r*r));
    }
}

class Rect1 implements Calculate {
    private int a,b;
    public Rect1(int a, int b){
        super();
        this.a = a;
        this.b = b;
    }
    public void area(){
        System.out.println("\nThe area of rectangle is " + (a*b));
    }
    // default area2(r);
}

public class Interface2 {
   public static void main(String[] args){

        Rect1 r = new Rect1(2, 3);
        r.area();
        r.area2(3);
   } 
}
