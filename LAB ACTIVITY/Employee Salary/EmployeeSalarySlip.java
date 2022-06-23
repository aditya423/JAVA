// Define a class employee with the following members like name, id, salary and calculate gross pay using
// other factors like HRA, IT, DA to compute the salary slip of an employee

class Employee {
    
    String name;
    int id, salary;
    double bs, da, hra, ta, pf, gs; 

    void setData(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void compute(){
        bs = salary;
        da = bs*0.15;
        hra = bs*0.10;
        ta = bs*0.08;
        pf = bs*0.05;
        gs = bs + da + hra + ta - pf;
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("\nBASIC SALARY ---------> " + bs);
        System.out.println("DEARNESS ALLOWANCE ---> " + da);
        System.out.println("HOUSE RATE ALLOWANCE -> " + hra);
        System.out.println("TRAVEL ALLOWANCE -----> " + ta);
        System.out.println("PROVIDENT FUND -------> " + pf);
        System.out.println("\nGROSS SALARY ---------> " + gs);
    }
}

public class EmployeeSalarySlip {
    public static void main(String[] args){

        Employee e = new Employee();
        e.setData(1, "Aditya", 50000);
        e.compute();
        e.display();
    }
}

