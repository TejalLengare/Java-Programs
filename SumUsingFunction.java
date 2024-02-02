import java.util.*;

public class SumUsingFunction {
    public static int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a and b Values");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int sum=Sum(a,b);
        System.out.println("Sum Of Two Numbers: "+sum);
    }
}
}