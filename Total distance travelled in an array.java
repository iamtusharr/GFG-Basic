//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            long ans = new Solution().distance(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long distance(int[] arr, int n) 
    {
        int dummy[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            int p = arr[i] - 1;
            dummy[p] = i;
        }
        long a = 0;
        for(int i = 0 ; i < n-1 ; i++)
        {
            a = a + Math.abs(dummy[i]-dummy[i+1]);
        }
        return a;
        
    }
}
