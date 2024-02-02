
import java.util.Scanner;
public class MathOperation {

    public static void main(String[] Args){
        try (Scanner sc = new Scanner(System.in)) {

        System.out.println("Choose operator '+' '-' '*' '/'");
        char operator = sc.next().charAt(0);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int result = 0;

        switch(operator) {
            case '+':
                result=a+b;
                System.out.println("Addition of two number"+ result);
                break;
            case '-':
                result=a-b;
                System.out.println("Subtraction of two numbers"+ result);
                break;
            case '*':
                result=a*b;
                System.out.println("Multiplication of two numbers"+ result);
                break;
            case '/':
                result=a/b;
                System.out.println("Division of two numbers"+ result);
                break;
            default:
                System.out.println("Enter valid operator");
        }
    }
    }
}
