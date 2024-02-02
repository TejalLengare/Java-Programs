import java.util.*;

public class LeapYear{
    public static void main(String args[]){
       
        try (Scanner sc = new Scanner(System.in)) {        
        System.out.println("Enter A Year");
        int year = sc.nextInt();

        // Check if the year is divisible by 4 but not 100, DISPLAY "leap year" 
        // Check if the year is divisible by 400, DISPLAY "leap year"
        if((year%4==0)  && (year%100!=0) || (year%400==0)){
            System.out.println("Enter Year is Leap Year");
        }else{
            System.out.println("Enter Year is Not Leap year");
        }

    }
    }
}