import java.util.*;
public class Word_Reverse {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        String str[] = s.split("\\s");	 
		if(str.length == 2)
		  {       	        
	        for(int i=str.length-1; i>=0; i--)
	        {
	        	System.out.print(str[i] + " ");       	
	        }
		}
	}

}
