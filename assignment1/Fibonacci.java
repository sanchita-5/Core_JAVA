import java.util.*;

class Fib
{

        int n;
        int fib1 = 0, fib2 = 1,fib3,sum=0; 
	void calculate (int n){
        for(int i=1; i<=n; i++)
        {
                System.out.println(fib1);
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
		sum=sum+fib1;
           
        } 
 	System.out.println(sum);
	}
  
}
class Fibonacci
{
	public static void main(String a[])
	{
	 Fib ob1 = new Fib();
	 ob1.calculate(10);
	}
}
	
		
		