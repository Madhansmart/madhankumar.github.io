import java.util.*;
public class Match_index {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
        {
            arr[i] = scan.nextInt();
        }
	    int count =0;
        for(int j=0; j<N; j++)
        {
            if(j == arr[j])
            {
                System.out.print(arr[j] + " ");
		    count++;
            }		
        }
	    if(count == 0)
	    {
		System.out.println("-1");    
	    }
    }
}
	
