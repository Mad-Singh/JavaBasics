import java.util.*;

public class Main
{
    public static void greaterNo(int a,int b){
        int big =a;
                
        if(b>a){
            big = b;
        }
        
        System.out.println("Greater no is "+big);
        return;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    
	    greaterNo(a,b);
	     
	}
}
