public class FibonacciSeries{
    public static void main(String args[]){
        int n=10,n1=0,n2=1,n3=0;
        System.out.println("Fibonacci Series untill"+n);
        for(int i=1;i<=n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}