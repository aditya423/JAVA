
// can be used to modify the behavior of conditional and iterative statements

public class BreakWhile {

    public static void main(String[] args) {
        
        int i=1;
        while(i<=10){

            if(i==8)
                break;

            System.out.println(i);
            i++;
        }
    }
}
