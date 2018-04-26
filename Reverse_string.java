import java.util.*;
public class Reverse_string {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        String str[] = s.split("\\s");	        	        
	        for(int i=0; i<str.length; i++)
	        {
	        	for(int j=str[0].length()-1; j>=0; j--)
	        	{
	        		System.out.print(str[i].charAt(j));
	        	}
	        	System.out.print(" ");
	        }
	}

}
