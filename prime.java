// To determine a number is prime or not prime
import java.util.*;
class prime
{
    public static void main(String a[]){
        int n;
        int count=0;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else
            System.out.println("Not a prime number");
    }
}