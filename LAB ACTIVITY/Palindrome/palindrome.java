// Write a program to check if a string is palindrome

import java.util.Scanner;

public class palindrome {
    
    static boolean isPalindrome(String str){ 

        int n = str.length();

        if(n==0 || n==1)
            return true; 
        
        if(str.charAt(0) == str.charAt(n-1))
            return isPalindrome(str.substring(1, n-1));

        return false;
    }   

    public static void main(String args[]){ 

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = s.nextLine();   

        if (isPalindrome(str)) 
            System.out.println(str + " is palindrome"); 
        else
            System.out.println(str + " is not a palindrome"); 
    }     
}
