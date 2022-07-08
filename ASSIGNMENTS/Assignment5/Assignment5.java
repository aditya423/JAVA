package Assignment5;
// Write a program to accept the number from user and 
// check whether the number is armstrong number or not

import java.util.Scanner;

public class Assignment5 {

    static int SumOfCubes(int n){

        int sum = 0;
        
        while(n != 0){
            sum += Math.pow(n%10, 3);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter the number: ");;
        int n = s.nextInt();

        int sum = SumOfCubes(n);
        
        if(n == sum)
            System.out.println("It's an Armstrong number");
        else 
            System.out.println("It's not an Armstrong number");
    }
}
