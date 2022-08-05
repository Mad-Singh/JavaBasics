import java.util.*;

public class Main
{
    public static void circumference(int r){
        float pie = 3.14f;
        System.out.println("circumference is "+2*pie*r);
        
        return;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int r= sc.nextInt();
	   
	    circumference(r);
	     
	}
}
