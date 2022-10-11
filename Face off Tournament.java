//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int x = Integer.parseInt(in.readLine());
            String s[] = in.readLine().trim().split("\\s+");
            int m = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            String st[] = in.readLine().trim().split("\\s+");
            long arr[] = new long[x];
            for(int i = 0;i < x;i++)
                arr[i] = Long.parseLong(st[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.winner(x, m, n, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String winner(int x, int m, int n, long arr[])
    {
        int ram = 0;
        int rohan = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] % m == 0)
            {
                ram++;
            }
            else if(arr[i] % n == 0)
            {
                rohan++;
            }
        }
        if(ram > rohan)
        {
            return "Ram";
        }
        else if(ram == rohan)
        {
            return "Both";
        }
        return "Rohan";
    }
}
