package Assignment7;
// Write a program to perform the arithmetic operation by using compile time polymorphism 
// and you should accept input from user

import java.util.Scanner;

class Calculate{
    void add(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    void add(int a, int b, int c){
        System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
    }
    void add(int a, int b, int c, int d){
        System.out.println(a + " + " + b + " + " + c + " + " + d +  " = " + (a+b+c+d));
    }
}

public class Assignment7 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("\nHow many integers you want to add? (2 3 or 4) --> ");
        int n = s.nextInt();
        System.out.println("Enter the integers --> ");
        Calculate cal = new Calculate();
        int a = s.nextInt();
        int b = s.nextInt();
        switch(n){
            case 2: {
                cal.add(a,b);
                break;
            }
            case 3: {
                int c = s.nextInt();
                cal.add(a,b,c);
                break;
            }
            case 4: {
                int c = s.nextInt();
                int d = s.nextInt();
                cal.add(a,b,c,d);
                break;
            }
            default:
                System.out.println("Please enter valid input ..!");
        }
    }
}
