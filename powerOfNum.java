import java.util.*;

public class Main
{
    public static void powerOfNo(int x, int n){
        int pow=1;
        for(int i= 1;i<=n;i++){
            pow = pow *x;
        }
        System.out.println(x+" raise to the power of "+n+" is " + pow);
        return;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int x= sc.nextInt();
	    int n= sc.nextInt();
	    
	    
	    powerOfNo(x,n);
	     
	}
}
