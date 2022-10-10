//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.primeSum(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int primeSum(int N)
    {
        int sum = 0;
        int dummy = N;
        while(N != 0)
        {
            int rem = N % 10;
            if(rem == 2 || rem == 3 || rem == 5 || rem == 7)
            {
                sum = sum + rem;
            }
            N = N/10;
        }
        return  sum;
        // code here
    }
}
