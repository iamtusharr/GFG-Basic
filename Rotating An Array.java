// { Driver Code Starts
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
            int d = Integer.parseInt(br.readLine().trim());

            new Solution().leftRotate(arr, n, d);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void leftRotate(int[] arr, int n, int d) 
    {
        int a[] = new int[d];
        for(int i = 0 ; i < d ; i++ )
        {
            a[i] = arr[i];
        }
        int x = 0;
        for(int i = d ; i < n ; i++)
        {
            arr[x] = arr[i];
            x++;
        }
        x = 0;
        for(int i = n-d ; i < n ; i++)
        {
            arr[i] = a[x];
            x++;
        }
        
    }
}