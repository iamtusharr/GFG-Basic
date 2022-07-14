// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int l = Integer.parseInt(inputLine[0]);
            int r = Integer.parseInt(inputLine[1]);

            new Solution().reverseSubArray(arr, n, l, r);
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
    void reverseSubArray(int arr[], int n, int l, int r) 
    {
        int x = (r-l) + 1; 
        int ar[] = new int[x];
        int temp = 0;
        for(int i = r-1 ; i > l-2 ; i-- )
        {
            ar[temp] = arr[i];
            temp++;
        }
        int p = l-1;
        for(int i = 0 ; i < x; i++)
        {
            arr[p] = ar[i];
            p++;
        }
    }
}
