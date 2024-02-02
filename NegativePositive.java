import java.util.Scanner;

public class NegativePositive {
     public static void main(String Args[]){
        try (Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();
        if(num==0){
            System.out.println("NUmber is Equal");
        }
        else if(num>0){
            System.out.println("Number is Positive number");
        }else{
            System.out.println("Number is Negative number");
        }
    } 
}
}