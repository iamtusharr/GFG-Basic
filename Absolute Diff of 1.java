class Solution {
    long[] getDigitDiff1AndLessK(long[] arr, int n, long k) 
    {
        ArrayList<Long> list = new ArrayList<>();
        for(long x : arr)
        {
            if(x < k)
            {
                if(isDiffOne(x))
                {
                    list.add(x);
                }
            }
        }
        
        long[] ar = new long[list.size()];
        
        int a = 0;
        for(long y : list){
            ar[a++] = y;
        }
        
        return ar;
    }
    
    static boolean isDiffOne(long num){
        if(num/10 == 0)
        {
            return false;
        }
        long temp1 = num % 10;
        num = num / 10;
        long temp2 = num % 10;
        while(num > 0){
            if(Math.abs(temp1 - temp2) != 1)
            {
                return false;
            }
            temp1 = temp2;
            num = num / 10;
            temp2 = num % 10;
        }
        return true;
    }
}
