public class Swapping {
    
    public static void main(String[] args) {
        
        int a=10, b=20;
        System.out.println("\nBefore swapping: a=" + a + " and b=" + b);

        // with third variable
        int temp=b;
        b=a;
        a=temp;
        System.out.println("\nAfter swapping:  a=" + a + " and b=" + b);

        // without third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("\nAfter swapping:  a=" + a + " and b=" + b + "\n");   
    }
}
