import java.util.*;

public class UsingIndexOf{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String emailAddress = sc.next();
	    String userName= emailAddress.substring(0,emailAddress.indexOf("@"));
		
	    System.out.println(userName);
	}
}
