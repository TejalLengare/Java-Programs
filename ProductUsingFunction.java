import java.util.*;

public class ProductUsingFunction {
    public static int prod(int a,int b) {
        return a*b;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a and b Values ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Product of a and b is "+prod(a, b));
    }
}
}
