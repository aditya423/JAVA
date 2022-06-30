// Write a program to reverse a number using recursion

import java.util.Scanner;

public class reverseRecursion {

    static void reversed(int num){

        // base case
        if(num < 10){
            System.out.print(num);
            return;
        }
        else {
            System.out.print(num%10);
            reversed(num/10);
        }
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        System.out.println("Reversed number: ");
        reversed(num);
    }
}
