
// used this type of loop in arrays

// syntax :-
//     for(vartype:arrayname)

public class ForEach {
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3};
        int sum=0;

        for(int b:a){   
            sum+=b;
            System.out.println(b);
        }

        System.out.println("Sum: " + sum);
    }
}
