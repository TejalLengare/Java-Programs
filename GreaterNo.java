import java.util.Scanner;

public class GreaterNo {
       public static void main(String Args[]){
        try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            System.out.println("a is grater than b and c");
        }
        else if(b>c){
            System.out.println("b is greater than c and a");
        }else{
            System.out.println("c is greater than b and a ");
        }
    } 
}
}
