//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S)
    {
        char ch[] = S.toCharArray();
        
        
        int j = 0;
        for(int i = 1 ; i < ch.length ; i++)
        {
            if(ch[i] != ch[j])
            {
                j++;
                ch[j] = ch[i];
            }
        }
        String dummy = "";
        for(int i = 0 ; i < j+1 ; i++)
        {
            dummy = dummy + ch[i];
        }
        return dummy;
        
        
    }
}
