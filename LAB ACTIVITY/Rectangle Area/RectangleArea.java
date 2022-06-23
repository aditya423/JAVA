// WAP to calculate the area of rectangle by initialising the data members inside the method

class Area {
    
    int length, breadth, area;

    void setData(int l, int b){
        length = l;
        breadth = b;
    }

    void calculate(){
        area = length*breadth;
    }

    void displayData(){
        System.out.println("Area of Rectangle --> " + area + "sqm");
    }
}

public class RectangleArea {
    public static void main(String[] args){

        Area a = new Area();
        a.setData(10,20);
        a.calculate();
        a.displayData();
    }
}

