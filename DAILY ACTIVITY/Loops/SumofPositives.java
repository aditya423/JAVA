import java.util.Scanner;

public class SumofPositives {
 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the number: ");
        int i=s.nextInt();

        int sum=0;
        while(i>=0){
            sum+=i;
            System.out.println("Enter the number: ");
            i=s.nextInt();
        }

        System.out.println("\nSum of numbers: " + sum + "\n");
    }
}
