// Write a program to accept input from user using Scanner Class

import java.util.Scanner;

public class ScannerClass{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        float n = s.nextFloat();
        System.out.println("The entered number is " + n);
    }
}
