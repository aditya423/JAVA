// Write a program to test Hybrid Inheritance

class College {
    void showName(){
        System.out.println("College name is SFIT");
    }
}

class Student extends College {
    // showName() from College
    void showName(){
        super.showName();
        System.out.println("College name is SFIT and name of the student is Aditya");
    }
}

class Teacher extends College {
    // showName() from College
    void showName(){
        System.out.println("College name is SFIT and name of the teacher is Santosh");
    }
}

class Department extends Student {
    // showName() from Student
    void showName(){
        super.showName();
        System.out.println("College name is SFIT and name of the department is EXTC");
    }
}

public class HybridInheritance {
    
    public static void main(String[] args){

        Department d = new Department();
        d.showName();
    }
}
