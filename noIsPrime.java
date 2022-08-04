import java.util.*;

public class Main
{
    public static boolean noIsPrime(int n){
        boolean b=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                b=false;
            }
        }
        return b;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	   
	    if(noIsPrime(n)){
	        System.out.println("No is Prime");
	    }
	    else{
	        System.out.println("No is not Prime");
	    }
	     
	}
}
