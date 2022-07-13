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

            new Solution().rearrangeArray(arr, n);
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
    void rearrangeArray(int[] arr, int n) 
    {
        Arrays.sort(arr);
        int a[] = new int[n];
        int small = 0;
        int large = n-1;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                a[i] = arr[small];
                small++;
            }
            else
            {
                a[i] = arr[large];
                large--;
            }
       }
       for(int i=0; i<n; i++)
       {
           arr[i]=a[i];
       }
    }
}
