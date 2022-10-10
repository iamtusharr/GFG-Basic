//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.minTime(a, b, n));
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {

    public long minTime(long a[], long b[], long n) 
    {
        long sum1 = 0;
        long sum2 = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(i % 2 == 0)
            {
                sum1 = sum1 + a[i];
                sum2 = sum2 + b[i];
            }
            else
            {
                sum1 = sum1 + b[i];
                sum2 = sum2 + a[i];
            }
            
            
        }
        return Math.min(sum1,sum2);
        
    }
}
