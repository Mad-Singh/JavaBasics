import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=0,b=0,c=0;
	    long start = System.currentTimeMillis();
	    long end = start;
	    do{
	        end = start + 5 * 1000;
	        System.out.println("Enter your no");
	        int num = sc.nextInt();
	        if(num<0){
	            a = a+1;
	        }
	        else if(num>0){
	            b=b+1;
	        }
	        else{
	            c=c+1;
	        }
	        
	    }while(System.currentTimeMillis() < end);
	    System.out.println("Number of Negative no "+a);
	    System.out.println("Number of Positive no "+b);
	    System.out.println("Number of Zeros "+c);
	}
}
