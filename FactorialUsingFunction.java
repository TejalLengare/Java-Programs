import java.util.*;

public class FactorialUsingFunction {                    
    public static void Fact(int num){                          // Define Function
        if(num<0){
            System.out.println("Enter a Positive Values");
            return;
        }else{
            int fact=1;
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of Given Number :"+fact);
            return;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Number to find Factorial");
        int num=sc.nextInt();
       
        Fact(num);   // Call Function
    }
}
}

