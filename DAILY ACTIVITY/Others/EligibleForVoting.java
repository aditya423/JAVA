import java.util.Scanner;

// Using conditional operator check whether the person is eligible for voting or not 
// by accepting input from the user

public class EligibleForVoting {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter your age: ");
        int age = s.nextInt();

        String result = (age>18) ? "Eligible\n" : "Not eligible\n";
        System.out.println(result);
    }
}
