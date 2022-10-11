//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.altProduct(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long altProduct(long arr[], long n)
    {
        Arrays.sort(arr);
        long mid = (arr.length / 2) ;
        long sum = 0;
        long start = 0;
        long end = arr.length - 1;
        while(start < end)
        {
            sum = sum + (arr[(int)start] * arr[(int)end]);
            start++;
            end--;
        }
        return sum;
    }
}
