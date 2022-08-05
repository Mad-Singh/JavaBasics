import java.util.*;

public class Main
{
    public static void eligibleToVote(int a){
        boolean b=false;
                
        if(a>18){
            b=true;
            System.out.println("Eligible to Vote");
        }
        else {           
            System.out.println("Not Eligible to Vote");
        }
        return;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int a= sc.nextInt();
	    
	    
	    eligibleToVote(a);
	     
	}
}
