// Create one interface Bank and try to implement method rate of interest in different banks 
// and try to implement abstraction using interface

import java.util.Scanner;

interface Bank {
    void RateOfInterest();
}

class Customer implements Bank {

    private String name, bank_name;

    // constructor to initialise variables
    Customer(String name, String bank_name){
        this.name = name;
        this.bank_name = bank_name;
    }

    // implementing method from interface Bank
    public void RateOfInterest(){
        if(bank_name.equals("SBI"))
            System.out.println("Rate of Interest: " + 1.34);
        else if(bank_name.equals("ICICI"))
            System.out.println("Rate of Interest: " + 2.13);
        else if(bank_name.equals("PNB"))
            System.out.println("Rate of Interest: " + 0.894);
        else 
            System.out.println("Error..! Please enter valid input...");
    }
}

public class Assignment6 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        // taking uset input
        System.out.println("\nEnter your name: ");
        String name = s.nextLine();
        System.out.println("Enter your bank name (SBI,ICICI,PNB): ");    
        String bank_name = s.nextLine();
        
        // making object and calling method
        Customer c = new Customer(name, bank_name.toUpperCase());
        c.RateOfInterest();
    }
}
