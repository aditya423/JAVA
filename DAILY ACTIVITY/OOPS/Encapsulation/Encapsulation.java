// Write a program to implement Encapsulation

class Employee {

    private int eid;
    private String ename;

    // setters
    public void setEid(int eid){
        this.eid = eid;
    }
    public void setEname(String ename){
        this.ename = ename;
    }
    // getters
    public int getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
}
public class Encapsulation {
    public static void main(String[] args){

        Employee emp = new Employee();
        emp.setEid(39);
        emp.setEname("Aditya Ghadge");
        System.out.println("ID: " + emp.getEid());
        System.out.println("Name: " + emp.getEname());
    }
}
