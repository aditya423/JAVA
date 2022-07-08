package Assignment3;
// Write a program that reads an integer and check whether it is negative, zero or positive

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = s.nextInt();

        if(n < 0)
            System.out.println("Negative");
        else if(n > 0)
            System.out.println("Positive");
        else 
            System.out.println("Zero");
    }
}
