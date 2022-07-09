// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    if(n < 3)
	    {
	        return -1;
	    }
	    int Largest = a[0];
	    int Second_Largest = Integer.MIN_VALUE;
	    int Third_Largest = Integer.MIN_VALUE;
	    
	    for(int i = 1 ; i < n ; i++)
	    {
	        if(a[i] > Largest)
	        {
	            Largest = a[i];
	        }
	    }
	    
	    for(int i = 1 ; i < n ; i++)
	    {
	        if(a[i] > Second_Largest && a[i] < Largest)
	        {
	            Second_Largest = a[i];
	        }
	    }
	    
	    for(int i = 1 ; i < n ; i++)
	    {
	        if(a[i] > Third_Largest  && a[i] < Second_Largest)
	        {
	            Third_Largest = a[i];
	        }
	    }
	    return Third_Largest;
    }
}
