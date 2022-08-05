import java.util.*;

public class Main
{
    public static void sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of Odd no upto n is "+sum);
        return;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	    
	    sumOfOdd(n);
	     
	}
}
