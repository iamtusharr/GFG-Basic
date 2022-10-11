//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		new Sol().strangeSort (arr, n, k);
    		for (int i = 0; i < n; i++)
    		    System.out.print (arr[i] + " ");
    		System.out.println ();
        }
        
    }
}
// Contributed By: Pranay Bansal


// } Driver Code Ends


//User function Template for Java

class Sol
{
    void strangeSort (int A[], int N, int K)
    {
        int temp = A[K-1];
        A[K-1] = Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i = N-1 ; i > K-1 ; i--)
        {
            A[i] = A[i-1];
        }
        A[K-1] = temp;
    }
}
