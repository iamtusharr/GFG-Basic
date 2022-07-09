// { Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
// User function template for C++

class Solution {
  public:
    int binarysearch(int arr[], int N, int X) 
    {
         int left = 0;
        int right = N - 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(X < arr[mid])
            {
                right = mid - 1;
            }
            else if(X > arr[mid])
            {
                left = mid + 1;
            }
            else
            {
                return mid;
            }
        }
    return -1;
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;

    while (t--) {
        int N;
        cin >> N;
        int arr[N];
        for (int i = 0; i < N; i++) cin >> arr[i];
        int key;
        cin >> key;
        Solution ob;
        int found = ob.binarysearch(arr, N, key);
        cout << found << endl;
    }
}
  // } Driver Code Ends
