
// can be used to modify the behavior of conditional and iterative statements

public class BreakFor {
    
    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++){

            if(i==8)
                break;

            System.out.println(i);
        }
    }
}
