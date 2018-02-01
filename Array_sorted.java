import java.util.*;
public class Array_sorted {

	public static void main(String[] args) {
		 Scanner x=new Scanner(System.in);
	        int i, j, k, temp;
	        int size = x.nextInt();
	        int []a =new int [size];
	        for(i=0;i<size;i++)
	        {
	        	a[i] = x.nextInt();
	        }
	        for(i=0;i<size;i++)
	        {
	        	for(j=i+1;j<size;j++)
	        	{
	        		if(a[i]>a[j])
	        		{
	        			temp = a[i];
	        			a[i] = a[j];
	        			a[j] = temp;
	        		}
	        	}
	        }        
	        for(i=0;i<size;i++)
	        {
	        	System.out.print(a[i] + "\t");
	        }

	}

}
