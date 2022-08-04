import java.util.*;

public class Main
{
    public static boolean noIsEven(int n){
        boolean b=false;
        if(n%2==0){
            b=true;
        }
        return b;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	   
	    if(noIsEven(n)){
	        System.out.println("No is even");
	    }
	    else{
	        System.out.println("No is odd");
	    }
	     
	}
}
