import java.util.*;
public class ChangeEToI
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String inputStr = sc.next();
	    String[] arr = inputStr.split("");
	    for(int i=0;i<inputStr.length();i++){
	        if(arr[i].compareTo("e") == 0){
	            arr[i] = "i";
	        }
	    }
		
	    String outputStr="";
	    
	    for(int i=0; i<inputStr.length();i++){
	        outputStr+= arr[i];
	    }
	    System.out.println(outputStr);
	}
}
