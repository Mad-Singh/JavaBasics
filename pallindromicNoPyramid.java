import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	    int number;
	    for(int i=1;i<=n;i++){
	        number=i;
	        for(int j=1;j<=n-i;j++){
	            System.out.print(" ");
	        }
	        for(int j=1; j<=i; j++){
	            System.out.print(number);
	            if (number==1){
	            	break;
	            }
	            number--;
	        }
	        number = 2;
	        for(int j=1; j<=i-1;j++){
	            System.out.print(number);
	            number++;
	        }
	        
	        System.out.println(" ");
	    }
	}
}
