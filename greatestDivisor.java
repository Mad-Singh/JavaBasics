import java.util.*;

public class Main
{
    public static void greatestDivisor(int a, int b){
        int div = 1;
        if(a<b){
            for(int i= 1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    div =i;
                }
            }
        }
        else{
            for(int i= 1;i<=b;i++){
                if(a%i==0 && b%i==0){
                    div = i;
                }
            }
        }
        System.out.println("Greatest Divisor is "+div);
        return;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    greatestDivisor(a,b);
	     
	}
}
