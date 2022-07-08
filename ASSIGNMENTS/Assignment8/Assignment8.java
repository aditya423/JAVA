package Assignment8;
// Accept two numbers from user and by adding that numbers check if the addition is less than 100 
// then display the output otherwise throw the exception

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int sum = n1 + n2;

        if(sum >= 100)
            throw new ArithmeticException("Exception..! Addition exceeds 100..!");
        else 
            System.out.println("Addition: " + sum);
    }
}
