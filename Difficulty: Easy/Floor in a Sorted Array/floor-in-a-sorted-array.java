class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int st = 0;
        int n = arr.length;
        int end = n-1;
        int ans =-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            
            if(arr[mid] > x){
                end =mid-1;
            }
            else{
                st = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
