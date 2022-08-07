import java.util.*;
 
public class Main {
   public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       
       String[] arr = new String[n];
       
       for(int i=0; i<n; i++){
           arr[i] = sc.nextLine();
       }
       String outputStr= "";
       for(int i=0; i<n; i++){
           outputStr = outputStr+arr[i];
       }
       System.out.println(outputStr.length());
   }
}

