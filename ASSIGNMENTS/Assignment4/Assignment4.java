package Assignment4;
// Write a program to calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter how many terms you want to display? -->");
        int n = s.nextInt();

        System.out.println("Fibonacci series till " + n + " -->");
        if(n==1)
            System.out.println("0");
        else if(n==2)
            System.out.println("0 1");
        else {
            int first = 0;
            int second = 1;

            for(int i=0; i<n; i++){
                System.out.print(first + " ");
                int third = first + second;
                first = second;
                second = third;
            }
        }
    }    
}
