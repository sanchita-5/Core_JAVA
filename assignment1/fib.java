// Write a java program to print first 10 numbers in Fibonacci sequence. Also print the sum of the numbers.
import java.util.*;
class Cal{
    
    void fib(int n){
    int fib1=-1,fib2=1,fib3,sum=0;
     for(int i=0;i<n;i++){
        
                 
                 fib3 = fib1 + fib2;
System.out.println( fib3);
                 fib1 = fib2;
                 fib2 = fib3;
	         sum=sum+fib3;
            
    }
    System.out.println("Sum is :" +sum);
    }
}
    class fib{
        public static void main(String []args) {
    
    System.out.print("Enter the value of N:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //Fiboo obj1 = new Fiboo();
    Cal obj =new Cal();
    obj.fib(n);
        }
    }