
// also known as exit control loop
// used when number of iterations are not fixed but you want to execute the loop atleast once 

// syntax :-
//     do {
//         statement;
//     } while(condition);

public class DoWhile {
    
    public static void main(String[] args) {
        
        int i=1;
        do {
            System.out.println(i);
            i++;
        } while(i>5);
    }
}
