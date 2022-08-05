import java.util.*;

public class Main
{
    public static void printAverage(int a, int b, int c){
        float average=(float) (a+b+c)/3;
        String ans = String.format("%.2f", average);
        System.out.println(ans);
        return;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    int c= sc.nextInt();
	   
	    printAverage(a,b,c);
	     
	}
}
