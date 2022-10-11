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

            int[] ans = new Solution().repeatingEven(arr, n);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] repeatingEven(int[] arr, int n) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr)
        {
            set.add(x);
        }
        for(int y : arr)
        {
            if(set.contains(y))
            {
                set.remove(y);
            }
            else
            {
                set.add(y);
            }
        }
        if(set.size() == 0)
        {
            int ans[] = {-1};
            return ans;
        }
        int ans[] = new int[set.size()];
        int a = 0;
        for(int z : set)
        {
            ans[a++] = z;
        }
        Arrays.sort(ans);
        return (ans);
        
    }
}
