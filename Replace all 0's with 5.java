// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int num) 
    {
        String str = String.valueOf(num);
        char ch[] = str.toCharArray();
        String str2 = "";
        for(int i = 0 ; i < ch.length ; i++)
        {
            if(ch[i] == '0')
            {
                ch[i]= '5';
            }
            str2 = str2 + ch[i];
        }
        int A = Integer.parseInt(str2);
        return A;
        
    }
}
